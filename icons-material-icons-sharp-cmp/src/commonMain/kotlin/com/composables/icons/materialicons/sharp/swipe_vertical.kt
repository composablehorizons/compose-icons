package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Swipe_vertical: ImageVector
    get() {
        if (_Swipe_vertical != null) return _Swipe_vertical!!
        
        _Swipe_vertical = ImageVector.Builder(
            name = "swipe_vertical",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(1f, 3.5f)
                    horizontalLineToRelative(2.02f)
                    curveTo(1.13f, 5.82f, 0f, 8.78f, 0f, 12f)
                    reflectiveCurveToRelative(1.13f, 6.18f, 3.02f, 8.5f)
                    horizontalLineTo(1f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(-5f)
                    horizontalLineTo(4.5f)
                    verticalLineToRelative(2.91f)
                    curveToRelative(-1.86f, -2.11f, -3f, -4.88f, -3f, -7.91f)
                    reflectiveCurveToRelative(1.14f, -5.79f, 3f, -7.91f)
                    verticalLineTo(7f)
                    horizontalLineTo(6f)
                    verticalLineTo(2f)
                    horizontalLineTo(1f)
                    verticalLineTo(3.5f)
                    close()
                    moveTo(21.71f, 11.18f)
                    lineToRelative(2.09f, 7.39f)
                    lineToRelative(-8.23f, 3.65f)
                    lineToRelative(-6.84f, -2.85f)
                    lineToRelative(0.61f, -1.62f)
                    lineToRelative(3.8f, -0.75f)
                    lineTo(8.79f, 7.17f)
                    curveToRelative(-0.34f, -0.76f, 0f, -1.64f, 0.76f, -1.98f)
                    curveToRelative(0.76f, -0.34f, 1.64f, 0f, 1.98f, 0.76f)
                    lineToRelative(2.43f, 5.49f)
                    lineToRelative(1.26f, -0.56f)
                    lineTo(21.71f, 11.18f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_vertical!!
    }

private var _Swipe_vertical: ImageVector? = null

