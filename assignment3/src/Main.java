public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        CarAudioSystem carAudioSystem = new SmartphoneToCarAudioAdapter(smartphone);

        AudioSource audioSource = new Bluetooth();
        carAudioSystem.playAudio(audioSource);

        audioSource = new USB();
        carAudioSystem.playAudio(audioSource);
    }
}
