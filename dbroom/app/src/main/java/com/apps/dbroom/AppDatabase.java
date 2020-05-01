package com.apps.dbroom;


import androidx.room.Database;
import androidx.room.RoomDatabase;

/*
    Developed by Prana Reza Alviana - 10117192 - IF5
    on 29-04-2020
 */

@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}
