import java.util.List;

/**
 * Represents a single game piece.
 */
public abstract class Piece {

    /**
     * Provides the list of block objects representing {@code this}.
     *
     * @return The {@code List} of {@code Block}s.
     */
    public abstract List<Block> getBlockList();

    /**
     * Retrieves the number of blocks in this piece.
     *
     * @return The size of {@code this}.
     */
    public abstract int getPieceSize();

    /**
     * Updates {@code this}
     */
    public abstract void update();
}

