package mhd.guiATP.model.lcc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LineConstants extends LCC {

  private List<Bundle> phases;
  private List<Conductor> groundWires;
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
    rho = 1000.;
    freq = 60.;
    icpr = 111111;
    izpr = 111111;
    icap = 0;
    iseg = 0;
  }

  @Override
  public String generate() {
    String s = """
        BEGIN NEW DATA CASE
        LINE CONSTANTS
        METRIC
        """;

    for (Bundle f : phases) {
      s += f.getCard();
    }
    for (Conductor g : groundWires) {
      s += String.format("  0%5f%8f%2d%8%8f%8f%8f%8f\n", sk, resis, ix, react, g.getDiam(), g.getHoriz(), g.getVtower(), g.getVmid());
    }
    s += "BLANK CARD ENDING CONDUCTOR CARDS\n";
    // Frequency
    x += String.format("%8f%10f%10f%06d%06d%1d%1d", rho, freq, fcar, icpr, izpr, icap, iseg);
    s += """
        BLANK CARD ENDING FREQUENCY CARDS
        BLANK CARD ENDING LINE CONSTANT
        BEGIN NEW DATA CASE
        BLANK CARD TERMINATING ALL CASES
        """;
    return s;
  }

  @Override
  public void getResult(File f) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  public List<Bundle> getPhases() {
    return phases;
  }

  public void setPhases(List<Bundle> phases) {
    this.phases = phases;
  }

  public List<Conductor> getGroundWires() {
    return groundWires;
  }

  public void setGroundWires(List<Conductor> groundWires) {
    this.groundWires = groundWires;
  }
}
