fun main() {

    val products = listOf(Product("dżem", 3, 10.3, 1),
                          Product(name = "masło", price = 12.0, id = 3, quantity = 2),
                          Product(price = 99.0, name = "bigosss", quantity = 1, id = 7))

    val shop = Shop(productList = products, name = "Biedronka")
    println(shop.getTotalIncome())
    shop.buyProduct(7)
    println(shop.getTotalIncome())

    shop.buyProduct(3)
    println(shop.getTotalIncome())
}

