package menemen_recipe;
public class Olive extends FoodItem {

	Olive(double amount) {
		super(Unit.Liter, amount);
	}
	
	@Override
	public double getCalorie() {
		return 680.0;
	}		
	
}
