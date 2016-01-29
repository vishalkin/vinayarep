package remoteProxy;

public class RemoteControl implements ControlInterface {
	private ControlInterface tv;
	
	public RemoteControl(ControlInterface tv){
		this.tv=tv;
	}
	
	@Override
	public boolean powerOnOff() {
		// TODO Auto-generated method stub
		return tv.powerOnOff();
	}


	@Override
	public int channelNext() {
		// TODO Auto-generated method stub
		return tv.channelNext();
	}

	@Override
	public int channelPrevious() {
		// TODO Auto-generated method stub
		return tv.channelPrevious();
	}

	@Override
	public int volumeUp() {
		// TODO Auto-generated method stub
		return tv.volumeUp();
	}

	@Override
	public int volumeDown() {
		// TODO Auto-generated method stub
		return tv.volumeDown();
	}

}
