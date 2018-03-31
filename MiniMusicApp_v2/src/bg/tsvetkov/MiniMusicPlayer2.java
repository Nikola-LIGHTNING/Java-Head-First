/*package bg.tsvetkov;

import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener {
    public static void main(String[] args) {
        MiniMusicPlayer2 miniPlayer = new MiniMusicPlayer2();
        miniPlayer.go();
    }
    public void go() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            
            int[] eventsIWant =  {127};
            sequencer.addControllerEventListener(this, eventsIWant);
            
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            
            for(int i = 5; i < 61; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));  
                
                // event that does nothing (to know when we create a NOTE ON event
                track.add(makeEvent(176, 1, 127, 0, i));
                
                // NOTE ON 144 and NOTE OFF 128 pairs
                track.add(makeEvent(128, 1, i, 100, i + 2));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void controlChange(ShortMessage event) {
        System.out.println("la");
    }
    
    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        // the first four arguments are for setMessage
        // tick is for WHEN the event should happen
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
            
        }
        return event;
    }
}
*/