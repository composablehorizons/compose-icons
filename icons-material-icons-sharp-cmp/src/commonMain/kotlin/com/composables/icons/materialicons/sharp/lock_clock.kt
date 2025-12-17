package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Lock_clock: ImageVector
    get() {
        if (_Lock_clock != null) return _Lock_clock!!
        
        _Lock_clock = ImageVector.Builder(
            name = "lock_clock",
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
                    moveTo(18f, 11f)
                    curveToRelative(0.7f, 0f, 1.37f, 0.1f, 2f, 0.29f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(6.21f)
                    curveToRelative(0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f)
                    curveTo(9.51f, 0.74f, 7f, 3.08f, 7f, 6f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(8.26f)
                    curveTo(11.47f, 20.87f, 11f, 19.49f, 11f, 18f)
                    curveTo(11f, 14.13f, 14.13f, 11f, 18f, 11f)
                    close()
                    moveTo(9f, 6f)
                    curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                    reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(9f)
                    verticalLineTo(6f)
                    close()
                    moveTo(18f, 13f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                    reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                    reflectiveCurveTo(20.76f, 13f, 18f, 13f)
                    close()
                    moveTo(19.65f, 20.35f)
                    lineToRelative(-2.15f, -2.15f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2.79f)
                    lineToRelative(1.85f, 1.85f)
                    lineTo(19.65f, 20.35f)
                    close()
                }
            }
        }.build()
        
        return _Lock_clock!!
    }

private var _Lock_clock: ImageVector? = null

