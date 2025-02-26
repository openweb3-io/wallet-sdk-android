package io.openweb3.wallet;

@SuppressWarnings("unchecked")
public class ListOptions<T> {

	private String cursor;
	private Integer limit;

	public ListOptions() {
	}

	public T cursor(final String cursor) {
		this.cursor = cursor;
		return (T) this;
	}

	public T limit(final Integer limit) {
		this.limit = limit;
		return (T) this;
	}

	public void setCursor(final String cursor) {
		this.cursor = cursor;
	}

	public void setLimit(final Integer limit) {
		this.limit = limit;
	}

	public Integer getLimit() {
		return limit;
	}

	public String getCursor() {
		return cursor;
	}
}
