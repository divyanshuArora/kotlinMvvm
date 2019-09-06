package com.example.mvvmkotlin.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/mvvmkotlin/utils/SqliteDatabase;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "helper", "Landroid/database/sqlite/SQLiteDatabase;", "getHelper", "()Landroid/database/sqlite/SQLiteDatabase;", "setHelper", "(Landroid/database/sqlite/SQLiteDatabase;)V", "sqLiteDatabase", "getSqLiteDatabase", "()Lcom/example/mvvmkotlin/utils/SqliteDatabase;", "setSqLiteDatabase", "(Lcom/example/mvvmkotlin/utils/SqliteDatabase;)V", "addUser", "", "user", "Lcom/example/mvvmkotlin/model/User;", "onCreate", "sqliteDatabase", "onUpgrade", "p0", "p1", "", "p2", "Companion", "app_debug"})
public final class SqliteDatabase extends android.database.sqlite.SQLiteOpenHelper {
    @org.jetbrains.annotations.Nullable()
    private com.example.mvvmkotlin.utils.SqliteDatabase sqLiteDatabase;
    @org.jetbrains.annotations.Nullable()
    private android.database.sqlite.SQLiteDatabase helper;
    private static final java.lang.String dbName = "KotlinMVVM";
    private static final java.lang.String USER_TABLE = "users";
    private static final java.lang.String ID = "id";
    private static final java.lang.String NAME = "user_name";
    private static final java.lang.String EMAIL = "user_email";
    private static final java.lang.String PASSWORD = "user_password";
    public static final com.example.mvvmkotlin.utils.SqliteDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.mvvmkotlin.utils.SqliteDatabase getSqLiteDatabase() {
        return null;
    }
    
    public final void setSqLiteDatabase(@org.jetbrains.annotations.Nullable()
    com.example.mvvmkotlin.utils.SqliteDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.database.sqlite.SQLiteDatabase getHelper() {
        return null;
    }
    
    public final void setHelper(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase sqliteDatabase) {
    }
    
    public final void addUser(@org.jetbrains.annotations.NotNull()
    com.example.mvvmkotlin.model.User user) {
    }
    
    @java.lang.Override()
    public void onUpgrade(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase p0, int p1, int p2) {
    }
    
    public SqliteDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/mvvmkotlin/utils/SqliteDatabase$Companion;", "", "()V", "EMAIL", "", "ID", "NAME", "PASSWORD", "USER_TABLE", "dbName", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}