package heap;
import java.math.*;
public class Heap {
	
	public static int len;
//	public int len;
//	public int array[];
//	public Heap(int i,int[] A){
//		this.len=i;
//		this.array=A;
//	}
	//ȡ��ĳ�ڵ������λ��
	public static int getLeftchild(int i){
		
		return 2*i+1;
	}
	//ȡ��ĳ�ڵ���Һ���λ��
	public static int getrightchild(int i){
		return 2*i+2;
	}
	//ȡ��ĳ�ڵ�ĸ��ڵ�λ��
	public static int getParent(int i){
		return (i+1)/2-1;
	}
	//����2��Ԫ�ص�λ��
	public static  void exchangePlace(int a,int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
	//ά�������ʣ�������iΪ���Ķ��Ǵ����
	public static void maxHeapify(int[] array,int i){
		int largest;
		int left = getLeftchild(i);
		int right = getrightchild(i);
		if(left<len&&array[left]>array[i]){
			largest = left;
		}
		else
			largest = i;
		if(right<len&&array[right]>array[largest]){
			largest = right;
		}
		if(largest!=i){
			int temp;
			temp = array[largest];
			array[largest] = array[i];
			array[i] = temp;
			maxHeapify(array,largest);
		}
	}
//	������
	static void buildHeap(int[] A){

		int s=len/2-1;
		for(int i=s;i>=0;i--){
			maxHeapify(A,i);
		}
	}
//	������
	static void HeapSort(int[] A){
//		buildHeap(A);
		for(int i=A.length-1;i>=1;i--){
			int temp;
			temp = A[i];
			A[i] = A[0];
			A[0] = temp;
			len--;
//			System.out.print(A[0]+" ");
			maxHeapify(A,0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[8];
		for(int i=0;i<8;i++){
			a[i]=i+1;
		}
		len=a.length;
		buildHeap(a);
		
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		HeapSort(a);
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}






















