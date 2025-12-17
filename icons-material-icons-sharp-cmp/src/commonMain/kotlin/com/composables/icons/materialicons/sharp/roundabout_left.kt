package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Roundabout_left: ImageVector
    get() {
        if (_Roundabout_left != null) return _Roundabout_left!!
        
        _Roundabout_left = ImageVector.Builder(
            name = "roundabout_left",
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
                    moveTo(16f, 13f)
                    curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                    reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                    curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                    lineToRelative(0f, 1f)
                    lineToRelative(-6.17f, 0f)
                    lineToRelative(1.59f, 1.59f)
                    lineTo(6f, 13f)
                    lineTo(2f, 9f)
                    lineToRelative(4f, -4f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(5.83f, 8f)
                    lineToRelative(4.25f, 0f)
                    curveToRelative(0.48f, -2.84f, 2.94f, -5f, 5.92f, -5f)
                    curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                    curveToRelative(0f, 2.97f, -2.16f, 5.44f, -5f, 5.92f)
                    lineTo(17f, 21f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(0f, -8f)
                    lineTo(16f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Roundabout_left!!
    }

private var _Roundabout_left: ImageVector? = null

