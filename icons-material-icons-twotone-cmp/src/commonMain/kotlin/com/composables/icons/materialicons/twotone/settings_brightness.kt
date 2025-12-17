package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Settings_brightness: ImageVector
    get() {
        if (_Settings_brightness != null) return _Settings_brightness!!
        
        _Settings_brightness = ImageVector.Builder(
            name = "settings_brightness",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 19.01f)
                horizontalLineToRelative(18f)
                verticalLineTo(4.99f)
                horizontalLineTo(3f)
                verticalLineToRelative(14.02f)
                close()
                moveToRelative(5f, -8.51f)
                verticalLineTo(8f)
                horizontalLineToRelative(2.5f)
                lineTo(12f, 6.5f)
                lineTo(13.5f, 8f)
                horizontalLineTo(16f)
                verticalLineToRelative(2.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                verticalLineTo(16f)
                horizontalLineToRelative(-2.5f)
                lineTo(12f, 17.5f)
                lineTo(10.5f, 16f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2.5f)
                lineTo(6.5f, 12f)
                lineTo(8f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                horizontalLineToRelative(2.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(1.5f, -1.5f)
                horizontalLineTo(16f)
                verticalLineToRelative(-2.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-1.5f, -1.5f)
                verticalLineTo(8f)
                horizontalLineToRelative(-2.5f)
                lineTo(12f, 6.5f)
                lineTo(10.5f, 8f)
                horizontalLineTo(8f)
                verticalLineToRelative(2.5f)
                lineTo(6.5f, 12f)
                lineTo(8f, 13.5f)
                verticalLineTo(16f)
                close()
                moveToRelative(4f, -7f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                verticalLineTo(9f)
                close()
                moveToRelative(9f, -6f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16.01f)
                horizontalLineTo(3f)
                verticalLineTo(4.99f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14.02f)
                close()
            }
        }.build()
        
        return _Settings_brightness!!
    }

private var _Settings_brightness: ImageVector? = null

