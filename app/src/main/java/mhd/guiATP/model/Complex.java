package mhd.guiATP.model;

import java.util.ArrayList;
import java.util.List;

public class Complex {
  private double re;
  private double im;
  
  public Complex() {
    re = 0.;
    im = 0.;
  }
  
  public String toString(){
    return "";
  }
  
  /**
   * Get an usual ATP array (real first line, imaginary second line)
   * @param s
   * @return 
   */
  public static List<Complex> getATPArray(String s) {
    List<Complex> l = new ArrayList<>();
    
    return l;
  }

  public double getRe() {
    return re;
  }

  public void setRe(double re) {
    this.re = re;
  }

  public double getIm() {
    return im;
  }

  public void setIm(double im) {
    this.im = im;
  }
}
