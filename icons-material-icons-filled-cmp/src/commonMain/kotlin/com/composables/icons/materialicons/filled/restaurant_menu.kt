package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Restaurant_menu: ImageVector
    get() {
        if (_Restaurant_menu != null) return _Restaurant_menu!!
        
        _Restaurant_menu = ImageVector.Builder(
            name = "restaurant_menu",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.1f, 13.34f)
                lineToRelative(2.83f, -2.83f)
                lineTo(3.91f, 3.5f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.09f, 0f, 5.66f)
                lineToRelative(4.19f, 4.18f)
                close()
                moveToRelative(6.78f, -1.81f)
                curveToRelative(1.53f, 0.71f, 3.68f, 0.21f, 5.27f, -1.38f)
                curveToRelative(1.91f, -1.91f, 2.28f, -4.65f, 0.81f, -6.12f)
                curveToRelative(-1.46f, -1.46f, -4.2f, -1.1f, -6.12f, 0.81f)
                curveToRelative(-1.59f, 1.59f, -2.09f, 3.74f, -1.38f, 5.27f)
                lineTo(3.7f, 19.87f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12f, 14.41f)
                lineToRelative(6.88f, 6.88f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 13f)
                lineToRelative(1.47f, -1.47f)
                close()
            }
        }.build()
        
        return _Restaurant_menu!!
    }

private var _Restaurant_menu: ImageVector? = null

