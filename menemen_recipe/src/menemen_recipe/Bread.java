package menemen_recipe;

public class Bread extends FoodItem {

	Bread(double amount) {
		super(Unit.Piece, amount);
	}
	
	@Override
	public double getCalorie() {
		return 250.0;
	}
	
}
