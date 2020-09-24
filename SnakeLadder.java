public class SnakeLadder{
	public static void main(String[] args){
		System.out.println("Welcome to Snake Ladder Problem Statement");

		//constants
		int INITIAL_POSITION=0, NO_OF_PLAYERS=2,INITIAL_POSITION_1=0, INITIAL_POSITION_2=0;
		int NO_PLAY=0,LADDER=1,SNAKE=2;
		int count=0;
		int player=1;

		//computation
		while(INITIAL_POSITION<100)
		{
			int face_number=(int)Math.floor(Math.random()*10)%6 + 1;
			int check=(int)Math.floor(Math.random()*10)%3;
			switch(check)
			{
				case 0:
					break;
				case 1:
					if(INITIAL_POSITION+face_number<100)
					{
						INITIAL_POSITION+=face_number;
						face_number=(int)Math.floor(Math.random()*10)%6 + 1;
						check=(int)Math.floor(Math.random()*10)%3;
						continue;
					}
					else if(INITIAL_POSITION+face_number==100)
					{	
						INITIAL_POSITION=100;
						break;
					}
				case 2:
					if(INITIAL_POSITION>=face_number)
					INITIAL_POSITION-=face_number;
					break;
			}

			if(player==2)
			{	
				if(INITIAL_POSITION==100)
				{
					System.out.println("Player 2");
					break;
				}
				INITIAL_POSITION_2=INITIAL_POSITION;
				player=1;
				INITIAL_POSITION=INITIAL_POSITION_1;

			}				
			else
			{
				if(INITIAL_POSITION==100)
				{	
					System.out.println("Player 1");
					break;
				}
				INITIAL_POSITION_1=INITIAL_POSITION;
				player=2;
				INITIAL_POSITION=INITIAL_POSITION_2;
			}
		}
	}
}