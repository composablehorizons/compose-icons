package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Earbuds_battery: ImageVector
    get() {
        if (_Earbuds_battery != null) return _Earbuds_battery!!
        
        _Earbuds_battery = ImageVector.Builder(
            name = "earbuds_battery",
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
                        moveTo(5.38f, 16.5f)
                        lineTo(5.38f, 16.5f)
                        curveToRelative(-1.04f, 0f, -1.88f, -0.84f, -1.88f, -1.87f)
                        verticalLineTo(10f)
                        horizontalLineTo(6f)
                        verticalLineTo(6f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 6f, 2f, 6.9f, 2f, 8f)
                        verticalLineToRelative(6.63f)
                        curveTo(2f, 16.49f, 3.51f, 18f, 5.37f, 18f)
                        horizontalLineToRelative(0f)
                        curveToRelative(1.86f, 0f, 3.37f, -1.51f, 3.37f, -3.37f)
                        verticalLineTo(9.37f)
                        curveToRelative(0f, -1.04f, 0.84f, -1.87f, 1.87f, -1.87f)
                        horizontalLineToRelative(0f)
                        curveToRelative(1.04f, 0f, 1.87f, 0.84f, 1.87f, 1.87f)
                        verticalLineTo(14f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(9.37f)
                        curveTo(14f, 7.51f, 12.49f, 6f, 10.63f, 6f)
                        horizontalLineToRelative(0f)
                        curveTo(8.76f, 6f, 7.25f, 7.51f, 7.25f, 9.37f)
                        verticalLineToRelative(5.25f)
                        curveTo(7.25f, 15.66f, 6.41f, 16.5f, 5.38f, 16.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Earbuds_battery!!
    }

private var _Earbuds_battery: ImageVector? = null

