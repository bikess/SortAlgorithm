package heap2;
//�������Ƕ�ջ�Ľ������������
public class Heap {
	
	public int len;//�ѵĳ���
	public int array[];
	public Heap(int i,int[] A){
		this.len=i;
		this.array=A;
	}
	//ȡ��ĳ�ڵ������λ��
	public int getLeftchild(int i){
		
		return 2*i+1;
	}
	//ȡ��ĳ�ڵ���Һ���λ��
	public int getrightchild(int i){
		return 2*i+2;
	}
	//ȡ��ĳ�ڵ�ĸ��ڵ�λ��
	public int getParent(int i){
		return (i+1)/2-1;
	}
	//����2��Ԫ�ص�λ��
	public void exchangePlace(int [] s){
		int temp;
		temp = s[1];
		s[1] = s[0];
		s[0] = temp;
	}
	//ά�������ʣ�������iΪ���Ķ��Ǵ����
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
//	������
	void buildHeap(){
		int s=len/2-1;
		for(int i=s;i>=0;i--){
			maxHeapify(i);
		}
	}
//	������
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
//	���ضѶ�Ԫ��
	int getHeapTop(){
		return array[0];
	}
//	���ضѶ�Ԫ�أ���ɾ��
	int getHeapTopdel(){
		int m = array[0];
		array[0]=array[len-1];
		len--;
		maxHeapify(0);
		return m;
	}
//	�޸Ķ��е�ĳ��Ԫ��
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
//	���һ��Ԫ�ص�����
	void addHeap(int key){
		len=len+1;
		modifyHeap(len-1, key);
	}
}
