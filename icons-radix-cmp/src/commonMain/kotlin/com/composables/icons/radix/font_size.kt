package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.FontSize: ImageVector
    get() {
        if (_FontSize != null) return _FontSize!!
        
        _FontSize = ImageVector.Builder(
            name = "font-size",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.49984f, 2.09991f)
                curveTo(2.6058f, 2.10001f, 2.70812f, 2.14217f, 2.78305f, 2.2171f)
                lineTo(4.78305f, 4.2171f)
                lineTo(4.83383f, 4.28058f)
                curveTo(4.93587f, 4.43578f, 4.91954f, 4.64701f, 4.78305f, 4.78351f)
                curveTo(4.64655f, 4.92f, 4.43531f, 4.93633f, 4.28012f, 4.83429f)
                lineTo(4.21664f, 4.78351f)
                lineTo(2.90023f, 3.4671f)
                verticalLineTo(11.5335f)
                lineTo(4.21664f, 10.2171f)
                curveTo(4.37285f, 10.0609f, 4.62684f, 10.0609f, 4.78305f, 10.2171f)
                curveTo(4.93888f, 10.3733f, 4.93913f, 10.6274f, 4.78305f, 10.7835f)
                lineTo(2.78305f, 12.7835f)
                curveTo(2.70812f, 12.8584f, 2.60579f, 12.9006f, 2.49984f, 12.9007f)
                curveTo(2.39393f, 12.9007f, 2.29162f, 12.8583f, 2.21664f, 12.7835f)
                lineTo(0.21664f, 10.7835f)
                lineTo(0.165858f, 10.72f)
                curveTo(0.0634971f, 10.5648f, 0.0800246f, 10.3537f, 0.21664f, 10.2171f)
                curveTo(0.353264f, 10.0805f, 0.564328f, 10.064f, 0.719569f, 10.1663f)
                lineTo(0.783046f, 10.2171f)
                lineTo(2.09945f, 11.5335f)
                verticalLineTo(3.4671f)
                lineTo(0.783046f, 4.78351f)
                curveTo(0.626961f, 4.93958f, 0.372878f, 4.93934f, 0.21664f, 4.78351f)
                curveTo(0.0604332f, 4.6273f, 0.0604398f, 4.37331f, 0.21664f, 4.2171f)
                lineTo(2.21664f, 2.2171f)
                lineTo(2.27816f, 2.1673f)
                curveTo(2.34333f, 2.12394f, 2.42042f, 2.09991f, 2.49984f, 2.09991f)
                close()
                moveTo(7.97055f, 11.7396f)
                curveTo(7.87676f, 11.9991f, 7.58955f, 12.1339f, 7.32992f, 12.0403f)
                curveTo(7.07066f, 11.9466f, 6.93609f, 11.6601f, 7.02914f, 11.4007f)
                lineTo(7.97055f, 11.7396f)
                close()
                moveTo(10.4998f, 2.75031f)
                curveTo(10.7105f, 2.75031f, 10.899f, 2.88226f, 10.9705f, 3.08038f)
                lineTo(13.9705f, 11.4007f)
                curveTo(14.0636f, 11.6602f, 13.9291f, 11.9467f, 13.6698f, 12.0403f)
                curveTo(13.4102f, 12.1338f, 13.1229f, 11.9991f, 13.0291f, 11.7396f)
                lineTo(12.0467f, 9.01593f)
                horizontalLineTo(8.95297f)
                lineTo(7.97055f, 11.7396f)
                lineTo(7.49984f, 11.5696f)
                lineTo(7.02914f, 11.4007f)
                lineTo(10.0291f, 3.08038f)
                lineTo(10.0614f, 3.00909f)
                curveTo(10.1482f, 2.85119f, 10.3156f, 2.75035f, 10.4998f, 2.75031f)
                close()
                moveTo(9.25863f, 8.16632f)
                horizontalLineTo(11.7411f)
                lineTo(10.4998f, 4.72491f)
                lineTo(9.25863f, 8.16632f)
                close()
            }
        }.build()
        
        return _FontSize!!
    }

private var _FontSize: ImageVector? = null

