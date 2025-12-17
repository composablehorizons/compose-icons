package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ZoomCheck: ImageVector
    get() {
        if (_ZoomCheck != null) return _ZoomCheck!!
        
        _ZoomCheck = ImageVector.Builder(
            name = "zoom-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3.072f)
                arcToRelative(8f, 8f, 0f, false, true, 2.617f, 11.424f)
                lineToRelative(4.944f, 4.943f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -2.008f, 2.225f)
                lineToRelative(-0.114f, -0.103f)
                lineToRelative(-4.943f, -4.944f)
                arcToRelative(8f, 8f, 0f, false, true, -12.49f, -6.332f)
                lineToRelative(-0.006f, -0.285f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8f, 8f, 0f, false, true, 11.995f, -6.643f)
                close()
                moveToRelative(-0.293f, 4.22f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-3.293f, 3.294f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, 1.497f)
                lineToRelative(2f, 2f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(4f, -4f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                close()
            }
        }.build()
        
        return _ZoomCheck!!
    }

private var _ZoomCheck: ImageVector? = null

