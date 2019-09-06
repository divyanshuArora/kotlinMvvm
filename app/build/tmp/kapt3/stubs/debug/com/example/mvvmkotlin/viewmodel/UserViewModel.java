package com.example.mvvmkotlin.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0011\u0010\u0006\u001a\u00020\u00078G\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078G\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00078G\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00078G\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\t\u00a8\u0006\u001d"}, d2 = {"Lcom/example/mvvmkotlin/viewmodel/UserViewModel;", "Ljava/util/Observer;", "Landroidx/databinding/BaseObservable;", "user", "Lcom/example/mvvmkotlin/model/User;", "(Lcom/example/mvvmkotlin/model/User;)V", "number", "", "getNumber", "()Ljava/lang/String;", "password", "getPassword", "getUser", "()Lcom/example/mvvmkotlin/model/User;", "userEmail", "getUserEmail", "userName", "getUserName", "isInputDataValid", "", "onRegister", "", "view", "Landroid/view/View;", "update", "o", "Ljava/util/Observable;", "arg", "", "app_debug"})
public final class UserViewModel extends androidx.databinding.BaseObservable implements java.util.Observer {
    @org.jetbrains.annotations.NotNull()
    private final com.example.mvvmkotlin.model.User user = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getUserEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getNumber() {
        return null;
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.Nullable()
    java.util.Observable o, @org.jetbrains.annotations.Nullable()
    java.lang.Object arg) {
    }
    
    public final void onRegister(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final boolean isInputDataValid() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mvvmkotlin.model.User getUser() {
        return null;
    }
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mvvmkotlin.model.User user) {
        super();
    }
}