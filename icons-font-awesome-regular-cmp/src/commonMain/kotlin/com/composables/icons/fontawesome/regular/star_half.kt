package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.StarHalf: ImageVector
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
                moveTo(288f, 385.3f)
                lineToRelative(-124.3f, 65.4f)
                lineToRelative(23.7f, -138.4f)
                lineToRelative(-100.6f, -98f)
                lineToRelative(139f, -20.2f)
                lineToRelative(62.2f, -126f)
                verticalLineTo(0f)
                curveToRelative(-11.4f, 0f, -22.8f, 5.9f, -28.7f, 17.8f)
                lineTo(194f, 150.2f)
                lineTo(47.9f, 171.4f)
                curveToRelative(-26.2f, 3.8f, -36.7f, 36.1f, -17.7f, 54.6f)
                lineToRelative(105.7f, 103f)
                lineToRelative(-25f, 145.5f)
                curveToRelative(-4.5f, 26.1f, 23f, 46f, 46.4f, 33.7f)
                lineTo(288f, 439.6f)
                verticalLineToRelative(-54.3f)
                close()
            }
        }.build()
        
        return _StarHalf!!
    }

private var _StarHalf: ImageVector? = null

