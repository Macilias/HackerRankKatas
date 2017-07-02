package quesAndStacks;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class SolutionTest {

    final String problem0 = "}(]}){";

    final String result0 = "NO";

    final String problem1 = "[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]\n" +
            "[()][{}[{}[{}]]][]{}[]{}[]{{}({}(){({{}{}[([[]][[]])()]})({}{{}})})}\n" +
            "(])[{{{][)[)])(]){(}))[{(})][[{)(}){[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}{({}](]{{[}}(([{]\n" +
            "){[]()})}}]{}[}}})}{]{](]](()][{))])(}]}))(}[}{{)}{[[}[]\n" +
            "}(]}){\n" +
            "((]()(]([({]}({[)){}}[}({[{])(]{()[]}}{)}}]]{({)[}{(\n" +
            "{}{({{}})}[][{{}}]{}{}(){{}[]}{}([[][{}]]())\n" +
            "(){}[()[][]]{}(())()[[([])][()]{}{}(({}[]()))()[()[{()}]][]]\n" +
            "()([]({}[]){}){}{()}[]{}[]()(()([[]]()))()()()[]()(){{}}()({[{}][]}[[{{}({({({})})})}]])\n" +
            "[]([{][][)(])}()([}[}(})}])}))]](}{}})[]({{}}))[])(}}[[{]{}]()[(][])}({]{}[[))[[}[}{(]})()){{(]]){][\n" +
            "{()({}[[{}]]()(){[{{}{[[{}]{}((({[]}{}()[])))]((()()))}(()[[[]]])((()[[](({([])()}))[]]))}]})}\n" +
            "()(){{}}[()()]{}{}\n" +
            "{}()([[]])({}){({[][[][[()]]{{}[[]()]}]})}[](())((())[{{}}])\n" +
            "{}(((){}){[]{{()()}}()})[]{{()}{(){()(){}}}}{()}({()(()({}{}()((()((([])){[][{()}{}]})))))})\n" +
            "][[{)())))}[)}}}}[{){}()]([][]){{{{{[)}]]{([{)()][({}[){]({{\n" +
            "{{}(\n" +
            "{[{((({}{({({()})()})[]({()[[][][]]}){}}))){}}]}{}{({((){{}[][]{}[][]{}}[{}])(())}[][])}\n" +
            "()[[][()[]][]()](([[[(){()[[]](([]))}]]]))\n" +
            "()[]({}{})(()){{{}}()()}({[]()}())[](){}(({()}[{}[{({{}}){({}){({})((({()})))}}}]]))\n" +
            "}[{){({}({)})]([}{[}}{[(([])[(}){[]])([]]}(]]]]{][\n" +
            "[{]{[{(){[}{}(([(]}])(){[[}(]){(})))}}{{)}}{}][({(}))]}({)\n" +
            ")})[(]{][[())]{[]{{}}[)[)}[]){}](}({](}}}[}{({()]]\n" +
            "[[[({[]}({[][[[[][[{(()[][])}()[][]][]{}]]]]}))][(()){}]]]()[{}([]{}){}{{}}]\n" +
            "({[]({[]})}())[][{}[{{(({{{([{}])}}}))}}]]\n" +
            "([((()))()])[][][]{}()(([]))[]()[]((){}[]){}(){{}[]}[[{[]}]]\n" +
            "[[(((({}{[]{}()}){}{{}}){({[]{[{}]{(){}(((){()}))}()}}[[]]()()[()])[[{}{}]()]}))]]{}[]{}({({{}})})\n" +
            "(]{()}((\n" +
            "[][(())[({{{()[]}}{[[][[][[[]{{{[()]{{{{}{[]}[][]}}}}}}]]]]}})]]\n" +
            "}[})})}[)]{}{)\n" +
            "({(}{})))}(}[)[}{)}}[)[{][{(}{{}]({}{[(})[{[({{[}{(]]})}\n" +
            "]}})[]))]{][])[}(])]({[]}[]([)\n" +
            "[{{}{[{{[}[[}([]\n" +
            "[([]){}][({})({[(([])[][])][[{}{([{{}{(()){{{({}{{}}())}}[]}}()[()[{{{([](()){[[[]]]})}}}]]}])}]]})]\n" +
            "]{}{(}))}](})[{]]()(]([}]([}][}{]{[])}{{{]([][()){{})[{({{{[}{}](]}}\n" +
            "{[{}}){(}[][)(}[}][)({[[{]}[(()[}}){}{)([)]}(()))]{)(}}}][\n" +
            "(]{}{(}}}[)[\n" +
            "[]{}{[[]]}([{}]{}[]){{(())}}\n" +
            "[)([{(][(){)[)}{)]]}}([((][[}}(]{}]]}]][(({{{))[[){}{]][))[]{]][)[{{}{()]){)])))){{{[(]}[}}{}]\n" +
            "{({(){[[[][]{}[[([]{})]{}]][[]()()]]}})}[{}{{}}]\n" +
            ")}][(})){))[{}[}\n" +
            "{[]{({]}[}}[{([([)([){{}{(}}[]}}[[{[}[[()(])[}[]\n" +
            "()()()[]\n" +
            "((){}])][]][}{]{)]]}][{]}[)(])[}[({(\n" +
            ")[((])(]]]]((]){{{{())]}]}(}{([}(({}]])[[{){[}]{{}})[){(\n" +
            "}][[{[((}{[]){}}[[[)({[)}]]}(]]{[)[]}{}(){}}][{()]))})]][(((}}\n" +
            "([]){}{{}{}}()([([{}{[[]()([(([]()))()[[]]])]}])])\n" +
            "[()[[]{{[]}()([])}[]][][]][]()[]{}{}[][]{}{}[()(){}]\n" +
            "{[{){]({(((({](]{([])([{{([])[}(){(]](]{[{[]}}())[){})}))[{})))[\n" +
            "{}[()[]][]{}{}[[{{[[({})]()[[()]]]}}]]\n" +
            "{[{}[][]]}[((()))][]({})[]{}{()}\n" +
            "(){[{({})}]}\n" +
            "([]])][{)]({)[]))}]())[}]))][}{(}}})){]}]{[)}(][})[[\n" +
            "((({{}(([{}(())]))[()]{[[[]()]]}})))\n" +
            "}()))}(}]]{{})}][{](]][{]{[[]]]}]]}([)({([))[[(]}])}[}(([{)[)]]([[](]}]}{]{{})[]){]}{])(\n" +
            "{}{}{}{[[()]][]}\n" +
            ")]}]({{})[[[{]{{{}}][))]{{\n" +
            "))){({}])}])}}]{)()(}(]}([\n" +
            "([[]][])[[]()][]()(([[]]{[()[]{[][{}]}[()]]{}{[]}}{{}()}(()[([][]{})[[{}][]]{}[]])))\n" +
            "(]{[({}[){)))}]{[{}][({[({[]))}[}]}{()(([]{]()}})}[]{[)](((]]])([]}}]){)(([]]}[[}[\n" +
            "([[]])({}(([(){{}[{}]}]){[{}]}))[][{}{}](){}\n" +
            "[][][][][][([])][]{({()}[[()()]{([(){[]{}}{(())}{[](){}()({}())}[({}[[]()])][]])}])}\n" +
            "}[{{(}})}}(((())()({]{([]((][(({)[({[]]}[])}]{][{{}]{)][}(])}}}))}}}\n" +
            "[]({})()[]{}{}[]({}{})[]{([])()[()][{()({})[{}{[[()]{}[]][]}(({{[]{()()()}{}[]()}[]}){{}{}})]}]}\n" +
            "{{(([{)]{}({][{](){({([[[][)}[)})(\n" +
            "[{}]{[()({[{}]})]}\n" +
            "[[{}]]\n" +
            "]{{({[{]}[[)]]}{}))}{){({]]}{]([)({{[]){)]{}){){}()})(]]{{])(])[]}][[()()}\n" +
            "{[([}[[{{(]]][}()())]{){(){)]]){})}]{][][(}[]())[}[)})})[][{[)[})()][]))}[[}\n" +
            "]()])}[}}}{]]{)[}(}]]])])}{(}{([{]({)]}])(})[{}[)]])]}[]{{)){}{()}]}((}}{({])[}])[]}\n" +
            "(]}[{}{{][}))){{{([)([[])([]{[\n" +
            "{(()[]){}}(){[]}({{}(()())})([]){}{}(())()[()]{}()\n" +
            "{{}[{}[{}[]]]}{}({{[]}})[[(){}][]]{}(([]{[][]()()}{{{()()}{[]}({}[]{()})}{()}[[]][()]}))\n" +
            "{[][]}[{}[](){}]{{}{[][{}]}}\n" +
            "()(){}(){((){}[])([[]]())}\n" +
            "{}[[{[((}[(}[[]{{]([(}]][[\n" +
            "{}[([{[{{}()}]{}}([[{}[]]({}{{()}[][][]})])])]\n" +
            "{[](}([)(])[]]})()]){[({]}{{{)({}(][{{[}}(]{\n" +
            "[][]{{}[](())}{}({[()]}())[][[][({}([{}]))]]\n" +
            "((()))[]{[(()({[()({[]}{})]}))]}{[]}{{({}{})[{}{}]{()([()])[{()}()[[]{}()]{}{}[]()]}[[]{[]}([])]}}";

    final String result1 = "YES\n" +
            "YES\n" +
            "NO\n" +
            "NO\n" +
            "NO\n" +
            "NO\n" +
            "YES\n" +
            "YES\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "YES\n" +
            "YES\n" +
            "YES\n" +
            "NO\n" +
            "NO\n" +
            "YES\n" +
            "YES\n" +
            "YES\n" +
            "NO\n" +
            "NO\n" +
            "NO\n" +
            "YES\n" +
            "YES\n" +
            "YES\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "NO\n" +
            "NO\n" +
            "NO\n" +
            "NO\n" +
            "YES\n" +
            "NO\n" +
            "NO\n" +
            "NO\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "NO\n" +
            "NO\n" +
            "YES\n" +
            "NO\n" +
            "NO\n" +
            "NO\n" +
            "YES\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "YES\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "NO\n" +
            "NO\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "YES\n" +
            "NO\n" +
            "NO\n" +
            "NO\n" +
            "NO\n" +
            "YES\n" +
            "YES\n" +
            "YES\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "NO\n" +
            "YES\n" +
            "YES";

    @Test
    public void testStack1 () {
        Solution.Stack stack = new Solution.Stack();
        Assert.assertTrue(stack.empty());
        stack.push('a');
        Assert.assertFalse(stack.empty());
        Assert.assertEquals('a', stack.peak());
        Assert.assertFalse(stack.empty());
        Assert.assertEquals('a', stack.pop());
        Assert.assertTrue(stack.empty());
    }

    @Test
    public void testStack2 () {
        Solution.Stack stack = new Solution.Stack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        Assert.assertEquals('d', stack.peak());
        Assert.assertEquals('d', stack.pop());
        Assert.assertEquals('c', stack.pop());
        Assert.assertEquals('b', stack.pop());
        Assert.assertEquals('a', stack.pop());
        Assert.assertTrue(stack.empty());
    }

    @Test
    public void testProblem1 () {
        runTest(getLines(problem1), getLines(result1));
    }

    private String[] getLines(String input) {
        return input.split(System.getProperty("line.separator"));
    }

    private void runTest(String[] input, String[] result) {
        if (input.length != result.length) {
            throw new InvalidParameterException("inputs does not match");
        }

        for (int i = 0; i < input.length; i++) {
            String in = input[i].trim();
            System.out.println(in);
            String re = result[i].trim();
            System.out.println(re);
            if (Solution.isBalanced(in)) {
                Assert.assertTrue(re.equals("YES"));
            } else {
                Assert.assertTrue(re.equals("NO"));
            }
        }
    }

}
