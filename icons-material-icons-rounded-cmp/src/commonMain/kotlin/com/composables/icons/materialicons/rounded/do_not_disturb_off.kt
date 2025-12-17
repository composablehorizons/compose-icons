package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Do_not_disturb_off: ImageVector
    get() {
        if (_Do_not_disturb_off != null) return _Do_not_disturb_off!!
        
        _Do_not_disturb_off = ImageVector.Builder(
            name = "do_not_disturb_off",
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
                    moveTo(17f, 11f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-1.17f)
                    lineToRelative(4.51f, 4.51f)
                    curveTo(21.39f, 15.93f, 22f, 14.04f, 22f, 12f)
                    curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                    curveTo(9.96f, 2f, 8.07f, 2.61f, 6.49f, 3.66f)
                    lineTo(13.83f, 11f)
                    horizontalLineTo(17f)
                    close()
                    moveTo(2.1f, 4.93f)
                    lineToRelative(1.56f, 1.56f)
                    curveToRelative(-1.37f, 2.07f, -2f, 4.68f, -1.48f, 7.45f)
                    curveToRelative(0.75f, 3.95f, 3.92f, 7.13f, 7.88f, 7.88f)
                    curveToRelative(2.77f, 0.52f, 5.38f, -0.1f, 7.45f, -1.48f)
                    lineToRelative(1.56f, 1.56f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveTo(1.71f, 3.91f, 1.71f, 4.54f, 2.1f, 4.93f)
                    close()
                    moveTo(7f, 11f)
                    horizontalLineToRelative(1.17f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(7f)
                    verticalLineTo(11f)
                    close()
                }
            }
        }.build()
        
        return _Do_not_disturb_off!!
    }

private var _Do_not_disturb_off: ImageVector? = null

