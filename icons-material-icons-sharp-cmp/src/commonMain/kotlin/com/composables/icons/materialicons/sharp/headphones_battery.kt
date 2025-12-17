package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Headphones_battery: ImageVector
    get() {
        if (_Headphones_battery != null) return _Headphones_battery!!
        
        _Headphones_battery = ImageVector.Builder(
            name = "headphones_battery",
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
                        moveTo(20f, 7f)
                        lineTo(20f, 6f)
                        lineTo(18f, 6f)
                        lineTo(18f, 7f)
                        lineTo(16f, 7f)
                        lineTo(16f, 18f)
                        lineTo(22f, 18f)
                        lineTo(22f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 6f)
                        curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-5f)
                        horizontalLineTo(3.5f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                        reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-6f)
                        curveTo(14f, 8.69f, 11.31f, 6f, 8f, 6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Headphones_battery!!
    }

private var _Headphones_battery: ImageVector? = null

