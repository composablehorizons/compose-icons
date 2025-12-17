package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Stars: ImageVector
    get() {
        if (_Stars != null) return _Stars!!
        
        _Stars = ImageVector.Builder(
            name = "stars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                close()
                moveToRelative(4.24f, 16f)
                lineTo(12f, 15.45f)
                lineTo(7.77f, 18f)
                lineToRelative(1.12f, -4.81f)
                lineToRelative(-3.73f, -3.23f)
                lineToRelative(4.92f, -0.42f)
                lineTo(12f, 5f)
                lineToRelative(1.92f, 4.53f)
                lineToRelative(4.92f, 0.42f)
                lineToRelative(-3.73f, 3.23f)
                lineTo(16.23f, 18f)
                close()
            }
        }.build()
        
        return _Stars!!
    }

private var _Stars: ImageVector? = null

