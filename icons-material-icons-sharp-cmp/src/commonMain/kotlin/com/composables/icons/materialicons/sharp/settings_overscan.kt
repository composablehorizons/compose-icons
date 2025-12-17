package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Settings_overscan: ImageVector
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
                moveTo(12.01f, 5.5f)
                lineTo(10f, 8f)
                horizontalLineToRelative(4f)
                lineToRelative(-1.99f, -2.5f)
                close()
                moveTo(18f, 10f)
                verticalLineToRelative(4f)
                lineToRelative(2.5f, -1.99f)
                lineTo(18f, 10f)
                close()
                moveTo(6f, 10f)
                lineToRelative(-2.5f, 2.01f)
                lineTo(6f, 14f)
                verticalLineToRelative(-4f)
                close()
                moveToRelative(8f, 6f)
                horizontalLineToRelative(-4f)
                lineToRelative(2.01f, 2.5f)
                lineTo(14f, 16f)
                close()
                moveToRelative(9f, -13f)
                horizontalLineTo(1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(22f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 16.01f)
                horizontalLineTo(3f)
                verticalLineTo(4.99f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14.02f)
                close()
            }
        }.build()
        
        return _Settings_overscan!!
    }

private var _Settings_overscan: ImageVector? = null

