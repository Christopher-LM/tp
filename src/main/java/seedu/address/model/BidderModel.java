package seedu.address.model;

import java.nio.file.Path;
import java.util.function.Predicate;

import javafx.collections.ObservableList;
import seedu.address.model.bidderaddressbook.ReadOnlyBidderAddressBook;
import seedu.address.model.person.bidder.Bidder;

public interface BidderModel {

    /** {@code Predicate} that always evaluate to true */
    Predicate<Bidder> PREDICATE_SHOW_ALL_BIDDERS = unused -> true;

    /**
     * Returns the user prefs' Bidder address book file path.
     */
    Path getBidderAddressBookFilePath();

    /**
     * Sets the user prefs' Bidder address book file path.
     */
    void setBidderAddressBookFilePath(Path bidderAddressBookFilePath);

    /**
     * Replaces address book data with the data in {@code addressBook}.
     */
    void setBidderAddressBook(ReadOnlyBidderAddressBook bidderAddressBook);

    /** Returns the AddressBook */
    ReadOnlyBidderAddressBook getBidderAddressBook();

    /**
     * Returns true if a bidder with the same identity as {@code bidder} exists in the address book.
     */
    boolean hasBidder(Bidder bidder);

    /**
     * Deletes the given bidder.
     * The bidder must exist in the address book.
     */
    void deleteBidder(Bidder target);

    /**
     * Adds the given bidder.
     * {@code bidder} must not already exist in the address book.
     */
    void addBidder(Bidder bidder);

    /**
     * Replaces the given bidder {@code target} with {@code editedBidder}.
     * {@code target} must exist in the address book.
     * The bidder identity of {@code editedBidder} must not be the same as another existing bidder in the address book.
     */
    void setBidder(Bidder target, Bidder editedBidder);

    /** Returns an unmodifiable view of the filtered bidder list */
    ObservableList<Bidder> getFilteredBidderList();

    /**
     * Updates the filter of the filtered bidder list to filter by the given {@code predicate}.
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredBidderList(Predicate<Bidder> predicate);

}
