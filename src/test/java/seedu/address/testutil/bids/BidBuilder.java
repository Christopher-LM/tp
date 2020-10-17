package seedu.address.testutil.bids;

import seedu.address.model.bid.Bid;
import seedu.address.model.id.BidderId;
import seedu.address.model.id.PropertyId;

public class BidBuilder {

    public static final String DEFAULT_PROPERTY_ID = "P01";
    public static final String DEFAULT_BIDDER_ID = "B01";
    public static final double DEFAULT_BID_AMOUNT = 45000.30;

    private PropertyId propertyId;
    private BidderId bidderId;
    private double bidAmount;

    /**
     * constructor for a default BidBuilder object
     */
    public BidBuilder() {
        propertyId = new PropertyId(DEFAULT_PROPERTY_ID);
        bidderId = new BidderId(DEFAULT_BIDDER_ID);
        bidAmount = DEFAULT_BID_AMOUNT;
    }

    /**
     * constructor for a copy BidBuilder object
     */
    public BidBuilder(Bid bidToCopy) {
        propertyId = bidToCopy.getPropertyId();
        bidderId = bidToCopy.getBidderId();
        bidAmount = bidToCopy.getBidAmount();
    }

    /**
     * sets a BidBuilder object with a unique PropertyId
     * @param id String id to change to
     * @return
     */
    public BidBuilder withPropertyId(String id) {
        this.propertyId = new PropertyId(id);
        return this;
    }

    /**
     * sets a BidBuilder object with a unique BidderId
     * @param id String id to change to
     * @return
     */
    public BidBuilder withBidderId(String id) {
        this.bidderId = new BidderId(id);
        return this;
    }

    /**
     * sets a BidBuilder object with a unique BidAmount
     * @param amt double amount to change to
     * @return
     */
    public BidBuilder withBidAmount(double amt) {
        this.bidAmount = amt;
        return this;
    }

    public Bid build() {
        return new Bid(propertyId, bidderId, bidAmount);
    }

}
