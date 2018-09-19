import java.util.*;
public class ProblemC{
	static class Node{
		char c;
		Node next;
		Node prev;

		public Node(char c){
			this.c = c;
			this.next = null;
			this.prev = null;
		}
	}

	static Node head = null;

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		char [] colors = input.nextLine().trim().toCharArray();
		Node prev = head;
		for(int i=0;i<colors.length;i++){
			Node node = new Node(colors[i]);
			if(prev==null){
				head = node;
			}
			node.prev = prev;
			if(prev!=null){
				prev.next = node;
			}
			prev = node;
		}
		
		int count = 0;
		while(true){
			boolean delete = false;
			Node temp = head;
			Node p = null;
			Node newhead = null;
			while(temp!=null){
				if(temp.next!=null && temp.c != temp.next.c){
					temp = temp.next;
					delete = true;
					continue;
				}
				if(temp.prev!=null && temp.c!=temp.prev.c){
					temp = temp.next;
					delete = true;
					continue;
				}
				if(p==null){
					newhead = temp;
					p = temp;
					temp = temp.next;
					continue;
				}
				p.next = temp;
				temp.prev = p;
				p = temp;
				temp = temp.next;
			}
			head = newhead;
			if(!delete){
				break;
			}
			count++;
		}
		
		System.out.println(count);
	}
}
