package main;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
	
	public static class Item {
		
		int weigth;
		int value;
		
		public int getWeigth() {
			return weigth;
		}
		public void setWeigth(int weigth) {
			this.weigth = weigth;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		
		public Item(int weigth, int value) {
			super();
			this.weigth = weigth;
			this.value = value;
		}
		
		
		
		
	}

	public static class Sack {
		
		int limit;

		public int getLimit() {
			return limit;
		}

		public void setLimit(int limit) {
			this.limit = limit;
		}

		public Sack(int limit) {
			super();
			this.limit = limit;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Sack sack = new Sack(10);
		
		Item item1 = new Item(7, 42);
		Item item2 = new Item(3, 12);
		Item item3 = new Item(4, 40);
		Item item4 = new Item(5, 25);
		
		List<Item> items = new ArrayList<Knapsack.Item>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		
		Integer bestWeight = 0;
		calculateMaxPossibleWeightInSack( items, sack, 0, bestWeight);
		

	}
	
	public static int calculateMaxPossibleWeightInSack ( List<Item> items, Sack sack, int value, Integer bestWeigth) {
		System.out.println("Start");
		
		if (value > sack.limit) {
			// Nothing
			System.out.println("LIMIT, current best weight: " + bestWeigth);
			return bestWeigth;
			
		} else if (items.isEmpty()) {
			// Nothing
			System.out.println("RESULT: " + value);
			
			if (value > bestWeigth) {
				bestWeigth = value;
			}
			return bestWeigth; 
			
		} else {
			Item item = items.get(items.size() - 1);
			// Make a new list
			List itemsNew = new ArrayList<Item>(items);
			items.remove(items.size() -1);
			
			int newValue = value + item.weigth;
			System.out.println("NEW WEIGHT: " + newValue);
			
			return calculateMaxPossibleWeightInSack(itemsNew, sack, newValue, bestWeigth);
			
		}
		
		
		
		
		
	}
}

