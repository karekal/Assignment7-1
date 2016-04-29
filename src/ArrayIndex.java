
public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
int arr[]={1,2,3,4};
System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException ee){
			System.out.println("dude your array size is 4 how can i print 5th element");
		}
	}

}
