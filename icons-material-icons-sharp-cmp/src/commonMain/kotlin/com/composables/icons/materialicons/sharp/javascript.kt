package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Javascript: ImageVector
    get() {
        if (_Javascript != null) return _Javascript!!
        
        _Javascript = ImageVector.Builder(
            name = "javascript",
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
                    moveTo(12f, 15f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(0.5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(12f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(-0.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(17f)
                    verticalLineTo(15f)
                    horizontalLineTo(12f)
                    close()
                    moveTo(9f, 9f)
                    verticalLineToRelative(4.5f)
                    horizontalLineTo(7.5f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(6f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(4.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(9f)
                    close()
                }
            }
        }.build()
        
        return _Javascript!!
    }

private var _Javascript: ImageVector? = null

