
public class ListNodeDemo {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);

        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

//        System.out.println(addTwoNumbers(l1,l2));
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);

//        ListNode node1 = l1;
//        ListNode node2 = l2;
//        int a = 0;
//
//        int i = 0;
//
//        while (true) {
//            a += node1.val * Math.pow(10, i);
//
//            if (node1.next != null) {
//                node1 = node1.next;
//                i++;
//            } else {
//                break;
//            }
//        }
//        int b = 0;
//        int j = 0;
//        while (true) {
//
//
//            b += node2.val * Math.pow(10, j);
//
//            if (node2.next != null) {
//                node2 = node2.next;
//                j++;
//            } else {
//                break;
//            }
//        }
//        int sum = a + b;
//        ListNode node3=res;
//        while (true) {
//            node3.val=sum%10;
//            sum/=10;
//            if(sum!=0){
//                node3.next = new ListNode(0);
//                node3=node3.next;
//            }else break;
//
//
//        }

        return res;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    };
    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }



}
