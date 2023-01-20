package com.desafiocarteira.enums

enum class TipoOperacao(operacao: String) {
    DEPOSITO("depósito"),
    SAQUE("saque"),
    TRANSFERENCIA_PIX("transferência via Pix"),
    PAGAMENTO_BOLETO("pagamento de boleto"),
    INVESTIMENTO("investimento"),
    GUARDAR("poupança")
}