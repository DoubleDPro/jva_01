package exercise_2;

public class Link extends FileSystemComposite {

  private String name;
  private String path;
  private FSItem link;
  private FSItem parent;

  public Link(String name, String path, FSItem link) {
    super(name, path);
    this.link = link;
  }

  public void addChild(FileSystemComposite fileSystemComposite) {
    super.add(fileSystemComposite);
  }

  public FSItem getLink() {
    return link;
  }

}
