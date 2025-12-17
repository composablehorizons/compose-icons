package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_cell: ImageVector
    get() {
        if (_Settings_cell != null) return _Settings_cell!!
        
        _Settings_cell = ImageVector.Builder(
            name = "settings_cell",
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
                    moveTo(8f, 24f)
                    lineTo(8f, 24f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(7f, 23.55f, 7.45f, 24f, 8f, 24f)
                    close()
                    moveTo(12f, 24f)
                    lineTo(12f, 24f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(11f, 23.55f, 11.45f, 24f, 12f, 24f)
                    close()
                    moveTo(16f, 24f)
                    lineTo(16f, 24f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(15f, 23.55f, 15.45f, 24f, 16f, 24f)
                    close()
                    moveTo(16f, 0.01f)
                    lineTo(8f, 0f)
                    curveTo(6.9f, 0f, 6f, 0.9f, 6f, 2f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(8f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(2f)
                    curveTo(18f, 0.9f, 17.1f, 0.01f, 16f, 0.01f)
                    close()
                    moveTo(16f, 16f)
                    horizontalLineTo(8f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(16f)
                    close()
                }
            }
        }.build()
        
        return _Settings_cell!!
    }

private var _Settings_cell: ImageVector? = null

