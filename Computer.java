class CPU
{
    int price;
    class Processor
    {
        int core;
        String manufacture;
    }
    static class RAM
    {
        int memory;
        String manufacture;
    }
}
public class Computer
{
    public static void main(String[] args)
    {
        CPU cpu=new CPU();
        cpu.price=10000;
        
        CPU.Processor processor=cpu.new Processor();
        processor.core=8;
        processor.manufacture="Intel";
        
        CPU.RAM ram = new CPU.RAM();
        ram.memory=16;
        ram.manufacture="Corsair";
        
        System.out.println("CPU price:Rs"+cpu.price);
        System.out.println("Processor core:"+processor.core);
        System.out.println("Processor Manufacture:"+processor.manufacture);
        System.out.println("Ram Memory:"+ram.memory+"GB");
        System.out.println("Ram Manufacture:"+ram.manufacture);
    }
}