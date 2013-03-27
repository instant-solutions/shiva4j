package at.tripwire.shiva4j.objects;

public interface Album {

	/**
	 * The object's ID.
	 */
	int getId();

	/**
	 * The album's name.
	 */
	String getName();

	/**
	 * The release year of the album.
	 */
	int getYear();

	/**
	 * The URI of this resource's instance.
	 */
	String getUri();

	/**
	 * The URI to download this album.
	 */
	String getDownloadUri();

	/**
	 * A link to an image of the album's cover.
	 */
	String getCoverUrl();

	/**
	 * A slug of the album's name.
	 */
	String getSlug();

	/**
	 * A list of the artists involved in that record.
	 */
	Artist[] getArtists();
}
