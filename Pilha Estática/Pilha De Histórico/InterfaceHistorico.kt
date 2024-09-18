interface InterfaceHistorico {

    fun perquisar(url: String)
    fun excluirPesquisa(): String
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun relatorioDeHistorico()

}