package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Border_color: ImageVector
    get() {
        if (_Border_color != null) return _Border_color!!
        
        _Border_color = ImageVector.Builder(
            name = "border_color",
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
                    moveTo(22f, 24f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(24f)
                    close()
                    moveTo(13.06f, 5.19f)
                    lineToRelative(3.75f, 3.75f)
                    lineTo(7.75f, 18f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-3.75f)
                    lineTo(13.06f, 5.19f)
                    close()
                    moveTo(17.88f, 7.87f)
                    lineToRelative(-3.75f, -3.75f)
                    lineToRelative(2.53f, -2.54f)
                    lineToRelative(3.75f, 3.75f)
                    lineTo(17.88f, 7.87f)
                    close()
                }
            }
        }.build()
        
        return _Border_color!!
    }

private var _Border_color: ImageVector? = null

