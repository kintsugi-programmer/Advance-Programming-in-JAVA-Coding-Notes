import java.util.ArrayList;
//2D ArrayLists = a dynamic lists of lists
//you can change the size of these lists in run time
public class _20_ArrayLists_2D {



	public static void main(String[] args) {



		ArrayList<ArrayList<String>> groceryList = new ArrayList();



		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		System.out.println(bakeryList.get(2));

		ArrayList<String> produceList = new ArrayList();

		produceList.add("tomatoes");

		produceList.add("zucchini");

		produceList.add("peppers");



		ArrayList<String> drinksList = new ArrayList();

		drinksList.add("soda");

		drinksList.add("coffee");



		groceryList.add(bakeryList);

		groceryList.add(produceList);

		groceryList.add(drinksList);



		System.out.println(groceryList);
		System.out.println(groceryList.get(1).get(2)); //getting inside element



	}

}