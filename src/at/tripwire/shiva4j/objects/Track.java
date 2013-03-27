package at.tripwire.shiva4j.objects;

public interface Track {

	/**
	 * The object's ID.
	 */
	int getId();

	/**
	 * The ordinal number of this track with respect to this album.
	 */
	int getNumber();

	/**
	 * In MP3s this value is directly proportional to the sound quality.
	 */
	int getBitrate();

	/**
	 * A slug of the track's title.
	 */
	String getSlug();

	/**
	 * The title of the track.
	 */
	String getTitle();

	/**
	 * The URI of this resource's instance.
	 */
	String getUri();

	/**
	 * The length in seconds of the track.
	 */
	int getLength();

	/**
	 * The URI to access the file.
	 */
	String getStreamUri();

	/**
	 * The album to which this track belongs to.
	 */
	Album getAlbum();

	/**
	 * The artist which performs this track.
	 */
	Artist getArtist();
}