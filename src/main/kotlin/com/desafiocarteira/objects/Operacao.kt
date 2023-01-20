package com.desafiocarteira.objects

import com.desafiocarteira.enums.TipoOperacao
import java.time.LocalDateTime


data class Operacao(val tipoOperacao: TipoOperacao, val valorOperacao: Double, val data: LocalDateTime, val destino:
String? = null)
