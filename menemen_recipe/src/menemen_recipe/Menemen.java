package menemen_recipe;
public class Menemen extends Food {

	Menemen(double amount) {
		super(amount);
		
		foodItems.add(new Tomato(0.5));
		foodItems.add(new Egg(2));
		foodItems.add(new Olive(0.01));
	}
		
}
