package mhd.guiATP.model.lcc;

import java.io.File;

/**
 * Line/cable model
 */
public abstract class LCC {
  public abstract String generate();
  public abstract void getResult(File f);
}
