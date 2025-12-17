package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Gg: ImageVector
    get() {
        if (_Gg != null) return _Gg!!
        
        _Gg = ImageVector.Builder(
            name = "gg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(179.2f, 230.4f)
                lineToRelative(102.4f, 102.4f)
                lineToRelative(-102.4f, 102.4f)
                lineTo(0f, 256f)
                lineTo(179.2f, 76.8f)
                lineToRelative(44.8f, 44.8f)
                lineToRelative(-25.6f, 25.6f)
                lineToRelative(-19.2f, -19.2f)
                lineToRelative(-128f, 128f)
                lineToRelative(128f, 128f)
                lineToRelative(51.5f, -51.5f)
                lineToRelative(-77.1f, -76.5f)
                lineToRelative(25.6f, -25.6f)
                close()
                moveTo(332.8f, 76.8f)
                lineTo(230.4f, 179.2f)
                lineToRelative(102.4f, 102.4f)
                lineToRelative(25.6f, -25.6f)
                lineToRelative(-77.1f, -76.5f)
                lineToRelative(51.5f, -51.5f)
                lineToRelative(128f, 128f)
                lineToRelative(-128f, 128f)
                lineToRelative(-19.2f, -19.2f)
                lineToRelative(-25.6f, 25.6f)
                lineToRelative(44.8f, 44.8f)
                lineTo(512f, 256f)
                lineTo(332.8f, 76.8f)
                close()
            }
        }.build()
        
        return _Gg!!
    }

private var _Gg: ImageVector? = null

