package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Analyze: ImageVector
    get() {
        if (_Analyze != null) return _Analyze!!
        
        _Analyze = ImageVector.Builder(
            name = "analyze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.99f, 12.862f)
                arcToRelative(7.1f, 7.1f, 0f, false, false, 12.171f, 3.924f)
                arcToRelative(1.956f, 1.956f, 0f, false, true, -0.156f, -0.637f)
                lineToRelative(-0.005f, -0.149f)
                lineToRelative(0.005f, -0.15f)
                arcToRelative(2f, 2f, 0f, true, true, 1.769f, 2.137f)
                arcToRelative(9.099f, 9.099f, 0f, false, true, -15.764f, -4.85f)
                arcToRelative(1f, 1f, 0f, false, true, 1.98f, -0.275f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 8f)
                arcToRelative(4f, 4f, 0f, true, true, -3.995f, 4.2f)
                lineToRelative(-0.005f, -0.2f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, -3.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.142f, 3.09f)
                arcToRelative(9.1f, 9.1f, 0f, false, true, 7.848f, 7.772f)
                arcToRelative(1f, 1f, 0f, false, true, -1.98f, 0.276f)
                arcToRelative(7.1f, 7.1f, 0f, false, false, -6.125f, -6.064f)
                arcToRelative(7.096f, 7.096f, 0f, false, false, -6.048f, 2.136f)
                arcToRelative(2f, 2f, 0f, true, true, -3.831f, 0.939f)
                lineToRelative(-0.006f, -0.149f)
                lineToRelative(0.005f, -0.15f)
                arcToRelative(2f, 2f, 0f, false, true, 2.216f, -1.838f)
                arcToRelative(9.094f, 9.094f, 0f, false, true, 7.921f, -2.922f)
                close()
            }
        }.build()
        
        return _Analyze!!
    }

private var _Analyze: ImageVector? = null

