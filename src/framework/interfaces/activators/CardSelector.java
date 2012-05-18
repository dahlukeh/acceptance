package framework.interfaces.activators;

import framework.cards.Card;

/**
 * A component of the CardActivator family.
 *
 * @author Matthew Moss (matthew.moss)
 * @author Lasath Fernando (lasath.fernando)
 * @author Damon Stacey (damon.stacey)
 */
public interface CardSelector {

    /**
     * The user chooses a card from a pile.
     *
     * <p>
     * The choice is specified by the name of the choosen card. You are
     * to pick the first such card in the pile with this name.
     * </p>
     *
     * @param choosen The card that was picked
     */
    void chooseCardFromPile (Card choosen);
}
