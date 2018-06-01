
class FileInvoker{
	Command c;
	FileInvoker(Command c){
		this.c = c;
	}
	void execute(){
		c.execute(); 
	}
}