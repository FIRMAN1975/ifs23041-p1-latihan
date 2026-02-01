package org.delcom.intermediate.scopefunctions

import intermediate.`Lambdaexpressionswithreceiver﻿`.getPriceInEuros

data class ProductInfo(val priceInDollars: Double?)

class Product {
    fun getProductInfo(): intermediate.`Lambdaexpressionswithreceiver﻿`.ProductInfo? {
        return _root_ide_package_.intermediate.`Lambdaexpressionswithreceiver﻿`.ProductInfo(100.0)
    }
}

fun intermediate.`Lambdaexpressionswithreceiver﻿`.Product.getPriceInEuros() = getProductInfo()?.priceInDollars?.let {
    _root_ide_package_.intermediate.`Lambdaexpressionswithreceiver﻿`.convertToEuros(
        it
    )
}

fun convertToEuros(dollars: Double): Double {
    return dollars * 0.85
}

fun main() {
    val product = _root_ide_package_.intermediate.`Lambdaexpressionswithreceiver﻿`.Product()
    val priceInEuros = product.getPriceInEuros()

    if (priceInEuros != null) {
        println("Price in Euros: €$priceInEuros")
        // Price in Euros: €85.0
    } else {
        println("Price information is not available.")
    }
}