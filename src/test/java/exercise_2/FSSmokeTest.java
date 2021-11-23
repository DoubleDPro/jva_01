package exercise_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FSSmokeTest {

  @Test
  void smokeTest() {
    FileSystemComposite parentDirectory =
        new Directory("Parent directory", "/home/parent_directory/");
    FileSystemComposite directory =
        new Directory("Directory", "/home/parent_directory/directory");
    FileSystemComposite file =
        new File("File", "/home/parent_directory/directory/file");
    FileSystemComposite link =
        new Link("Link to directory", "/home/parent_directory/directory/link", directory);

    parentDirectory.add(directory);
    parentDirectory.add(file);
    parentDirectory.add(link);


    FS fileSystem = new FS(parentDirectory);

    assertAll(
        () ->  assertEquals("FileSystemComposite{name='Parent directory', path='/home/parent_directory/'}", fileSystem.getParent().toString()),
        () -> assertEquals(3, parentDirectory.count())
    );

  }

}