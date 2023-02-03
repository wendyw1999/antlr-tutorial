package edu.ucsd.cse232b.project.visitor;

import edu.ucsd.cse232b.project.xpath.ProgCustom;
import org.w3c.dom.Node;
import edu.ucsd.cse232b.project.xpathParsers.xpathBaseVisitor;
import edu.ucsd.cse232b.project.xpathParsers.xpathParser;

import java.util.LinkedList;

public class ProgramBuilder extends xpathBaseVisitor<ProgCustom> {
    @Override
    public ProgCustom visitProg(xpathParser.ProgContext ctx){
        LinkedList<Node> nodeList = new LinkedList<>();
        final XpathBuilder xpathBuilder = new XpathBuilder();

        for (xpathParser.XpathContext context: ctx.xpath()) {
            final LinkedList<Node> nodes = xpathBuilder.visit(context);
            nodeList = nodes;
        }
        final ProgCustom prog = new ProgCustom(nodeList);
        return prog;
    }
}