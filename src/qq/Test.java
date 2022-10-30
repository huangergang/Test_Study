package qq;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

public class Test {

    public static void main(String[] args) throws AWTException {

        String sentence = "Test...";//定义要发送的话

        //以下三行为将上述字符串放到剪切板内，相当于做了一次复制操作
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = new StringSelection(sentence);
        clip.setContents(tText, null);


        Robot robot = new Robot();//创建Robot对象
        robot.delay(3000);//延迟三秒，主要是为了预留出打开窗口的时间，括号内的单位为毫秒

        while (true) {

            //以下两行按下了ctrl+v，完成粘贴功能
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);//释放ctrl按键，像ctrl，退格键，删除键这样的功能性按键，在按下后一定要释放，不然会出问题。crtl如果按住没有释放，在按其他字母按键是，敲出来的回事ctrl的快捷键。
            robot.keyPress(KeyEvent.VK_ENTER);//回车

        }

    }
}
