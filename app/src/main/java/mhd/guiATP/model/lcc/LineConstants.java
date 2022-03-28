package mhd.guiATP.model.lcc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LineConstants extends LCC {

  List<Bundle> phases;
  List<Conductor> groundWires;
  boolean skin;
  double rho;
  double freq;
  int icpr;
  int izpr;
  int icap;
  int iseg;

  public LineConstants() {
    phases = new ArrayList<>();
    groundWires = new ArrayList<>();
    skin = true;
  }

  @Override
  public String generate() {
    String s = """
    BEGIN NEW DATA CASE
    LINE CONSTANTS
    METRIC
    """;

    for (Bundle f : phases) {
      if (f.getNc() == 1) {
        s += String.format("%3d%5f%8f%2d%8%8f%8f%8f%8f\n", f.getIp(), f.getSkin(), resis, ix, react, f.getDiam(), f.getHoriz(), f.getVtower(), f.getVmid());
      } else {
        s += String.format("%3d%5f%8f%2d%8%8f%8f%8f%8f%8f%6f%2d\n", f.getIp(), f.getSkin(), resis, ix, react, f.getDiam(), f.getHoriz(), f.getVtower(), f.getVmid(), f.getSepar(), f.getAlpha(), f.getNc());
      }
    }
    for (Conductor g : groundWires) {
      s += String.format("  0%5f%8f%2d%8%8f%8f%8f%8f\n", sk, resis, ix, react, f.getDiam(), f.getHoriz(), f.getVtower(), f.getVmid());
    }
    s += "BLANK CARD ENDING CONDUCTOR CARDS\n";
    // Frequency
    x +== String.format("%8f%10f%10f%06d%06d%1d%1d", rho, freq, fcar, icpr, izpr, icap, iseg);
    s += """
    BLANK CARD ENDING FREQUENCY CARDS
    BLANK CARD ENDING LINE CONSTANT
    BEGIN NEW DATA CASE
    BLANK CARD
    """;
    return s;
  }

  @Override
  public void getResult(File f) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }
}
