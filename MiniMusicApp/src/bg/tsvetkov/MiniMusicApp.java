package bg.tsvetkov;

import javax.sound.midi.*;

//TRY WITH COMMAND LINE ARGUMENTS 80 20 & 40 70.. SIIIIICK!

public class MiniMusicApp {    
    public static void main(String[] args) {
        MiniMusicApp app = new MiniMusicApp();
        if(args.length < 2) {
            System.out.println("You have not entered an instrument anda a note value!");            
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            app.play(instrument, note);
        }
        
    }
    
    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            
            Track track = seq.createTrack();
            
            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);            
            track.add(changeInstrument);
            
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);            
            track.add(noteOn);
            
            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);
            
            player.setSequence(seq);
            player.start();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
    
}
