package ua;


public class Main {

	public static void main(String[] args) {
		
	int count = 1;	
	
	int count1 = 0;
	
	int count2 = 0;
	
	int random = (int) Math.round(Math.random()*200+10);
	
	System.out.println("n = "+random);
	
	System.out.println(count+") "+random+" �� 1�");
	
	count++;
	
	if(random%2==0) {
		System.out.println(count+") "+random/2+" �� 2�");
		count++;
	}
	
	if(random%5==0) {
		System.out.println(count+") "+random/5+" �� 5�");
		count++;
	}
	
	if(random%10==0) {
		System.out.println(count+") "+random/10+" �� 10�");
		count++;
	}
	
	count=search1(2,random,count,count1);
	count=search1(5,random,count,count1);
	count=search1(10,random,count,count1);
	count=search2(2,5,random,count,count1,count2);
	count=search2(2,10,random,count,count1,count2);
	count=search2(5,10,random,count,count1,count2);
	count=search4(10,5,2,random, count, count1, count2);
	count=search4(5,2,1,random, count, count1, count2);
	count=search4(10,5,1,random, count, count1, count2);
	count=search5(10, 5, 2, 1, random, count, count1, count2);
	System.out.println("���������: ��������� "+random+"� ����� ��������� "+count+" ���������");
	

	
	
	
	
	
	}
	
	
	static int search1 (int a, int random,int count, int count1){
		
		while(random>a){
			random-=a;
			count1++;
			System.out.println(count+") "+random+" �� 1� + "+count1+" �� "+a+"�");
			count++;
		}
		return count;
	}
	
	
	
	static int search2 (int a, int b, int random,int count, int count1,int count2){
		while(random>a){
			random-=a;
			count1++;
			if((random)%b==0){
				count2=random/b;
				System.out.println(count+") "+count1+" �� "+a+"� + "+count2+" �� "+b+"�");
				count++;
			}
		}
		return count;
		
	}
	
	
	
	static int search3 (int a, int b,int c,int d, int random,int count, int count1,int count2){
		while(random>a){
			random-=a;
			count1++;
			if((random)%b==0){
				count2=random/b;
				System.out.println(count+") "+c+" �� "+d+"� +"+count1+" �� "+a+"� + "+count2+" �� "+b+"�");
				count++;
			}
		}
		return count;
		
	}
	
	
	static int search4 (int a,int b,int c ,int random, int count, int count1, int count2 ){
		random-=a;
		for(int count11=1;random>a;random-=a, count11++){
			if(random>b){
				count=search3(b, c, count11,a, random, count, count1, count2);
			}
		}
		return count;
	}
	
	static int search5 (int a,int b,int c ,int d,int random, int count, int count1, int count2 ){
		random-=a;
		for(int count11=1;random>a;random-=a, count11++){
			if(random>b){
				count=search6(a,b,c,d,random, count, count1, count2,count11);
			}
		}
		return count;
	}


	private static int search6(int a, int b, int c, int d, int random, int count, int count1, int count2,int count12) {
		random-=b;
		for(int count11=1;random>b;random-=b, count11++){
			if(random>c){
				count=search7(c, d, count11,a, random, count, count1, count2, count12);
			}
		}
		return count;
	}


	private static int search7(int c, int d, int count11, int a, int random, int count, int count1, int count2, int count12) {
		while(random>c){
			random-=c;
			count1++;
			if((random)%d==0){
				count2=random/d;
				System.out.println(count+") "+count12+" �� 10� +"+count11+" �� 5� + "+count1+" �� 2� +"+count2+" �� 1�");
				count++;
			}
		}
		
		return count;
	}

}
