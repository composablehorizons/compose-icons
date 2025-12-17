package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Fence: ImageVector
    get() {
        if (_Fence != null) return _Fence!!
        
        _Fence = ImageVector.Builder(
            name = "fence",
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
                    moveTo(21f, 12f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7f)
                    lineToRelative(-3f, -3f)
                    lineToRelative(-2f, 2f)
                    lineToRelative(-2f, -2f)
                    lineToRelative(-2f, 2f)
                    lineTo(8f, 4f)
                    lineTo(5f, 7f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(21f)
                    close()
                    moveTo(16f, 6.83f)
                    lineToRelative(1f, 1f)
                    verticalLineTo(10f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7.83f)
                    lineToRelative(0.41f, -0.41f)
                    lineTo(16f, 6.83f)
                    close()
                    moveTo(12f, 6.83f)
                    lineToRelative(0.59f, 0.59f)
                    lineTo(13f, 7.83f)
                    verticalLineTo(10f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7.83f)
                    lineToRelative(0.41f, -0.41f)
                    lineTo(12f, 6.83f)
                    close()
                    moveTo(11f, 14f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(11f)
                    close()
                    moveTo(13f, 16f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(7f, 7.83f)
                    lineToRelative(1f, -1f)
                    lineToRelative(0.59f, 0.59f)
                    lineTo(9f, 7.83f)
                    verticalLineTo(10f)
                    horizontalLineTo(7f)
                    verticalLineTo(7.83f)
                    close()
                    moveTo(7f, 12f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(7f)
                    verticalLineTo(12f)
                    close()
                    moveTo(7f, 16f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(7f)
                    verticalLineTo(16f)
                    close()
                    moveTo(17f, 18f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(18f)
                    close()
                    moveTo(17f, 14f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Fence!!
    }

private var _Fence: ImageVector? = null

