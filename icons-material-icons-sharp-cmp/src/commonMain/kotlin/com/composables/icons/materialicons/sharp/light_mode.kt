package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Light_mode: ImageVector
    get() {
        if (_Light_mode != null) return _Light_mode!!
        
        _Light_mode = ImageVector.Builder(
            name = "light_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(14.76f, 7f, 12f, 7f)
                lineTo(12f, 7f)
                close()
                moveTo(11f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                lineTo(11f, 1f)
                close()
                moveTo(11f, 19f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                lineTo(11f, 19f)
                close()
                moveTo(23f, 11f)
                lineToRelative(-4f, 0f)
                verticalLineToRelative(2f)
                lineToRelative(4f, 0f)
                verticalLineTo(11f)
                close()
                moveTo(5f, 11f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(4f, 0f)
                lineTo(5f, 11f)
                close()
                moveTo(16.24f, 17.66f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.47f, -2.47f)
                lineTo(16.24f, 17.66f)
                close()
                moveTo(3.87f, 5.28f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.28f, 3.87f)
                lineTo(3.87f, 5.28f)
                close()
                moveTo(6.34f, 16.24f)
                lineToRelative(-2.47f, 2.47f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.47f, -2.47f)
                lineTo(6.34f, 16.24f)
                close()
                moveTo(18.72f, 3.87f)
                lineToRelative(-2.47f, 2.47f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.47f, -2.47f)
                lineTo(18.72f, 3.87f)
                close()
            }
        }.build()
        
        return _Light_mode!!
    }

private var _Light_mode: ImageVector? = null

