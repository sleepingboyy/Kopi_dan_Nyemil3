package com.example.kopidannyemil.data

data class MenuItem(
    val id: Int,
    val name: String,
    val category: String,
    val price: String,
    val rating: String,
    val description: String
)

data class Order(
    val item: MenuItem,
    val address: String = "",
    val paymentMethod: String = "QRIS",
    val note: String = "",
    val status: String = "Selesai"
)

object DataSource {
    val menuList = listOf(
        MenuItem(1, "Kopi Susu Gula Aren", "Kopi", "Rp 18.000", "4.8", "Espresso dengan fresh milk dan gula aren asli."),
        MenuItem(2, "Americano Classic", "Kopi", "Rp 15.000", "4.7", "Double shot espresso dengan air segar."),
        MenuItem(3, "Croissant Butter", "Nyemil", "Rp 22.000", "4.9", "Pastry renyah dengan mentega premium."),
        MenuItem(4, "Roti Bakar Coklat Keju", "Nyemil", "Rp 16.000", "4.6", "Roti tebal dengan lelehan cokelat dan keju parut."),
        MenuItem(5, "Matcha Latte", "Non-Kopi", "Rp 20.000", "4.8", "Green tea matcha jepang pilihan dengan susu segar."),
        MenuItem(6, "Hazelnut Cream Latte", "Kopi", "Rp 24.000", "4.9", "Espresso lembut berpadu sirup hazelnut dan krimer murni.")
    )

    val orderHistory = mutableListOf<Order>()
    var currentItem: MenuItem? = null
    var currentAddress: String = ""
    var currentNote: String = ""
    var currentPaymentMethod: String = "QRIS"
}