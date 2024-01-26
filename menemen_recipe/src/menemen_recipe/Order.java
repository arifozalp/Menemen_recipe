package menemen_recipe;import java.util.*;

public class Order extends FoodItem {
	public final List<FoodItem> orders = new ArrayList<>();
	
	Order() {
		super(Unit.Piece, 1.0);
	}
	
	void add(FoodItem foodItem) {
		orders.add(foodItem);
	}

	void cancel(FoodItem foodItem) {
		orders.remove(foodItem);
	}
	
	void cancel() {
		orders.clear();
	}
	
	Iterable<FoodItem> get() {
		return orders;
	}
	
	@Override
	public double getCalorie() {
		double totalCalorie = 0.0;
		
		for (FoodItem foodItem : orders) {
			totalCalorie += foodItem.getTotalCalorie();
		}
		
		return totalCalorie;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Order" + " (" + getCalorie() + " calories) \n");		
		sb.append("----------------------- \n");
		for (FoodItem foodItem : orders) {
			sb.append(foodItem + "\n");
		}		
		
		return sb.toString();
	}		
	
}
