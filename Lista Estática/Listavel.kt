interface Listavel {
    // PRINCIPAIS
    fun inserir(posicao: Int, dado: Any?)
    fun anexar(dado: Any?)
    fun selecionar(posicao: Int): Any?
    fun selecionarTodos(): Array<Any?>
    fun atualizar(posicao: Int, dado: Any?)
    fun apagar(posicao: Int): Any?
    fun limpar(): Boolean
    // AUXILIARES
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}
/*
inserirInicio(dado)
selecionarInicio(): Any
atualizarFim(dado)
*/
