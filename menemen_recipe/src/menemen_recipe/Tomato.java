package menemen_recipe;
public class Tomato extends FoodItem {

	Tomato(double amount) {
		super(Unit.Kilogam, amount);
	}

	@Override
	public double getCalorie() {
		return 180.0;
	}	
	
}
