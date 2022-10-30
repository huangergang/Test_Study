package test.stu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class MyRandom {

    public static String randomName() {
        String str = "��һ��\n" +
                "�����\n" +
                "����ŵ\n" +
                "����ϫ\n" +
                "��һ��\n" +
                "����ϫ\n" +
                "������\n" +
                "������\n" +
                "������\n" +
                "�μ���\n" +
                "��˼��\n" +
                "����ܰ\n" +
                "������\n" +
                "��һ��\n" +
                "����ӱ\n" +
                "��γ�\n" +
                "����ŵ\n" +
                "���ǰ�\n" +
                "���ŵ\n" +
                "����ī\n" +
                "��һȻ\n" +
                "������\n" +
                "������\n" +
                "��h��\n" +
                "����\n" +
                "��ҫ��\n" +
                "���ղ�\n" +
                "�����\n" +
                "�����\n" +
                "��ɿ�\n" +
                "����ܰ\n" +
                "������\n" +
                "�����h\n" +
                "������\n" +
                "���»�\n" +
                "�ƼѼ�\n" +
                "��˼��\n" +
                "������\n" +
                "����ͮ\n" +
                "���Ͻ�\n" +
                "��һŵ\n" +
                "�°���\n" +
                "��һһ\n" +
                "������\n" +
                "����ͯ\n" +
                "�ž���\n" +
                "������\n" +
                "�����\n" +
                "���h\n" +
                "�º���\n" +
                "���Ļ�\n" +
                "��h��\n" +
                "������\n" +
                "ë����\n" +
                "������\n" +
                "����֮\n" +
                "������\n" +
                "����ϫ\n" +
                "�Ϋh��\n" +
                "���̻�\n" +
                "��誺�\n" +
                "���԰�\n" +
                "����һ\n" +
                "κ��Ȼ\n" +
                "����Ц\n" +
                "������\n" +
                "�����\n" +
                "��־ƽ\n" +
                "��̩��\n" +
                "������\n" +
                "������\n" +
                "�����\n" +
                "������\n" +
                "������\n" +
                "����ϫ\n" +
                "������\n" +
                "��ǧ˶\n" +
                "���\n" +
                "���լu\n" +
                "�����\n" +
                "�߾���\n" +
                "�ƶ�ѩ\n" +
                "������\n" +
                "��һ��\n" +
                "������\n" +
                "�����\n" +
                "������\n" +
                "�����\n" +
                "�����\n" +
                "���\n" +
                "������\n" +
                "�����\n" +
                "��־��\n" +
                "ũ����\n" +
                "���ʽ�\n" +
                "������\n" +
                "������\n" +
                "������\n" +
                "֣�īh\n" +
                "��ɭ��";
        String str1 = "�R��������ö�ӳ���ӳ���嵤��������ͨ���̱��갲�����⿡���ܱ�����ϱ̺�ͨ�ö���ְ���౱����ӭ�����ٵ�����Ǿ�������R��ɺξ����ӷ��Ļ�ˮ�仳�Ƭ���С�ỳ�����ﶬ�׽�Ĭ��ξˮͮ��Ѱɽ�������������𲨺�������������ջ�˿�ĺ����ඬ��ŷ����������ͨǧ��購Ĳ���ѩ���ɽ��ѩɺ�ط�褺ڴ����ںᲨ��������õ�ξ�����÷�ޱ���������ŵ����ܷξ�ֶ���ӭ���ڻ�����г��Rѩ�İ�ڤ���߷�ô�ε�ξ��ѩ�����ư�������֮Ľ�R��֮���ѩʫ��ī�����尬���װ�Ӣ����ĺ���������߷ðؿ�Ѱ��������޵��ɽ�徸��ŷˮ��������������ⶬ÷��������˪�x���ݹ���ͮ�����̰�������֮�ΛR���ϰ��Ƭu����᰽񿭶�����������������÷�ͯϫ����Ȼ����칮���ٺ�ˮ�����ͮ��������ɽ�ƕx��ޱ�ڱ���������������ʫ��˪������Ѱ¶����������మ���ٱ����ٱ�����ʥĽ��������������ɽ���崺˿ʥ��ѩξ���฻�ɺ���������Ԫͮ����Ƽʫ��������ѩ�Ͽ����붫����޵�������������ɽ��˼�����ְ��𵤴�������Rѩ��x�����°�ޱ���������������̱������Ĵ�������ѧ��ʫ�°����Ϻ�����޵���޵ɽ��ξ��������������ŷϧ��ͨ����廪��������";
        List<String> list = new ArrayList<>() {
        };
        for (int i = 0; i < str1.length(); i++) {
            if ((i + 3) < str1.length())
                list.add(str1.substring(i, i + 3));
        }
        String[] names = str.split("\n");
        list.addAll(Arrays.asList(names));
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }

    public static String randomGender() {
        String[] gender = {"MALE", "FEMALE"};
        return gender[ThreadLocalRandom.current().nextInt(gender.length)];
    }

    public static String randomPhone() {
        String headStr = "135��136��137��138��139��147��150��151��152��157��158��159��172��178��182��183��184��187��188��195��197��198��130��131��132��145��155��156��166��175��176��185��186��196��133��149��153��180��181��189��173��177��190��191��193��199";
        String[] headArray = headStr.split("��");
        StringBuilder phone = new StringBuilder(headArray[ThreadLocalRandom.current().nextInt(headArray.length)]);
        phone.append(ThreadLocalRandom.current().nextInt(0, 10))
                .append(ThreadLocalRandom.current().nextInt(0, 10))
                .append(ThreadLocalRandom.current().nextInt(0, 10))
                .append(ThreadLocalRandom.current().nextInt(0, 10))
                .append(ThreadLocalRandom.current().nextInt(0, 10))
                .append(ThreadLocalRandom.current().nextInt(0, 10))
                .append(ThreadLocalRandom.current().nextInt(0, 10))
                .append(ThreadLocalRandom.current().nextInt(0, 10));
        return new String(phone);
    }

}