package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Favorite_border: ImageVector
    get() {
        if (_Favorite_border != null) return _Favorite_border!!
        
        _Favorite_border = ImageVector.Builder(
            name = "favorite_border",
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
                moveTo(19.66f, 3.99f)
                curveToRelative(-2.64f, -1.8f, -5.9f, -0.96f, -7.66f, 1.1f)
                curveToRelative(-1.76f, -2.06f, -5.02f, -2.91f, -7.66f, -1.1f)
                curveToRelative(-1.4f, 0.96f, -2.28f, 2.58f, -2.34f, 4.29f)
                curveToRelative(-0.14f, 3.88f, 3.3f, 6.99f, 8.55f, 11.76f)
                lineToRelative(0.1f, 0.09f)
                curveToRelative(0.76f, 0.69f, 1.93f, 0.69f, 2.69f, -0.01f)
                lineToRelative(0.11f, -0.1f)
                curveToRelative(5.25f, -4.76f, 8.68f, -7.87f, 8.55f, -11.75f)
                curveToRelative(-0.06f, -1.7f, -0.94f, -3.32f, -2.34f, -4.28f)
                close()
                moveTo(12.1f, 18.55f)
                lineToRelative(-0.1f, 0.1f)
                lineToRelative(-0.1f, -0.1f)
                curveTo(7.14f, 14.24f, 4f, 11.39f, 4f, 8.5f)
                curveTo(4f, 6.5f, 5.5f, 5f, 7.5f, 5f)
                curveToRelative(1.54f, 0f, 3.04f, 0.99f, 3.57f, 2.36f)
                horizontalLineToRelative(1.87f)
                curveTo(13.46f, 5.99f, 14.96f, 5f, 16.5f, 5f)
                curveToRelative(2f, 0f, 3.5f, 1.5f, 3.5f, 3.5f)
                curveToRelative(0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f)
                close()
            }
        }.build()
        
        return _Favorite_border!!
    }

private var _Favorite_border: ImageVector? = null

