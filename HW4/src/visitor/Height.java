
package visitor;

public class Height implements Visitor {

	@Override
	public int visitEmpty(Empty empty) {
		return 0;
	}

	@Override
	public int visitNonEmpty(NonEmpty nonEmpty) {
		int leftHeight = (nonEmpty.getLeftSubTree() != null
			? (nonEmpty.getLeftSubTree() instanceof NonEmpty
				? visitNonEmpty((NonEmpty) nonEmpty.getLeftSubTree())
				: visitEmpty((Empty) nonEmpty.getLeftSubTree()))
			: 0);

		int rightHeight = (nonEmpty.getRightSubTree() != null
			? (nonEmpty.getRightSubTree() instanceof NonEmpty
				? visitNonEmpty((NonEmpty) nonEmpty.getRightSubTree())
				: visitEmpty((Empty) nonEmpty.getRightSubTree()))
			: 0);

		if (leftHeight >= rightHeight) {
			return 1 + leftHeight;
		}
		else
			return 1 + rightHeight;
	}

}
