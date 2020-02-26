/** 
*The purpose of this class is to model a television
*Carl Szeless and 2/25/20
*/

public class Television {

	private String manufacturer; // who makes the television
	private int screenSize; // size of the television
	int channel; // channel the television is on
	int volume; //volume of the television
	boolean powerOn; //choose if the power is on or off
	
	
	
	/**
	 * Television construct the initial television
	 * initial television
	 */
	public Television(String brand, int size) {
		manufacturer = brand;
		screenSize = size;
		channel = 2;
		volume = 20;
		powerOn = false;
				
	}
	
	/**
	 * gets the Television manufacturer
	 * @return the television's manufacturer
	 */
	 public String getManufacturer() {
		 return manufacturer;
	 }
	 
   /**
	* gets the Television screen size
	* @return the television's screen size
	*/
	 public int getScreenSize() {
		 return screenSize;
	 }
	 
	   /**
		* gets the Television channel
		* @return the television's channel
		*/
	 public int getChannel() {
		 return channel;
	 }
	 
	   /**
		* gets the Television volume
		* @return the television's volume
		*/
	 public int getVolume() {
		 return volume;
	 }
	
		/**
		 * increaseVolume increase volume by one
		 * @param volune + 1
		 */
	 public void increaseVolume() {
		 volume += 1;
	 }
	 
		/**
		 * decreaseVolume decrease volume by one
		 * @param volune - 1
		 */
	 public void decreaseVolume() {
		 volume -= 1;
	 }
	 
		/**
		 * set channel lets the user input a channel
		 * @param the television's channel is set to channel_num
		 */
	 public void setChannel(int channel_num) {
		 channel = channel_num;
	 }
	 
		/**
		 * turns the power from on to off and vice-versa
		 * @param powerOn is set to its opposite
		 */
	 public void power() {
		 powerOn = !powerOn;
	 }
	 
	 
}







