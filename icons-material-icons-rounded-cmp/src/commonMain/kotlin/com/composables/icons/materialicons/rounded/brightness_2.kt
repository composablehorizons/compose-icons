package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Brightness_2: ImageVector
    get() {
        if (_Brightness_2 != null) return _Brightness_2!!
        
        _Brightness_2 = ImageVector.Builder(
            name = "brightness_2",
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
                moveTo(12.43f, 2.3f)
                curveToRelative(-2.38f, -0.59f, -4.68f, -0.27f, -6.63f, 0.64f)
                curveToRelative(-0.35f, 0.16f, -0.41f, 0.64f, -0.1f, 0.86f)
                curveTo(8.3f, 5.6f, 10f, 8.6f, 10f, 12f)
                curveToRelative(0f, 3.4f, -1.7f, 6.4f, -4.3f, 8.2f)
                curveToRelative(-0.32f, 0.22f, -0.26f, 0.7f, 0.09f, 0.86f)
                curveToRelative(1.28f, 0.6f, 2.71f, 0.94f, 4.21f, 0.94f)
                curveToRelative(6.05f, 0f, 10.85f, -5.38f, 9.87f, -11.6f)
                curveToRelative(-0.61f, -3.92f, -3.59f, -7.16f, -7.44f, -8.1f)
                close()
            }
        }.build()
        
        return _Brightness_2!!
    }

private var _Brightness_2: ImageVector? = null

