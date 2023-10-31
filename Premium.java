class Premium extends Customers implements OrderPayment{
	@Override
	public double payBill(double amount) {
        // 20% discount
        return amount * 0.8;
    }
}