package quicksort;

public class QuickSort {
	public static int patitonArray(int []A,int begin,int end){
//		最后位置的元素作为分割元素
		int x = A[end];
//		分割位置开始时在begin的位置
		int fence = begin-1;
		for(int i=begin;i<end;i++){
			if(A[i]<=x){
				fence++;//分割位置增加1
//				交换分割位置元素与此此时比分割元素小的位置的元素
				int temp = A[fence];
				A[fence] = A[i];
				A[i] = temp;
			}
		}
//		将分割元素放到分割位置上
		fence++;
		int temp = A[fence];
		A[fence] = A[end];
		A[end] = temp;
		return fence;
	}
	public static void quickSort(int []A,int begin,int end){
		if(begin<end){
			int fence = patitonArray(A, begin, end);
			quickSort(A, begin, fence-1);
			quickSort(A, fence+1, end);
		}
	}
}
