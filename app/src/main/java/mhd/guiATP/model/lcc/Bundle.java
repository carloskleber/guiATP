package mhd.guiATP.model.lcc;

public class Bundle {

  /**
   * Phase number
   */
  private int ip;
  /**
   * Number of subconductors
   */
  private int nc;
  private double diam;
  private double horiz;
  private double vtower;
  private double vmid;
  private double separ;
  private double alpha;
  private double skin;
  double resis;
  int ix;
  double react;

  public Bundle() {
    this.ip = 1;
    this.nc = 1;
    this.diam = 0.;
    this.horiz = 0.;
    this.vtower = 0.;
    this.vmid = 0.;
    this.separ = 0.;
    this.alpha = 0.;
    this.skin = 0.5;
  }

  public Bundle(int ip, double skin, double resis, int ix, double react, double diam, double horiz, double vtower, double vmid) {
    this.ip = ip;
    this.skin = skin;
    this.resis = resis;
    this.ix = ix;
    this.react = react;
    this.diam = diam;
    this.horiz = horiz;
    this.vtower = vtower;
    this.vmid = vmid;
  }

  public Bundle(int ip, double skin, double resis, int ix, double react, double diam, double horiz, double vtower, double vmid, double separ, double alpha, int nc) {
    this.ip = ip;
    this.skin = skin;
    this.resis = resis;
    this.ix = ix;
    this.react = react;
    this.diam = diam;
    this.horiz = horiz;
    this.vtower = vtower;
    this.vmid = vmid;
    this.separ = separ;
    this.alpha = alpha;
    this.nc = nc;
  }

  /**
   * Return the card (string for Line Constants entry)
   *
   * @return
   */
  public String getCard() {
    String s;
    if (nc == 1) {
      s = String.format("%3d%5f%8f%2d%8%8f%8f%8f%8f\n", ip, skin, resis, ix, react, diam, horiz, vtower, vmid);
    } else {
      s = String.format("%3d%5f%8f%2d%8%8f%8f%8f%8f%8f%6f%2d\n", ip, skin, resis, ix, react, diam, horiz, vtower, vmid, separ, alpha, nc);
    }
    return s;
  }

  public double getVmid() {
    return vmid;
  }

  public void setVmid(double vmid) {
    this.vmid = vmid;
  }

  public int getNc() {
    return nc;
  }

  public void setNc(int nc) {
    this.nc = nc;
  }

  public double getDiam() {
    return diam;
  }

  public void setDiam(double diam) {
    this.diam = diam;
  }

  public double getHoriz() {
    return horiz;
  }

  public void setHoriz(double horiz) {
    this.horiz = horiz;
  }

  public double getVtower() {
    return vtower;
  }

  public void setVtower(double vtower) {
    this.vtower = vtower;
  }

  public double getSepar() {
    return separ;
  }

  public void setSepar(double separ) {
    this.separ = separ;
  }

  public double getAlpha() {
    return alpha;
  }

  public void setAlpha(double alpha) {
    this.alpha = alpha;
  }

  public int getIp() {
    return ip;
  }

  public void setIp(int ip) {
    this.ip = ip;
  }

  public double getSkin() {
    return skin;
  }

  public void setSkin(double skin) {
    this.skin = skin;
  }

}
