import java.util.Scanner

fun main(){
    var s = Scanner(System.`in`)
    print("Informe o limite de pedidos -> ")
    var tamanho = s.nextInt()

    var pedidos = PilhaDePedidos(tamanho)

    pedidos.empilharPedidos("X Burguer")
    pedidos.empilharPedidos("Pizza Calabresa")
    pedidos.empilharPedidos("X Tudo")
    pedidos.empilharPedidos("Pizza Bacon")
    pedidos.empilharPedidos("Coca")

    pedidos.relatorioDePedidos()

    println(pedidos.desempilharPedidos())
    println(pedidos.desempilharPedidos())
    println(pedidos.desempilharPedidos())

    pedidos.relatorioDePedidos()
}