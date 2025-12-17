package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Unpublished: ImageVector
    get() {
        if (_Unpublished != null) return _Unpublished!!
        
        _Unpublished = ImageVector.Builder(
            name = "unpublished",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(13.59f, 10.76f)
                lineToRelative(2.65f, -2.65f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(3.88f, 3.88f)
                curveTo(19.59f, 14.86f, 20f, 13.48f, 20f, 12f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                curveToRelative(-1.48f, 0f, -2.86f, 0.41f, -4.06f, 1.12f)
                lineTo(13.59f, 10.76f)
                close()
                moveTo(17.66f, 9.53f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17.66f, 9.53f)
                close()
                moveTo(16.06f, 18.88f)
                lineToRelative(-3.88f, -3.88f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(0.18f, -0.18f)
                lineTo(5.12f, 7.94f)
                curveTo(4.41f, 9.14f, 4f, 10.52f, 4f, 12f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                curveTo(13.48f, 20f, 14.86f, 19.59f, 16.06f, 18.88f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.94f, 5.12f)
                lineTo(6.49f, 3.66f)
                curveTo(8.07f, 2.61f, 9.96f, 2f, 12f, 2f)
                curveToRelative(5.52f, 0f, 10f, 4.48f, 10f, 10f)
                curveToRelative(0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f)
                lineToRelative(-1.46f, -1.46f)
                curveTo(19.59f, 14.86f, 20f, 13.48f, 20f, 12f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                curveTo(10.52f, 4f, 9.14f, 4.41f, 7.94f, 5.12f)
                close()
                moveTo(17.66f, 9.53f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17.66f, 9.53f)
                close()
                moveTo(19.78f, 22.61f)
                lineToRelative(-2.27f, -2.27f)
                curveTo(15.93f, 21.39f, 14.04f, 22f, 12f, 22f)
                curveTo(6.48f, 22f, 2f, 17.52f, 2f, 12f)
                curveToRelative(0f, -2.04f, 0.61f, -3.93f, 1.66f, -5.51f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(16.06f, 18.88f)
                lineToRelative(-3.88f, -3.88f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(0.18f, -0.18f)
                lineTo(5.12f, 7.94f)
                curveTo(4.41f, 9.14f, 4f, 10.52f, 4f, 12f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                curveTo(13.48f, 20f, 14.86f, 19.59f, 16.06f, 18.88f)
                close()
            }
        }.build()
        
        return _Unpublished!!
    }

private var _Unpublished: ImageVector? = null

