package org.dromara.sureness.processor.exception;

/**
 * exception for digest auth
 * means you should try once again by authenticate below with digest auth information
 * @author tomsun28
 * @date 2020-10-28 23:27
 */
public class NeedDigestInfoException extends SurenessAuthenticationException {

	private static final long serialVersionUID = 7651386288955053842L;
	private final String authenticate;

    public NeedDigestInfoException(String message, String authenticate) {
        super(message);
        this.authenticate = authenticate;
    }

    public String getAuthenticate() {
        return authenticate;
    }
}
