package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dangerous: ImageVector
    get() {
        if (_Dangerous != null) return _Dangerous!!
        
        _Dangerous = ImageVector.Builder(
            name = "dangerous",
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
                    moveTo(15.73f, 3f)
                    horizontalLineTo(8.27f)
                    lineTo(3f, 8.27f)
                    verticalLineToRelative(7.46f)
                    lineTo(8.27f, 21f)
                    horizontalLineToRelative(7.46f)
                    lineTo(21f, 15.73f)
                    verticalLineTo(8.27f)
                    lineTo(15.73f, 3f)
                    close()
                    moveTo(16.24f, 14.83f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(12f, 13.41f)
                    lineToRelative(-2.83f, 2.83f)
                    lineToRelative(-1.41f, -1.41f)
                    lineTo(10.59f, 12f)
                    lineTo(7.76f, 9.17f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(12f, 10.59f)
                    lineToRelative(2.83f, -2.83f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(13.41f, 12f)
                    lineTo(16.24f, 14.83f)
                    close()
                }
            }
        }.build()
        
        return _Dangerous!!
    }

private var _Dangerous: ImageVector? = null

