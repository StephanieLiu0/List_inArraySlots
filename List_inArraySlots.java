/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    private int[] list;
    private int filledElements;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
	list = new int[10];
	filledElements = 0;
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
	return filledElements;
    }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
	String output = "[";
	for (int i = 0; i < filledElements; i++) {
	    output += list[i] + ",";
	}
	output += "]";
	return output;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
	 if (filledElements == list.length)
	     expand();
	 list[filledElements] = value;
	 return true;
     }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
	 System.out.println( "expand... (for debugging)");
	 int[] oldList = list;
	 list = new int[filledElements * 2];
	 for (int i = 0; i < filledElements; i++) {
	     list[i] = oldList[i];
	 }
     }
}
