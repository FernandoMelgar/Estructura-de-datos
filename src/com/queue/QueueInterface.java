package com.queue;

import java.util.NoSuchElementException;

/**
 *
 * @author Julio Arriaga
 * @param <E> the type of elements being stored in the queue
 */
public interface QueueInterface<E> {

  /**
   * Adds a new element to the tail of the Queue
   * @param newEntry the element to be added
   */
  void enqueue(E newEntry);

  /**
   * Removes the element at the head of the queue
   * @return the element at the head of the queue
   * @throws NoSuchElementException if the queue is empty
   */
  E dequeue();

  /**
   * Returns the element at the head of the queue
   * @return the element at the head of the queue
   * @throws NoSuchElementException if the queue is empty
   */
  E getFront();

  /**
   * Checks if the queue is empty
   * @return true if the queue is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Removes every element of the queue
   */
  void clear();

  /**
   * Returns an array containing the elements of the queue
   * @return an array representation of the queue
   */
  E[] toArray();

  /**
   * Returns the number of elements in the queue
   * @return the size of the queue
   */
  int size();
}