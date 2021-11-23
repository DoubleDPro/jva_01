package exercise_2;

public class Link extends FileSystemComposite {

  private FSItem link;

  public Link(String name, String path, FSItem link) {
    super(name, path);
    this.link = link;
  }

  public FSItem getLink() {
    return link;
  }

}
