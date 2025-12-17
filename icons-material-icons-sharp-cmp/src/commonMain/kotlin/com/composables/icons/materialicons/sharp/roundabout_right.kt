package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Roundabout_right: ImageVector
    get() {
        if (_Roundabout_right != null) return _Roundabout_right!!
        
        _Roundabout_right = ImageVector.Builder(
            name = "roundabout_right",
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
                    moveTo(8f, 13f)
                    curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                    curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                    curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                    lineToRelative(0f, 1f)
                    lineToRelative(6.17f, 0f)
                    lineToRelative(-1.59f, 1.59f)
                    lineTo(18f, 13f)
                    lineToRelative(4f, -4f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(18.17f, 8f)
                    lineToRelative(-4.25f, 0f)
                    curveTo(13.44f, 5.16f, 10.97f, 3f, 8f, 3f)
                    curveTo(4.69f, 3f, 2f, 5.69f, 2f, 9f)
                    curveToRelative(0f, 2.97f, 2.16f, 5.44f, 5f, 5.92f)
                    lineTo(7f, 21f)
                    horizontalLineToRelative(2f)
                    lineToRelative(0f, -8f)
                    lineTo(8f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Roundabout_right!!
    }

private var _Roundabout_right: ImageVector? = null

