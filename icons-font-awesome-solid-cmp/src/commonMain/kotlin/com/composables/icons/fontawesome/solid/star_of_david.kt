package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StarOfDavid: ImageVector
    get() {
        if (_StarOfDavid != null) return _StarOfDavid!!
        
        _StarOfDavid = ImageVector.Builder(
            name = "star-of-david",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 464f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(405.68f, 256f)
                lineToRelative(53.21f, -89.39f)
                curveTo(473.3f, 142.4f, 455.48f, 112f, 426.88f, 112f)
                horizontalLineTo(319.96f)
                lineToRelative(-55.95f, -93.98f)
                curveTo(256.86f, 6.01f, 244.43f, 0f, 232f, 0f)
                reflectiveCurveToRelative(-24.86f, 6.01f, -32.01f, 18.02f)
                lineTo(144.04f, 112f)
                horizontalLineTo(37.11f)
                curveToRelative(-28.6f, 0f, -46.42f, 30.4f, -32.01f, 54.61f)
                lineTo(58.32f, 256f)
                lineTo(5.1f, 345.39f)
                curveTo(-9.31f, 369.6f, 8.51f, 400f, 37.11f, 400f)
                horizontalLineToRelative(106.93f)
                lineToRelative(55.95f, 93.98f)
                curveTo(207.14f, 505.99f, 219.57f, 512f, 232f, 512f)
                reflectiveCurveToRelative(24.86f, -6.01f, 32.01f, -18.02f)
                lineTo(319.96f, 400f)
                horizontalLineToRelative(106.93f)
                curveToRelative(28.6f, 0f, 46.42f, -30.4f, 32.01f, -54.61f)
                lineTo(405.68f, 256f)
                close()
                moveToRelative(-12.78f, -88f)
                lineToRelative(-19.8f, 33.26f)
                lineTo(353.3f, 168f)
                horizontalLineToRelative(39.6f)
                close()
                moveToRelative(-52.39f, 88f)
                lineToRelative(-52.39f, 88f)
                horizontalLineTo(175.88f)
                lineToRelative(-52.39f, -88f)
                lineToRelative(52.38f, -88f)
                horizontalLineToRelative(112.25f)
                lineToRelative(52.39f, 88f)
                close()
                moveTo(232f, 73.72f)
                lineTo(254.79f, 112f)
                horizontalLineToRelative(-45.57f)
                lineTo(232f, 73.72f)
                close()
                moveTo(71.1f, 168f)
                horizontalLineToRelative(39.6f)
                lineToRelative(-19.8f, 33.26f)
                lineTo(71.1f, 168f)
                close()
                moveToRelative(0f, 176f)
                lineToRelative(19.8f, -33.26f)
                lineTo(110.7f, 344f)
                horizontalLineTo(71.1f)
                close()
                moveTo(232f, 438.28f)
                lineTo(209.21f, 400f)
                horizontalLineToRelative(45.57f)
                lineTo(232f, 438.28f)
                close()
                moveTo(353.29f, 344f)
                lineToRelative(19.8f, -33.26f)
                lineTo(392.9f, 344f)
                horizontalLineToRelative(-39.61f)
                close()
            }
        }.build()
        
        return _StarOfDavid!!
    }

private var _StarOfDavid: ImageVector? = null

