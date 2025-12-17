package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Audible: ImageVector
    get() {
        if (_Audible != null) return _Audible!!
        
        _Audible = ImageVector.Builder(
            name = "audible",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 199.9f)
                verticalLineToRelative(54f)
                lineToRelative(-320f, 200f)
                lineTo(0f, 254f)
                verticalLineToRelative(-54f)
                lineToRelative(320f, 200f)
                lineToRelative(320f, -200.1f)
                close()
                moveToRelative(-194.5f, 72f)
                lineToRelative(47.1f, -29.4f)
                curveToRelative(-37.2f, -55.8f, -100.7f, -92.6f, -172.7f, -92.6f)
                curveToRelative(-72f, 0f, -135.5f, 36.7f, -172.6f, 92.4f)
                horizontalLineToRelative(0.3f)
                curveToRelative(2.5f, -2.3f, 5.1f, -4.5f, 7.7f, -6.7f)
                curveToRelative(89.7f, -74.4f, 219.4f, -58.1f, 290.2f, 36.3f)
                close()
                moveToRelative(-220.1f, 18.8f)
                curveToRelative(16.9f, -11.9f, 36.5f, -18.7f, 57.4f, -18.7f)
                curveToRelative(34.4f, 0f, 65.2f, 18.4f, 86.4f, 47.6f)
                lineToRelative(45.4f, -28.4f)
                curveToRelative(-20.9f, -29.9f, -55.6f, -49.5f, -94.8f, -49.5f)
                curveToRelative(-38.9f, 0f, -73.4f, 19.4f, -94.4f, 49f)
                close()
                moveTo(103.6f, 161.1f)
                curveToRelative(131.8f, -104.3f, 318.2f, -76.4f, 417.5f, 62.1f)
                lineToRelative(0.7f, 1f)
                lineToRelative(48.8f, -30.4f)
                curveTo(517.1f, 112.1f, 424.8f, 58.1f, 319.9f, 58.1f)
                curveToRelative(-103.5f, 0f, -196.6f, 53.5f, -250.5f, 135.6f)
                curveToRelative(9.9f, -10.5f, 22.7f, -23.5f, 34.2f, -32.6f)
                close()
                moveToRelative(467f, 32.7f)
                close()
            }
        }.build()
        
        return _Audible!!
    }

private var _Audible: ImageVector? = null

