package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Css3: ImageVector
    get() {
        if (_Css3 != null) return _Css3!!
        
        _Css3 = ImageVector.Builder(
            name = "css3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 32f)
                lineToRelative(-64f, 368f)
                lineToRelative(-223.3f, 80f)
                lineTo(0f, 400f)
                lineToRelative(19.6f, -94.8f)
                horizontalLineToRelative(82f)
                lineToRelative(-8f, 40.6f)
                lineTo(210f, 390.2f)
                lineToRelative(134.1f, -44.4f)
                lineToRelative(18.8f, -97.1f)
                horizontalLineTo(29.5f)
                lineToRelative(16f, -82f)
                horizontalLineToRelative(333.7f)
                lineToRelative(10.5f, -52.7f)
                horizontalLineTo(56.3f)
                lineToRelative(16.3f, -82f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Css3!!
    }

private var _Css3: ImageVector? = null

