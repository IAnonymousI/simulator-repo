
public class StatusKeeper{
	
	private int red_position_x = 0;
	private int red_position_y = 0;
	private int red_velocity_x = 0;
	private int red_velocity_y = 0;
	private int red_acceleration_x = 0;
	private int red_acceleration_y = 0;
	private int blue_position_x = 0;
	private int blue_position_y = 0;
	private int blue_velocity_x = 0;
	private int blue_velocity_y = 0;
	private int blue_acceleration_x = 0;
	private int blue_acceleration_y = 0;
	private int white_position_x = 0;
	private int white_position_y = 0;
	private int white_velocity_x = 0;
	private int white_velocity_y = 0;
	private int white_acceleration_x = 0;
	private int white_acceleration_y = 0;
	
	public void setPos(int redPosX, int redPosY, int bluePosX, int bluePosY, int whitePosX, int whitePosY){
		red_position_x = redPosX;
		red_position_y = redPosY;
		blue_position_x = bluePosX;
		blue_position_y = bluePosY;
		white_position_x = whitePosX;
		white_position_y = whitePosY;
	}
	public void setVel(int redVelX, int redVelY, int blueVelX, int blueVelY, int whiteVelX, int whiteVelY){
		red_velocity_x = redVelX;
		red_velocity_y = redVelY;
		blue_velocity_x = blueVelX;
		blue_velocity_y = blueVelY;
		white_velocity_x = whiteVelX;
		white_velocity_y = whiteVelY;
	}
	public void setAcc(int redAccX, int redAccY, int blueAccX, int blueAccY, int whiteAccX, int whiteAccY){
		red_acceleration_x = redAccX;
		red_acceleration_y = redAccY;
		blue_acceleration_x = blueAccX;
		blue_acceleration_y = blueAccY;
		white_acceleration_x = whiteAccX;
		white_acceleration_y = whiteAccY;
	}
	
	public int[] getPos(){
		return new int[] {red_position_x, red_position_y, blue_position_x, blue_position_y, white_position_x, white_position_y};
	}
	public int[] getVel(){
		return new int[] {red_velocity_x, red_velocity_y, blue_velocity_x, blue_velocity_y, white_velocity_x, white_velocity_y};
	}
	public int[] getAcc(){
		return new int[] {red_acceleration_x, red_acceleration_y, blue_acceleration_x, blue_acceleration_y, white_acceleration_x, white_acceleration_y};
	}
	
}
