class Lista : Listavel{

    private val dados: Array<Any?>
    private var ponteiroFim: Int
    private var ponteiroInicio: Int
    private var quantidade: Int

    constructor(tamanho: Int){
        dados = arrayOfNulls(tamanho)
        ponteiroInicio = 0
        ponteiroFim = -1
        quantidade = 0
    }
    override fun inserir(posicao: Int, dado: Any?) {
        if (!estaCheia()){
            if (posicao >=0 && posicao <= quantidade){
                val posicaoFisica = (ponteiroInicio + posicao) % dados.size
                var ponteiroAux = ponteiroFim+1
                for (i in quantidade-posicao .. 0){
                    dados[(posicaoFisica+i+1)%dados.size] = dados[(posicaoFisica+i)%dados.size]
                } 
                dados[posicaoFisica] = dado
                quantidade++
                ponteiroFim = (ponteiroFim + 1) % dados.size
            } else {
                println("Posicao invalida")
            }
        } else {
            println("Lista Cheia")
        }
    }
    override fun anexar(dado: Any?) {
        if (!estaCheia()){
            ponteiroFim = (ponteiroFim+1)%dados.size
            dados[ponteiroFim] = dado
            quantidade++
        } else {
            println("Lista Cheia")
        }
    }
    override fun selecionar(posicao: Int): Any? {
        var aux: Any? = null
        if (!estaVazia()){
            if ((posicao >=0) && (posicao < quantidade)){
                val posicaoFisica = (ponteiroInicio + posicao)%dados.size
                aux = dados[posicaoFisica]
            }
        }
        return aux
    }

    override fun selecionarTodos(): Array<Any?> {
        var dadosAux: Array<Any?> = arrayOfNulls(quantidade)
        if (!estaVazia()){
            var ponteiroAux = ponteiroInicio
            for (i in 0 until quantidade){
                dadosAux[i] = dados[ponteiroAux % dados.size]
                ponteiroAux++
            }
        } else {
            println("Lista Vazia")
        }
        return dadosAux
    }

    override fun atualizar(posicao: Int, dado: Any?) {
        if (!estaVazia()){
            if ((posicao >=0) && (posicao < quantidade)){
                val posicaoFisica = (ponteiroInicio +  posicao)%dados.size
                dados[posicaoFisica] = dado
            } else {
                println("Posição Invalida")
            }
        } else {
            println("Lista Vazia")
        }
    }

    override fun apagar(posicao: Int): Any? {
        var dadoAux: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                val posicaoFisica = (ponteiroInicio + posicao) % dados.size
                dadoAux = dados[posicaoFisica]
                for (i in 0 until quantidade-posicao){
                    dados[posicaoFisica+i] = dados[(posicaoFisica+i+1)%dados.size]
                }
                ponteiroFim--
                if (ponteiroFim == -1){
                    ponteiroFim = dados.size-1
                }
                quantidade--
            } else {
                println("Indice Inválido!")
            }
        } else {
            println("Lista Vazia!")
        }
        return dadoAux
    }

    override fun limpar(){
        ponteiroInicio = 0
        ponteiroFim = -1
        quantidade = 0
    }

    override fun estaCheia(): Boolean {
        return (quantidade == dados.size)
    }

    override fun estaVazia(): Boolean {
        return (quantidade == 0)
    }

    override fun imprimir(): String {
        var retorno = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 until quantidade){
            if (i == quantidade-1)
                retorno += "${dados[ponteiroAux % dados.size]}"
            else
                retorno += "${dados[ponteiroAux % dados.size]},"

            ponteiroAux++
        }
        return "$retorno]"
    }
}