import java.util.ArrayList;
import java.util.List;

/**
 * Represents a straight piece on the game board
 */
public class StraightPiece extends Piece {

    private List<Block> blockList;
    
    /**
     * Generates a single straight piece.
     *
     * @param x The x position of the top left corner of the shape.
     * @param y The y position of the top left corner of the shape.
     */
    public StraightPiece(int x, int y) {
        
    }

    @Override
    public List<Block> getBlockList() {
        return this.blockList;
    }

    @Override
    public int getPieceSize() {
        return blockList.size();
    }

    @Override
    public void update() {
        // TODO: Complete this method later.
    }
}

