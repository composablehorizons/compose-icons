package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Punch_clock: ImageVector
    get() {
        if (_Punch_clock != null) return _Punch_clock!!
        
        _Punch_clock = ImageVector.Builder(
            name = "punch_clock",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 6f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(1f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(18f)
                        verticalLineTo(6f)
                        close()
                        moveTo(8f, 3f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(8f)
                        verticalLineTo(3f)
                        close()
                        moveTo(12f, 19f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                        curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                        reflectiveCurveTo(14.76f, 19f, 12f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.5f, 11.5f)
                        lineTo(11.5f, 11.5f)
                        lineTo(11.5f, 14.21f)
                        lineTo(13.14f, 15.85f)
                        lineTo(13.85f, 15.14f)
                        lineTo(12.5f, 13.79f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Punch_clock!!
    }

private var _Punch_clock: ImageVector? = null

