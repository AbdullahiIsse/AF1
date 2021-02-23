package temperature.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;



public class TemperatureViewController{
   @FXML private Label outputLabel;
   @FXML private TextField filterField;
   @FXML private Label filterLabel;
   @FXML private Label t0;
   @FXML private Label t1;

   private ViewHandler viewHandler;
   private Region root;
   private TemperaturViewModel viewModel;

   public TemperatureViewController()
   {
   }

   public void init(ViewHandler viewHandler, TemperaturViewModel viewModel, Region root)
   {
      this.viewHandler = viewHandler;
      this.viewModel = viewModel;
      this.root = root;
      outputLabel.textProperty().bind(viewModel.temperaturProperty());
      t1.textProperty().bind(viewModel.temperaturProperty1());
      t0.textProperty().bind(viewModel.temperaturProperty2());
      filterLabel.textProperty().bind(viewModel.filterProperty());
      filterField.textProperty().bindBidirectional(viewModel.filterProperty());
   }


   public Region getRoot()
   {
      return root;
   }

   @FXML private void updateButtonPressed()
   {
    viewModel.update();
    }


   @FXML private void onFilter()
   {
   viewModel.unFilter();
   }


   public void nextpage(ActionEvent actionEvent) {
      viewHandler.openView("temperature2");
   }

}
