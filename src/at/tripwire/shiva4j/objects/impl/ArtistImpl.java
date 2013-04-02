package at.tripwire.shiva4j.objects.impl;

import at.tripwire.shiva4j.objects.Artist;

public class ArtistImpl implements Artist {

	private int id;
	private String name;
	private String imageUrl;
	private String uri;
	private String downloadUri;
	private String slug;

	/**
	 * {@inheritDoc}
	 */
	public int getId() {
		return id;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getName() {
		return name;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getDownloadUri() {
		return downloadUri;
	}

	/**
	 * {@inheritDoc}
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
