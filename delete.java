class node{
    int data;
    node next;
    node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class delete{
    public static node array2ll(int[]arr){
        node head =new node(arr[0]);
        node mover=head;
        for(int i=1;i<arr.length;i++){
            node temp=new node(arr[i]);
            mover.next=temp;
            mover=temp;
           

        }
        return head;
    }
    public static node deletellNode(node head,int k){
        if(head==null){
            
            return head;}
            if(k==1){
                
                head=head.next;
                return head;
            }
           int cnt=0;
           node temp=head;
           node prev=null;
           while(temp!=null){
            cnt++;
            if(cnt==k){
               
                prev.next=prev.next.next;
                break;


            }prev=temp;
            temp=temp.next;
           }
            return head;
        }

        
      
       
    
    public static void main(String []args){
        int []arr={1,2,3,4,5};
        node head=array2ll(arr);
        head=deletellNode(head, 3);
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        
    }
}

