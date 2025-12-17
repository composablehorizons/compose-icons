package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_brightness: ImageVector
    get() {
        if (_Settings_brightness != null) return _Settings_brightness!!
        
        _Settings_brightness = ImageVector.Builder(
            name = "settings_brightness",
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
                    moveTo(17.15f, 12.35f)
                    lineTo(16f, 13.5f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(-1.15f, 1.15f)
                    curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                    lineTo(10.5f, 16f)
                    horizontalLineToRelative(-2f)
                    curveTo(8.22f, 16f, 8f, 15.78f, 8f, 15.5f)
                    verticalLineToRelative(-2f)
                    lineToRelative(-1.15f, -1.15f)
                    curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                    lineTo(8f, 10.5f)
                    verticalLineToRelative(-2f)
                    curveTo(8f, 8.22f, 8.22f, 8f, 8.5f, 8f)
                    horizontalLineToRelative(2f)
                    lineToRelative(1.15f, -1.15f)
                    curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                    lineTo(13.5f, 8f)
                    horizontalLineToRelative(2f)
                    curveTo(15.78f, 8f, 16f, 8.22f, 16f, 8.5f)
                    verticalLineToRelative(2f)
                    lineToRelative(1.15f, 1.15f)
                    curveTo(17.34f, 11.84f, 17.34f, 12.16f, 17.15f, 12.35f)
                    close()
                    moveTo(12f, 9f)
                    verticalLineToRelative(6f)
                    curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                    curveTo(15f, 10.34f, 13.66f, 9f, 12f, 9f)
                    close()
                }
            }
        }.build()
        
        return _Settings_brightness!!
    }

private var _Settings_brightness: ImageVector? = null

