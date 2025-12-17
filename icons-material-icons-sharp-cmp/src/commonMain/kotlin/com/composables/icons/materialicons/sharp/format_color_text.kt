package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_color_text: ImageVector
    get() {
        if (_Format_color_text != null) return _Format_color_text!!
        
        _Format_color_text = ImageVector.Builder(
            name = "format_color_text",
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
                    moveTo(2f, 20f)
                    horizontalLineToRelative(20f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(2f)
                    verticalLineTo(20f)
                    close()
                    moveTo(5.49f, 17f)
                    horizontalLineToRelative(2.42f)
                    lineToRelative(1.27f, -3.58f)
                    horizontalLineToRelative(5.65f)
                    lineTo(16.09f, 17f)
                    horizontalLineToRelative(2.42f)
                    lineTo(13.25f, 3f)
                    horizontalLineToRelative(-2.5f)
                    lineTo(5.49f, 17f)
                    close()
                    moveTo(9.91f, 11.39f)
                    lineToRelative(2.03f, -5.79f)
                    horizontalLineToRelative(0.12f)
                    lineToRelative(2.03f, 5.79f)
                    horizontalLineTo(9.91f)
                    close()
                }
            }
        }.build()
        
        return _Format_color_text!!
    }

private var _Format_color_text: ImageVector? = null

