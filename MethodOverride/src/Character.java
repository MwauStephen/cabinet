import java.util.List;

	public class Character {
		public String FirstName;
		public String SecondName;
		
		//create a getters method for firstname
		public String getFirstName() {
			return FirstName;
		}
		
		//create the setters method for firstname
		public void setFirstName(String Fc) {
			FirstName=Fc;
		}
		
		
		//create getters for secondname
		public String getSecondName() {
			return SecondName;
		}

		//create a setter for secondname
		public void setSecondName(String Sc) {
			SecondName=Sc;
		}
		
		//create a getter for fullname 
		public String getFullName() {
			return FirstName+""+SecondName;
		}
		public String Output() {
			return "Hi, my name is"+" "+getFullName()+".";
		} 
		//overload the above method
		 public String Output(boolean word) {
			 if(word) {
			 return getFullName()+","+" "+"You dont need a new day to start over,you only need a new mindset";
		 }
			 return "Dont give up the  beginning is always hard";
		 }
		
		//static method
		 public static void printNames(List<Character> ch) {
		    	for(Character c:ch) {
		    	System.out.println(c.getFullName());
	}
		 }
		 //searching through a list
		 public static int  searchList(List<Character> ch,String Fc,String Sc) {
	      return searchList(ch,Fc+" "+Sc);
		 }
		 //an overload of the method above
		 public static int searchList(List<Character> ch, String FullName) {
			 for(int i=0;i<ch.size();i++) {
		    	  if(ch.get(i).getFullName().equals(FullName)){
		    		  return i;
		    	  }
		      }
		      return -1;
		 }
		 //overide a method

		@Override
		public String toString() {
			return "Character [FirstName=" + FirstName + ", SecondName=" + SecondName + ", getFullName()=" + getFullName()
					+ "]";
		}
		//override equals method

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
			result = prime * result + ((SecondName == null) ? 0 : SecondName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Character other = (Character) obj;
			if (FirstName == null) {
				if (other.FirstName != null)
					return false;
			} else if (!FirstName.equals(other.FirstName))
				return false;
			if (SecondName == null) {
				if (other.SecondName != null)
					return false;
			} else if (!SecondName.equals(other.SecondName))
				return false;
			return true;
		}
		
	}
	 

