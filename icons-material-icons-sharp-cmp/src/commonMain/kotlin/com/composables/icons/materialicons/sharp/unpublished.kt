package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Unpublished: ImageVector
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
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(2.27f, 2.27f)
                curveTo(2.61f, 8.07f, 2f, 9.96f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                curveToRelative(2.04f, 0f, 3.93f, -0.61f, 5.51f, -1.66f)
                lineToRelative(2.27f, 2.27f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(10.59f, 16.6f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(0.18f, -0.18f)
                lineToRelative(1.41f, 1.41f)
                lineTo(10.59f, 16.6f)
                close()
                moveTo(13.59f, 10.76f)
                lineToRelative(-7.1f, -7.1f)
                curveTo(8.07f, 2.61f, 9.96f, 2f, 12f, 2f)
                curveToRelative(5.52f, 0f, 10f, 4.48f, 10f, 10f)
                curveToRelative(0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f)
                lineToRelative(-5.34f, -5.34f)
                lineToRelative(2.65f, -2.65f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(13.59f, 10.76f)
                close()
            }
        }.build()
        
        return _Unpublished!!
    }

private var _Unpublished: ImageVector? = null

