package com.example.database_101.dependenciesinjection

import android.content.Context
import com.example.database_101.data.database.KrsDatabase
import com.example.database_101.repository.LocalRepositoryMhs
import com.example.database_101.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}