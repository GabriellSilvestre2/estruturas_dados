package PilhaEstatica.Dupla

import java.util.Scanner

fun main(){
    var s = Scanner(System.`in`)
    var pilha = PilhaEstaticaDupla(20)
    var menu = """
        === Menu ===
        1. Empilhar na Pilha 1 (números)
        2. Empilhar na Pilha 2 (caracteres)
        3. Desempilhar da Pilha 1
        4. Desempilhar da Pilha 2
        5. Exibir as pilhas
        6. Sair
    """.trimIndent()
    var opcao: Int

    do {
        println()
        println(menu)
        print("\nEscolha uma opção: ")
        opcao = s.nextInt()

        when (opcao){

            1 -> {
                print("Informe o número a ser empilhado na pilha 1: ")
                var numero = s.nextInt()
                pilha.empilhar1(numero)
            }
            2 -> {
                print("Informe o caractere a ser empilhado na pilha 2: ")
                var charactere = readLine()
                pilha.empilhar2(charactere)
            }
            3 -> {
                println("Desempilhar da pilha 1 -> ${pilha.desempilhar1()}")
            }
            4 -> {
                println("Desempilhar da pilha 2 -> ${pilha.desempilhar2()}")
            }
            5 -> {
                println("Exibindo as pilhas:")
                println("Pilha 1: " + pilha.imprimir1())
                println("Pilha 2: " + pilha.imprimir2())
            }
            6 -> println("Encerrando...")
            else -> println("Opção Invalida. Tente Novamente.")
        }
    } while (!(opcao==6))
    s.close()
}