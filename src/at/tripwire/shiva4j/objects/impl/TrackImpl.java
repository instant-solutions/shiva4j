package at.tripwire.shiva4j.objects.impl;

import java.util.Map;

import at.tripwire.shiva4j.objects.Album;
import at.tripwire.shiva4j.objects.Artist;
import at.tripwire.shiva4j.objects.Track;

public class TrackImpl implements Track {

	private int id;
	private int number;
	private int bitrate;
	private String slug;
	private String title;
	private String uri;
	private int length;
	private AlbumImpl album;
	private ArtistImpl artist;
	private Map<MimeType, String> files;

	/**
	 * {@inheritDoc}
	 */
	public int getId() {
		return id;
	}

	/**
	 * {@inheritDoc}
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * {@inheritDoc}
	 */
	public int getBitrate() {
		return bitrate;
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
	public String getTitle() {
		return title;
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
	public int getLength() {
		return length;
	}

	/**
	 * {@inheritDoc}
	 */
	public Album getAlbum() {
		return album;
	}

	/**
	 * {@inheritDoc}
	 */
	public Artist getArtist() {
		return artist;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setBitrate(int bitrate) {
		this.bitrate = bitrate;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setAlbum(AlbumImpl album) {
		this.album = album;
	}

	public void setArtist(ArtistImpl artist) {
		this.artist = artist;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getFile(MimeType type) {
		if(files == null) {
			return null;
		}
		return files.get(type);
	}

	/**
	 * {@inheritDoc}
	 */
	public String[] getFiles() {
		if(files == null) {
			return null;
		}
		return files.values().toArray(new String[0]);
	}
	
	public void setFiles(Map<MimeType, String> files) {
		this.files = files;
	}

	/**
	 * {@inheritDoc}
	 */
	public MimeType[] getAvailableFileFormats() {
		if(files == null) {
			return null;
		}
		return files.keySet().toArray(new MimeType[0]);
	}
}