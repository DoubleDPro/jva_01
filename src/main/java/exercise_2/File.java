package exercise_2;

public class File extends FileSystemComposite {

  public File(String name, String path) {
    super(name, path);
  }

  public void addChild(FileSystemComposite fileSystemComposite) {
    super.add(fileSystemComposite);
  }
}
