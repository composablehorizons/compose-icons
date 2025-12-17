package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Expand: ImageVector
    get() {
        if (_Expand != null) return _Expand!!
        
        _Expand = ImageVector.Builder(
            name = "expand",
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
                    moveTo(4f, 20f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    verticalLineTo(20f)
                    close()
                    moveTo(4f, 2f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    verticalLineTo(2f)
                    close()
                    moveTo(13f, 9f)
                    horizontalLineToRelative(3f)
                    lineToRelative(-4f, -4f)
                    lineTo(8f, 9f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(8f)
                    lineToRelative(4f, 4f)
                    lineToRelative(4f, -4f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(9f)
                    close()
                }
            }
        }.build()
        
        return _Expand!!
    }

private var _Expand: ImageVector? = null

