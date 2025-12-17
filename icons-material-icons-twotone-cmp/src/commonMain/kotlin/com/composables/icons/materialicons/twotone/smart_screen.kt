package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Smart_screen: ImageVector
    get() {
        if (_Smart_screen != null) return _Smart_screen!!
        
        _Smart_screen = ImageVector.Builder(
            name = "smart_screen",
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
                    moveTo(3f, 17f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(7f)
                    horizontalLineTo(3f)
                    verticalLineTo(17f)
                    close()
                    moveTo(20f, 7f)
                    verticalLineToRelative(10f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(7f)
                    horizontalLineTo(20f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 11.25f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(1.5f)
                    horizontalLineTo(14f)
                    verticalLineTo(11.25f)
                    close()
                    moveTo(16.5f, 11.25f)
                    horizontalLineTo(15f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(11.25f)
                    close()
                    moveTo(11.5f, 11.25f)
                    horizontalLineTo(10f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(11.25f)
                    close()
                    moveTo(9f, 11.25f)
                    horizontalLineTo(7.5f)
                    verticalLineToRelative(1.5f)
                    horizontalLineTo(9f)
                    verticalLineTo(11.25f)
                    close()
                    moveTo(21f, 5f)
                    horizontalLineTo(3f)
                    curveTo(1.9f, 5f, 1f, 5.9f, 1f, 7f)
                    verticalLineToRelative(10f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(18f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(7f)
                    curveTo(23f, 5.9f, 22.1f, 5f, 21f, 5f)
                    close()
                    moveTo(4f, 17f)
                    horizontalLineTo(3f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(17f)
                    close()
                    moveTo(18f, 17f)
                    horizontalLineTo(6f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(17f)
                    close()
                    moveTo(21f, 17f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(17f)
                    close()
                }
            }
        }.build()
        
        return _Smart_screen!!
    }

private var _Smart_screen: ImageVector? = null

