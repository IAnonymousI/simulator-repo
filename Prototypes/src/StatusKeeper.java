
public class StatusKeeper{
	
	private int red_position = 0;
	private int red_velocity = 0;
	private int red_acceleration = 0;
	private int blue_position = 0;
	private int blue_velocity = 0;
	private int blue_acceleration = 0;
	private int white_position = 0;
	private int white_velocity = 0;
	private int white_acceleration = 0;
	
	public void setPos(int redPos, int bluePos, int whitePos){
		red_position = redPos;
		blue_position = bluePos;
		white_position = whitePos;
	}
	public void setVel(int redVel, int blueVel, int whiteVel){
		red_velocity = redVel;
		blue_velocity = blueVel;
		white_velocity = whiteVel;
	}
	public void setAcc(int redAcc, int blueAcc, int whiteAcc){
		red_acceleration = redAcc;
		blue_acceleration = blueAcc;
		white_acceleration = whiteAcc;
	}
	
	public int[] getPos(){
		return new int[] {red_position, blue_position, white_position};
	}
	public int[] getVel(){
		return new int[] {red_velocity, blue_velocity, white_velocity};
	}
	public int[] getAcc(){
		return new int[] {red_acceleration, blue_acceleration, white_acceleration};
	}
	
}
