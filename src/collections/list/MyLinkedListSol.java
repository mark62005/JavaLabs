package collections.list;

import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Singly Linked-list (generic)
 */
public class MyLinkedListSol<E> {

  private Node<E> head, tail; // null
  private int size; // 0

  public MyLinkedListSol() { }

  // O(1)
  public void addFirst(E e) {
    final Node<E> h = head;
    final Node<E> newNode = new Node<>(e, h);
    head = newNode;
    if (h == null) {
      // adding a new node to the empty linked list
      tail = newNode;
    }
    size++;
  }

  // O(1)
  public void addLast(E e) {
    final Node<E> t = tail;
    final Node<E> newNode = new Node<>(e, null);
    tail = newNode;
    if (t == null) {
      head = newNode;
    } else {
      t.next = newNode;
    }
    size++;
  }

  // O(N)
  public void add(int index, E e) {
    if (index < 0 || index > size) {
     throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
    }
    if (index == 0) {
      addFirst(e);
    } else if (index == size) {
      addLast(e);
    } else {
      Node<E> cur = head;
      for (int i = 0; i < index - 1; i++) {
        cur = cur.next;
      }
      cur.next = new Node<>(e, cur.next);
      size++;
    }
  }

  // O(1)
  public E removeFirst() {
    final Node<E> h = head;
    if (h == null) {
      throw new NoSuchElementException("list is empty");
    }

    E data = h.data;
    Node<E> next = h.next;
    h.data = null;
    h.next = null;
    head = next;
    if (next == null) {
      // only one element in the list
      tail = null;
    }
    size--;
    return data;
  }

  /**
   * O(N)
   * This method can be improved by using Doubly-Linked List. O(1)
   * (Doubly-Linked List has `prev` pointer.)
   * ex) tail.prev (second last node)
   */
  public E removeLast() {
    // TODO: Implement Me;

    // if linked list is empty
    if (head == null) {
      throw new NoSuchElementException();
    }
    // if linked list has one node
    if (size == 1) {
      return removeFirst();
    }
    // more than one node
    Node<E> nodeBefore = head;
    for (int i = 0; i < size - 2; i++) {
      nodeBefore = nodeBefore.next;
    }
    Node<E> nodeToRemove = nodeBefore.next;
    nodeBefore.next = null;
    tail = nodeBefore;
    size--;
    return nodeToRemove.data;

  }

  // O(1)
  public E getFirst() {
    if (head == null) {
      throw new NoSuchElementException("list is empty");
    }
    return head.data;
  }

  // O(1)
  public E getLast() {
    if (tail == null) {
      throw new NoSuchElementException("list is empty");
    }
    return tail.data;
  }

  private Node<E> getNodeAt(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
    }
    Node<E> cur = head;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    return cur;
  }

  // O(N)
  public E get(int index) {
    return getNodeAt(index).data;
  }

  // O(N)
  public E set(int index, E e) {
    Node<E> cur = getNodeAt(index);
    E oldValue = cur.data;
    cur.data = e;
    return oldValue;
  }

  // O(N)
  public int indexOf(E e) {
    int index = 0;
    if (e == null) {
      for (Node<E> x = head; x != null; x = x.next) {
        if (x.data == null) {
          return index;
        }
        index++;
      }
    } else {
      for (Node<E> x = head; x != null; x = x.next) {
        if (e.equals(x.data)) {
          return index;
        }
        index++;
      }
    }
    return -1;
  }

  /**
   * Remove the element e from the list
   * @param e
   * @return
   */
  public boolean remove(E e) {
    // TODO: Implement M

    int index = indexOf(e);
    if (index == -1) {
      return false;
    }
    if (index == 0) {
      removeFirst();
      return true;
    }
    if (index == size - 1) {
      removeLast();
      return true;
    }
    return remove(index);

  }

  /**
   * Remove the element at index
   * O(N)
   * @param index
   * @return
   */
  public boolean remove(int index) {
    // TODO: Implement Me

    Objects.checkIndex(index, size);
    if (index == 0) {
      removeFirst();
      return true;
    }
    if (index == size - 1) {
      removeLast();
      return true;
    }
    Node<E> prev = getNodeAt(index - 1);
    prev.next = prev.next.next;
    size--;

    return true;

  }


  /**
   * Returns the index of the last occurrence of element e
   * O(N)
   *
   * ll = [1, 1, 2, 3, 1, 5, 1, 2]
   * ll.lastIndexOf(1) -> 6
   * @param e
   * @return the index of the last occurrence of element e
   */
  public int lastIndexOf(E e) {
    // TODO: Implement Me

    Node<E> curr = head;
    int index = -1;
    int i = 0;

    if (e == null) {

      for (; i < size; i++) {
        if (curr.data == null) {
          index = i;
        }
        curr = curr.next;
      }

    } else {

      for (; i < size; i++) {
        if (curr.data.equals(e)) {
          index = i;
        }
        curr = curr.next;
      }

    }
    return index;

  }

  /**
   * Reverses the current linked list
   * "A" -> "B" -> "C" -> null
   * should be
   * "C" -> "B" -> "A" -> null
   */
  public void reverse() {
    // TODO: Implement Me

    // o(n)
    Node<E> prev = null;
    Node<E> curr = head;
    Node<E> next = null;

    tail = curr;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    // last prev becomes the new head
    head = prev;

  }

  // O(N)
  public boolean contains(E e) {
    return indexOf(e) >= 0;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    for (Node<E> x = head; x != null; x = x.next) {
      s.append(x.data).append(" -> ");
    }
    s.append("null");
    return s.toString();
  }

  public int size() {
    return size;
  }

  // static nested class
  public static class Node<E> {
    E data;
    Node<E> next;

    public Node(E item, Node<E> next) {
      this.data = item;
      this.next = next;
    }
  }
}

