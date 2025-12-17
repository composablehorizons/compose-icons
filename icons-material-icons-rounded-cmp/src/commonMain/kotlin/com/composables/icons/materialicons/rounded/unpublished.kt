package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Unpublished: ImageVector
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
                moveTo(20.49f, 20.49f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(0f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(-1.25f, 1.88f, -1.88f, 4.21f, -1.59f, 6.7f)
                curveToRelative(0.53f, 4.54f, 4.21f, 8.22f, 8.74f, 8.74f)
                curveToRelative(2.49f, 0.29f, 4.81f, -0.34f, 6.7f, -1.59f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0f, 0f)
                curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                close()
                moveTo(9.88f, 15.89f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(0f, 0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(0.18f, -0.18f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-0.88f, 0.88f)
                curveTo(10.9f, 16.28f, 10.27f, 16.28f, 9.88f, 15.89f)
                close()
                moveTo(13.59f, 10.76f)
                lineToRelative(-7.1f, -7.1f)
                curveToRelative(1.88f, -1.25f, 4.21f, -1.88f, 6.7f, -1.59f)
                curveToRelative(4.54f, 0.53f, 8.22f, 4.21f, 8.74f, 8.74f)
                curveToRelative(0.29f, 2.49f, -0.34f, 4.82f, -1.59f, 6.7f)
                lineToRelative(-5.34f, -5.34f)
                lineToRelative(1.94f, -1.94f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                verticalLineToRelative(0f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineTo(13.59f, 10.76f)
                close()
            }
        }.build()
        
        return _Unpublished!!
    }

private var _Unpublished: ImageVector? = null

