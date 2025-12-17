package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.YinYang: ImageVector
    get() {
        if (_YinYang != null) return _YinYang!!
        
        _YinYang = ImageVector.Builder(
            name = "yin-yang",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                close()
                moveToRelative(-9f, 1.732f)
                arcToRelative(8f, 8f, 0f, false, false, 4f, 14.928f)
                lineToRelative(0.2f, -0.005f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -7.99f)
                lineToRelative(-0.2f, -0.005f)
                arcToRelative(4f, 4f, 0f, false, true, -0.2f, -7.995f)
                lineToRelative(0.2f, -0.005f)
                arcToRelative(7.995f, 7.995f, 0f, false, false, -4f, 1.072f)
                close()
                moveToRelative(4f, 1.428f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 14.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, -3f)
                close()
            }
        }.build()
        
        return _YinYang!!
    }

private var _YinYang: ImageVector? = null

