package at.tripwire.shiva4j.objects;

public interface Lyric {

	/**
	 * The object's ID.
	 */
	int getId();

	/**
	 * The lyric's text.
	 */
	String getText();

	/**
	 * The URI of this resource's instance.
	 */
	String getUri();

	/**
	 * The URI whre the lyrics were fetched from.
	 */
	String getSourceUri();

	/**
	 * The track for which the lyrics are.
	 */
	Track getTrack();
}