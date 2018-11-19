package aprendendoselenium;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import categorias.NegativeTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({
	LoginFacebookTest.class,
	CadastroFacebookTest.class,
})
//@IncludeCategory({PositiveTest.class, SmokeTest.class})
@ExcludeCategory({NegativeTest.class})
public class PositiveSuite {

}
