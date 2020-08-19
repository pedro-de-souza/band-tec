/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oshente;

<<<<<<< HEAD
import java.util.Arrays;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OSProcess;
=======
>>>>>>> 622c6db2b3302f12fc5986f52c79e1f2b2507e0e

/**
 *
 * @author pedro
 */
public class TesteConsole {
<<<<<<< HEAD
    
    

    public static void main(String[] args) {

        //http://oshi.github.io/oshi/apidocs/oshi/SystemInfo.html
        
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        CentralProcessor cpu = hal.getProcessor();
        GlobalMemory memoria = hal.getMemory();
        HWDiskStore[] hd = hal.getDiskStores();
        
        

        System.out.println("\n----------------------------------------");
        System.out.println("Sistema operacional:");
        System.out.println(si.getOperatingSystem().getFamily());
        System.out.println(si.getOperatingSystem());
        System.out.println(si.getOperatingSystem().getBitness());

        System.out.println("\nCPU");
        //System.out.println(cpu)
        System.out.println(cpu.getProcessorIdentifier());
        System.out.println(cpu.getProcessorIdentifier().getName());
       
            
        System.out.println("\nMemoria RAM:");
        System.out.println(String.format("%s", memoria.getAvailable()));
        System.out.println(String.format("%s", memoria));
        System.out.println(String.format("%.1f", (memoria.getTotal() / Math.pow(10, 9) - 0.5)));
        
        System.out.println("\nDisco Rígido:");
        System.out.println(hd[0].getSize());
        
      
       
        
//        System.out.println("Processos em execução:");
//        for (OSProcess process : si.getOperatingSystem().getProcesses()) {
//
//            System.out.println(process.getName());
//        }
        System.out.println("\n----------------------------------------Fim");
    }
    
=======
    public static void main(String[] args) {
        CPU cpu = new CPU();
        RAM ram = new RAM();
        HD hd = new HD();

        //http://oshi.github.io/oshi/apidocs/oshi/SystemInfo.html
        System.out.println("\nCPU\n{");
        System.out.println(cpu.getProcessador()); 
        System.out.println(cpu.getUptime()); 
        System.out.println(cpu.getDesempenho()); 
        System.out.println(cpu.getClockSpeed()); 
        System.out.println("}\n");

        System.out.println("\nRAM\n{");
        System.out.println(ram.getTotalMemoria());
        System.out.print(ram.getUtilizavel());
        System.out.print("/");
        System.out.println(ram.getDisponivel());
        System.out.println(ram.getVirutalMemoriaTotal());
        System.out.println(ram.getNumerosDePentes());
        System.out.println(ram.getTipoMemoria());
        System.out.println(ram.getClockSpeed());
        System.out.println(ram.getDesempenhoMemoria());
        System.out.println("}\n");
        
        System.out.println("\nDisco Rigido\n{");

        System.out.println(hd.getQtdDisk());
        System.out.println(hd.getSizeDisk());
        System.out.println(hd.getFilesVolume());
        System.out.println(hd.getDiscoAlocado());
        System.out.println(hd.getDiscosTotalLivre());
        System.out.println(hd.getPorcentagemDisponivel());
        System.out.println(hd.getTipoSADisco());
        System.out.println(hd.getPorcentagemOcupada());

        System.out.println("}\n");
    }
>>>>>>> 622c6db2b3302f12fc5986f52c79e1f2b2507e0e
}
