package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Ring_volume: ImageVector
    get() {
        if (_Ring_volume != null) return _Ring_volume!!
        
        _Ring_volume = ImageVector.Builder(
            name = "ring_volume",
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
                moveTo(21.16f, 6.26f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.56f, 3.55f)
                lineToRelative(1.41f, 1.41f)
                reflectiveCurveToRelative(3.45f, -3.52f, 3.56f, -3.55f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(6.4f, 9.81f)
                lineTo(7.81f, 8.4f)
                lineTo(4.26f, 4.84f)
                lineTo(2.84f, 6.26f)
                curveToRelative(0.11f, 0.03f, 3.56f, 3.55f, 3.56f, 3.55f)
                close()
                moveTo(0f, 17.39f)
                lineToRelative(3.68f, 3.68f)
                lineToRelative(3.92f, -3.11f)
                verticalLineToRelative(-3.37f)
                curveToRelative(2.85f, -0.93f, 5.94f, -0.93f, 8.8f, 0f)
                verticalLineToRelative(3.38f)
                lineToRelative(3.91f, 3.1f)
                lineTo(24f, 17.39f)
                curveToRelative(-6.41f, -7.19f, -17.59f, -7.19f, -24f, 0f)
                close()
            }
        }.build()
        
        return _Ring_volume!!
    }

private var _Ring_volume: ImageVector? = null

