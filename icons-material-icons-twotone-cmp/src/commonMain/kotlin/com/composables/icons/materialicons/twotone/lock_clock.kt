package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Lock_clock: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.29f, 20f)
                        horizontalLineTo(6f)
                        verticalLineTo(10f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(1f)
                        curveToRelative(0.7f, 0f, 1.37f, 0.1f, 2f, 0.29f)
                        verticalLineTo(10f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                        reflectiveCurveTo(7f, 3.24f, 7f, 6f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(6f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(10f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(6.26f)
                        curveTo(11.84f, 21.4f, 11.51f, 20.72f, 11.29f, 20f)
                        close()
                        moveTo(9f, 6f)
                        curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                        reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(9f)
                        verticalLineTo(6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 18f)
                        curveToRelative(0f, -3.87f, 3.13f, -7f, 7f, -7f)
                        verticalLineToRelative(-1f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(5.29f)
                        curveTo(11.1f, 19.37f, 11f, 18.7f, 11f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
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
            }
        }.build()
        
        return _Lock_clock!!
    }

private var _Lock_clock: ImageVector? = null

