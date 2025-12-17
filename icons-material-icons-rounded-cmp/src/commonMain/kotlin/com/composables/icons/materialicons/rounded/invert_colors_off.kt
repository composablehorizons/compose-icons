package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Invert_colors_off: ImageVector
    get() {
        if (_Invert_colors_off != null) return _Invert_colors_off!!
        
        _Invert_colors_off = ImageVector.Builder(
            name = "invert_colors_off",
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
                lineToRelative(3.5f, 3.5f)
                curveToRelative(-1f, 1.31f, -1.6f, 2.94f, -1.6f, 4.7f)
                curveTo(4f, 17.48f, 7.58f, 21f, 12f, 21f)
                curveToRelative(1.75f, 0f, 3.36f, -0.56f, 4.67f, -1.5f)
                lineToRelative(2.4f, 2.4f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0f, 0f)
                curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.31f, 0f, -6f, -2.63f, -6f, -5.87f)
                curveToRelative(0f, -1.19f, 0.36f, -2.32f, 1.02f, -3.28f)
                lineTo(12f, 14.83f)
                verticalLineTo(19f)
                close()
                moveTo(8.38f, 5.56f)
                lineToRelative(2.91f, -2.87f)
                curveToRelative(0.39f, -0.38f, 1.01f, -0.38f, 1.4f, 0f)
                lineToRelative(4.95f, 4.87f)
                lineToRelative(0f, 0f)
                curveTo(19.1f, 8.99f, 20f, 10.96f, 20f, 13.13f)
                curveToRelative(0f, 1.18f, -0.27f, 2.29f, -0.74f, 3.3f)
                lineTo(12f, 9.17f)
                verticalLineTo(4.81f)
                lineTo(9.8f, 6.97f)
                lineTo(8.38f, 5.56f)
                close()
            }
        }.build()
        
        return _Invert_colors_off!!
    }

private var _Invert_colors_off: ImageVector? = null

