//package Array_Programs;

//import java.lang.reflect.Array;

public class Array_Sample_Program {

	public static void main(String[] args) {
		Array_Sample_Program arrayObj = new Array_Sample_Program();
		arrayObj.Printing_Array();
		arrayObj.Reverse_Array();
		arrayObj.count_max_number();
		arrayObj.average_number();
		arrayObj.higest_number();
		arrayObj.lowest_number();
		arrayObj.first_two_big();
		arrayObj.move_leftside();
		arrayObj.first_non_repeated();
		arrayObj.second_non_repeated();
		arrayObj.find_repeated_elements();
		}

	private void find_repeated_elements() {
		// Array to find the repeated elements
		char[] name= {'E','O','F','A','S','S','T'};
		int i =1, count =0, j=0;
		char first = name[0];
		boolean repeated = false;
		for(i=1;i<name.length;i++) {
			if(first==name[i]) {
				repeated = true;
				break;
			}
			else {
				continue;
			}
		}
		while(repeated==false){
			first = name[j];
			for(i=j+1;i<name.length;i++){
			if(first==name[i]){
			System.out.println("Repeated Elements: "+first);
			repeated = true;
			//break;
			count ++;
			System.out.println("Count of attempt: "+count);
			}
			else {
				continue;
				}
			}
			j++;
			}
		}

	private void second_non_repeated() {
		// Second array non repeated elements
		char[] name = {'S','A','S','H','I','L'};
		int i =1;
		char first = name[0];
		boolean repeated = false;
		while(i<name.length) {
			if(first==name[i]) {
				repeated = true;
				//System.out.println("Repeated Elements");
				break;
			}
		i++;
	}
		first = name[i-1];
		repeated = false;
		while(i<name.length) {
		if(first == name[i]) {
			repeated = true;
			break;
		}
		i++;
		}
		if(repeated == false) {
			System.out.println("Non Repeated Elements \t" +first);
		}
	}

	private void first_non_repeated() {
		// First non repeated array element
		char[] name = {'S','A','T','H','I'};
		int i =1;
		char first = name[0];
		boolean repeated = false;
		while(i<name.length) {
			if(first!=name[i]) {
				//break;
			}
			i++;
			if(i==name.length) {
				System.out.println("First Non Repeated is: "+first);
			}
		}
		}

	private void move_leftside() {
		// Shifting all elements to left side
		String Name[] = {"AAAA","BBBB","CCCC","DDDD"};
		String extra = Name[0];
		int i=0;
		while(i<Name.length-1) {
			Name[i]=Name[i+1];
			i++;
			System.out.println(Name[i]);
		}
		Name[i] = extra;
		System.out.println(Name[i]);
		}

	private void first_two_big() {
		// First 2 biggest number in an Array
		int[] values = {175,180,195,199,165,160,150};
		int first =0, second =0;
		for(int i=0; i<values.length; i++)
			if(values[i]>first) {
				second = first;
				first = values[i];
			}
			else if(values[i]>second){
				second = values[i];
			}
		System.out.println("First heigest values is: "+first+"\t Second Higest Value: "+second);
	}

	private void lowest_number() {
		// Lowest mark scored in subject
		int[] marks = {90,95,85,75,60};
		String Name[]= {"Tamil","English","Maths","Science","Social Science"};
		int lowest = marks[0];
		String Sub = Name[0];
		for(int i =0; i<marks.length; i++)
			if(marks[i]<lowest) {
				lowest = marks[i];
				Sub = Name[i];
			}
		System.out.println("Lowest mark in: "+lowest+"\t Subject: "+Sub);
	}

	private void higest_number() {
		// Highest mark in subject
		int higest = 0; 
		String Sub = null;
		int[] marks = {90,95,85,75,60};
		String Name[]= {"Tamil","English","Maths","Science","Social Science"};
		for(int i=0; i<marks.length; i++)
			if(marks[i]>higest) {
				higest = marks[i];
				Sub = Name[i];
			}
		System.out.println("Higest Mark in: "+higest+"\t Subject: "+Sub);
	}

	private void average_number() {
		// mark scored min and print how many subject
		int[] marks = {90,95,85,75,60};
		int total =0;
		for(int i=0; i<marks.length; i++) {
			total = total + marks[i];
		}
		System.out.println("Total Marks Scored in: "+total);
		System.out.println("Average is : "+total/marks.length);
	}

	private void count_max_number() {
		// mark scored max in 90 and print how many subject
		int[] marks = {90,95,85,75,60};
		int count=0;
		for(int i=0; i<marks.length; i++)
		if(marks[i]>=90) {
			count ++;
			System.out.println("Mark Scored in Subjects are: "+marks[i]+"\tCount of subject: "+count);
		}
		
	}

	private void Reverse_Array() {
		// Reverse Printing in Array Program
		int[] marks = {90,95,85,75,60};
		for(int i =marks.length-1;i>=0;i--) {
			System.out.println("Reverse value of Array is: "+marks[i]);
		}
		
	}

	private void Printing_Array() {
		// Printing an Array Programs
		 int[] marks = {90,95,85,75,60};
		 for(int i=0;i<5;i++) {
			 System.out.println("The Printing values of Array is: "+marks[i]);
		 }
	}

}

