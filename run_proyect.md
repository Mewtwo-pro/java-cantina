# instalar JavaFX

```
sudo apt update && sudo apt install openjfx
```
# verificar la ubicacio

```
dpkg -L openjfx | grep lib
```
 
# definer la ruta del sdk

```
export PATH_TO_FX=/usr/share/openjfx/lib

```

# compilar los archivos

```
javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml *.java
```

# ejecutar la ventana

```
java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml Main
```
