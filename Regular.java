class Regular extends Customers implements OrderPayment{
	@Override
	public double payBill(double amount) {
        // 10% discount
        return amount * 0.9;
    }
}