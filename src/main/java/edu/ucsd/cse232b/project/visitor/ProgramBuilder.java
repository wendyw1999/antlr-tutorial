package edu.ucsd.cse232b.project.visitor;


import edu.ucsd.cse232b.project.xpath.Prog;
import edu.ucsd.cse232b.project.xpath.Xpath;
import edu.ucsd.cse232b.project.xpathParsers.xpathBaseVisitor;
import edu.ucsd.cse232b.project.xpathParsers.xpathParser;
import java.util.ArrayList;
import java.util.List;

public class ProgramBuilder extends xpathBaseVisitor<Prog> {
    @Override
    public Prog visitProg(xpathParser.ProgContext ctx){
        final List<Xpath> xpathList = new ArrayList<>();
        final XpathBuilder xpathBuilder = new XpathBuilder();

        for (xpathParser.XpathContext context: ctx.xpath()) {
            final Xpath xpath = xpathBuilder.visit(context);
            xpathList.add(xpath);
        }
        final Prog prog = new Prog(xpathList);
        return prog;
    }
}