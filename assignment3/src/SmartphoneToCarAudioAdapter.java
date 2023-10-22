// Adapter class
public class SmartphoneToCarAudioAdapter implements CarAudioSystem {
    private Smartphone smartphone;

    public SmartphoneToCarAudioAdapter(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public void playAudio(AudioSource audioSource) {
        if (audioSource instanceof Bluetooth) {
            Bluetooth bluetoothSource = (Bluetooth) audioSource;
            smartphone.connectToBluetooth(bluetoothSource);
            System.out.println("Playing audio through AUX input.");
        }
        else if (audioSource instanceof USB) {
            USB usbSource = (USB) audioSource;
            smartphone.connectToUSB(usbSource);
            System.out.println("Playing audio through AUX input.");
        }
        else {
            System.out.println("Unsupported audio source.");
        }
    }
}