public class SnakeLadder{
	public static void main(String[] args){
		System.out.println("Welcome to Snake Ladder Problem Statement");

		//constants
		int INITIAL_POSITION=0, NO_OF_PLAYERS=1;
		int NO_PLAY=0,LADDER=1,SNAKE=2;
		int count=0;

		//computation
		while(INITIAL_POSITION<100)
		{
			count++;
			int face_number=(int)Math.floor(Math.random()*10)%6 + 1;
			int check=(int)Math.floor(Math.random()*10)%3;
			switch(check)
			{
				case 0:
					break;
				case 1:
					if(INITIAL_POSITION+face_number<=100)
					INITIAL_POSITION+=face_number;
					break;
				case 2:
					if(INITIAL_POSITION>=face_number)
					INITIAL_POSITION-=face_number;
					break;
			}
			System.out.println(INITIAL_POSITION);
		}
		System.out.println(count);
	}
}