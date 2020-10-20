package JavaBasics;

public class Naveen_Class5_2Darray {

	public static void main(String[] args) {
		String s[][]=new String[2][3];//no of rows-0,1 and no of col 0,1,2
		System.out.println(s.length);
		System.out.println(s[0].length);
		
		s[0][0]="neeraj";
		s[0][1]="11/07/2020";
		s[0][2]="&&gg";
		s[1][0]="333";
		s[1][1]="true";//only true incorrect
		s[1][2]="***";
		
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s[0].length;j++){
				System.out.println(s[i][j]);
			}
		}

				
			
		

	}

}
