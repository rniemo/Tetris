import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Square-Shaped piece
 */
public class SquarePiece extends Piece {
    
    private List<Block> blockList;

    /**
     * Constructs a single instance of the Square Piece.
     *
     * @param x The x coordinate of the top left corner.
     * @param y The y coordinate of the top left corner.
     */
    public SquarePiece(int x, int y) {
        
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

