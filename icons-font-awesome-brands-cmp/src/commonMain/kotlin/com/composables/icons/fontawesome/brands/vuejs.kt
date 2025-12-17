package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Vuejs: ImageVector
    get() {
        if (_Vuejs != null) return _Vuejs!!
        
        _Vuejs = ImageVector.Builder(
            name = "vuejs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(356.9f, 64.3f)
                horizontalLineTo(280f)
                lineToRelative(-56f, 88.6f)
                lineToRelative(-48f, -88.6f)
                horizontalLineTo(0f)
                lineTo(224f, 448f)
                lineTo(448f, 64.3f)
                horizontalLineToRelative(-91.1f)
                close()
                moveToRelative(-301.2f, 32f)
                horizontalLineToRelative(53.8f)
                lineTo(224f, 294.5f)
                lineTo(338.4f, 96.3f)
                horizontalLineToRelative(53.8f)
                lineTo(224f, 384.5f)
                lineTo(55.7f, 96.3f)
                close()
            }
        }.build()
        
        return _Vuejs!!
    }

private var _Vuejs: ImageVector? = null

