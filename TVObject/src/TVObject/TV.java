package TVObject;

public class TV {
 public int channel;
 public int VolumeLevel;
 public boolean on=false;
 
public int getChannel() {
	return channel;
}
public void setChannel(int channel) {
	if(on&& channel>=1 && channel<=7)
	this.channel = channel;
}
public int getVolumeLevel() {
	return VolumeLevel;
}
public void setVolumeLevel(int volumeLevel) {
	if(on&& VolumeLevel>=1 && VolumeLevel<=7)
	VolumeLevel = volumeLevel;
}
public boolean isOn() {
	return on;
}
public void setOn(boolean on) {
	this.on = on;
}
}
