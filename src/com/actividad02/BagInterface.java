package com.actividad02;

/**
 * Defines a Bag
 * A Bag is a finite-sized collection of elements in no particular order
 * @author Julio Arriaga
 */
public interface BagInterface<T> {

  /**
   * Returns the number of elements in the Bag
   * @return the number of elements in Bag
   */
  int getCurrentSize();

  /**
   * Checks if the Bag has elements
   * @return true if the Bag is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Checks if the Bag is at full capacity
   * @return true if the Bag is full, false otherwise
   */
  boolean isFull();

  /**
   * Adds a new element to the Bag
   * @param newEntry the element to be add
   * @return true if the element was added, false otherwise (if the Bag is full)
   */
  boolean add(T newEntry);

  /**
   * Removes all elements from the Bag
   */
  void clear();

  /**
   * Removes a random element from the Bag
   * @return the element that was removed
   */
  T remove();

  /**
   * Removes the first instance of the element in the Bag
   * @param anEntry the element to be removed
   */
  void remove(T anEntry);

  /**
   * Counts the number of occurrences of an element in the Bag
   * @param anEntry the element to be counted
   * @return the number of occurrences of the element
   */
  int getFrequencyOf(T anEntry);

  /**
   * Checks if an element is in the Bag
   * @param anEntry the element to be checked
   * @return true if the element is in the Bag, false otherwise
   */
  boolean contains(T anEntry);

  /**
   * Returns the contents of the Bag as an array
   * @return an array containing the elements in the Bag
   */
  T[] toArray();

}

