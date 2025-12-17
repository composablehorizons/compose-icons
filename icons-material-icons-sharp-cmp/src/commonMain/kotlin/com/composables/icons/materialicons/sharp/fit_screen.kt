package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Fit_screen: ImageVector
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
                    moveTo(17f, 4f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(4f)
                    close()
                    moveTo(4f, 9f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(4f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(4f)
                    close()
                    moveTo(20f, 15f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(-5f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(7f, 18f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(18f)
                    close()
                    moveTo(18f, 8f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(8f)
                    close()
                }
            }
        }.build()
        
        return _Fit_screen!!
    }

private var _Fit_screen: ImageVector? = null

