package menemen_recipe;
public class Tea extends FoodItem {
	
	Tea(int amount) {
		super(Unit.Glass, amount);
	}
	
	@Override
	public double getCalorie() {
		return 1.0;
	}	
	
}
