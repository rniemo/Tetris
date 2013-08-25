import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single SPiece.
 */
public class SPiece extends Piece {
    
    private List<Block> blockList;

    /**
     * Constructs a single BackZPiece.
     *
     * @param x The x position of the top left corner.
     * @param y The y position of the top left corner.
     */
    public SPiece(int x, int y) {
        
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

