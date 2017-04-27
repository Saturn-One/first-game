package firstpackage;

public class Player {
	//variables we will use
	private int x, y;
	private boolean left, right, up, down;
	
	
	public void update() {
		//In this function we will do the required checking and updates
	} //These 4 functions are able to set the direction
		public void setLeft (boolean newLeft){
			left = newLeft;
		} public void setRight (boolean newRight){
			right = newRight;
		} public void setUp (boolean newUp){
			up = newUp;
		} public void setDown (boolean newDown){
			down = newDown;
		}
		
		//This function will return x as an int.
		public int getX(){
			return x;
		}
		public int getY(){
			return y;
		}
		public void update(){
			move();
		}
		//This function will move the player according to its direction
		public void move(){
			if(left){
				x--;
			}if(right){
				x++;
			}if(up){
				y--;
			}if(down){
				y++;
			}
		}
	}

