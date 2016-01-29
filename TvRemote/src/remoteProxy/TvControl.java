package remoteProxy;

public class TvControl implements ControlInterface {

	private boolean power=false;
	private int currentChannel;
	private int maxChannel=5;
	private int currentVolume;
	private int maxVolume=5;
	
	public TvControl(int channel, int volume){
		this.currentChannel=channel;
		this.currentVolume=volume;
	}
	
	@Override
	public boolean powerOnOff() {
		// TODO Auto-generated method stub
		if(power==false){
			power=true;
			return power;
		}
		else{
			power=false;
		return power;
		}
	}

	@Override
	public int channelNext() {
		// TODO Auto-generated method stub
		if(currentChannel>maxChannel-1){
			currentChannel=0;
			return currentChannel;
		}
			
		else
			return ++currentChannel;
	}

	@Override
	public int channelPrevious() {
		// TODO Auto-generated method stub
		
		if(currentChannel<1)
			return	currentChannel=maxChannel;
		else 
			return	--currentChannel;
	}

	@Override
	public int volumeUp() {
		// TODO Auto-generated method stub
		if(currentVolume>maxVolume-1){
			return maxVolume;
		}
			
		else{
			return ++currentVolume;
		}
	}

	@Override
	public int volumeDown() {
		// TODO Auto-generated method stub
		if(currentVolume<1)
			return	currentVolume=0;
		else 
			return	--currentVolume;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

}
