package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Angular: ImageVector
    get() {
        if (_Angular != null) return _Angular!!
        
        _Angular = ImageVector.Builder(
            name = "angular",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(185.7f, 268.1f)
                horizontalLineToRelative(76.2f)
                lineToRelative(-38.1f, -91.6f)
                lineToRelative(-38.1f, 91.6f)
                close()
                moveTo(223.8f, 32f)
                lineTo(16f, 106.4f)
                lineToRelative(31.8f, 275.7f)
                lineToRelative(176f, 97.9f)
                lineToRelative(176f, -97.9f)
                lineToRelative(31.8f, -275.7f)
                close()
                moveTo(354f, 373.8f)
                horizontalLineToRelative(-48.6f)
                lineToRelative(-26.2f, -65.4f)
                horizontalLineTo(168.6f)
                lineToRelative(-26.2f, 65.4f)
                horizontalLineTo(93.7f)
                lineTo(223.8f, 81.5f)
                close()
            }
        }.build()
        
        return _Angular!!
    }

private var _Angular: ImageVector? = null

