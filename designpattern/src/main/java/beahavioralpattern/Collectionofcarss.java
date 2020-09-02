package beahavioralpattern;



public class Collectionofcarss implements Container {

	 public String cars[]={"Mercedes", "Ferrari","Rolls Royce","Audi","Lamborgini"}; 
	
	 public int no[]={12,34,4,45,87}; 
		
	 public String model[]={"e702", "hyper","ghost","r8","avatador"}; 
	 
	
	public Iterator getIterator() {
		
		return new CollectionofcarssIterate();
	}
	
	
	private class CollectionofcarssIterate implements Iterator{
		
		int i;

	
		public boolean hasNext() {
			if (i<cars.length){
				return true;
			}
			return false;
		}

		public Object next() {
			if(this.hasNext()){
	            return cars[i++];
			}
		    return null;	
		}
	
	}
}




