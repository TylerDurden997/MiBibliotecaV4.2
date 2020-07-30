package com.example.mibibliotecav2.model.remote

import java.io.Serializable

class UsersRemote(
    val id: String? = "",
    val nombre: String = "",
    val correo: String = "",
    val telefono: String = "",
    val residencia: String = "",
    val notificacion: Boolean = false,
    val urlPhoto: String = ""
)

class LibrosRemote(
    val id: String? = "",
    val titulo: String = "",
    val autor: String = "",
    val nedicion: String = "",
    val lpublicacion: String = "",
    val aedicion: String = "",
    val npag: String = "",
    val genero: String = "",
    val notas: MutableList<String> = mutableListOf(),
    val isbn: String = "",
    val portada: String = "",
    val galeria: MutableList<String> = mutableListOf()
) : Serializable

class PrestamosRemote(
    val  id: String? = "",
    val titulo: String = "",
    val paginas: String = "",
    val genero: String = "",
    val fprestamo: String = "",
    val fdevolucion: String = "",
    val urlportada: String = "",
    val deudor: String = ""
)

