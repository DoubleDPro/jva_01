package exercise_1;

public class Link extends AbstractFSItem {

  private String name;
  private String path;
  private FSItem link;
  private FSItem parent;

  public Link(String name, FSItem parent, String path, FSItem link) {
    super(name, parent, path);
    this.link = link;
  }

  public FSItem getLink() {
    return link;
  }

}
