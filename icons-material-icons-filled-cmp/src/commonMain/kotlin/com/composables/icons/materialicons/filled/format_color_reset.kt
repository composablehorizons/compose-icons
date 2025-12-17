package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Format_color_reset: ImageVector
    get() {
        if (_Format_color_reset != null) return _Format_color_reset!!
        
        _Format_color_reset = ImageVector.Builder(
            name = "format_color_reset",
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
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 14f)
                curveToRelative(0f, -4f, -6f, -10.8f, -6f, -10.8f)
                reflectiveCurveToRelative(-1.33f, 1.51f, -2.73f, 3.52f)
                lineToRelative(8.59f, 8.59f)
                curveToRelative(0.09f, -0.42f, 0.14f, -0.86f, 0.14f, -1.31f)
                close()
                moveToRelative(-0.88f, 3.12f)
                lineTo(12.5f, 12.5f)
                lineTo(5.27f, 5.27f)
                lineTo(4f, 6.55f)
                lineToRelative(3.32f, 3.32f)
                curveTo(6.55f, 11.32f, 6f, 12.79f, 6f, 14f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(1.52f, 0f, 2.9f, -0.57f, 3.96f, -1.5f)
                lineToRelative(2.63f, 2.63f)
                lineToRelative(1.27f, -1.27f)
                lineToRelative(-2.74f, -2.74f)
                close()
            }
        }.build()
        
        return _Format_color_reset!!
    }

private var _Format_color_reset: ImageVector? = null

