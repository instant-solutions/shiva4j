package at.tripwire.shiva4j.objects.impl;

import at.tripwire.shiva4j.objects.Album;
import at.tripwire.shiva4j.objects.Artist;

public class AlbumImpl implements Album {

	private int id;
	private String name;
	private int year;
	private String uri;
	private String downloadUri;
	private String coverUrl;
	private String slug;
	private Artist[] artists;

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
	public int getYear() {
		return year;
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
	public String getCoverUrl() {
		return coverUrl;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * {@inheritDoc}
	 */
	public Artist[] getArtists() {
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

	public void setArtists(Artist[] artists) {
		this.artists = artists;
	}
}
