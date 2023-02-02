package edu.ucsd.cse232b.project.xpath;


import org.w3c.dom.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Program
 */
public class ProgCustom {
    final LinkedList<Node> xpathList;

    public ProgCustom() {
        this.xpathList = new LinkedList<>();
    }

    public ProgCustom(LinkedList<Node> xpathList) {
        this.xpathList = xpathList;
    }

    public void addNode(final Node xpath) {
        xpathList.add(xpath);
    }

    public LinkedList<Node> getNodeList() {
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
        for (Node node : xpathList) {
            str.append(node.toString());
            str.append("\n");
        }
        return str.toString();
    }
}
