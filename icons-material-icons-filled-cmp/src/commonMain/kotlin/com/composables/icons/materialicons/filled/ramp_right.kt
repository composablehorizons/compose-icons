package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Ramp_right: ImageVector
    get() {
        if (_Ramp_right != null) return _Ramp_right!!
        
        _Ramp_right = ImageVector.Builder(
            name = "ramp_right",
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
                    moveTo(11f, 21f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(6.83f)
                    lineToRelative(1.59f, 1.59f)
                    lineTo(16f, 7f)
                    lineToRelative(-4f, -4f)
                    lineTo(8f, 7f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(11f, 6.83f)
                    verticalLineTo(9f)
                    curveToRelative(0f, 4.27f, -4.03f, 7.13f, -6f, 8.27f)
                    lineToRelative(1.46f, 1.46f)
                    curveTo(8.37f, 17.56f, 9.9f, 16.19f, 11f, 14.7f)
                    lineTo(11f, 21f)
                    close()
                }
            }
        }.build()
        
        return _Ramp_right!!
    }

private var _Ramp_right: ImageVector? = null

