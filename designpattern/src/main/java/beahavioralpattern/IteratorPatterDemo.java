package beahavioralpattern;

public class IteratorPatterDemo {
	
	public static void main(String[] args) {
	      Collectionofcarss carrep = new Collectionofcarss();
	      
	      for(Iterator iter = carrep.getIterator(); iter.hasNext();){
	          String cars = (String)iter.next();
	          System.out.println("Cars : " + cars);
	       } 	
	      
	}
}
