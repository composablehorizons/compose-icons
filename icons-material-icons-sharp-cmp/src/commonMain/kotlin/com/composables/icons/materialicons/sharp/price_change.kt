package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Price_change: ImageVector
    get() {
        if (_Price_change != null) return _Price_change!!
        
        _Price_change = ImageVector.Builder(
            name = "price_change",
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
                    moveTo(2f, 4f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(4f)
                    horizontalLineTo(2f)
                    close()
                    moveTo(12f, 10f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(6f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10f)
                    close()
                    moveTo(16f, 16.25f)
                    lineToRelative(-2f, -2f)
                    horizontalLineToRelative(4f)
                    lineTo(16f, 16.25f)
                    close()
                    moveTo(14f, 10f)
                    lineToRelative(2f, -2f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Price_change!!
    }

private var _Price_change: ImageVector? = null

