interface InterfaceDePedidos {

    fun empilharPedidos(pedido: String)
    fun desempilharPedidos(): String
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun relatorioDePedidos()

}