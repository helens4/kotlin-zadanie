class Shop(private var productList: List<Product>,
           private var name: String,
           private var totalIncome: Double = 0.0)  {

    fun getTotalIncome() = totalIncome

    fun buyProduct(id: Int) {
        productList.forEach { product ->
            if(product.getId() == id){
                totalIncome += product.buyProduct()
            }
        }
    }
}