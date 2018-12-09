public class AST {
    MainNode root;

    private void makeStringForTree(ASTNode node, StringBuilder stringBuilder, String indentation) {
        stringBuilder.append(indentation);
        stringBuilder.append(node);
        stringBuilder.append("\n");

        if (node.sons != null)
            for (ASTNode son : node.sons)
                makeStringForTree(son, stringBuilder, indentation + "\t");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        makeStringForTree(root, stringBuilder, "");
        return stringBuilder.toString();
    }
}
