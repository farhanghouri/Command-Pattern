
class UnixFileSystemReceiver implements FileSystemReceiver{
	@Override
	public void openFile(){
		System.out.println("unix file is opened.");
	}
	@Override
	public void readFile(){}
	@Override
	public void writeFile(){}

	public void hello(){
		System.out.println("hello");
	}
}