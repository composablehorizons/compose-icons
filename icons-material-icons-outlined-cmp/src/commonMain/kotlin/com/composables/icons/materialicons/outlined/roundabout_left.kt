package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Roundabout_left: ImageVector
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
                    moveTo(10.08f, 8f)
                    curveToRelative(0.48f, -2.84f, 2.94f, -5f, 5.92f, -5f)
                    curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                    curveToRelative(0f, 2.97f, -2.16f, 5.44f, -5f, 5.92f)
                    lineTo(17f, 21f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(0f, -6.09f)
                    curveToRelative(0f, -0.98f, 0.71f, -1.8f, 1.67f, -1.97f)
                    curveTo(18.56f, 12.63f, 20f, 10.98f, 20f, 9f)
                    curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                    curveToRelative(-1.98f, 0f, -3.63f, 1.44f, -3.94f, 3.33f)
                    curveTo(11.89f, 9.29f, 11.07f, 10f, 10.09f, 10f)
                    lineToRelative(-4.26f, 0f)
                    lineToRelative(1.59f, 1.59f)
                    lineTo(6f, 13f)
                    lineTo(2f, 9f)
                    lineToRelative(4f, -4f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(5.83f, 8f)
                    lineTo(10.08f, 8f)
                    close()
                }
            }
        }.build()
        
        return _Roundabout_left!!
    }

private var _Roundabout_left: ImageVector? = null

