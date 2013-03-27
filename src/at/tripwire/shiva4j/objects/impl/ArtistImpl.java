package at.tripwire.shiva4j.objects.impl;

public class ArtistImpl {

	private int id;
	private String name;
	private String imageUrl;
	private String uri;
	private String downloadUri;
	private String slug;

	/**
	 * The object's ID.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Artist's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Link to a photo of the artist.
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * The URI of this resource's instance.
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * The URI to domload this artist's tracks.
	 */
	public String getDownloadUri() {
		return downloadUri;
	}

	/**
	 * A slug of the artist's name.
	 */
	public String getSlug() {
		return slug;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}
}
