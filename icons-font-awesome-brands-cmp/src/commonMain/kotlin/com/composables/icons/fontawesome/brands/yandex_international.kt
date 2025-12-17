package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.YandexInternational: ImageVector
    get() {
        if (_YandexInternational != null) return _YandexInternational!!
        
        _YandexInternational = ImageVector.Builder(
            name = "yandex-international",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(129.5f, 512f)
                verticalLineTo(345.9f)
                lineTo(18.5f, 48f)
                horizontalLineToRelative(55.8f)
                lineToRelative(81.8f, 229.7f)
                lineTo(250.2f, 0f)
                horizontalLineToRelative(51.3f)
                lineTo(180.8f, 347.8f)
                verticalLineTo(512f)
                horizontalLineToRelative(-51.3f)
                close()
            }
        }.build()
        
        return _YandexInternational!!
    }

private var _YandexInternational: ImageVector? = null

