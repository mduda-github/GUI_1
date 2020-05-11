package View;

import java.awt.*;
import javax.swing.*;

public class ImportExportPanel {
  private JPanel importExportPanel;
  private JButton importButton;
  private JButton exportButton;

  public ImportExportPanel() {
    importExportPanel = new JPanel(new GridBagLayout());

    // Add border
    importExportPanel.setBorder(BorderFactory.createTitledBorder("File"));

    // Add buttons
    importButton = new JButton("Import");
    exportButton = new JButton("Export");

    // Setting dimension for buttons
    Dimension addEmployeeLabelDimension = new Dimension(85, 25);
    importButton.setPreferredSize(addEmployeeLabelDimension);
    exportButton.setPreferredSize(addEmployeeLabelDimension);

    // Position elements of layout in panel
    GridBagConstraints c = new GridBagConstraints();
    c.insets = new Insets(0, 10, 0, 10);
    c.gridx = 0;
    c.gridy = 0;
    importExportPanel.add(importButton, c);
    c.gridx = 0;
    c.gridy = 2;
    importExportPanel.add(exportButton, c);
  }

  public JPanel getImportExportPanel() {
    return importExportPanel;
  }

  public JButton getImportButton() {
    return importButton;
  }

  public JButton getExportButton() {
    return exportButton;
  }
}
