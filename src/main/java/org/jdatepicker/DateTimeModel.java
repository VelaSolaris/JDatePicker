package org.jdatepicker;

/**
 *  Created 12 November 2020
 *  Updated 12 November 2020
 *
 * @param <T> The type of this model (e.g. java.time.LocalDateTime, java.util.Calendar)
 * @author Marc Jakobi
 */
public interface DateTimeModel<T> extends DateModel<T>, TimeModel<T> {

    /**
     * @return the underlying date model
     */
    DateModel<?> getDateModel();

    /**
     * @return the underlying time model
     */
    TimeModel<?> getTimeModel();

    /**
     * @param hour between 0 and 23
     */
    void setHour(int hour);

    /**
     * @param minute between 0 and 59
     */
    void setMinute(int minute);

    /**
     * @param second between 0 and 59
     */
    void setSecond(int second);

    /**
     * @param nanoSecond the nanosecond
     */
    void setNanoSecond(int nanoSecond);

    /**
     * Adds the given number of hours.
     * @param numberOfHours the number of hours to add
     */
    void addHours(int numberOfHours);

    /**
     * Adds the given number of minutes.
     * @param numberOfMinutes the number of minutes to add
     */
    void addMinutes(int numberOfMinutes);

    /**
     * Adds the given number of seconds.
     * @param numberOfSeconds the number of seconds to add
     */
    void addSeconds(int numberOfSeconds);

    /**
     * Adds the given number of nanoseconds.
     * @param numberOfNanoseconds the number of nanoseconds to add
     */
    void addNanoSeconds(int numberOfNanoseconds);

}
