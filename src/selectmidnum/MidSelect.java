package selectmidnum;

//这是选择某个数值中，第i大元素的算法，采用快速排序的思路

public class MidSelect {

	/**
	 * @param args
	 */
//	这是用于选取一个元素，将一段数值分为两部分，前面的元素都比此元素小，后面的元素都比此元素大
	public static int SelectFence(int []A,int begin, int end){
		
		int x=(int)(Math.random()*(end-begin)+begin);//得到一个begin到end 的随机数
		
//	将随机数位置上的元素与end位置的元素交换
		int compare = A[x];
		A[x] = A[end];
		A[end] = compare;
		
//		分界元素的位置
		int fence = begin-1;
		
		for(int i=begin;i<end;i++){
			if(A[i]<=compare){
				fence++;
				
//				交换fence位置与i位置的元素
				int temp = A[fence];
				A[fence] = A[i];
				A[i] = temp;
			}
		}
		fence++;
//		将分割元素放到适当的位置上
		int temp = A[fence];
		A[fence] = A[end];
		A[end] = temp;	
		
		return fence;
	}
	
	
//	 这是选取第i大数字的算法
	public static int SelectMaxNum(int []A,int begin,int end,int r){
		
		if(begin==end)
			return A[begin];
		else{
		int q = SelectFence(A, begin, end);
		
//		算出q在数组中的位置
		int k = q-begin+1;
		
		if(k==r){
			return A[q];
		}
		else
//		说明在前半部分
		if(k>r){
			return SelectMaxNum(A, begin, q-1, r);
		}
//		说明在后半部分
		else{
			return SelectMaxNum(A, q+1, end, r);
		}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		定义数组
		int A[] = new int [20];
		for(int i=0;i<20;i++){
			A[i]=(int)(Math.random()*99+1);
			System.out.print(A[i]+" ");
		}
		System.out.println();
		
//		定义选取数组中第i大的数字
		int r = 20;
//		  调用选择中位数函数
		int maxi = SelectMaxNum(A, 0, A.length-1, r);
		System.out.println(maxi);
	}

}
