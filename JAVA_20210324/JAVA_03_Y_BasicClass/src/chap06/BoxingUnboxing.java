package chap06;
class BoxingUnboxing {
    public static void main(String[] args) {
        // �ν��Ͻ��� ���� ���δ� �ڽ�
        Integer iObj = new Integer(10);
        Double dObj = new Double(3.14);
        
        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        // �޼ҵ� ȣ���� ���� ��ڽ�
        int num1 = iObj.intValue();
        double num2 = dObj.doubleValue();

        System.out.println(iObj);
        System.out.println(dObj);
 
    }
}