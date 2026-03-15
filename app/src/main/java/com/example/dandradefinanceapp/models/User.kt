package models

class User(
    val id: Int,
    val nombre: String,
    val saldoactual: Double
)

val listaUsuario = listOf(
    User(1,"Diana",12320.99)
)