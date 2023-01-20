package com.desafiocarteira.objects

import com.desafiocarteira.enums.TipoCarteira
import com.desafiocarteira.enums.TipoOperacao
import java.time.LocalDateTime

abstract class Carteira (
    private val senha: String,
    val tipo: TipoCarteira,
    private var saldo: Double,
    private var extrato: MutableList<Operacao>
    ) {

    fun atualizaSaldo(valor: Double, tipoOperacao: TipoOperacao) {
        when (tipoOperacao) {
            TipoOperacao.DEPOSITO -> saldo+=valor
            else -> saldo-=valor
        }
    }

    fun salvaOp(tipoOperacao : TipoOperacao, valorOperacao: Double, destino: String? = null) {
        this.extrato.add(Operacao(tipoOperacao, valorOperacao, LocalDateTime.now(), destino))
    }

    fun pagarBoleto(valorBoleto: Double)  {
        this.atualizaSaldo(valorBoleto, TipoOperacao.PAGAMENTO_BOLETO)
        this.salvaOp(TipoOperacao.PAGAMENTO_BOLETO, valorBoleto*-1)
    }

}