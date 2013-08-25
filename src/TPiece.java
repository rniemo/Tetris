import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single T-Shaped piece
 */
public class TPiece extends Piece {
    
    private List<Block> blockList;

    /**
     * Constructs a single T-Shaped piece.
     *
     * @param x The x coordinate of the top left corner
     * @param y The y coordinate of the top left corner
     */
    public TPiece(int x, int y) {
        
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

