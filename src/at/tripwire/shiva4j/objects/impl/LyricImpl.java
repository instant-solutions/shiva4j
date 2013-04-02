package at.tripwire.shiva4j.objects.impl;

import at.tripwire.shiva4j.objects.Lyric;
import at.tripwire.shiva4j.objects.Track;

public class LyricImpl implements Lyric {

	private int id;
	private String text;
	private String uri;
	private String sourceUri;
	private Track track;

	/**
	 * {@inheritDoc}
	 */
	public int getId() {
		return id;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getText() {
		return text;
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
	public String getSourceUri() {
		return sourceUri;
	}

	/**
	 * {@inheritDoc}
	 */
	public Track getTrack() {
		return track;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void setSourceUri(String sourceUri) {
		this.sourceUri = sourceUri;
	}

	public void setTrack(Track track) {
		this.track = track;
	}
}