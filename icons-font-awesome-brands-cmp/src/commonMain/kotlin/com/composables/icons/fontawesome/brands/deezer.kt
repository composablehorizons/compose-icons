package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Deezer: ImageVector
    get() {
        if (_Deezer != null) return _Deezer!!
        
        _Deezer = ImageVector.Builder(
            name = "deezer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(451.46f, 244.71f)
                horizontalLineTo(576f)
                verticalLineTo(172f)
                horizontalLineTo(451.46f)
                close()
                moveToRelative(0f, -173.89f)
                verticalLineToRelative(72.67f)
                horizontalLineTo(576f)
                verticalLineTo(70.82f)
                close()
                moveToRelative(0f, 275.06f)
                horizontalLineTo(576f)
                verticalLineTo(273.2f)
                horizontalLineTo(451.46f)
                close()
                moveTo(0f, 447.09f)
                horizontalLineTo(124.54f)
                verticalLineTo(374.42f)
                horizontalLineTo(0f)
                close()
                moveToRelative(150.47f, 0f)
                horizontalLineTo(275f)
                verticalLineTo(374.42f)
                horizontalLineTo(150.47f)
                close()
                moveToRelative(150.52f, 0f)
                horizontalLineTo(425.53f)
                verticalLineTo(374.42f)
                horizontalLineTo(301f)
                close()
                moveToRelative(150.47f, 0f)
                horizontalLineTo(576f)
                verticalLineTo(374.42f)
                horizontalLineTo(451.46f)
                close()
                moveTo(301f, 345.88f)
                horizontalLineTo(425.53f)
                verticalLineTo(273.2f)
                horizontalLineTo(301f)
                close()
                moveToRelative(-150.52f, 0f)
                horizontalLineTo(275f)
                verticalLineTo(273.2f)
                horizontalLineTo(150.47f)
                close()
                moveToRelative(0f, -101.17f)
                horizontalLineTo(275f)
                verticalLineTo(172f)
                horizontalLineTo(150.47f)
                close()
            }
        }.build()
        
        return _Deezer!!
    }

private var _Deezer: ImageVector? = null

