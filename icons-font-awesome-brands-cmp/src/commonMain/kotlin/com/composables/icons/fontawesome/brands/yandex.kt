package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Yandex: ImageVector
    get() {
        if (_Yandex != null) return _Yandex!!
        
        _Yandex = ImageVector.Builder(
            name = "yandex",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(153.1f, 315.8f)
                lineTo(65.7f, 512f)
                horizontalLineTo(2f)
                lineToRelative(96f, -209.8f)
                curveToRelative(-45.1f, -22.9f, -75.2f, -64.4f, -75.2f, -141.1f)
                curveTo(22.7f, 53.7f, 90.8f, 0f, 171.7f, 0f)
                horizontalLineTo(254f)
                verticalLineToRelative(512f)
                horizontalLineToRelative(-55.1f)
                verticalLineTo(315.8f)
                horizontalLineToRelative(-45.8f)
                close()
                moveToRelative(45.8f, -269.3f)
                horizontalLineToRelative(-29.4f)
                curveToRelative(-44.4f, 0f, -87.4f, 29.4f, -87.4f, 114.6f)
                curveToRelative(0f, 82.3f, 39.4f, 108.8f, 87.4f, 108.8f)
                horizontalLineToRelative(29.4f)
                verticalLineTo(46.5f)
                close()
            }
        }.build()
        
        return _Yandex!!
    }

private var _Yandex: ImageVector? = null

