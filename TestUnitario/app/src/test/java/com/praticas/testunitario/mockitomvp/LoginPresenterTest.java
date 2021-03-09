package com.praticas.testunitario.mockitomvp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    /**
     * 1. Hacer Mock de clases o Interfaces
     */

    @Mock
    private Login.View view;

    @Mock
    private Login.Model model;

    private LoginPresenter presenter;

    @Before
    public void setUp() throws Exception{
        presenter = new LoginPresenter(view);
    }

    @Test
    public void shouldShowErrorMessageWhenUserOrPasswordIsWrongTest() throws Exception{
        /**
         * 2. Nos permite programar un comportamiento
         */
        when(view.getUserName()).thenReturn("maria");
        when(view.getPassword()).thenReturn("fhlshl");

        /**
         * 3. Ejecutamos un metodo
         */
         presenter.validadUser(view.getUserName(), view.getPassword());
        /**
         * 4. Verificar que la vista ejecuta el metodo Error
         */
        //verify(view).usarioValido();
        verify(view).error();
    }

    @Test
    public void shouldCallusuarioValidoWheUserAndPasswordAreRightTest() throws Exception{
        /**
         * 2. Nos permite programar un comportamiento
         */
        when(view.getUserName()).thenReturn("isabel");
        when(view.getPassword()).thenReturn("1234");
        Assert.assertEquals("isabel", view.getUserName());

        /**
         * 3. Ejecutamos un metodo
         */
        presenter.validadUser(view.getUserName(), view.getPassword());
        /**
         * 4. Verificar que la vista ejecuta el metodo Error
         */
        verify(view).usarioValido();
        //verify(view).error();
    }

    @Test
    public void shouldThrowingException() throws Exception{
        when(view.getUserName()).thenThrow(RuntimeException.class);
        try {
            view.getUserName();
        }catch (RuntimeException e){ }
    }

    @Test
    public void shouldCallusuarioValidoWheUserAndPasswordAreRightDoReturnTest() throws Exception{
        doReturn("isabel").when(view).getUserName();
        Assert.assertEquals("isabel", view.getUserName());
    }


    /**
     * Ejemplo para diferenciar @Mock de @Spy
     */

    @Mock
    List<String> mockList = new ArrayList<>();

    @Spy
    List<String> spyList = new ArrayList<>();

    @Test
    public void spyTest() throws Exception{
          spyList.add("one");
          spyList.add("two");

          verify(spyList).add("one");
          verify(spyList).add("two");

          Assert.assertEquals(2,spyList.size());
    }

    @Test
    public void mockTest() throws Exception{
        mockList.add("one");
        mockList.add("two");

        verify(mockList).add("one");
        verify(mockList).add("two");

       // Assert.assertEquals(2,spyList.size());
    }
}