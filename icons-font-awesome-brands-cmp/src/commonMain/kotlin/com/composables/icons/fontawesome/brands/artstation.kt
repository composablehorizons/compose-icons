package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Artstation: ImageVector
    get() {
        if (_Artstation != null) return _Artstation!!
        
        _Artstation = ImageVector.Builder(
            name = "artstation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 377.4f)
                lineToRelative(43f, 74.3f)
                arcTo(51.35f, 51.35f, 0f, false, false, 90.9f, 480f)
                horizontalLineToRelative(285.4f)
                lineToRelative(-59.2f, -102.6f)
                close()
                moveTo(501.8f, 350f)
                lineTo(335.6f, 59.3f)
                arcTo(51.38f, 51.38f, 0f, false, false, 290.2f, 32f)
                horizontalLineToRelative(-88.4f)
                lineToRelative(257.3f, 447.6f)
                lineToRelative(40.7f, -70.5f)
                curveToRelative(1.9f, -3.2f, 21f, -29.7f, 2f, -59.1f)
                close()
                moveTo(275f, 304.5f)
                lineToRelative(-115.5f, -200f)
                lineTo(44f, 304.5f)
                close()
            }
        }.build()
        
        return _Artstation!!
    }

private var _Artstation: ImageVector? = null

