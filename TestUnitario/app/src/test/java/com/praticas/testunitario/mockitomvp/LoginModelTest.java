package com.praticas.testunitario.mockitomvp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LoginModelTest {

    @Mock
    private LoginPresenter presenter;

    private Login.Model model;

    @Before
    public void setUp() throws Exception{
        model = new LoginModel(presenter);
    }

    @Test
    public void shouldSuccessWithValidUserAndPasswordTest() throws Exception{
        model.validaUser("isabel","1234");
        verify(presenter).usuarioValido();
    }

    @Test
    public void shouldNotSuccessWithValidUserAndPasswordTest() throws Exception{
        model.validaUser("isab","1234");
        verify(presenter).error();
    }


}