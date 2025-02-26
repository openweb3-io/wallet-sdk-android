package io.openweb3.wallet;

public final class APIClientOptions {
	private static final String DEFAULT_URL = "https://app.wallet.openweb3.io";

	private boolean debug = false;
	private String serverUrl = DEFAULT_URL;
	private String verifier;
	private String idToken;

	public APIClientOptions() {
	}

	public APIClientOptions debug(final boolean debug) {
		this.debug = debug;
		return this;
	}

	public APIClientOptions serverUrl(final String serverUrl) {
		this.serverUrl = serverUrl;
		return this;
	}

	public APIClientOptions verifier(final String verifier) {
		this.verifier = verifier;
		return this;
	}

	public APIClientOptions idToken(final String idToken) {
		this.idToken = idToken;
		return this;
	}

	public void setDebug(final boolean debug) {
		this.debug = debug;
	}

	public void setServerUrl(final String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public void setVerifier(final String verifier) {
		this.verifier = verifier;
	}

	public void setIdToken(final String idToken) {
		this.idToken = idToken;
	}

	public boolean getDebug() {
		return debug;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	public String getVerifier() {
		return verifier;
	}

	public String getIdToken() {
		return idToken;
	}
}
