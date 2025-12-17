package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Ramp_left: ImageVector
    get() {
        if (_Ramp_left != null) return _Ramp_left!!
        
        _Ramp_left = ImageVector.Builder(
            name = "ramp_left",
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
                    moveTo(13f, 21f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(6.83f)
                    lineTo(9.41f, 8.41f)
                    lineTo(8f, 7f)
                    lineToRelative(4f, -4f)
                    lineToRelative(4f, 4f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(13f, 6.83f)
                    verticalLineTo(9f)
                    curveToRelative(0f, 4.27f, 4.03f, 7.13f, 6f, 8.27f)
                    lineToRelative(-1.46f, 1.46f)
                    curveToRelative(-1.91f, -1.16f, -3.44f, -2.53f, -4.54f, -4.02f)
                    lineTo(13f, 21f)
                    close()
                }
            }
        }.build()
        
        return _Ramp_left!!
    }

private var _Ramp_left: ImageVector? = null

