package mhd.guiATP.model;

import mhd.guiATP.model.component.Component;

import java.util.ArrayList;
import java.util.List;

public class Case {

  List<Node> nodes;
  List<Component> components;

  void Case() {
    nodes = new ArrayList<>();
    components = new ArrayList<>();
  }

  /**
   * Generate the ATP file
   */
  public String generateATP(String file) {
    String s = "BEGIN NEW DATA CASE\n";

    s += "";
    return s;
  }
}
