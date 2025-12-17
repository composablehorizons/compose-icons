package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Network_wifi: ImageVector
    get() {
        if (_Network_wifi != null) return _Network_wifi!!
        
        _Network_wifi = ImageVector.Builder(
            name = "network_wifi",
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
                    moveTo(12f, 4f)
                    curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                    lineTo(12f, 21f)
                    lineTo(24f, 8.98f)
                    curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                    close()
                    moveTo(12f, 8f)
                    curveToRelative(-2.86f, 0f, -5.5f, 0.94f, -7.65f, 2.51f)
                    lineTo(2.92f, 9.07f)
                    curveTo(5.51f, 7.08f, 8.67f, 6f, 12f, 6f)
                    reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f)
                    lineToRelative(-1.43f, 1.43f)
                    curveTo(17.5f, 8.94f, 14.86f, 8f, 12f, 8f)
                    close()
                }
            }
        }.build()
        
        return _Network_wifi!!
    }

private var _Network_wifi: ImageVector? = null

