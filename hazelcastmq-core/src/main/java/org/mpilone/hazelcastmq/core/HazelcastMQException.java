package org.mpilone.hazelcastmq.core;

/**
 * An exception raised by HazelcastMQ.
 *
 * @author mpilone
 */
public class HazelcastMQException extends RuntimeException {

  /**
   * Serialization ID.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constructs the exception.
   *
   * @param message the exception message
   * @param cause the root cause exception
   */
  public HazelcastMQException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs the exception with no root cause.
   *
   * @param message the exception message
   */
  public HazelcastMQException(String message) {
    super(message);
  }

  /**
   * An exception that indicates a transaction is already in progress and
   * therefore the requested transactional operation cannot be performed.
   */
  public static class TransactionInProgressException extends HazelcastMQException {

    /**
     * Constructs the exception.
     *
     * @param message the exception message
     * @param cause the root cause exception
     */
    public TransactionInProgressException(String message, Throwable cause) {
      super(message, cause);
    }

    /**
     * Constructs the exception with no root cause.
     *
     * @param message the exception message
     */
    public TransactionInProgressException(String message) {
      super(message);
    }
  }

}
