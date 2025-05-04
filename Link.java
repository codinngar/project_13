class Link {
    public int data; // data item
    public Link next; // next link in list
    public Link previous; // last link in list

    public Link(int d) { // constructor
        data = d;
        next = null;
        previous = null;
    }
}