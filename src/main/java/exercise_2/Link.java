package exercise_2;

public class Link extends FileSystemComposite {

  private FileSystemComposite link;

  public Link(String name, String path, FileSystemComposite link) {
    super(name, path);
    this.link = link;
  }

  public FileSystemComposite getLink() {
    return link;
  }

}
