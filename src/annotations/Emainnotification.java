package annotations;

class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Enviando correo electrónico");
    }
}