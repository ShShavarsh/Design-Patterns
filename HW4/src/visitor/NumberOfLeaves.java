
package visitor;

public class NumberOfLeaves implements Visitor {

	@Override
	public int visitEmpty(Empty empty) {
		return 1;
	}

	@Override
	public int visitNonEmpty(NonEmpty nonEmpty) {
		int leftNum = 0, rightNum = 0;
		if (nonEmpty.getLeftSubTree() != null) {

			if (nonEmpty.getLeftSubTree() instanceof NonEmpty) {
				leftNum = visitNonEmpty((NonEmpty) nonEmpty.getLeftSubTree());
			}
			else {
				leftNum = visitEmpty((Empty) nonEmpty.getLeftSubTree());
			}
		}
		if (nonEmpty.getRightSubTree() != null) {
			if (nonEmpty.getRightSubTree() instanceof NonEmpty) {
				rightNum = visitNonEmpty((NonEmpty) nonEmpty.getRightSubTree());
			}
			else {
				rightNum = visitEmpty((Empty) nonEmpty.getRightSubTree());
			}
		}
		return leftNum + rightNum;
	}

}
