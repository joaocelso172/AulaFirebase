package com.example.aulafirebase.helper;

import java.text.SimpleDateFormat;

public class DateCustom {

    public static String dataAtual(){

        long date = System.currentTimeMillis();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - hh:mm");
        String dataString = simpleDateFormat.format(date);

        return dataString;
    }

    public static String firebaseFormatDate(String data){

        //Quebra a string no padrão escrito, neste caso, quebrará a cada '/'
        String dataFormatada[] = data.split("/");

        //Estabelece um novo padrão, agora todos são separados por Hífen
        String dataFormatoNovo = dataFormatada[0] + " - "
                + dataFormatada[1]
                + " - " + dataFormatada[2];

        //Pega novamente a data completa e quebra a cada ' - '.
        String dataBuilder[] = dataFormatoNovo.split(" - ");

        //Pega o indice 0, equivalente ao dia no nosso formato estabelecido
        String dia = dataBuilder[0];
        //Pega o indice 1, equivalente ao mes no nosso formato estabelecido
        String mes = dataBuilder[1];
        //Pega o indice 2, equivalente ao ano no nosso formato estabelecido
        String ano = dataBuilder[2];
        //Pega o indice 3, equivalente a hora + minutos no nosso formato estabelecido
        String hora = dataBuilder[3];


        String dataRetorno = ano + "/" + mes + "/" + dia;

        return dataRetorno;
    }

    public static String udemyFormatDate(String data){

        //Quebra a string no padrão escrito, neste caso, quebrará a cada '/'
        String dataFormatada[] = data.split("/");

        //Pega o indice 0, equivalente ao dia no nosso formato estabelecido
        String dia = dataFormatada[0];
        //Pega o indice 1, equivalente ao mes no nosso formato estabelecido
        String mes = dataFormatada[1];
        //Pega o indice 2, equivalente ao ano no nosso formato estabelecido
        String ano = dataFormatada[2];


        String dataRetorno = mes + ano;

        return dataRetorno;
    }
}