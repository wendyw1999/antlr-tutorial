package edu.ucsd.cse232b.project.xpath;

import java.util.Objects;

public class Star implements Xpath {
        final String operation;


        /**
         * Constructor
         *
         * @param operation
         */
        public Star(String operation) {
            this.operation = operation;
        }

        public String getOperation() {
            return operation;
        }




        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Star that = (Star) o;
            return Objects.equals(operation, that.operation);
        }

        @Override
        public int hashCode() {
            return Objects.hash(operation);
        }

        @Override
        public String toString() {
            final StringBuilder str = new StringBuilder();
            str.append(operation.toString());
            return str.toString();
        }

        @Override
        public Xpath.XpathKind getXpathKind() {
            return Xpath.XpathKind.STAR;
        }
    }