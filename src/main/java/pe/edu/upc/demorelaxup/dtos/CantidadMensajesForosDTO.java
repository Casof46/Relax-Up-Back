package pe.edu.upc.demorelaxup.dtos;

public class CantidadMensajesForosDTO {
    public int Id_Mensajesforos;
    public String nameForo;
    public String nameUser;
    public int CantidadMensajesForos;

    public int getId_Mensajesforos() {
        return Id_Mensajesforos;
    }

    public void setId_Mensajesforos(int id_Mensajesforos) {
        Id_Mensajesforos = id_Mensajesforos;
    }

    public String getNameForo() {
        return nameForo;
    }

    public void setNameForo(String nameForo) {
        this.nameForo = nameForo;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getCantidadMensajesForos() {
        return CantidadMensajesForos;
    }

    public void setCantidadMensajesForos(int cantidadMensajesForos) {
        CantidadMensajesForos = cantidadMensajesForos;
}




}
