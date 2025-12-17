package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_color_reset: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 14f)
                curveToRelative(0f, -3.98f, -6f, -10.8f, -6f, -10.8f)
                reflectiveCurveToRelative(-1.18f, 1.35f, -2.5f, 3.19f)
                lineToRelative(8.44f, 8.44f)
                curveToRelative(0.03f, -0.27f, 0.06f, -0.55f, 0.06f, -0.83f)
                close()
                moveTo(5.41f, 5.14f)
                lineTo(4f, 6.55f)
                lineToRelative(3.32f, 3.32f)
                curveTo(6.55f, 11.33f, 6f, 12.79f, 6f, 14f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(1.52f, 0f, 2.9f, -0.57f, 3.95f, -1.5f)
                lineToRelative(2.63f, 2.63f)
                lineTo(20f, 19.72f)
                lineTo(5.41f, 5.14f)
                close()
            }
        }.build()
        
        return _Format_color_reset!!
    }

private var _Format_color_reset: ImageVector? = null

