package at.tripwire.shiva4j.objects.impl;

public class AlbumImpl {

	private int id;
	private String name;
	private int year;
	private String uri;
	private String downloadUri;
	private String coverUrl;
	private String slug;
	private ArtistImpl[] artists;

	/**
	 * The object's ID.
	 */
	public int getId() {
		return id;
	}

	/**
	 * The album's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * The release year of the album.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * The URI of this resource's instance.
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * The URI to download this album.
	 */
	public String getDownloadUri() {
		return downloadUri;
	}

	/**
	 * A link to an image of the album's cover.
	 */
	public String getCoverUrl() {
		return coverUrl;
	}

	/**
	 * A slug of the album's name.
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * A list of the artists involved in that record.
	 */
	public ArtistImpl[] getArtists() {
		return artists;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setArtists(ArtistImpl[] artists) {
		this.artists = artists;
	}
}
