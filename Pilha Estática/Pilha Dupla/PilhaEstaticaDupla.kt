package PilhaEstatica.Dupla

class PilhaEstaticaDupla : EmpilhavelDupla{

    private var dados: Array<Any?>
    private var ponteiro1: Int
    private var ponteiro2: Int

    constructor(tamanho: Int){
        dados = arrayOfNulls(tamanho)
        ponteiro1 = -1
        ponteiro2 = tamanho
    }

    override fun empilhar1(dado: Any?){
        if (!estaCheia1()){
            ponteiro1++
            dados[ponteiro1] = dado
        } else {
            println("Pilha Cheia.")
        }
    }

    override fun empilhar2(dado: Any?) {
        if (!estaCheia2()){
            ponteiro2--
            dados[ponteiro2] = dado
        } else {
            println("Pilha Cheia.")
        }
    }

    override fun desempilhar1(): Any? {
        var aux: Any? = null
        if (!estaVazia1()){
            aux = dados[ponteiro1]
            ponteiro1--
        } else {
            println("Pilha Vazia")
        }
        return aux
    }

    override fun desempilhar2(): Any? {
        var aux: Any? = null
        if (!estaVazia2()){
            aux = dados[ponteiro2]
            ponteiro2++
        } else {
            println("Pilha Vazia")
        }
        return aux
    }

    override fun espiar1(): Any? {
        var aux: Any? = null
        if (!estaVazia1()){
            aux = dados[ponteiro1]
        } else {
            println("Pilha Vazia")
        }
        return "Topo Pilha 1 -> " + aux
    }

    override fun espiar2(): Any? {
        var aux: Any? = null
        if (!estaVazia2()){
            aux = dados[ponteiro2]
        } else {
            println("Pilha Vazia")
        }
        return "Topo Pilha 2 -> " + aux
    }

    override fun atualizar1(dado: Any?) {
        if (!estaCheia1())
            dados[ponteiro1] = dado
        else
            println("Pilha Cheia.")
    }

    override fun atualizar2(dado: Any?) {
        if (!estaCheia2())
            dados[ponteiro2] = dado
        else
            println("Pilha Cheia.")
    }

    override fun estaCheia1(): Boolean {
        return (ponteiro1 == ponteiro2-1)
    }

    override fun estaCheia2(): Boolean {
        return estaCheia1()
    }

    override fun estaVazia1(): Boolean {
        return (ponteiro1 == -1)
    }

    override fun estaVazia2(): Boolean {
        return (ponteiro2 == dados.size)
    }

    override fun imprimir1(): String{
        var retorno = "["
        for (i in ponteiro1 downTo 0){
            if (i == 0){
                retorno += "${dados[i]}"
            } else {
                retorno += "${dados[i]},"
            }
        }
        return "$retorno]"
    }

    override fun imprimir2(): String{
        var retorno = "["
        for (i in ponteiro2 .. dados.size-1){
            if (i == dados.size-1){
                retorno += "${dados[i]}"
            } else {
                retorno += "${dados[i]},"
            }
        }
        return "$retorno]"
    }

}