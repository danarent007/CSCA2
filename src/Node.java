//Daniel Vorster
//VRSDAN004
//09 April 2017
//TBinary tree node

/**
 *
 * @author DanielVorster
 */
public class Node<dataType extends Entry> {
    dataType data;
    Node<dataType> left;
    Node<dataType> right;
    
    /**
     * 
     * @param d Data type of the tree
     * @param l Left linking node
     * @param r Right linking node
     */
    public Node(dataType d, Node<dataType> l, Node<dataType> r){
        data = d;
        left = l;
        right = r;
    }
    
    /**
     * Creates a new Node with data and no children.
     * @param d Create a node with a datatype d.
     */
    public Node(dataType d){
        data = d;
        left = null;
        right = null; 
    }
    
    /**
     * Use this to request the data of the Node.
     * @return returns the Node data.
     */
    public dataType getData(){
        return data;
    }
    
    /**
     * Use this to request the toString method of the Data object stored in the Node.
     * @return returns the toString of the Data object.
     */
    public String toString(){
        return data.toString();
    }
    
    
    /**
     * Use this to get the left child.
     * @return Returns the left child in the form of a Node.
     */
    public Node<dataType> getLeft (){
        return left;
    }
    
    /**
     * Use this to get the right child.
     * @return Returns the right child in the form of a Node.
     */
    public Node<dataType> getRight (){
        return right;
    }
    
    /**
     * Use this method to set the value of the left node.
     * @param newNode This is the new left Node you wish to use.
     */
    public void setLeft(Node<dataType> newNode){
        this.left = newNode;
    }
    
    /**
     * Use this method to set the value of the right node.
     * @param newNode This is the new right Node you wish to use.
     */
    public void setRight(Node<dataType> newNode){
        this.right = newNode;
    }
}
