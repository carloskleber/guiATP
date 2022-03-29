package mhd.guiATP.model.lcc;

import org.junit.jupiter.api.Test;

public class LineConstantsTest {

  @Test
  void testLine1() {
    System.out.println("line1");
    LineConstants instance  = new LineConstants();
    instance.getPhases().add(new Bundle());
    String s = instance.generate();
  }
}
