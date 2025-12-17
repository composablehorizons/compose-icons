package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.JewishStar: ImageVector
    get() {
        if (_JewishStar != null) return _JewishStar!!
        
        _JewishStar = ImageVector.Builder(
            name = "jewish-star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.433f, 6f)
                horizontalLineToRelative(-5.433f)
                lineToRelative(-0.114f, 0.006f)
                arcToRelative(1f, 1f, 0f, false, false, -0.743f, 1.508f)
                lineToRelative(2.69f, 4.486f)
                lineToRelative(-2.69f, 4.486f)
                lineToRelative(-0.054f, 0.1f)
                arcToRelative(1f, 1f, 0f, false, false, 0.911f, 1.414f)
                horizontalLineToRelative(5.434f)
                lineToRelative(2.709f, 4.514f)
                lineToRelative(0.074f, 0.108f)
                arcToRelative(1f, 1f, 0f, false, false, 1.64f, -0.108f)
                lineToRelative(2.708f, -4.514f)
                horizontalLineToRelative(5.435f)
                lineToRelative(0.114f, -0.006f)
                arcToRelative(1f, 1f, 0f, false, false, 0.743f, -1.508f)
                lineToRelative(-2.691f, -4.486f)
                lineToRelative(2.691f, -4.486f)
                lineToRelative(0.054f, -0.1f)
                arcToRelative(1f, 1f, 0f, false, false, -0.911f, -1.414f)
                horizontalLineToRelative(-5.434f)
                lineToRelative(-2.709f, -4.514f)
                arcToRelative(1f, 1f, 0f, false, false, -1.714f, 0f)
                lineToRelative(-2.71f, 4.514f)
                close()
            }
        }.build()
        
        return _JewishStar!!
    }

private var _JewishStar: ImageVector? = null

