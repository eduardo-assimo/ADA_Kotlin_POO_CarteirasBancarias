package com.desafiocarteira.objects

import com.desafiocarteira.enums.TipoCarteira
import com.desafiocarteira.enums.TipoOperacao
import com.desafiocarteira.interfaces.Digital

class CarteiraDigital(
    senha: String,
    tipo: TipoCarteira = TipoCarteira.DIGITAL,
    saldo: Double,
    extrato: MutableList<Operacao>
) : Digital, Carteira(senha, tipo, saldo, extrato) {

    override fun transferenciaPix(valorPix: Double, chavePix: String) {
        this.atualizaSaldo(valorPix, TipoOperacao.TRANSFERENCIA_PIX)
        this.salvaOp(TipoOperacao.TRANSFERENCIA_PIX, valorPix)
    }

    override fun investir(valorInvestimento: Double) {
        this.atualizaSaldo(valorInvestimento, TipoOperacao.INVESTIMENTO)
        this.salvaOp(TipoOperacao.INVESTIMENTO, valorInvestimento)
    }

    override fun guardar(valorPoupanca: Double) {
        this.atualizaSaldo(valorPoupanca, TipoOperacao.GUARDAR)
        this.salvaOp(TipoOperacao.GUARDAR, valorPoupanca)
    }
}