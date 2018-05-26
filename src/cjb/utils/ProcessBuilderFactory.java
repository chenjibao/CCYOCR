package cjb.utils;


public class ProcessBuilderFactory {
	private static ProcessBuilder processBuilder=new ProcessBuilder(); 
	public static ProcessBuilder getProcessBuilder(){
		if(processBuilder==null){
			processBuilder=new ProcessBuilder();
			return processBuilder;
		}
		return processBuilder;
	}
}
