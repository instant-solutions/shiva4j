package at.tripwire.shiva4j.objects;

import java.sql.Timestamp;

public interface Show {

	public interface Venue {

		/**
		 * Venue's name.
		 */
		String getName();

		/**
		 * Venue's latitude.
		 */
		String getLatitude();

		/**
		 * Venue's longitude.
		 */
		String getLongitude();
	}

	public interface OtherArtist {

		/**
		 * Name of the artist.
		 */
		String getName();

		/**
		 * MusicBrainz.com ID.
		 */
		String getMusicBrainzId();

		/**
		 * URI to BandsInTown's Facebook app for this artist.
		 */
		String getFacebookTourDatesUrl();

		/**
		 * URI to an image of the artist.
		 */
		String getImageUrl();
	}

	/**
	 * BandsInTown's ID for this event.
	 */
	int getId();

	/**
	 * The title of the event.
	 */
	String getTitle();

	/**
	 * Date and time of the show.
	 */
	Timestamp getDatetime();

	/**
	 * A boolean representing the availability (or not) of tickets for the
	 * concert.
	 */
	boolean isTicketsLeft();

	/**
	 * A structure identifying the venue where the event takes place.
	 */
	Venue getVenue();

	/**
	 * A list of artist resources.
	 */
	Artist[] getArtists();

	/**
	 * A list with artists that are not in Shiva's database.
	 */
	OtherArtist[] getOtherArtists();
}