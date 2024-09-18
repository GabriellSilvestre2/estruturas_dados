class PilhaDeHistorico : InterfaceHistorico{
    private var pesquisas: Array<String?>
    private var ponteiroTopo: Int

    constructor(tamanho: Int){
        pesquisas = arrayOfNulls(tamanho)
        ponteiroTopo = -1
    }

    override fun perquisar(url: String) {
        if(!estaCheia()){
            ponteiroTopo++
            pesquisas[ponteiroTopo] = url
        } else {
            println("Limite de pesquisa atingido.")
        }
    }

    override fun excluirPesquisa(): String {
        if(!estaVazia()){
            var excluido = pesquisas[ponteiroTopo]
            pesquisas[ponteiroTopo] = null
            ponteiroTopo--
            return "Pesquisa '$excluido' excluída."
        } else{
            return "Historico vazio, nada a ser excluído."
        }
    }

    override fun estaCheia(): Boolean {
        return (ponteiroTopo == pesquisas.size-1)
    }

    override fun estaVazia(): Boolean {
        return (ponteiroTopo == -1)
    }

    override fun relatorioDeHistorico() {
        println("---------- RELATORIO DE PEDIDOS ----------")
        if(!estaVazia()){
            for (i in ponteiroTopo downTo 0){
                println(" * " + pesquisas[i])
            }
        } else{
            println("Histórico Vazio.")
        }
        println("------------------------------------------")
    }
}