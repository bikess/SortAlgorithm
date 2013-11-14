package countSort;
//基数排序算法

public class JishuSort {

	/**
	 * @param args
	 */
	static int Array[] = new int[20];
	
//	基数排序算法
	
	public static void counting_sort(int[]A,int[]B,int k){
		int C[] = new int[k+1];
		for(int i=0;i<k;i++){
			C[i]=0;
		}
		for(int i=0;i<A.length;i++){
			C[A[i]]=C[A[i]]+1;
		}
		for(int i=1;i<k;i++){
			C[i]=C[i]+C[i-1];
		}
		for(int i=A.length-1;i>=0;i--){
			B[C[A[i]]-1]=Array[i];//一定要注意减1 ！！！！！
			C[A[i]]=C[A[i]]-1;
		}
//		这里将一轮排序后的值重新赋给Array
		Array=B;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =0;i<20;i++){
			Array[i]=(int)(Math.random()*998+1);//产生随机的三位整数
			System.out.print(Array[i]+" ");
		}
		System.out.print("\n");
		
//		int B[]=new int[20];
//		int A[]=new int[20];
//		A=Array;
//		counting_sort(A, B, 10);
	
//		计数排序的测试数据
//		int A[]={1,2,3,4,5,6,7,8,9,1,1,2,3,4,5,6,7,8,9,0};
//		int B[]=new int[20];
//		counting_sort(A, B, 10);
//		for(int i=0;i<A.length;i++)
//			System.out.print(B[i]+" ");
//		

		
//		基数排序要经过r轮排序完成，r表示排序的轮数也基数整数的位数
		int r=3;
		
//		计数排序的每一个元素位于0-k这个区间
		
		int k= 10;
		
		for(int i=1;i<=r;i++){
			int B[]=new int[20];
			int A[]=new int[20];
			for(int j=0;j<Array.length;j++){
				A[j]=(int) (Array[j]%Math.pow(10, i)/(Math.pow(10, i-1)));
				System.out.print(A[j]+" ");
			}
			System.out.println();
			counting_sort(A, B, k);
		}
		for(int i=0;i<Array.length;i++){
			System.out.print(Array[i]+" ");
		}
	}

}
