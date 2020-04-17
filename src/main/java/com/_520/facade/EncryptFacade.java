package com._520.facade;

/**
 *  外观类：负责处理 读取文件，加密，保存文件 操作
 */
public class EncryptFacade {

    private final FileReader fileReader = new FileReader();
    private final FileWriter fileWriter = new FileWriter();
    private final CipherMachine cipherMachine = new CipherMachine();

    public void fileEncrypt(String fileNameSrc, String fileNameDesc){
        // 获取文件内容
        String text = fileReader.read(fileNameSrc);
        // 对文件内容进行加密
        String encrypt = cipherMachine.encrypt(text);
        // 保存加密后的文件
        fileWriter.write(encrypt, fileNameDesc);
    }
}
