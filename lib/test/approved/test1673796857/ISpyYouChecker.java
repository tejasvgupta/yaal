package approved.test1673796857;

import net.egork.utils.checker.Checker;
import net.egork.utils.io.InputReader;
import java.util.Collections;
import java.util.Collection;
import net.egork.utils.test.Test;

public class ISpyYouChecker extends Checker {
	@Override
	public String check(InputReader input, InputReader expectedOutput, InputReader actualOutput) {
		return tokenCheck(expectedOutput, actualOutput);
	}

	@Override
	public double getCertainty() {
		return 0;
	}

	@Override
	public Collection<Test> generateTests() {
		return Collections.<Test>emptyList();
	}
}

