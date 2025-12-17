package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Fit_screen: ImageVector
    get() {
        if (_Fit_screen != null) return _Fit_screen!!
        
        _Fit_screen = ImageVector.Builder(
            name = "fit_screen",
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
                    moveTo(6f, 16f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(8f)
                    horizontalLineTo(6f)
                    verticalLineTo(16f)
                    close()
                    moveTo(8f, 10f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(8f)
                    verticalLineTo(10f)
                    close()
                    moveTo(4f, 15f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineTo(15f)
                    close()
                    moveTo(4f, 6f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(4f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(6f)
                    close()
                    moveTo(20f, 4f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(6f)
                    curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                    close()
                    moveTo(20f, 18f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(18f)
                    close()
                }
            }
        }.build()
        
        return _Fit_screen!!
    }

private var _Fit_screen: ImageVector? = null

