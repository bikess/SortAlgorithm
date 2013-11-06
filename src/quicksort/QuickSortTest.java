package quicksort;

public class QuickSortTest extends QuickSort{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2,8,7,1,3,5,6,4};
		quickSort(A, 0, A.length-1);
		for(int i = 0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}

}
