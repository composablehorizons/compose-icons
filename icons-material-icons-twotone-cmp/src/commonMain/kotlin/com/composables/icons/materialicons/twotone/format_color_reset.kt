package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Format_color_reset: ImageVector
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
                verticalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.93f, 7.83f)
                lineToRelative(4.77f, 4.77f)
                curveToRelative(-0.62f, -1.81f, -2.17f, -4.24f, -3.71f, -6.24f)
                curveToRelative(-0.35f, 0.47f, -0.71f, 0.96f, -1.06f, 1.47f)
                close()
                moveTo(12f, 18f)
                curveToRelative(0.96f, 0f, 1.83f, -0.36f, 2.53f, -0.92f)
                lineToRelative(-5.72f, -5.72f)
                curveTo(8.32f, 12.38f, 8f, 13.31f, 8f, 14f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6.36f)
                curveToRelative(1.53f, 2f, 3.08f, 4.43f, 3.71f, 6.24f)
                lineToRelative(2.23f, 2.23f)
                curveToRelative(0.03f, -0.27f, 0.06f, -0.55f, 0.06f, -0.83f)
                curveToRelative(0f, -3.98f, -6f, -10.8f, -6f, -10.8f)
                reflectiveCurveToRelative(-1.18f, 1.35f, -2.5f, 3.19f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(0.34f, -0.51f, 0.7f, -1f, 1.06f, -1.47f)
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
                moveTo(12f, 18f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -0.69f, 0.32f, -1.62f, 0.81f, -2.64f)
                lineToRelative(5.72f, 5.72f)
                curveToRelative(-0.7f, 0.56f, -1.57f, 0.92f, -2.53f, 0.92f)
                close()
            }
        }.build()
        
        return _Format_color_reset!!
    }

private var _Format_color_reset: ImageVector? = null

