package br.com.rodrigoeduque.bytebank.testes.cursosArray

import java.math.BigDecimal
import java.math.RoundingMode

fun testeArrayObjetos() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    println("----------------------------------------")
    println("Salários normais")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> =
        salarios.map { salario ->
            calculaAumentoRelativo(salario, aumento)
        }.toTypedArray()

    println("----------------------------------------")
    println("Salários com Aumento")
    println(salariosComAumento.contentToString())

    println("----------------------------------------")
    println("Filtrar salarios maiores que R$2500.00")
    val maioresFiltrados = salariosComAumento.filter { it > "2500.00".toBigDecimal() }.toTypedArray()
    println(maioresFiltrados.contentToString())

    println("----------------------------------------")
    println("Somar todos os Salários")
    val somatoriaAntesAumento = salarios.somatoria()
    val somatoriaPosAumento = salariosComAumento.somatoria()
    println("Soma Antes Aumento = R$ $somatoriaAntesAumento")
    println("Soma Pós Aumento = R$ $somatoriaPosAumento")

    println("----------------------------------------")
    val qtdMeses = "6".toBigDecimal()
    val previsao = salariosComAumento.fold(somatoriaPosAumento) { acumulador, salario ->
        acumulador + (salario * qtdMeses).setScale(2, RoundingMode.UP)
    }
    println("Previsão de Gasto para os próximos $qtdMeses meses pos reajuste : R$ $previsao")

    println("----------------------------------------")
    val qtdMaioresSalarios = "3".toBigDecimal()
//    val maioresSalarios :Array<BigDecimal> = salariosOrdenados.takeLast(qtdMaioresSalarios.intValueExact()).toTypedArray()
//    val salariosOrdenados = salariosComAumento.sorted()
    val maioresSalarios =
        salariosComAumento.sorted().takeLast(qtdMaioresSalarios.intValueExact()).toTypedArray()
    println("$qtdMaioresSalarios maiores Salários : ${maioresSalarios.contentToString()}")
    val mediaMaioresSalarios = maioresSalarios.media()
    println("Média dos $qtdMaioresSalarios maiores salarios : R$ $mediaMaioresSalarios")
    println("----------------------------------------")


}

fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}
