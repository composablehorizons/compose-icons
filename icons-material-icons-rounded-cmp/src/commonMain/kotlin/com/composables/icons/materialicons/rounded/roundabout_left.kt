package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Roundabout_left: ImageVector
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
                    moveTo(16f, 21f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    lineToRelative(0f, -5.09f)
                    curveToRelative(0f, -0.98f, 0.71f, -1.8f, 1.67f, -1.97f)
                    curveTo(18.56f, 12.63f, 20f, 10.98f, 20f, 9f)
                    curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                    curveToRelative(-1.98f, 0f, -3.63f, 1.44f, -3.94f, 3.33f)
                    curveTo(11.89f, 9.29f, 11.07f, 10f, 10.09f, 10f)
                    lineToRelative(-4.26f, 0f)
                    lineToRelative(0.88f, 0.88f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineTo(2.71f, 9.71f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(2.59f, -2.59f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineTo(5.83f, 8f)
                    lineToRelative(4.25f, 0f)
                    curveToRelative(0.48f, -2.84f, 2.94f, -5f, 5.92f, -5f)
                    curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                    curveToRelative(0f, 2.97f, -2.16f, 5.44f, -5f, 5.92f)
                    lineTo(17f, 20f)
                    curveTo(17f, 20.55f, 16.55f, 21f, 16f, 21f)
                    close()
                }
            }
        }.build()
        
        return _Roundabout_left!!
    }

private var _Roundabout_left: ImageVector? = null

