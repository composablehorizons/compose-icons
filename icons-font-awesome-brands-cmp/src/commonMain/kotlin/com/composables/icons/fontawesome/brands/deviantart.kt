package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Deviantart: ImageVector
    get() {
        if (_Deviantart != null) return _Deviantart!!
        
        _Deviantart = ImageVector.Builder(
            name = "deviantart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 93.2f)
                lineToRelative(-98.2f, 179.1f)
                lineToRelative(7.4f, 9.5f)
                horizontalLineTo(320f)
                verticalLineToRelative(127.7f)
                horizontalLineTo(159.1f)
                lineToRelative(-13.5f, 9.2f)
                lineToRelative(-43.7f, 84f)
                curveToRelative(-0.3f, 0f, -8.6f, 8.6f, -9.2f, 9.2f)
                horizontalLineTo(0f)
                verticalLineToRelative(-93.2f)
                lineToRelative(93.2f, -179.4f)
                lineToRelative(-7.4f, -9.2f)
                horizontalLineTo(0f)
                verticalLineTo(102.5f)
                horizontalLineToRelative(156f)
                lineToRelative(13.5f, -9.2f)
                lineToRelative(43.7f, -84f)
                curveToRelative(0.3f, 0f, 8.6f, -8.6f, 9.2f, -9.2f)
                horizontalLineTo(320f)
                verticalLineToRelative(93.1f)
                close()
            }
        }.build()
        
        return _Deviantart!!
    }

private var _Deviantart: ImageVector? = null

