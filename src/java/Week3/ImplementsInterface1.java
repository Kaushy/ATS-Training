package Week3;

class ImplementsInterface implements MultipleInterface,MultipleInterface2 {
    public void takePhoto() {
        System.out.println("taking photo");
    }

    public void videoRecord() {
        System.out.println("taking video");
    }

    public void makeCall(String phoneNumber) {
        System.out.println("calling to..."+phoneNumber);

    }

    public void sendMessage(String phoneNumber, String message) {
        System.out.println("messaging to.."+phoneNumber+" "+message);

    }
    void showFeature(){
        System.out.println("Feature of smart Camera");
        takePhoto();
        videoRecord();
        System.out.println("Features of phone");
        makeCall("9741110394");
        sendMessage("9741110394","hi da");

    }
}