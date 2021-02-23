package temperature.view;

import javafx.scene.layout.Region;

public class TemperatureViewController2 {

        private ViewHandler viewHandler;
        private Region root;
        private TemperaturViewModel2 viewModel;

        public TemperatureViewController2()
        {
        }

        public void init(ViewHandler viewHandler, TemperaturViewModel2 viewModel, Region root)
        {
            this.viewHandler = viewHandler;
            this.viewModel = viewModel;
            this.root = root;
        }


    public Region getRoot() {
            return root;
    }
}
