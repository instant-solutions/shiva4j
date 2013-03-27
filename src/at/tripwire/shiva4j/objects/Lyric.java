package at.tripwire.shiva4j.objects;

public class Lyric {

	private int id;
	private String text;
	private String uri;
	private String sourceUri;
	private Track track;

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
	public Track getTrack() {
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

	public void setTrack(Track track) {
		this.track = track;
	}
}