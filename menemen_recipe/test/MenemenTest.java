package menemen_recipe;

public class MenemenTest {

	public static void main(String[] args) {

		Menemen menemen = new Menemen(2);
		System.out.println(menemen.getName() + ", Calories = " + menemen.getTotalCalorie());
		System.out.println("---------------------------------------------");
		menemen.execute((f) -> System.out.println(f) );
		System.out.println();
				
		Order order = new Order();
		order.add(menemen);
		order.add(new Bread(2));
		order.add(new Tea(4));
		order.add(new Cake(1));		
		System.out.println(order);
				
		System.out.print(" --> Order has ");
		for (FoodItem anOrder : order.get()) {
			System.out.print(anOrder.getName() + " ");
		}
	}

}
