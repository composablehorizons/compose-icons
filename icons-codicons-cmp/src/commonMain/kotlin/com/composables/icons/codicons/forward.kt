package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Forward: ImageVector
    get() {
        if (_Forward != null) return _Forward!!
        
        _Forward = ImageVector.Builder(
            name = "forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.293f, 7.99984f)
                lineTo(9.61091f, 10.6824f)
                curveTo(9.41565f, 10.8776f, 9.41565f, 11.1942f, 9.61091f, 11.3895f)
                curveTo(9.78448f, 11.563f, 10.0539f, 11.5823f, 10.2488f, 11.4473f)
                lineTo(10.318f, 11.3895f)
                lineTo(13.884f, 7.82067f)
                lineTo(13.9336f, 7.74953f)
                lineTo(13.9612f, 7.69372f)
                lineTo(13.984f, 7.62609f)
                lineTo(13.9889f, 7.60536f)
                curveTo(13.9962f, 7.57168f, 14f, 7.53647f, 14f, 7.50038f)
                lineTo(13.9945f, 7.5743f)
                lineTo(13.9982f, 7.54286f)
                verticalLineTo(7.45786f)
                lineTo(13.9832f, 7.37155f)
                lineTo(13.9622f, 7.30934f)
                lineTo(13.9228f, 7.23337f)
                lineTo(13.8683f, 7.16222f)
                lineTo(10.318f, 3.61129f)
                curveTo(10.1228f, 3.41603f, 9.80617f, 3.41603f, 9.61091f, 3.61129f)
                curveTo(9.43735f, 3.78486f, 9.41806f, 4.05428f, 9.55306f, 4.24915f)
                lineTo(9.61091f, 4.3184f)
                lineTo(12.293f, 6.99984f)
                lineTo(8f, 7.00038f)
                curveTo(4.47823f, 7.00038f, 2.11461f, 8.97618f, 2.00405f, 11.7928f)
                lineTo(2f, 12.0004f)
                curveTo(2f, 12.2765f, 2.22386f, 12.5004f, 2.5f, 12.5004f)
                curveTo(2.77614f, 12.5004f, 3f, 12.2765f, 3f, 12.0004f)
                curveTo(3f, 9.72721f, 4.80747f, 8.09579f, 7.73848f, 8.00442f)
                lineTo(8f, 8.00038f)
                lineTo(12.293f, 7.99984f)
                close()
            }
        }.build()
        
        return _Forward!!
    }

private var _Forward: ImageVector? = null

