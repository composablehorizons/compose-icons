package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Roundabout_right: ImageVector
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
                    moveTo(13.92f, 8f)
                    curveTo(13.44f, 5.16f, 10.97f, 3f, 8f, 3f)
                    curveTo(4.69f, 3f, 2f, 5.69f, 2f, 9f)
                    curveToRelative(0f, 2.97f, 2.16f, 5.44f, 5f, 5.92f)
                    lineTo(7f, 21f)
                    horizontalLineToRelative(2f)
                    lineToRelative(0f, -6.09f)
                    curveToRelative(0f, -0.98f, -0.71f, -1.8f, -1.67f, -1.97f)
                    curveTo(5.44f, 12.63f, 4f, 10.98f, 4f, 9f)
                    curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                    curveToRelative(1.98f, 0f, 3.63f, 1.44f, 3.94f, 3.33f)
                    curveTo(12.11f, 9.29f, 12.93f, 10f, 13.91f, 10f)
                    lineToRelative(4.26f, 0f)
                    lineToRelative(-1.59f, 1.59f)
                    lineTo(18f, 13f)
                    lineToRelative(4f, -4f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(18.17f, 8f)
                    lineTo(13.92f, 8f)
                    close()
                }
            }
        }.build()
        
        return _Roundabout_right!!
    }

private var _Roundabout_right: ImageVector? = null

