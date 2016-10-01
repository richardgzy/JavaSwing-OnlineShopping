import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class AdminMusicDetails extends AdminProductDetails {

	// music
	private JLabel singerLabel;
	private JLabel genreLabel;
	private JLabel numOfSongsLabel;
	private JTextField singer;
	private JTextField genre;
	private JSpinner numOfSongs;

	public AdminMusicDetails(ShopController c,DefaultTableModel tm) {
		super(c,tm);
		setTitle("Create a music");
		// Create music labels and text fields
		singerLabel = new JLabel("Singer");
		genreLabel = new JLabel("Genre");
		numOfSongsLabel = new JLabel("NO. of songs");
		singer = new JTextField();
		genre = new JTextField();
		numOfSongs = new JSpinner();
		numOfSongs.setModel(new SpinnerNumberModel(1, 1, 10000, 1));

		// Add music attributes into content panel
		contentPanel.add(singerLabel);
		contentPanel.add(singer);
		contentPanel.add(genreLabel);
		contentPanel.add(genre);
		contentPanel.add(numOfSongsLabel);
		contentPanel.add(numOfSongs);
		contentPanel.setLayout(new GridLayout(7, 2));
		
		contentPanel.setLayout(new GridLayout(7, 2));
		this.getContentPane().add(contentPanel, BorderLayout.NORTH);
	}

	public JLabel getSingerLabel() {
		return singerLabel;
	}

	public JLabel getGenreLabel() {
		return genreLabel;
	}

	public JLabel getNumOfSongsLabel() {
		return numOfSongsLabel;
	}

	public JTextField getSinger() {
		return singer;
	}

	public JTextField getGenre() {
		return genre;
	}

	public JSpinner getNumOfSongs() {
		return numOfSongs;
	}

}
