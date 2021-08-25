package com.projetos.bussinescard

import android.app.Application
import com.projetos.bussinescard.data.AppDatabase
import com.projetos.bussinescard.data.BusinessCardRepository

class App: Application() {

    val database by lazy {AppDatabase.getDatabase(this)}
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}