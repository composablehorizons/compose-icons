package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Star: ImageVector
    get() {
        if (_Star != null) return _Star!!
        
        _Star = ImageVector.Builder(
            name = "star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.22271f, 0.665773f)
                curveTo(7.32528f, 0.419686f, 7.67484f, 0.419669f, 7.77739f, 0.665773f)
                lineTo(9.41314f, 4.60034f)
                curveTo(9.4563f, 4.70405f, 9.55412f, 4.77481f, 9.66607f, 4.78394f)
                lineTo(13.9141f, 5.12476f)
                curveTo(14.1799f, 5.14619f, 14.2874f, 5.47752f, 14.085f, 5.65112f)
                lineTo(13.8555f, 5.84644f)
                lineTo(10.8487f, 8.42358f)
                curveTo(10.7636f, 8.49661f, 10.7263f, 8.61137f, 10.752f, 8.72046f)
                lineTo(11.6709f, 12.572f)
                lineTo(11.7413f, 12.866f)
                curveTo(11.7953f, 13.093f, 11.5857f, 13.2787f, 11.3799f, 13.2283f)
                lineTo(11.293f, 13.1912f)
                lineTo(11.0352f, 13.033f)
                lineTo(7.6563f, 10.9705f)
                curveTo(7.56036f, 10.9119f, 7.43975f, 10.9119f, 7.3438f, 10.9705f)
                lineTo(3.70708f, 13.1912f)
                lineTo(3.62017f, 13.2283f)
                curveTo(3.41445f, 13.2787f, 3.20484f, 13.093f, 3.25884f, 12.866f)
                lineTo(3.32818f, 12.572f)
                lineTo(4.2481f, 8.72046f)
                curveTo(4.2674f, 8.63858f, 4.25134f, 8.55322f, 4.20611f, 8.48511f)
                lineTo(4.15142f, 8.42358f)
                lineTo(0.91509f, 5.65112f)
                curveTo(0.712634f, 5.47752f, 0.820148f, 5.14618f, 1.08599f, 5.12476f)
                lineTo(1.38677f, 5.10034f)
                lineTo(5.33403f, 4.78394f)
                curveTo(5.41796f, 4.77708f, 5.49411f, 4.73573f, 5.54497f, 4.67163f)
                lineTo(5.58696f, 4.60034f)
                lineTo(7.22271f, 0.665773f)
                close()
                moveTo(6.50982f, 4.98413f)
                curveTo(6.34606f, 5.37782f, 6.00173f, 5.66244f, 5.59282f, 5.75366f)
                lineTo(5.41314f, 5.78101f)
                lineTo(2.84282f, 5.98608f)
                lineTo(4.80181f, 7.66382f)
                lineTo(4.93071f, 7.79077f)
                curveTo(5.16843f, 8.05995f, 5.28398f, 8.41668f, 5.25005f, 8.77417f)
                lineTo(5.22075f, 8.95288f)
                lineTo(4.62212f, 11.4597f)
                lineTo(6.82232f, 10.1169f)
                lineTo(6.98345f, 10.0339f)
                curveTo(7.31289f, 9.89117f, 7.68721f, 9.89116f, 8.01665f, 10.0339f)
                lineTo(8.17778f, 10.1169f)
                lineTo(10.377f, 11.4597f)
                lineTo(9.77935f, 8.95288f)
                curveTo(9.66641f, 8.47881f, 9.82817f, 7.98087f, 10.1983f, 7.66382f)
                lineTo(12.1563f, 5.98608f)
                lineTo(9.58696f, 5.78101f)
                curveTo(9.16189f, 5.74693f, 8.78445f, 5.50702f, 8.57134f, 5.14624f)
                lineTo(8.49028f, 4.98413f)
                lineTo(7.50005f, 2.60327f)
                lineTo(6.50982f, 4.98413f)
                close()
            }
        }.build()
        
        return _Star!!
    }

private var _Star: ImageVector? = null

