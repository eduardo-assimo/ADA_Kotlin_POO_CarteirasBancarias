package com.desafiocarteira.objects

import com.desafiocarteira.enums.TipoCarteira
import com.desafiocarteira.enums.TipoOperacao
import com.desafiocarteira.interfaces.Fisica
import java.time.LocalDateTime

class CarteiraFisica(
    senha: String,
    tipo: TipoCarteira = TipoCarteira.FISICA,
    saldo: Double,
    extrato: MutableList<Operacao>
) : Fisica, Carteira(senha, tipo, saldo, extrato) {
    override fun deposito(valorDeposito: Double) {
        this.atualizaSaldo(valorDeposito, TipoOperacao.DEPOSITO)
        this.salvaOp(TipoOperacao.DEPOSITO, valorDeposito)
    }

    override fun saque(valorSaque: Double) {
        this.atualizaSaldo(valorSaque, TipoOperacao.SAQUE)
        this.salvaOp(TipoOperacao.SAQUE, valorSaque)
    }

}