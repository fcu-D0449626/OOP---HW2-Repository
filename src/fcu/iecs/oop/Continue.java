package fcu.iecs.oop;

public class Continue {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			if(i==0)
				continue;
			if(i==2)
			    continue;
			if(i>3)
				continue;
			System.out.println(i);
		}

	}

}
