package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StarHalf: ImageVector
    get() {
        if (_StarHalf != null) return _StarHalf!!
        
        _StarHalf = ImageVector.Builder(
            name = "star-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 0f)
                curveToRelative(-11.4f, 0f, -22.8f, 5.9f, -28.7f, 17.8f)
                lineTo(194f, 150.2f)
                lineTo(47.9f, 171.4f)
                curveToRelative(-26.2f, 3.8f, -36.7f, 36.1f, -17.7f, 54.6f)
                lineToRelative(105.7f, 103f)
                lineToRelative(-25f, 145.5f)
                curveToRelative(-4.5f, 26.1f, 23f, 46f, 46.4f, 33.7f)
                lineTo(288f, 439.6f)
                verticalLineTo(0f)
                close()
            }
        }.build()
        
        return _StarHalf!!
    }

private var _StarHalf: ImageVector? = null

