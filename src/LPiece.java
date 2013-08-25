import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single L-Shaped piece.
 */
public class LPiece extends Piece {
    
    private List<Block> blockList;

    /**
     * Constructs a single L-shaped piece.
     *
     * @param x The x coordinate of the top left corner.
     * @param y The y coordinate of the top left corner.
     */
    public LPiece(int x, int y) {
        
    }

    @Override
    public List<Block> getBlockList() {
        return this.blockList;
    }

    @Override
    public int getPieceSize() {
        return 0;
    }

    @Override
    public void update() {
        
    }
}

