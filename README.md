# guiATP
A GUI for ATP (Alternative Transient Program)

## Motivation

ATP is a ["universal program system for digital simulation of transient phenomena of electromagnetic as well as electromechanical nature"](https://www.eeug.org/index.php/about-eeug/about-atp). It's a well established software in the power system community, and it's free to use under a [specific license](https://www.eeug.org/index.php/how-to/be-licenced).

The software itself is very "old fashioned", and the user need to resort to a graphical user interface (GUI) to visualize the circuits and the output. The usual one is the [ATPDraw](https://www.atpdraw.net/). Despite the regular updates, still the GUi is a bit old, too.

Nowadays it's near imposible to sort out these two softwares, ATP and ATPDraw from the common user, but I think the GUI could be better. So, as a side project, I decide to propose a alternative GUI, with no pretense to be better, just different.

Also, this is my first public project, so if you reach me and read this text, thank you!

## Planning
  * Writen in Java
  * Possibly Swing
  * Aimed for some open source solution for graph/ diagram drawing, drag-drop

## Sandbox

Relevant libraries and projects:

  * [JUNG](http://jung.sourceforge.net/)
    * [Maven repository](https://mvnrepository.com/artifact/net.sf.jung)
    * https://github.com/jrtom/jung/releases/tag/jung-2.1
  * https://mindfusion.eu/java-diagram.html - commercial
  * https://scienceprog.com/free-fast-and-useful-java-based-circuit-simulator/
  * https://examples.javacodegeeks.com/desktop-java/swing/java-swing-drag-drop-example/
  * [ArgoUML](https://github.com/argouml-tigris-org/argouml) - Abandoned, but could be useful
  * https://giraph.apache.org/
  * https://github.com/hausen/circuit-simulator - Derived from Faulstad, still don't have "rubber wires"
  * [EDA software](https://en.wikipedia.org/wiki/Comparison_of_EDA_software)
  * [XCircuit](https://github.com/RTimothyEdwards/xcircuit/)


