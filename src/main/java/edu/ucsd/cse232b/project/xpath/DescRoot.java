package edu.ucsd.cse232b.project.xpath;



import java.util.Objects;

public class DescRoot implements Xpath {

    final Xpath rp;
    final String fileName;


    /**
     * Constructor
     *
     * @param fileName
     * @param rp
     */
    public DescRoot(Xpath rp,String fileName) {
        this.fileName = fileName;
        this.rp = rp;
    }

    public Xpath getChild() {
        return rp;
    }

    public String getFileName() {
        return fileName;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ChildRoot that = (ChildRoot) o;
        return Objects.equals(fileName, that.fileName) && rp == that.rp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName,rp);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(fileName.toString());
        str.append(rp.toString());
        return str.toString();
    }

    @Override
    public Xpath.XpathKind getXpathKind() {
        return Xpath.XpathKind.DescRoot;
    }
}
