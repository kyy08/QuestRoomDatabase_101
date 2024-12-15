package com.example.database_101.repository

import com.example.database_101.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa : Mahasiswa)
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>
    fun getMhs(nim : String) : Flow<Mahasiswa>

    suspend fun deleteMhs(Mahasiswa: Mahasiswa)

    suspend fun updateMhs(Mahasiswa: Mahasiswa)

}