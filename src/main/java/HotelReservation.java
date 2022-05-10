import model.Hotel;

public class HotelReservation {

    Hotel lakewood = new Hotel("Lakewood", 3, 110.0,80.0, 90.0, 80.0);
    Hotel bridgewood = new Hotel("Bridgewood", 4, 160.0, 110.0, 60.0, 50.0);
    Hotel ridgewood = new Hotel("Ridgewood", 5, 220.0, 100.0, 150.0, 40.0);

    Double valorNoLakewood = 0.0;
    Double valorNoBridgewood = 0.0;
    Double valorNoRidgewood = 0.0;

    public String getCheapestHotel (String input) {

        if(input == null || input.isEmpty()){
            return "Informe corretamente o tipo de cliente e as datas.";
        }

        int[] quantidadeDeDias = traduzirString(input);

        if(input.toLowerCase().startsWith("regular")){

            valorNoLakewood = (quantidadeDeDias[0] * lakewood.getDiariaDoFimDeSemanaNormal())
                    + (quantidadeDeDias[1] * lakewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[2] * lakewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[3] * lakewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[4] * lakewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[5] * lakewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[6] * lakewood.getDiariaDoFimDeSemanaNormal());

            valorNoBridgewood = (quantidadeDeDias[0] * bridgewood.getDiariaDoFimDeSemanaNormal())
                    + (quantidadeDeDias[1] * bridgewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[2] * bridgewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[3] * bridgewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[4] * bridgewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[5] * bridgewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[6] * bridgewood.getDiariaDoFimDeSemanaNormal());

            valorNoRidgewood = (quantidadeDeDias[0] * ridgewood.getDiariaDoFimDeSemanaNormal())
                    + (quantidadeDeDias[1] * ridgewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[2] * ridgewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[3] * ridgewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[4] * ridgewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[5] * ridgewood.getDiariaDaSemanaNormal())
                    + (quantidadeDeDias[6] * ridgewood.getDiariaDoFimDeSemanaNormal());

        }else if(input.toLowerCase().startsWith("rewards")){
            valorNoLakewood = (quantidadeDeDias[0] * lakewood.getDiariaDoFimDeSemanaFidelidade())
                    + (quantidadeDeDias[1] * lakewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[2] * lakewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[3] * lakewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[4] * lakewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[5] * lakewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[6] * lakewood.getDiariaDoFimDeSemanaFidelidade());

            valorNoBridgewood = (quantidadeDeDias[0] * bridgewood.getDiariaDoFimDeSemanaFidelidade())
                    + (quantidadeDeDias[1] * bridgewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[2] * bridgewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[3] * bridgewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[4] * bridgewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[5] * bridgewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[6] * bridgewood.getDiariaDoFimDeSemanaFidelidade());

            valorNoRidgewood = (quantidadeDeDias[0] * ridgewood.getDiariaDoFimDeSemanaFidelidade())
                    + (quantidadeDeDias[1] * ridgewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[2] * ridgewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[3] * ridgewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[4] * ridgewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[5] * ridgewood.getDiariaDaSemanaFidelidade())
                    + (quantidadeDeDias[6] * ridgewood.getDiariaDoFimDeSemanaFidelidade());

        }else{
            return "Informe o tipo de cliente corretamente.";
        }

        if(valorNoLakewood < valorNoBridgewood && valorNoLakewood < valorNoRidgewood){
            return "Lakewood";
        }else if((valorNoLakewood == valorNoBridgewood || valorNoLakewood > valorNoBridgewood) && valorNoBridgewood < valorNoRidgewood){
            return "Bridgewood";
        }else if(valorNoBridgewood == valorNoRidgewood || valorNoBridgewood > valorNoRidgewood){
            return "Ridgewood";
        }else if(valorNoRidgewood < valorNoBridgewood && valorNoRidgewood < valorNoLakewood){
            return "Ridgewood";
        }else{
            return "Ocorreu algum erro inesperado.";
        }
    }

    private int[] traduzirString(String valor){
        int[] diasDaSemana = new int[7];

        for(int i = 0; i< valor.length(); i++){
            if(valor.substring(i).startsWith("(sun)")){
                diasDaSemana[0]++;
            }else if(valor.substring(i).startsWith("(mon)")){
                diasDaSemana[1]++;
            }else if(valor.substring(i).startsWith("(tues)")){
                diasDaSemana[2]++;
            }else if(valor.substring(i).startsWith("(wed)")){
                diasDaSemana[3]++;
            }else if(valor.substring(i).startsWith("(thur)")){
                diasDaSemana[4]++;
            }else if(valor.substring(i).startsWith("(fri)")){
                diasDaSemana[5]++;
            }else if(valor.substring(i).startsWith("(sat)")){
                diasDaSemana[6]++;
            }
        }

        return diasDaSemana;
    }
}
