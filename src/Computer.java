package bjs.task05;

/**
 * Created by YM on 31.10.2015.
 */
public class Computer {
    //Variables which are common for all computers
		private String computerType;
    private String processorType;
    private float processorClockRateGHz;
    private float randomAccessMemorySizeGb;
		
		//Variables which are specific for desktop computers
		private int fixedMemorySizeGb;
    private String operationSystem;
		private String computerName;
    
    Computer(String computer_type, String processor_type) {
        this.computerType = computer_type;
				this.processorType = processor_type;
    }

    void powerOn(){
				setProcessorClockRateGHz(3.10f);
				setRandomAccessMemorySizeGb(8.00f);
				setFixedMemorySizeGb(1000);
				
				setOperationSystem("Windows 7, x64");
				setComputerName("MyComputer");
    }

    void powerOff(){
        System.out.println("\nSystem \"" + computerName + "\" is shut down.");
    }
		
    @Override
    public String toString() {
        //toString() method defined for all existing Java objects and can be overridden for user-defined objects
        String result;
        result = "Computer type: " + computerType + "\n";
        result += "Processor type: " + processorType + "\n";
        
				result += "Processor clock rate: " + getProcessorClockRateGHz() + "\n";
        result += "Random access memory size: " + getRandomAccessMemorySizeGb()  + "\n";
				result += "Fixed memory size: " + getFixedMemorySizeGb() + "\n";
        result += "Operation system: " + getOperationSystem() + "\n";
        result += "Computer name: " + getComputerName() + "\n";

        return result;
    }
		
		//Setters
		void setProcessorClockRateGHz(float processorClockRateGHz) {
			if (processorClockRateGHz > 0)
				this.processorClockRateGHz = processorClockRateGHz;
		}
		
		void setRandomAccessMemorySizeGb(float randomAccessMemorySizeGb) {
			if (randomAccessMemorySizeGb > 0)
				this.randomAccessMemorySizeGb = randomAccessMemorySizeGb;
		}
		
		void setFixedMemorySizeGb(int fixedMemorySizeGb) {
			this.fixedMemorySizeGb = fixedMemorySizeGb;
		}
		
		void setOperationSystem(String operationSystem) {
			if (!operationSystem.isEmpty())
				this.operationSystem = operationSystem;
		}
		
		void setComputerName(String computerName) {
			if (!computerName.isEmpty())
				this.computerName = computerName;
		}
		
		//Getters
		float getProcessorClockRateGHz() {
			return processorClockRateGHz;
		}
		
		float getRandomAccessMemorySizeGb() {
			return randomAccessMemorySizeGb;
		}
		
		int getFixedMemorySizeGb() {
			return fixedMemorySizeGb;
		}
		
		String getOperationSystem() {
			return operationSystem;
		}
		
		String getComputerName() {
			return computerName;
		}
}
