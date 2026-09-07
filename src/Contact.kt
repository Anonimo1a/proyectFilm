data class Contact(
    val nombre : String,
    val age: Int,
    val phone: String,
    val realName: String?): SafeInfo {
    override fun getInfo(): String {
        return "Nombre: $nombre | Age: $age | Phone : $phone"
    }
}

//error de safe info = sobreescribir


//conrt i = override


//protgemos realname, pedimos todos los datos pero solo mostramos los que queramos en la interface por eso reescribimos

//getInfo() decide qué información expone

// si necesito mostrar todos los datos no hay que eiminar interface solo se cera otra uncion con todos

//Cuando no quieres que todos los objetos se comporten exactamente igual o quieres establecer un contrato.

//interface ayuda si tienes muchos tipos de informacion tambien, cada uno puede decidir como presentar  su informacion

//algunos pueden ver y otros no puede ver la informacion

//:Safe info = Contact implementa el contrato SafeInfo.

/*La interfaz dice QUÉ debe existir.

La clase dice CÓMO funciona.



Aquí Contact tiene los datos y además decidió implementar el contrato SafeInfo.

Pero no tiene que ser una data class. Podría ser una clase normal:
*/
