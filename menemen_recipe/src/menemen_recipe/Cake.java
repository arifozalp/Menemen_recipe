package menemen_recipe;

public class Cake extends FoodItem {

	Cake(int amount) {
		super(Unit.Piece, amount);
	}
	
	@Override
	public double getCalorie() {
		return 125.0;
	}
	
}
