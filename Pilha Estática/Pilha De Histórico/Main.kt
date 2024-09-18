import java.util.Scanner

fun main(){
    var s = Scanner(System.`in`)

    print("Informe o limite de pesquisas: ")
    var limite = s.nextInt()

    var historico = PilhaDeHistorico(limite)

    historico.perquisar("youtube")
    historico.perquisar("uol")
    historico.perquisar("g1")
    historico.perquisar("instagram")
    historico.perquisar("facebook")

    historico.relatorioDeHistorico()

    println(historico.excluirPesquisa())
    println(historico.excluirPesquisa())
    println(historico.excluirPesquisa())

    historico.relatorioDeHistorico()

}