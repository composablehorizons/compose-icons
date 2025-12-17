package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.4f, 10.5f)
                lineToRelative(4.77f, -8.26f)
                curveTo(13.47f, 2.09f, 12.75f, 2f, 12f, 2f)
                curveToRelative(-2.4f, 0f, -4.6f, 0.85f, -6.32f, 2.25f)
                lineToRelative(3.66f, 6.35f)
                lineToRelative(0.06f, -0.1f)
                close()
                moveTo(21.54f, 9f)
                curveToRelative(-0.92f, -2.92f, -3.15f, -5.26f, -6f, -6.34f)
                lineTo(11.88f, 9f)
                horizontalLineToRelative(9.66f)
                close()
                moveToRelative(0.26f, 1f)
                horizontalLineToRelative(-7.49f)
                lineToRelative(0.29f, 0.5f)
                lineToRelative(4.76f, 8.25f)
                curveTo(21f, 16.97f, 22f, 14.61f, 22f, 12f)
                curveToRelative(0f, -0.69f, -0.07f, -1.35f, -0.2f, -2f)
                close()
                moveTo(8.54f, 12f)
                lineToRelative(-3.9f, -6.75f)
                curveTo(3.01f, 7.03f, 2f, 9.39f, 2f, 12f)
                curveToRelative(0f, 0.69f, 0.07f, 1.35f, 0.2f, 2f)
                horizontalLineToRelative(7.49f)
                lineToRelative(-1.15f, -2f)
                close()
                moveToRelative(-6.08f, 3f)
                curveToRelative(0.92f, 2.92f, 3.15f, 5.26f, 6f, 6.34f)
                lineTo(12.12f, 15f)
                horizontalLineTo(2.46f)
                close()
                moveToRelative(11.27f, 0f)
                lineToRelative(-3.9f, 6.76f)
                curveToRelative(0.7f, 0.15f, 1.42f, 0.24f, 2.17f, 0.24f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.25f)
                lineToRelative(-3.66f, -6.35f)
                lineToRelative(-0.93f, 1.6f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

