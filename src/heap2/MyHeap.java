package heap2;

public class MyHeap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[100];
		
		for(int i=0;i<8;i++){
			A[i]=i+1;
		}
		Heap h = new Heap(8, A);
		h.buildHeap();
		for(int i=0;i<h.len;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
//		int a=4,b=5;
//		int swap[]=new int[2];
//		swap[0]=a;
//		swap[1]=b;
//		h.exchangePlace(swap);
//		a=swap[0];
//		b=swap[1];
//		System.out.println("\n"+a+" "+b);
//		h.HeapSort();
//		for(int i=0;i<A.length;i++){
//			System.out.print(A[i]+" ");
//		}
//		System.out.println(h.getHeapTop());
//		int max = h.getHeapTopdel();
//		System.out.println(max);
//		for(int i=0;i<h.len;i++){
//			System.out.print(A[i]+" ");
//		}
		h.modifyHeap(4, 10);
		h.addHeap(11);
		for(int i=0;i<h.len;i++){
			System.out.print(A[i]+" ");
		}
	}

}
