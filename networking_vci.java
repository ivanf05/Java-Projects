import java.util.*;
//Ivan Fonseca
//Switch Object that has Incoming/Outgoing port and VCI
class Switch{
	private String in_port;
	private String in_vci;
	private String out_port;
	private String out_vci;
	Switch(String in_port,String in_vci,String out_port,String out_vci){
		this.in_port =in_port;
		this.in_vci=in_vci;
		this.out_port =out_port;
		this.out_vci=out_vci;
	}
	public void setIn_Port(String in_port){
		this.in_port= in_port;
	}
	public void setIn_Vci(String in_vci){
		this.in_vci= in_vci;
	}
	public void setOut_Port(String out_port){
		this.out_port= out_port;
	}
	public void setOut_Vci(String out_vci){
		this.out_vci= out_vci;
	}
	public String getIn_Port(){
		return in_port;
	}
	public String getIn_Vci(){
		return in_vci;
	}
	public String getOut_Port(){
		return out_port;
	}
	public String getOut_Vci(){
		return out_vci;
	}
	public String toString(){
		return String.format("Switch-Incoming: Port %s, VCI %s Outgoing: Port %s, VCI %s", getIn_Port(),getIn_Vci(),getOut_Port(),getOut_Vci());
		
	}
	
}

class networking_assignment3{
	public static void main(String args[]){
		String sources[]={"a","b","c","d","e"};
		String port_in[]={"1","1","2"};
		String vci_in[]={"14","66","22","77"};
		String port_out[]={"3","2","3"};
		String vci_out[]={" "," "," "};
		//Setup Request
		System.out.println("Setup Request");
		for(int i=0;i<sources.length;i++){
			//Source
			System.out.println("Request "+sources[i]);
			if(i<3){
				//Switch
				Switch s = new Switch(port_in[i],vci_in[i],port_out[i],vci_out[i]);
				System.out.println(s.toString());
			}
			//VCI = 77 once end of request is reached
			if(sources[i].equals("e")){
				System.out.println("VCI= "+vci_in[i-1]);
			}
		}
		//Sources reversed
		String sources2[]={"e","d","c","b","a"};
		int j=4;
		System.out.println("Setup Acknowledgement");
		//Setup Acknowledgement
		while(j !=-1){
			//Source with VCI value
			//Source sends/sets VCI outgoing value of switch
			if(j>1){
				Switch s = new Switch(port_in[j-2],vci_in[j-2],port_out[j-2],"");
				System.out.println("Request "+sources2[j]+" "+vci_in[j-1]);
				s.setOut_Vci(vci_in[j-1]);
				System.out.println(s.toString());
			}
			//Source with VCI value
			if(j<2){
				if(j>0){
					System.out.println("Request "+sources2[j] + " "+vci_in[j-1]);
				}
				else{
					System.out.println("Request "+sources2[j] + " VCI = "+vci_in[j]);
				}
			}
			j--;
		}
	}
}