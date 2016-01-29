package remoteProxy;

public class TvRemoteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvControl tv=new TvControl(3,3);
		ControlInterface remote = new RemoteControl(tv);
		
		if(remote.powerOnOff()==true)
		System.out.println("Power ON");
		System.out.println("");
		
		System.out.println("Current channel "+tv.getCurrentChannel());
		System.out.println("");
		
		System.out.println("Next Channel "+remote.channelNext());
		System.out.println("Next Channel "+remote.channelNext());
		System.out.println("Next Channel "+remote.channelNext());
		System.out.println("Next Channel "+remote.channelNext());
		System.out.println("Next Channel "+remote.channelNext());
		System.out.println("Next Channel "+remote.channelNext());
		System.out.println("Next Channel "+remote.channelNext());
		
		System.out.println("");
		
		System.out.println("Previous Channel "+remote.channelPrevious());
		System.out.println("Previous Channel "+remote.channelPrevious());
		System.out.println("Previous Channel "+remote.channelPrevious());
		System.out.println("Previous Channel "+remote.channelPrevious());
		System.out.println("Previous Channel "+remote.channelPrevious());
		System.out.println("Previous Channel "+remote.channelPrevious());
		System.out.println("Previous Channel "+remote.channelPrevious());
		
		System.out.println("");
		
		System.out.println("Current volume "+tv.getCurrentVolume());
		
		System.out.println("");
		
		System.out.println("Volume up "+remote.volumeUp());
		System.out.println("Volume up "+remote.volumeUp());
		System.out.println("Volume up "+remote.volumeUp());
		System.out.println("Volume up "+remote.volumeUp());
		System.out.println("Volume up "+remote.volumeUp());
		System.out.println("Volume up "+remote.volumeUp());
		System.out.println("Volume up "+remote.volumeUp());
		
		System.out.println("");
		
		System.out.println("Volume down "+remote.volumeDown());
		System.out.println("Volume down "+remote.volumeDown());
		System.out.println("Volume down "+remote.volumeDown());
		System.out.println("Volume down "+remote.volumeDown());
		System.out.println("Volume down "+remote.volumeDown());
		System.out.println("Volume down "+remote.volumeDown());
		System.out.println("Volume down "+remote.volumeDown());
		
		System.out.println("");
		
		if(remote.powerOnOff()==false)
			System.out.println("Power OFF");
	}

}
