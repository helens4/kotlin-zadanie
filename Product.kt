class Product(private var name: String,
              private var quantity: Int,
              private var price: Double,
              private var id: Int) {

    fun getId() = id
    fun getQuantity() = quantity
    fun getPrice() = price

    fun buyProduct(): Double {
        if(quantity > 0) {
            quantity--;
            return price
        }
        return 0.0
    }

    override fun toString(): String {
        return "ID: $id\nNazwa: $name\nIlosc: $quantity"
    }
}