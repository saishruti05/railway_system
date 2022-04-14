interface Queueinterface
{
	void add(int x);
	int delete();
	boolean isEmpty();
	boolean isFull();
	void display();
}

class Queue implements Queueinterface
{
	private int s[];
	private int front=-1,rear=-1,size;
	public 	Queue(int n){
		size=n;
		s=new int[n];
	}
	public void add(int x){
		if (front==-1 && rear==-1) {
			front=0;
			rear=0;
			s[rear]=x;
			return;
		}
		else{
			if ((rear+1)%size==front) {
				System.out.print("queue is full.\n");
				return;
			}
			rear=(rear+1)%size;
			s[rear]=x;
		}
	}

	public int delete(){
		if (front==rear) {
			System.out.print("queue is empty.\n");
			return -1;
		}
		else{
			front=(front+1)%size;
			int x=s[front];
			return x;
		}
	}

	public boolean isEmpty(){
		if (front==rear) {
			System.out.println("queue is empty");
			return true;
		}
		else return false;
	}

	public boolean isFull(){
		if ((rear+1)%size==front) {
			System.out.println("queue is full");
			return true;
		}
		else return false;
	}

	public void display(){
		for (int i=front+1;front!=rear ;i++ ) {
			System.out.print(s[i]+" ");
		}
	}
}