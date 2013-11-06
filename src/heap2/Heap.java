package heap2;
//本程序是堆栈的建立与排序程序
public class Heap {
	
	public int len;//堆的长度
	public int array[];
	public Heap(int i,int[] A){
		this.len=i;
		this.array=A;
	}
	//取得某节点的左孩子位置
	public int getLeftchild(int i){
		
		return 2*i+1;
	}
	//取得某节点的右孩子位置
	public int getrightchild(int i){
		return 2*i+2;
	}
	//取得某节点的父节点位置
	public int getParent(int i){
		return (i+1)/2-1;
	}
	//交换2个元素的位置
	public void exchangePlace(int [] s){
		int temp;
		temp = s[1];
		s[1] = s[0];
		s[0] = temp;
	}
	//维护堆性质，保持以i为根的堆是大根堆
	public  void maxHeapify(int i){
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
			maxHeapify(largest);
		}
	}
//	建立堆
	void buildHeap(){
		int s=len/2-1;
		for(int i=s;i>=0;i--){
			maxHeapify(i);
		}
	}
//	堆排序
	void HeapSort(){
		for(int i=array.length-1;i>=1;i--){
			int temp;
			temp = array[i];
			array[i]=array[0];
			array[0]=temp;
			len--;
			maxHeapify(0);
		}
	}
//	返回堆顶元素
	int getHeapTop(){
		return array[0];
	}
//	返回堆顶元素，并删除
	int getHeapTopdel(){
		int m = array[0];
		array[0]=array[len-1];
		len--;
		maxHeapify(0);
		return m;
	}
//	修改堆中的某个元素
	void  modifyHeap(int i, int key){
		if(i>=len){
			
		}
		else
		{
		array[i] = key;
		while(i>0&&array[i]>getParent(i)){
			int p = getParent(i);
			int temp = array[p];
			array[p] = array[i];
			array[i] = temp;
			
			i=p;
		}
		}
	}
//	添加一个元素到堆中
	void addHeap(int key){
		len=len+1;
		modifyHeap(len-1, key);
	}
}
