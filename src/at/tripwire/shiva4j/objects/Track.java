package at.tripwire.shiva4j.objects;

public interface Track {

	public enum MimeType {
		AUDIO_MP3, AUDIO_OGG
	}

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
	 * The album to which this track belongs to.
	 */
	Album getAlbum();

	/**
	 * The artist which performs this track.
	 */
	Artist getArtist();

	/**
	 * URI to access file in given format.
	 * 
	 * @param type
	 *            The file format.
	 */
	String getFile(MimeType type);

	/**
	 * A list of URIs to access the files in the different formats.
	 */
	String[] getFiles();
	
	/**
	 * A list of available mimetypes for this track.
	 */
	MimeType[] getAvailableFileFormats();
}