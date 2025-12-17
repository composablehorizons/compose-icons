package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_overscan: ImageVector
    get() {
        if (_Settings_overscan != null) return _Settings_overscan!!
        
        _Settings_overscan = ImageVector.Builder(
            name = "settings_overscan",
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
                    moveTo(12.01f, 7f)
                    lineTo(10f, 9f)
                    horizontalLineToRelative(4f)
                    lineTo(12.01f, 7f)
                    close()
                    moveTo(17f, 10f)
                    verticalLineToRelative(4f)
                    lineToRelative(2f, -1.99f)
                    lineTo(17f, 10f)
                    close()
                    moveTo(7f, 10f)
                    lineToRelative(-2f, 2.01f)
                    lineTo(7f, 14f)
                    verticalLineTo(10f)
                    close()
                    moveTo(14f, 15f)
                    horizontalLineToRelative(-4f)
                    lineToRelative(2.01f, 2f)
                    lineTo(14f, 15f)
                    close()
                    moveTo(20f, 4f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(6f)
                    curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                    close()
                    moveTo(20f, 18.01f)
                    horizontalLineTo(4f)
                    verticalLineTo(5.99f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(18.01f)
                    close()
                }
            }
        }.build()
        
        return _Settings_overscan!!
    }

private var _Settings_overscan: ImageVector? = null

