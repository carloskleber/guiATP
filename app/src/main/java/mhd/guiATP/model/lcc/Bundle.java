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

  public Bundle() {
    ip = 1;
    nc = 1;
    diam = 0.;
    horiz = 0.;
    vtower = 0.;
    vmid = 0.;
    separ = 0.;
    alpha = 0.;
    skin = 0.5;
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
