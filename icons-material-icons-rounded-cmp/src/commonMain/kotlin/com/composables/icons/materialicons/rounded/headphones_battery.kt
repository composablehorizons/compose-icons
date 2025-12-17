package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Headphones_battery: ImageVector
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
                        moveTo(21f, 7f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(6.5f)
                        curveTo(20f, 6.22f, 19.78f, 6f, 19.5f, 6f)
                        horizontalLineToRelative(-1f)
                        curveTo(18.22f, 6f, 18f, 6.22f, 18f, 6.5f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(9f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(8f)
                        curveTo(22f, 7.45f, 21.55f, 7f, 21f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 6f)
                        curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(3.5f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                        reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(12f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-4f)
                        curveTo(14f, 8.69f, 11.31f, 6f, 8f, 6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Headphones_battery!!
    }

private var _Headphones_battery: ImageVector? = null

