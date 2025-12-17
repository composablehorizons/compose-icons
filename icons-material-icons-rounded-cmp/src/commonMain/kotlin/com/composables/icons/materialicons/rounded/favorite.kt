package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Favorite: ImageVector
    get() {
        if (_Favorite != null) return _Favorite!!
        
        _Favorite = ImageVector.Builder(
            name = "favorite",
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
                moveTo(13.35f, 20.13f)
                curveToRelative(-0.76f, 0.69f, -1.93f, 0.69f, -2.69f, -0.01f)
                lineToRelative(-0.11f, -0.1f)
                curveTo(5.3f, 15.27f, 1.87f, 12.16f, 2f, 8.28f)
                curveToRelative(0.06f, -1.7f, 0.93f, -3.33f, 2.34f, -4.29f)
                curveToRelative(2.64f, -1.8f, 5.9f, -0.96f, 7.66f, 1.1f)
                curveToRelative(1.76f, -2.06f, 5.02f, -2.91f, 7.66f, -1.1f)
                curveToRelative(1.41f, 0.96f, 2.28f, 2.59f, 2.34f, 4.29f)
                curveToRelative(0.14f, 3.88f, -3.3f, 6.99f, -8.55f, 11.76f)
                lineToRelative(-0.1f, 0.09f)
                close()
            }
        }.build()
        
        return _Favorite!!
    }

private var _Favorite: ImageVector? = null

