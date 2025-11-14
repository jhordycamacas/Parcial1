def saludar(fraseBase: String): String => String = {
    def saludo(nombre: String): String =  s"$fraseBase, $nombre!"
    saludo
}

