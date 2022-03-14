fun main() {
    val amount = 100
    val commissionRate = 0.0075
    val minCommision = 3500

    val commissionAmount = if (amount * commissionRate > minCommision) amount * commissionRate else minCommision

    println("Total amount: $commissionAmount")
}
