
package visitor;

public class Size implements Visitor {

	@Override
	public int visitEmpty(Empty empty) {

		return 1;
	}

	@Override
	public int visitNonEmpty(NonEmpty nonEmpty) {
		int leftSize = 0, rightSize = 0;
		if (nonEmpty.getLeftSubTree() != null) {
			if (nonEmpty.getLeftSubTree() instanceof NonEmpty) {
				leftSize = visitNonEmpty((NonEmpty) nonEmpty.getLeftSubTree());
			}
			else {
				leftSize = visitEmpty((Empty) nonEmpty.getLeftSubTree());
			}

		}

		if (nonEmpty.getRightSubTree() != null) {
			if (nonEmpty.getRightSubTree() instanceof NonEmpty) {
				rightSize = visitNonEmpty(
					(NonEmpty) nonEmpty.getRightSubTree());
			}
			else {
				rightSize = visitEmpty((Empty) nonEmpty.getRightSubTree());
			}

		}

		return 1 + leftSize + rightSize;
	}

}
