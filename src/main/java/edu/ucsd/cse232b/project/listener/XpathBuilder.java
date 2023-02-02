package edu.ucsd.cse232b.project.listener;


import edu.ucsd.cse232b.project.xpath.*;
import edu.ucsd.cse232b.project.xpathParsers.xpathBaseListener;
import edu.ucsd.cse232b.project.xpathParsers.xpathParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
//import edu.ucsd.cse232b.project.xpathParsers.xpathParser.TagNameContext;

import java.util.ArrayList;
import java.util.List;

public class XpathBuilder extends xpathBaseListener {
    private ParseTreeProperty<Object> xpathObjects;

    /**
     * Constructor
     */
    public XpathBuilder() {
        xpathObjects = new ParseTreeProperty<Object>();
    }

    /**
     * Set object (parser tree property)
     *
     * @param subtree subtree
     * @param obj  corresponding object
     */
    private void setObject(ParseTree subtree, Object obj) {
        xpathObjects.put(subtree, obj);
    }

    /**
     * Retrieve object from parser tree property
     *
     * @param obj
     * @return expression object
     */
    private Object retrieveObject(ParseTree obj) {
        return xpathObjects.get(obj);
    }

    public Prog getProg(ParseTree tree){
        return (Prog) retrieveObject(tree);
    }
    @Override
    public void exitProg(xpathParser.ProgContext ctx){
        final List<Xpath> xpathList = new ArrayList<>();
//        final Xpath xpath = (Xpath) retrieveObject(ctx.xpath());
//        xpathList.add(xpath);
        for (xpathParser.XpathContext xpathContext: ctx.xpath()){
            final Xpath xpath = (Xpath) retrieveObject(xpathContext);
            xpathList.add(xpath);
        }
        final Prog program = new Prog(xpathList);
        setObject(ctx,program);
    }

    @Override
    public void exitChildRoot (xpathParser.ChildRootContext ctx){
        final String fileName = ctx.fileName().getText();
        System.out.println(fileName);
        final Xpath xpath = (Xpath) retrieveObject(ctx.rp());

        final ChildRoot childRootXpath = new ChildRoot(xpath,fileName);

        setObject(ctx,childRootXpath);
    }
    @Override
    public void exitDescRoot (xpathParser.DescRootContext ctx){
        final String fileName = ctx.fileName().getText();
        final Xpath xpath = (Xpath) retrieveObject(ctx.rp());
        final DescRoot descRootXpath = new DescRoot(xpath,fileName);
        setObject(ctx,descRootXpath);
    }
    @Override
    public void exitTAG_NAME (xpathParser.TAG_NAMEContext ctx){
        final String tagName = ctx.ID().getText();
        final TagName tagNameObj = new TagName(tagName);
        setObject(ctx,tagNameObj);
    }

    public void exitSTAR(xpathParser.STARContext ctx) {
        final String operation = ctx.STAR().getText();
        final Star starObj = new Star(operation);
        setObject(ctx,starObj);
    }




}
