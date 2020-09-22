public class ListNodeDemoR {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(2);

        t1.next = new ListNode(4);
        t1.next.next = new ListNode(3);

        ListNode t2 = new ListNode(5);
        t2.next = new ListNode(6);
        t2.next.next = new ListNode(4);

add(t1,t2);
//        System.out.println(add(t1, t2));
    }

    public static ListNode add(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        int flag1 = 1;
        int flag2 = 1;
        int flag3 = 0;
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode node3 = res;
        while (true) {

            int temp = node1.val * flag1 + node2.val * flag2 + flag3;
            if (node1.next == null) {
                flag1 = 0;
            }
            if (node2.next == null) {
                flag2 = 0;
            }
            if (temp < 10) {
                node3.val = temp;
                flag3 = 0;

            } else if (temp >= 10) {
                node3.val = temp % 10;
                flag3 = 1;
            }
            if (flag1 + flag2 + flag3 == 0) {
                break;
            }
            node3.next = new ListNode(0);
            node3 = node3.next;


            if (flag1 == 1) {
                node1 = node1.next;
            }
                if (flag2 == 1) {
                    node2 = node2.next;
                }



        }
        return res;
    }
}
