
class OpenFileCommand implements Command{
	private FileSystemReceiver fs;
	OpenFileCommand(FileSystemReceiver fs){
		this.fs = fs;
	}
	@Override
	public void execute(){ 
		fs.openFile();
	}
}