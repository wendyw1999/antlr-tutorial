package edu.ucsd.cse232b.project.xpath;

public interface Xpath {

    XpathKind getXpathKind();

    enum XpathKind {
        ChildRoot,
        DescRoot,
        TAG_NAME,
        STAR;
    }
}
