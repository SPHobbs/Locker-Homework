
public class combinationLock {
	private byte com1;
	private byte com2;
	private byte com3;
	private byte currentPosition;
	private byte tick = 0;
	
	public void resetDial(byte Tick){
		Tick=tick;
		tick=0;
	}
	public void turnLeft(){
		tick=(byte) (40-(com2-currentPosition)%40);
		
	}
	public void turnRight(){
		tick=(byte) (((com1-currentPosition)+40)%40);
		tick=(byte) (((com3-currentPosition)+40)%40);
	}
	public boolean openLocker(byte input1,byte input2,byte input3){
		if(input1==com1)
		{
			if(input2==com2)
			{
				if(input3==com3)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}
