public class PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        String input = "level";
        Node head = null, tail = null;
        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        Node first = head;
        Node second = prev;
        boolean isPalindrome = true;
        while (second != null) {
            if (first.data != second.data) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}