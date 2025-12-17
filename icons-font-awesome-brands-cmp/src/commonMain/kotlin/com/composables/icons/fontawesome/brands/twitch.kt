package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Twitch: ImageVector
    get() {
        if (_Twitch != null) return _Twitch!!
        
        _Twitch = ImageVector.Builder(
            name = "twitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(391.17f, 103.47f)
                horizontalLineTo(352.54f)
                verticalLineToRelative(109.7f)
                horizontalLineToRelative(38.63f)
                close()
                moveTo(285f, 103f)
                horizontalLineTo(246.37f)
                verticalLineTo(212.75f)
                horizontalLineTo(285f)
                close()
                moveTo(120.83f, 0f)
                lineTo(24.31f, 91.42f)
                verticalLineTo(420.58f)
                horizontalLineTo(140.14f)
                verticalLineTo(512f)
                lineToRelative(96.53f, -91.42f)
                horizontalLineToRelative(77.25f)
                lineTo(487.69f, 256f)
                verticalLineTo(0f)
                close()
                moveTo(449.07f, 237.75f)
                lineToRelative(-77.22f, 73.12f)
                horizontalLineTo(294.61f)
                lineToRelative(-67.6f, 64f)
                verticalLineToRelative(-64f)
                horizontalLineTo(140.14f)
                verticalLineTo(36.58f)
                horizontalLineTo(449.07f)
                close()
            }
        }.build()
        
        return _Twitch!!
    }

private var _Twitch: ImageVector? = null

