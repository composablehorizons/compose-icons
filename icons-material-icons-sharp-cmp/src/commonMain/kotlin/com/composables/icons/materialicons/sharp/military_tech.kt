package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Military_tech: ImageVector
    get() {
        if (_Military_tech != null) return _Military_tech!!
        
        _Military_tech = ImageVector.Builder(
            name = "military_tech",
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
                    moveTo(17f, 11f)
                    verticalLineTo(2f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(9f)
                    lineToRelative(4.66f, 2.8f)
                    lineToRelative(-0.99f, 2.34f)
                    lineToRelative(-3.41f, 0.29f)
                    lineToRelative(2.59f, 2.24f)
                    lineTo(9.07f, 22f)
                    lineTo(12f, 20.23f)
                    lineTo(14.93f, 22f)
                    lineToRelative(-0.78f, -3.33f)
                    lineToRelative(2.59f, -2.24f)
                    lineToRelative(-3.41f, -0.29f)
                    lineToRelative(-0.99f, -2.34f)
                    lineTo(17f, 11f)
                    close()
                    moveTo(13f, 12.23f)
                    lineToRelative(-1f, 0.6f)
                    lineToRelative(-1f, -0.6f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(12.23f)
                    close()
                }
            }
        }.build()
        
        return _Military_tech!!
    }

private var _Military_tech: ImageVector? = null

