package quicksort;

public class QuickSort {
	public static int patitonArray(int []A,int begin,int end){
//		���λ�õ�Ԫ����Ϊ�ָ�Ԫ��
		int x = A[end];
//		�ָ�λ�ÿ�ʼʱ��begin��λ��
		int fence = begin-1;
		for(int i=begin;i<end;i++){
			if(A[i]<=x){
				fence++;//�ָ�λ������1
//				�����ָ�λ��Ԫ����˴�ʱ�ȷָ�Ԫ��С��λ�õ�Ԫ��
				int temp = A[fence];
				A[fence] = A[i];
				A[i] = temp;
			}
		}
//		���ָ�Ԫ�طŵ��ָ�λ����
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
