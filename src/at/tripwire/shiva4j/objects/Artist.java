package at.tripwire.shiva4j.objects;

public interface Artist {

	/**
	 * The object's ID.
	 */
	int getId();

	/**
	 * Artist's name
	 */
	String getName();

	/**
	 * Link to a photo of the artist.
	 */
	String getImageUrl();

	/**
	 * The URI of this resource's instance.
	 */
	String getUri();

	/**
	 * The URI to domload this artist's tracks.
	 */
	String getDownloadUri();

	/**
	 * A slug of the artist's name.
	 */
	String getSlug();
}
