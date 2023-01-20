package com.desafiocarteira

import java.text.NumberFormat
import java.util.*

fun currencyFormatter(number: Double): String {
    val currencyInstance = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-br"))
    return currencyInstance.format(number)
}