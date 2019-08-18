package com.example.android.mvpexample.Presenter;


import com.example.android.mvpexample.Model.User;

public class MainActivityPresenter {
    User user;
    View view;

    public MainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void updateFullName(String fullName){
        user.setmFullName(fullName);
        view.updateUserInfoTextView(user.toString());
    }

    public void updateEmail(String email){
            user.setmEmail(email);
        view.updateUserInfoTextView(user.toString());
    }

    public interface View{
        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();
    }


}
