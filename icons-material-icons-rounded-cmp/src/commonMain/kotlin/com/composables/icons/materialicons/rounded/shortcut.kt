package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Shortcut: ImageVector
    get() {
        if (_Shortcut != null) return _Shortcut!!
        
        _Shortcut = ImageVector.Builder(
            name = "shortcut",
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
                    moveTo(20.29f, 10.29f)
                    lineToRelative(-3.59f, -3.59f)
                    curveTo(16.08f, 6.08f, 15f, 6.52f, 15f, 7.41f)
                    verticalLineTo(10f)
                    horizontalLineTo(8f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(2.59f)
                    curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                    lineToRelative(3.59f, -3.59f)
                    curveTo(20.68f, 11.32f, 20.68f, 10.68f, 20.29f, 10.29f)
                    close()
                }
            }
        }.build()
        
        return _Shortcut!!
    }

private var _Shortcut: ImageVector? = null

