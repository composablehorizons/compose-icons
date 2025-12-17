package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Shuffle_on: ImageVector
    get() {
        if (_Shuffle_on != null) return _Shuffle_on!!
        
        _Shuffle_on = ImageVector.Builder(
            name = "shuffle_on",
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
                    moveTo(1f, 1f)
                    verticalLineToRelative(22f)
                    horizontalLineToRelative(22f)
                    verticalLineTo(1f)
                    horizontalLineTo(1f)
                    close()
                    moveTo(5.41f, 4f)
                    lineToRelative(5.18f, 5.17f)
                    lineToRelative(-1.42f, 1.41f)
                    lineTo(4f, 5.41f)
                    lineTo(5.41f, 4f)
                    close()
                    moveTo(20f, 20f)
                    horizontalLineToRelative(-5.5f)
                    lineToRelative(2.05f, -2.05f)
                    lineToRelative(-3.13f, -3.13f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(3.13f, 3.13f)
                    lineTo(20f, 14.5f)
                    verticalLineTo(20f)
                    close()
                    moveTo(20f, 9.5f)
                    lineToRelative(-2.04f, -2.04f)
                    lineTo(5.41f, 20f)
                    lineTo(4f, 18.59f)
                    lineTo(16.54f, 6.04f)
                    lineTo(14.5f, 4f)
                    horizontalLineTo(20f)
                    verticalLineTo(9.5f)
                    close()
                }
            }
        }.build()
        
        return _Shuffle_on!!
    }

private var _Shuffle_on: ImageVector? = null

