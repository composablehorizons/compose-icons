package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Bell: ImageVector
    get() {
        if (_Bell != null) return _Bell!!
        
        _Bell = ImageVector.Builder(
            name = "bell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.964f, 12.315f)
                lineTo(13f, 9.90201f)
                verticalLineTo(6.00101f)
                curveTo(13f, 3.24401f, 10.757f, 1.00101f, 8f, 1.00101f)
                curveTo(5.243f, 1.00101f, 3f, 3.24301f, 3f, 6.00001f)
                verticalLineTo(9.90101f)
                lineTo(2.036f, 12.314f)
                curveTo(1.974f, 12.468f, 1.993f, 12.642f, 2.086f, 12.78f)
                curveTo(2.179f, 12.917f, 2.334f, 13f, 2.5f, 13f)
                horizontalLineTo(5.99999f)
                curveTo(5.99999f, 14.108f, 6.892f, 15f, 8f, 15f)
                curveTo(9.108f, 15f, 10f, 14.108f, 10f, 13f)
                horizontalLineTo(13.5f)
                curveTo(13.666f, 13f, 13.821f, 12.918f, 13.914f, 12.78f)
                curveTo(14.007f, 12.643f, 14.026f, 12.469f, 13.964f, 12.315f)
                close()
                moveTo(8f, 14f)
                curveTo(7.444f, 14f, 7f, 13.556f, 7f, 13f)
                horizontalLineTo(9f)
                curveTo(9f, 13.556f, 8.55599f, 14f, 8f, 14f)
                close()
                moveTo(3.238f, 12f)
                lineTo(3.964f, 10.183f)
                curveTo(3.988f, 10.124f, 4f, 10.061f, 4f, 9.99701f)
                verticalLineTo(5.99901f)
                curveTo(4f, 3.79301f, 5.794f, 1.99901f, 8f, 1.99901f)
                curveTo(10.206f, 1.99901f, 12f, 3.79301f, 12f, 5.99901f)
                verticalLineTo(9.99701f)
                curveTo(12f, 10.061f, 12.012f, 10.124f, 12.036f, 10.183f)
                lineTo(12.762f, 12f)
                horizontalLineTo(3.238f)
                close()
            }
        }.build()
        
        return _Bell!!
    }

private var _Bell: ImageVector? = null

