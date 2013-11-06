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
	//取得某节点的左孩子位置
	public static int getLeftchild(int i){
		
		return 2*i+1;
	}
	//取得某节点的右孩子位置
	public static int getrightchild(int i){
		return 2*i+2;
	}
	//取得某节点的父节点位置
	public static int getParent(int i){
		return (i+1)/2-1;
	}
	//交换2个元素的位置
	public static  void exchangePlace(int a,int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
	//维护堆性质，保持以i为根的堆是大根堆
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
//	建立堆
	static void buildHeap(int[] A){

		int s=len/2-1;
		for(int i=s;i>=0;i--){
			maxHeapify(A,i);
		}
	}
//	堆排序
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






















