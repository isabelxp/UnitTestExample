package com.praticas.testunitario.mockitomvp;

public class LoginModel implements  Login.Model{

    private Login.Presenter presenter;

    public LoginModel(Login.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void validaUser(String user, String password) {
        if(user.equals("isabel") && password.equals("1234")){
           presenter.usuarioValido();
        }else {
           presenter.error();
        }
    }
}
