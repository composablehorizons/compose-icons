package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Do_not_disturb_off: ImageVector
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
                    moveTo(7f, 13f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(1.17f)
                    lineTo(5.12f, 7.94f)
                    curveTo(4.41f, 9.14f, 4f, 10.52f, 4f, 12f)
                    curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                    curveToRelative(1.48f, 0f, 2.86f, -0.41f, 4.06f, -1.12f)
                    lineTo(10.17f, 13f)
                    horizontalLineTo(7f)
                    close()
                    moveTo(12f, 4f)
                    curveToRelative(-1.48f, 0f, -2.86f, 0.41f, -4.06f, 1.12f)
                    lineTo(13.83f, 11f)
                    horizontalLineTo(17f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-1.17f)
                    lineToRelative(3.06f, 3.06f)
                    curveTo(19.59f, 14.86f, 20f, 13.48f, 20f, 12f)
                    curveTo(20f, 7.59f, 16.41f, 4f, 12f, 4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 4f)
                    curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                    curveToRelative(0f, 1.48f, -0.41f, 2.86f, -1.12f, 4.06f)
                    lineToRelative(1.46f, 1.46f)
                    curveTo(21.39f, 15.93f, 22f, 14.04f, 22f, 12f)
                    curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                    curveTo(9.96f, 2f, 8.07f, 2.61f, 6.49f, 3.66f)
                    lineToRelative(1.46f, 1.46f)
                    curveTo(9.14f, 4.41f, 10.52f, 4f, 12f, 4f)
                    close()
                    moveTo(17f, 13f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-3.17f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(17f)
                    close()
                    moveTo(1.39f, 4.22f)
                    lineToRelative(2.27f, 2.27f)
                    curveTo(2.61f, 8.07f, 2f, 9.96f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    curveToRelative(2.04f, 0f, 3.93f, -0.61f, 5.51f, -1.66f)
                    lineToRelative(2.27f, 2.27f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    close()
                    moveTo(5.12f, 7.94f)
                    lineTo(8.17f, 11f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3.17f)
                    lineToRelative(5.88f, 5.88f)
                    curveTo(14.86f, 19.59f, 13.48f, 20f, 12f, 20f)
                    curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                    curveTo(4f, 10.52f, 4.41f, 9.14f, 5.12f, 7.94f)
                    close()
                }
            }
        }.build()
        
        return _Do_not_disturb_off!!
    }

private var _Do_not_disturb_off: ImageVector? = null

