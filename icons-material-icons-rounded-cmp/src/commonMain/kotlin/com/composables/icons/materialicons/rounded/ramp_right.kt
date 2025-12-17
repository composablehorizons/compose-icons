package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Ramp_right: ImageVector
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
                    moveTo(12f, 21f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(6.83f)
                    lineToRelative(0.88f, 0.88f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(-2.59f, -2.59f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineTo(8.71f, 6.29f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineTo(11f, 6.83f)
                    verticalLineToRelative(0f)
                    verticalLineTo(9f)
                    curveToRelative(0f, 3.62f, -2.89f, 6.22f, -4.97f, 7.62f)
                    curveToRelative(-0.52f, 0.35f, -0.59f, 1.09f, -0.14f, 1.53f)
                    curveToRelative(0.33f, 0.33f, 0.87f, 0.4f, 1.26f, 0.13f)
                    curveToRelative(1.59f, -1.06f, 2.89f, -2.28f, 3.85f, -3.59f)
                    lineToRelative(0f, 5.3f)
                    curveTo(11f, 20.55f, 11.45f, 21f, 12f, 21f)
                    close()
                }
            }
        }.build()
        
        return _Ramp_right!!
    }

private var _Ramp_right: ImageVector? = null

