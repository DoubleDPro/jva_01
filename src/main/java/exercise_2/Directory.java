package exercise_2;

public class Directory extends FileSystemComposite {

  public Directory(String name, String path) {
    super(name, path);
  }

  public void addChild(FileSystemComposite fileSystemComposite) {
    super.add(fileSystemComposite);
  }

}
