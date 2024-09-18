class PilhaDePedidos : InterfaceDePedidos{
    private var pedidos: Array<String?>
    private var ponteiroTopo: Int

    constructor(tamanho: Int){
        pedidos = arrayOfNulls(tamanho)
        ponteiroTopo = -1
    }

    override fun empilharPedidos(pedido: String) {
        if (!estaCheia()) {
            ponteiroTopo++
            pedidos[ponteiroTopo] = pedido
            println("Pedido $pedido adicionado.")
        } else {
            println("Maximo de Pedidos Atingido.")
        }
    }

    override fun desempilharPedidos(): String {
        if (!estaVazia()){
            var pedidoExcluido = pedidos[ponteiroTopo]
            pedidos[ponteiroTopo] = null
            ponteiroTopo--
            return "Pedido ->$pedidoExcluido<- excluido."
        } else {
            return "Nenhum Pedido para ser excluido."
        }
    }

    override fun estaCheia(): Boolean {
        return (ponteiroTopo == pedidos.size-1)
    }

    override fun estaVazia(): Boolean {
        return (ponteiroTopo == -1)
    }

    override fun relatorioDePedidos() {
        if (!estaVazia()){
            println("---------- RELATORIO DE PEDIDOS ----------")
            for (i in 0..ponteiroTopo){
                var indice = i+1
                println("$indice° pedido: " + pedidos[i])
            }
        } else {
            println("Nenhum pedido no sistema.")
        }
    }
}