package edu.ucsd.cse232b.project.xpath;

import java.util.Objects;

public class TagName implements Xpath {
    final String tagName;


    /**
     * Constructor
     *
     * @param tagName
     */
    public TagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TagName that = (TagName) o;
        return Objects.equals(tagName, that.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(tagName.toString());
        return str.toString();
    }

    @Override
    public Xpath.XpathKind getXpathKind() {
        return Xpath.XpathKind.TAG_NAME;
    }
}
