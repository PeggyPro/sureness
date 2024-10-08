package org.dromara.sureness.processor.exception;

/**
 * Extended Sureness exception.
 * Related to the internal configuration of sureness or the component itself.
 * @author tomsun28
 * @date 16:30 2020-02-28
 */
public class ExtSurenessException extends RuntimeException {

	private static final long serialVersionUID = 8329942117536125620L;

	public ExtSurenessException(String message) {
        super(message);
    }
}
