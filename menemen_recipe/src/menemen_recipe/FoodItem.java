package menemen_recipe;

abstract public class FoodItem {
	
	final public Unit unit;
	final public double amount;
	
	FoodItem(Unit unit, double amount) {
		this.unit = unit;
		this.amount = amount;
	}

	abstract public double getCalorie();
	
	public double getTotalCalorie() {
		return getCalorie() * amount;
	}
	
	public String getName() {
		return getClass().getName();
	}
	
	void execute(FoodInterface foodInterface) {
		foodInterface.process(this);
	}
	
	@Override
	public String toString() {
		return getName() + ": " + amount + " " + unit
				+ " (" + getCalorie() + " calories per " + unit + ")"; 
	}	
	
}
