package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Settings_overscan: ImageVector
    get() {
        if (_Settings_overscan != null) return _Settings_overscan!!
        
        _Settings_overscan = ImageVector.Builder(
            name = "settings_overscan",
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
                moveTo(18f, 10f)
                lineToRelative(2.5f, 2.01f)
                lineTo(18f, 14f)
                verticalLineToRelative(-4f)
                close()
                moveToRelative(-5.99f, -4.5f)
                lineTo(14f, 8f)
                horizontalLineToRelative(-4f)
                lineToRelative(2.01f, -2.5f)
                close()
                moveTo(14f, 16f)
                lineToRelative(-1.99f, 2.5f)
                lineTo(10f, 16f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(-8f, -6f)
                verticalLineToRelative(4f)
                lineToRelative(-2.5f, -1.99f)
                lineTo(6f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 16f)
                horizontalLineToRelative(-4f)
                lineToRelative(2.01f, 2.5f)
                close()
                moveToRelative(4f, -6f)
                verticalLineToRelative(4f)
                lineToRelative(2.5f, -1.99f)
                close()
                moveToRelative(3f, -7f)
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
                moveTo(6f, 10f)
                lineToRelative(-2.5f, 2.01f)
                lineTo(6f, 14f)
                close()
                moveToRelative(6.01f, -4.5f)
                lineTo(10f, 8f)
                horizontalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Settings_overscan!!
    }

private var _Settings_overscan: ImageVector? = null

