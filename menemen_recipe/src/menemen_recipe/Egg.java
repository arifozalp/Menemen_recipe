package menemen_recipe;

public class Egg extends FoodItem {

	Egg(int amount) {
		super(Unit.Piece, amount);
	}
	
	@Override
	public double getCalorie() {
		return 80.0;
	}
	
}
