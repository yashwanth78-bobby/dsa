class Heap{
    public int arr[]=new int[100];
    int size=0;
    public Heap(){
        arr[0]=-1;
        size=0;
    }
    void insert(int val){
        size+=1;
        arr[size]=val;
        int ind=size;
        while(ind>1){
            int parent=ind/2;
            if(arr[parent]<arr[ind]){
                int temp=arr[parent];
                arr[parent]=arr[ind];
                arr[ind]=temp;
            }
            else {
                return;
            }
        }
    }
    void delete(){
        if(size==0) {
            System.out.println("Heap is Empty");
            return;
        }
        arr[1]=arr[size];
        size--;
        int i=1;
        while(i<size){
            int left=2*i;
            int right=2*i+1;
            if(left<size&&arr[left]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
                i=left;
            }
            else if(right<size&&arr[right]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[right];
                arr[right]=temp;
                i=right;
            }
            else return;
        }
    }
    void print(){
        for(int i=1;i<=size;i++) System.out.println(arr[i]);
    }
}
public class Main
{
    public static void heapify(int[] arr,int n,int ind){
    int largest=ind;
    int left=2*largest;
    int right=2*largest+1;
    if(left<n&&arr[left]>arr[largest]){
        largest=left;
    }
    if(right<n&&arr[right]>arr[largest]){
        largest=right;
    }
    if(largest!=ind){
        int temp=arr[largest];
        arr[largest]=arr[ind];
        arr[ind]=temp;
        heapify(arr,n,largest);
    }
}
	public static void main(String[] args) {
// 		Heap heap=new Heap();
// 		heap.insert(50);
// 		heap.insert(55);
// 		heap.insert(53);
// 		heap.insert(52);
// 		heap.insert(54);
// 		heap.print();
// 		System.out.println("after deletion");
// 		heap.delete();
// 		heap.print();
int arr[]={-1,54,53,55,52,50};
int n=5;
for(int i=n/2;i>0;i--){
    heapify(arr,n,1);
}
for(int i=1;i<=n;i++){
    System.out.println(arr[i]+"");
}
	}
}
