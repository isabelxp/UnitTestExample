package com.praticas.testunitario.mockitomvp;

public interface Login {

    interface View{
        void usarioValido();
        void error();
        String getUserName();
        String getPassword();
    }

    interface Presenter{
        void validadUser(String user, String password);
        void usuarioValido();
        void error();
    }

    interface Model{
        void validaUser(String user, String password);
    }
}
