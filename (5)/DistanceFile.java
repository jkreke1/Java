import java.io.*;

public class DistanceFile {
		//Fields to hold value for speed of train and number of hours traveling
		private int mphSpeed;
		private int numHoursTraveled;
		
		//Constructor calls setter methods for field values
		public DistanceFile(int Speed, int NumHours) {
			this.setMphSpeed(Speed);
			this.setNumHoursTraveled(NumHours);
		}
		
		//Methods to get and set values for fields
		public int getMphSpeed(){
			return mphSpeed;
		}
		public void setMphSpeed(int MphSpeed){
			this.mphSpeed = MphSpeed;
		}
		
		public int getNumHoursTraveled(){
			return numHoursTraveled;
		}
		public void setNumHoursTraveled(int NumHoursTraveled){
			this.numHoursTraveled = NumHoursTraveled;
		}
		
		//Method to determine and display the distance traveled
		public void getDistance() throws IOException{
			PrintWriter outputFile = new PrintWriter("DistanceFile.txt");
			int distance = 0;
			int mph = this.getMphSpeed();
			int hours = this.getNumHoursTraveled();
			outputFile.println("Hour      Distance Traveled");
			outputFile.println("---------------------------");
			for(int i = 1; i <= hours; i++){
				//Calculate distance traveled
				distance = i * mph;
				//Print distance traveled per mile to console
				outputFile.println(i + "              " + distance);
			}
			outputFile.close();
			
		}
}
