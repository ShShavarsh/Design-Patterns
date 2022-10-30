
package visitor;

public interface  Visitor {

	public abstract int visitEmpty(Empty empty);

	public abstract int visitNonEmpty(NonEmpty nonEmpty);

}
