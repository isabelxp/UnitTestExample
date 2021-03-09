package com.praticas.testunitario.mockitomvp;

public class LoginPresenter implements Login.Presenter{

    private Login.View view;
    private Login.Model model;

    public LoginPresenter(Login.View view) {
        this.view = view;
        model = new LoginModel(this);
    }

    @Override
    public void validadUser(String user, String password) {
        if(view != null){
            model.validaUser(user, password);
        }
    }

    @Override
    public void usuarioValido() {
        if(view != null){
            view.usarioValido();
        }
    }

    @Override
    public void error() {
        if(view != null){
            view.error();
        }
    }
}
