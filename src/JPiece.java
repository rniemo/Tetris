import java.util.ArrayList;
import java.util.List;

/**
 * Reperesents a single J-Shaped piece.
 */
public class JPiece extends Piece {
    
    private List<Block> blockList;

    /**
     * Constructs a single instance of the J-Shaped piece.
     *
     * @param x The x coordinate of the top left corner.
     * @param y The y coordinate of the top left corner.
     */
    public JPiece(int x, int y) {
        
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

