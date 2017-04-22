//Daniel Vorster
//VRSDAN004
//09 April 2017
//Tree base class

/**
 * Tree provides a base for creating a Binary Tree.
 * @author DanielVorster
 * @param <dataType>
 */
public class Tree<dataType extends Entry> {
    Node<dataType> root = null;
    /**
     * Adds data to the referenced tree in the form of leaves/nodes.
     * @param data Adds this data to the tree as a leaf/node.
     */
    public void addLeaf(dataType data)
    {
        Node<dataType> currentNode = root;
        //If no root
        if (root == null)
        {
            root = new Node(data);
        } //If has root, compare
        else
        {
            //Repeat until no leaf
            while (currentNode != null)
            {
                //Check left or right
                if (currentNode.getData().toString().compareTo(data.toString()) > 0)
                {
                    //LEFT, check if node not null, else set.
                    if (currentNode.getLeft() == null)
                    {
                        currentNode.setLeft(new Node(data));
                        currentNode = null;
                    } //Node not null
                    else
                    {
                        //Traverse left
                        currentNode = currentNode.getLeft();
                    }
                } else
                {
                    //RIGHT, check if node not null, else set.
                    if (currentNode.getRight() == null)
                    {
                        currentNode.setRight(new Node(data));
                        currentNode = null;
                    } //Node not null
                    else
                    {
                        //Traverse left
                        currentNode = currentNode.getRight();
                    }
                }
            }
        }

    }
    /**
     * Prints all nodes, in order from left to right.
     * @param node The root node of the tree to be printed.
     */
    public static void printOrder(Node node) {
        
        if(node != null) {
        printOrder(node.left);
        System.out.println(node.data.getName() + " || " + node.data.getNumber() + " || " + node.data.getAddress());
        printOrder(node.right);  
        }   
    }
    
    /**
     * Finds the Node containing the Data matching key and returns that data.
     * @param key A key used to search through nodes.
     * @return If found, data of dataType is returned. If not, then null is returned.
     */
    public dataType find(String key){
            Node<dataType> currentNode = root;
        //If no tree
        if (root == null){
            return null;
        }
        //If has root, compare
        else{
            //Repeat until no leaf
            while(true){
                //Check left or right
                
                if(currentNode.getData().toString().compareTo(key) > 0){
                    //LEFT, check if node not null, else set.
                    if(currentNode.getLeft() == null){
                        return null;
                    }
                    //Node not null
                    else{
                        //Traverse left
                        currentNode = currentNode.getLeft();
                    }
                }
                else if(currentNode.getData().toString().compareTo(key) < 0){
                    //RIGHT, check if node not null, else set.
                    if(currentNode.getRight() == null){
                        return null;
                    }
                    //Node not null
                    else{
                        //Traverse left
                        currentNode = currentNode.getRight();
                    }
                }
                else {
                    //EQUAL
                    return(currentNode.getData());
                    
                }
            }
        }
        
        
    }
    
    
   
}


