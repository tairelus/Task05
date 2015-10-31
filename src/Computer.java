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
		
		//Variables which are specific for desctop computers
		private int fixedMemorySizeGb;
    private String operationSystem;
		private String computerName;
    
    Computer(String computer_type, String processor_type) {
        computerType = computer_type;
				processorType = processor_type;
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
		void setProcessorClockRateGHz(float processor_clock_rate_ghz) {
			if (processor_clock_rate_ghz > 0)
				processorClockRateGHz = processor_clock_rate_ghz;
		}
		
		void setRandomAccessMemorySizeGb(float random_access_memory_size_gb) {
			if (random_access_memory_size_gb > 0)
				randomAccessMemorySizeGb = random_access_memory_size_gb;
		}
		
		void setFixedMemorySizeGb(int fixed_memory_size_gb) {
			fixedMemorySizeGb = fixed_memory_size_gb;
		}
		
		void setOperationSystem(String operation_system) {
			if (!operation_system.isEmpty())
				operationSystem = operation_system;
		}
		
		void setComputerName(String computer_name) {
			if (!computer_name.isEmpty())
				computerName = computer_name;
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
