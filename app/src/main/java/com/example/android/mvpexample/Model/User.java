package com.example.android.mvpexample.Model;

public class User {
    private String mFullName, mEmail;

    public User(){}

    public User(String mFullName, String mEmail) {
        this.mFullName = mFullName;
        this.mEmail = mEmail;
    }

    public String getmFullName() {
        return mFullName;
    }

    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFullName='" + mFullName + '\'' +
                ", mEmail='" + mEmail + '\'' +
                '}';
    }
}
