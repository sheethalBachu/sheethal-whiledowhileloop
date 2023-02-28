package interviewsampleprog;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//looping concept means to avoid writing same again and again will use loopsconcept
		int i=1;//initialisation
		
		//1)while loop::check condition and it will execute statement
		//print 1 to 10
		while(i<=10) //condition
		{
			System.out.println(i);
			i++; //increment or decrement part i++ means i+1
		}
		
		System.out.println("*********");
		//disadvantage of while loop is if we not mention incremental or dec part then loop will generate infinite times
		//2)Do While loop::first execute statement and then it will check the condition
		
		
		int k=1;
		do {
			System.out.println(k);
			k++;
		}
		while(k>=10);
		
		System.out.println("*************");
			
		
		//3)for loop
		//print 1 to 10
		
		/*for(int j=1;j<=10;j++) //syntax;;;for(initialisation;conditionpart;inc/dec part)
		{
			System.out.println(j);
		}
		System.out.println("*****************");
		
		//print 10 to 1
		for(int n=10;n>=1;n--)
		{
			System.out.println(n);}
		}*/

	

}}
