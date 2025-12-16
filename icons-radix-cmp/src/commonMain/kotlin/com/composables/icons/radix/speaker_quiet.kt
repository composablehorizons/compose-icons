package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.SpeakerQuiet: ImageVector
    get() {
        if (_SpeakerQuiet != null) return _SpeakerQuiet!!
        
        _SpeakerQuiet = ImageVector.Builder(
            name = "speaker-quiet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25879f, 1.06173f)
                curveTo(7.40141f, 0.983238f, 7.5754f, 0.978824f, 7.72363f, 1.05294f)
                curveTo(7.89302f, 1.13764f, 8f, 1.31082f, 8f, 1.50021f)
                verticalLineTo(13.5002f)
                curveTo(8f, 13.6896f, 7.89302f, 13.8628f, 7.72363f, 13.9475f)
                curveTo(7.55436f, 14.0321f, 7.35167f, 14.014f, 7.2002f, 13.9006f)
                lineTo(3.33301f, 11.0002f)
                horizontalLineTo(1.5f)
                curveTo(0.723336f, 11.0002f, 0.0846097f, 10.4099f, 0.0078125f, 9.65353f)
                lineTo(0f, 9.50021f)
                verticalLineTo(5.50021f)
                curveTo(1.61064E-6f, 4.67178f, 0.671574f, 4.00021f, 1.5f, 4.00021f)
                horizontalLineTo(3.33301f)
                lineTo(7.2002f, 1.09982f)
                lineTo(7.25879f, 1.06173f)
                close()
                moveTo(3.7998f, 4.9006f)
                curveTo(3.71332f, 4.96536f, 3.60805f, 5.00021f, 3.5f, 5.00021f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 5.00021f, 1f, 5.22407f, 1f, 5.50021f)
                verticalLineTo(9.50021f)
                lineTo(1.00977f, 9.60079f)
                curveTo(1.05629f, 9.82876f, 1.25829f, 10.0002f, 1.5f, 10.0002f)
                horizontalLineTo(3.5f)
                curveTo(3.60805f, 10.0002f, 3.71332f, 10.0351f, 3.7998f, 10.0998f)
                lineTo(7f, 12.4992f)
                verticalLineTo(2.50021f)
                lineTo(3.7998f, 4.9006f)
                close()
                moveTo(9.52832f, 4.94357f)
                curveTo(9.68914f, 4.83682f, 9.89932f, 4.86253f, 10.0312f, 4.99337f)
                lineTo(10.084f, 5.05587f)
                lineTo(10.2559f, 5.3381f)
                curveTo(11.0078f, 6.67699f, 11.0078f, 8.32343f, 10.2559f, 9.66232f)
                lineTo(10.083f, 9.94454f)
                lineTo(10.0312f, 10.007f)
                curveTo(9.89921f, 10.1379f, 9.68914f, 10.1619f, 9.52832f, 10.0549f)
                curveTo(9.36795f, 9.94785f, 9.30943f, 9.74556f, 9.37891f, 9.57345f)
                lineTo(9.41699f, 9.50118f)
                lineTo(9.55762f, 9.26974f)
                curveTo(10.1728f, 8.17408f, 10.1738f, 6.82534f, 9.55859f, 5.7297f)
                lineTo(9.41602f, 5.49923f)
                lineTo(9.37891f, 5.42696f)
                curveTo(9.30932f, 5.25466f, 9.36755f, 5.05053f, 9.52832f, 4.94357f)
                close()
            }
        }.build()
        
        return _SpeakerQuiet!!
    }

private var _SpeakerQuiet: ImageVector? = null

