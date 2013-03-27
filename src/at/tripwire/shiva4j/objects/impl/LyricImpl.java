package at.tripwire.shiva4j.objects.impl;

public class LyricImpl {

	private int id;
	private String text;
	private String uri;
	private String sourceUri;
	private TrackImpl track;

	/**
	 * THe object's ID.
	 */
	public int getId() {
		return id;
	}

	/**
	 * The lyric's text.
	 */
	public String getText() {
		return text;
	}

	/**
	 * The URI of this resource's instance.
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * The URI whre the lyrics were fetched from.
	 */
	public String getSourceUri() {
		return sourceUri;
	}

	/**
	 * The track for which the lyrics are.
	 */
	public TrackImpl getTrack() {
		return track;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void setSourceUri(String sourceUri) {
		this.sourceUri = sourceUri;
	}

	public void setTrack(TrackImpl track) {
		this.track = track;
	}
}