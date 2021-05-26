package arraylist;

public class CityList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cityList=new ArrayList<String>();
		 
		
		//add some cities in the list
		cityList.add("London");
		cityList.add("Paris");
		cityList.add("Denver");
		cityList.add("Miami");
		cityList.add("Huwaii");
		cityList.add("NewYork");
		//print the size of the arrayList
		System.out.println("List size?"+cityList.size());
		System.out.println("Is Miami in the list?"+cityList.contains("Miami"));
		System.out.println("The location of Denver in the list?"+cityList.indexOf("Denver"));
		System.out.println("Is the list empty?"+cityList.IsEmpty());
		
		//insert a new city in the list
		cityList.add("2","Central City");
		
		//remove a city from the list
		cityList.remove("Huwaii");
		
		//remove a city at index 1
		cityList.remove(1);
		
		//display the contents of in the list
		System.out.println(cityList.toString());
		
		//display the contents on the list in reverse order
		for(int i=cityList.size()-1; i>=0; i--) {
			System.out.println(cityList.get(i)+" ");
			System.out.println();
		}
		

	}

}
