package org.dromara.sureness.processor.exception;

/**
 * Authentication exception: Disable lock account exception
 * @author tomsun28
 * @date 19:23 2019-03-11
 */
public class DisabledAccountException extends SurenessAuthenticationException {

	private static final long serialVersionUID = 8944393703712611088L;

	public DisabledAccountException(String message) {
        super(message);
    }
}
