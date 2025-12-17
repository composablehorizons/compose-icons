package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Css3Alt: ImageVector
    get() {
        if (_Css3Alt != null) return _Css3Alt!!
        
        _Css3Alt = ImageVector.Builder(
            name = "css3-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                lineToRelative(34.9f, 395.8f)
                lineTo(192f, 480f)
                lineToRelative(157.1f, -52.2f)
                lineTo(384f, 32f)
                horizontalLineTo(0f)
                close()
                moveToRelative(313.1f, 80f)
                lineToRelative(-4.8f, 47.3f)
                lineTo(193f, 208.6f)
                lineToRelative(-0.3f, 0.1f)
                horizontalLineToRelative(111.5f)
                lineToRelative(-12.8f, 146.6f)
                lineToRelative(-98.2f, 28.7f)
                lineToRelative(-98.8f, -29.2f)
                lineToRelative(-6.4f, -73.9f)
                horizontalLineToRelative(48.9f)
                lineToRelative(3.2f, 38.3f)
                lineToRelative(52.6f, 13.3f)
                lineToRelative(54.7f, -15.4f)
                lineToRelative(3.7f, -61.6f)
                lineToRelative(-166.3f, -0.5f)
                verticalLineToRelative(-0.1f)
                lineToRelative(-0.2f, 0.1f)
                lineToRelative(-3.6f, -46.3f)
                lineTo(193.1f, 162f)
                lineToRelative(6.5f, -2.7f)
                horizontalLineTo(76.7f)
                lineTo(70.9f, 112f)
                horizontalLineToRelative(242.2f)
                close()
            }
        }.build()
        
        return _Css3Alt!!
    }

private var _Css3Alt: ImageVector? = null

