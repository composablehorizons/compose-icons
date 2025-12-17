package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Invert_colors_off: ImageVector
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
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(4.2f, 4.2f)
                curveToRelative(-1f, 1.31f, -1.6f, 2.94f, -1.6f, 4.7f)
                curveTo(4f, 17.48f, 7.58f, 21f, 12f, 21f)
                curveToRelative(1.75f, 0f, 3.36f, -0.56f, 4.67f, -1.5f)
                lineToRelative(3.1f, 3.1f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.31f, 0f, -6f, -2.63f, -6f, -5.87f)
                curveToRelative(0f, -1.19f, 0.36f, -2.32f, 1.02f, -3.28f)
                lineTo(12f, 14.83f)
                verticalLineTo(19f)
                close()
                moveTo(8.38f, 5.56f)
                lineTo(12f, 2f)
                lineToRelative(5.65f, 5.56f)
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

