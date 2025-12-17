package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Settings_cell: ImageVector
    get() {
        if (_Settings_cell != null) return _Settings_cell!!
        
        _Settings_cell = ImageVector.Builder(
            name = "settings_cell",
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
                moveTo(8f, 17f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(16f, 0.01f)
                lineTo(8f, 0f)
                curveTo(6.9f, 0f, 6f, 0.9f, 6f, 2f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(2f)
                curveToRelative(0f, -1.1f, -0.9f, -1.99f, -2f, -1.99f)
                close()
                moveTo(16f, 18f)
                horizontalLineTo(8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(0f, -12f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Settings_cell!!
    }

private var _Settings_cell: ImageVector? = null

