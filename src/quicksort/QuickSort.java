package quicksort;


public class QuickSort {
	public static int patitonArray(int []A,int begin,int end){
//		���λ�õ�Ԫ����Ϊ�ָ�Ԫ��
//		int x = A[end];
//		��begin��end֮�����ѡȡһ��Ԫ����Ϊ�ָ�Ԫ����������߿������������
	
		int pla =(int) Math.random()*(end-begin)+begin;
		int x = A[pla];
		A[pla] =  A[end];
		A[end] = x;
		
//		Ȼ�����һ�ν�����������ָ�Ԫ�ؽ�����endλ���ϣ�������
//		�ָ�λ�ÿ�ʼʱ��begin��λ��
		int fence = begin-1;
		for(int i=begin;i<end;i++){
			if(A[i]<=A[end]){
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
