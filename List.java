/**
 * Represents a list of Nodes. Each node holds a reference to a memory block.
 * <br> (Part of Homework 10 in the Intro to CS course, Efi Arazi School of CS)
 */
public class List {

    private Node first = null; // The first (dummy) node of this list
    private Node last = null;  // The last node of this list
    private int size = 0;     // Number of elements (nodes) in this list

    /**
     * Constructs a new list of Node objects, each holding a memory block (MemBlock object)
     */
    public List() {
        // Creates a dummy node and makes first and last point to it.
        first = new Node(null);
        last = first;
    }

    /**
     * Adds the given memory block to the end of this list.
     * Executes efficiently, in O(1).
     *
     * @param block The memory block that is added at the list's end
     */
    public void addLast(MemBlock block) {
        Node newNode = new Node(block);
        size++;
        last.next = newNode;
        last = newNode;
    }

    /**
     * Adds the given memory block at the beginning of this list.
     * Executes efficiently, in O(1).
     *
     * @param block The memory block that is added at the list's beginning
     */
    public void addFirst(MemBlock block) {
        Node newNode = new Node(block);
        size++;
        newNode.next = first.next;
        first.next = newNode;
    }

    /**
     * Gets the node located at the given index in this list.
     *
     * @param index The index of the node to get, between 0 and size - 1
     * @return The node at the given index
     * @throws IllegalArgumentException If index is negative or greater than size - 1
     */
    public Node getNode(int index) {
        if (size - 1 < index || index < 0) {
            throw new IllegalArgumentException("index must be between 0 and (size - 1)");
        }
        Node newNode = first.next;
        int i = 0;
        while(i != index) {
            newNode = newNode.next;
            i++;
        }
        return newNode;
    }

    /**
     * Gets the memory block located at the given index in this list.
     *
     * @param index The index of the memory block to get, between 0 and size - 1
     * @return The memory block  at the given index
     * @throws IllegalArgumentException If index is negative or greater than size - 1
     */
    public MemBlock getBlock(int index) {
        return getNode(index).block;
    }

    /**
     * Gets the index of the node containing the given memory block.
     *
     * @param block The given memory block
     * @return The index of the memory block, or -1 if the memory block is not in this list
     */
    public int indexOf(MemBlock block) {
        Node newNode = first.next;
        for (int i = 0; i < size; i++) {
            if (newNode.block.equals(block)) {
                return i;
            }
            newNode = newNode.next;
        }
        return -1;
    }

    /**
     * Adds a new node to this list, as follows:
     * Creates a new node containing the given memory block,
     * and inserts the node at the given index in this list.
     * For example, if this list is   (m7, m3, m1, m6), then
     * add(2,m5) will make this list  (m7, m3, m5, m1, m6).
     * If the given index is 0, the new node becomes the first node in this list.
     * If the given index equals the list's size - 1, the new node becomes the last node in this list.
     * If the new element is added at the beginning or at the end of this list,
     * the addition's runtime is O(1). Othewrise is it O(size).
     *
     * @param block The memory block to add
     * @param index Where to insert the memory block
     * @throws IllegalArgumentException If index is negative or greater than the list's size - 1
     */
    public void add(int index, MemBlock block) {
        if (index == 0) {
            this.addFirst(block);
        }
        else if (index < 0 || ((size > 0) && index > size)) {
            throw new IllegalArgumentException("index must be between 0 and size");
        }
        else if (index == size){
            this.addLast(block);
        }
        else {
        Node newNode = new Node(block);
        newNode.next = getNode(index);
            getNode(index - 1).next = newNode;
        }

        size++;
    }

    /**
     * Removes the first memory block from this list.
     * Executes efficiently, in O(1).
     *
     * @throws IllegalArgumentException If trying to remove from an empty list
     */
    public void removeFirst() {
        if (size == 0) {
            throw new IllegalArgumentException("index must be between 0 and (size - 1)");
        }
        first.next = first.next.next;
        size--;
    }

    /**
     * Removes the given memory block from this list.
     *
     * @param block The memory block to remove
     */
    public void remove(MemBlock block) {
        int index = indexOf(block);
        Node Current = getNode(index);
        if (index == 0){
            removeFirst();
            return;
        }
        getNode(index - 1).next = Current.next;
        Current = null;
        size--;
    }

    /**
     * Returns an iterator over this list, starting with the first element.
     *
     * @return A ListIterator object
     */
    public ListIterator iterator() {
        return new ListIterator(first.next);
    }

    /**
     * A textual representation of this list.
     *
     * @return A string representing this list
     */
    public String toString() {
        StringBuilder s = new StringBuilder("[ ");
        Node current = first.next;
        while (current != null) {
            s.append(current.block).append(" ");
            current = current.next;
        }
        return s + "]";
    }
}
