package at.tripwire.shiva4j.objects.impl;

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
	private String streamUri;
	private AlbumImpl album;
	private ArtistImpl artist;

	/**
	 * The object's ID.
	 */
	public int getId() {
		return id;
	}

	/**
	 * The ordinal number of this track with respect to this album.
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * In MP3s this value is directly proportional to the sound quality.
	 */
	public int getBitrate() {
		return bitrate;
	}

	/**
	 * A slug of the track's title.
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * The title of the track.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * The URI of this resource's instance.
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * The length in seconds of the track.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * The URI to access the file.
	 */
	public String getStreamUri() {
		return streamUri;
	}

	/**
	 * The album to which this track belongs to.
	 */
	public Album getAlbum() {
		return album;
	}

	/**
	 * The artist which performs this track.
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

	public void setStreamUri(String streamUri) {
		this.streamUri = streamUri;
	}

	public void setAlbum(AlbumImpl album) {
		this.album = album;
	}

	public void setArtist(ArtistImpl artist) {
		this.artist = artist;
	}
}