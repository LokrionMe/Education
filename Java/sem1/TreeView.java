package Java.sem1;

public class TreeView {
    public static void treeView(Persona root,int b) {
        String line = "   ".repeat(b); 
        if (b==1){
            line += "[child] ";
        } else if(b >= 2) {
            line += "["+"great- ".repeat(b-2)+"grandchild] ";
        }
        line += root.FullName;
        if (root.listName.size()!=0){
            System.out.println(line);
            System.out.println(" ".repeat(line.length()) + "|");
        } else {
            System.out.println(line +" (end)");
        }
        for (Persona a : root.getListName()) {
            treeView(a, b+1);
            if (!a.equals(root.getListName().get(root.getListName().size()-1))){
                System.out.println(" ".repeat(line.length()) + "|");            
            }
        }
    }
    
}
