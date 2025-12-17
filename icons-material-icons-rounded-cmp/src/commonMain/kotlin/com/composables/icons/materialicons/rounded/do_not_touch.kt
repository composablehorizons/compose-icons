package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Do_not_touch: ImageVector
    get() {
        if (_Do_not_touch != null) return _Do_not_touch!!
        
        _Do_not_touch = ImageVector.Builder(
            name = "do_not_touch",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 10.17f)
                    lineToRelative(-2.5f, -2.5f)
                    verticalLineTo(2.25f)
                    curveTo(10.5f, 1.56f, 11.06f, 1f, 11.75f, 1f)
                    curveTo(12.44f, 1f, 13f, 1.56f, 13f, 2.25f)
                    verticalLineTo(10.17f)
                    close()
                    moveTo(20f, 5.32f)
                    curveToRelative(0f, -0.65f, -0.47f, -1.25f, -1.12f, -1.32f)
                    curveToRelative(-0.75f, -0.08f, -1.38f, 0.51f, -1.38f, 1.24f)
                    verticalLineToRelative(5.25f)
                    curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    lineToRelative(0f, -7.18f)
                    curveToRelative(0f, -0.65f, -0.47f, -1.25f, -1.12f, -1.32f)
                    curveTo(14.63f, 1.93f, 14f, 2.52f, 14f, 3.25f)
                    verticalLineToRelative(7.92f)
                    lineToRelative(6f, 6f)
                    lineTo(20f, 5.32f)
                    close()
                    moveTo(9.5f, 4.25f)
                    curveTo(9.5f, 3.56f, 8.94f, 3f, 8.25f, 3f)
                    curveToRelative(-0.67f, 0f, -1.2f, 0.53f, -1.24f, 1.18f)
                    lineTo(9.5f, 6.67f)
                    verticalLineTo(4.25f)
                    close()
                    moveTo(17f, 22f)
                    curveToRelative(0.62f, 0f, 1.18f, -0.19f, 1.65f, -0.52f)
                    lineToRelative(-0.02f, -0.02f)
                    lineToRelative(0.44f, 0.44f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(4.92f, 4.92f)
                    lineTo(7f, 9.83f)
                    verticalLineToRelative(4.3f)
                    lineToRelative(-2.6f, -1.48f)
                    curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f)
                    curveToRelative(-0.26f, 0f, -0.5f, 0.09f, -0.7f, 0.26f)
                    lineTo(2f, 13.88f)
                    lineToRelative(0f, 0f)
                    lineToRelative(6.8f, 7.18f)
                    curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f)
                    lineTo(17f, 22f)
                    lineTo(17f, 22f)
                    close()
                }
            }
        }.build()
        
        return _Do_not_touch!!
    }

private var _Do_not_touch: ImageVector? = null

