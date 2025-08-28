package boardgame;

public class BoardException extends RuntimeException{
    public static final Long serialVersionUID = 1L;

    public BoardException(String msg) {
        super(msg);
    }

}
