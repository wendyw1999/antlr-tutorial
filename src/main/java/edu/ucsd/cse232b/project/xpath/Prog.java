package edu.ucsd.cse232b.project.xpath;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Program
 */
public class Prog {
    final List<Xpath> xpathList;

    public Prog() {
        this.xpathList = new ArrayList<>();
    }

    public Prog(List<Xpath> xpathList) {
        this.xpathList = xpathList;
    }

    public void addXpath(final Xpath xpath) {
        xpathList.add(xpath);
    }

    public List<Xpath> getXpathList() {
        return xpathList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Prog prog = (Prog) o;
        return Objects.equals(xpathList, prog.xpathList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xpathList);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        for (Xpath xpath : xpathList) {
            str.append(xpath.toString());
            str.append("\n");
        }
        return str.toString();
    }
}
