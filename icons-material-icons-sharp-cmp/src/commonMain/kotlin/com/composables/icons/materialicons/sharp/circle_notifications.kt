package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Circle_notifications: ImageVector
    get() {
        if (_Circle_notifications != null) return _Circle_notifications!!
        
        _Circle_notifications = ImageVector.Builder(
            name = "circle_notifications",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(12f, 18.5f)
                    lineTo(12f, 18.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    verticalLineToRelative(0f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(0f)
                    curveTo(13.5f, 17.83f, 12.83f, 18.5f, 12f, 18.5f)
                    close()
                    moveTo(17f, 16f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -1.86f, 1.28f, -3.41f, 3f, -3.86f)
                    verticalLineTo(5.5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1.64f)
                    curveToRelative(1.72f, 0.45f, 3f, 2f, 3f, 3.86f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(16f)
                    close()
                }
            }
        }.build()
        
        return _Circle_notifications!!
    }

private var _Circle_notifications: ImageVector? = null

