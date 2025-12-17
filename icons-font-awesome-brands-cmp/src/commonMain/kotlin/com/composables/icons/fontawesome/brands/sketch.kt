package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Sketch: ImageVector
    get() {
        if (_Sketch != null) return _Sketch!!
        
        _Sketch = ImageVector.Builder(
            name = "sketch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(27.5f, 162.2f)
                lineTo(9f, 187.1f)
                horizontalLineToRelative(90.5f)
                lineToRelative(6.9f, -130.7f)
                lineToRelative(-78.9f, 105.8f)
                close()
                moveTo(396.3f, 45.7f)
                lineTo(267.7f, 32f)
                lineToRelative(135.7f, 147.2f)
                lineToRelative(-7.1f, -133.5f)
                close()
                moveTo(112.2f, 218.3f)
                lineToRelative(-11.2f, -22f)
                horizontalLineTo(9.9f)
                lineTo(234.8f, 458f)
                close()
                moveToRelative(2f, -31.2f)
                horizontalLineToRelative(284f)
                lineToRelative(-81.5f, -88.5f)
                lineTo(256.3f, 33f)
                close()
                moveToRelative(297.3f, 9.1f)
                lineTo(277.6f, 458f)
                lineToRelative(224.8f, -261.7f)
                horizontalLineToRelative(-90.9f)
                close()
                moveTo(415.4f, 69f)
                lineTo(406f, 56.4f)
                lineToRelative(0.9f, 17.3f)
                lineToRelative(6.1f, 113.4f)
                horizontalLineToRelative(90.3f)
                close()
                moveTo(113.5f, 93.5f)
                lineToRelative(-4.6f, 85.6f)
                lineTo(244.7f, 32f)
                lineTo(116.1f, 45.7f)
                close()
                moveToRelative(287.7f, 102.7f)
                horizontalLineToRelative(-290f)
                lineToRelative(42.4f, 82.9f)
                lineTo(256.3f, 480f)
                lineToRelative(144.9f, -283.8f)
                close()
            }
        }.build()
        
        return _Sketch!!
    }

private var _Sketch: ImageVector? = null

