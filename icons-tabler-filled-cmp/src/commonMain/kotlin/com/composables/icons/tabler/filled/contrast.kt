package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Contrast: ImageVector
    get() {
        if (_Contrast != null) return _Contrast!!
        
        _Contrast = ImageVector.Builder(
            name = "contrast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                moveToRelative(-9f, 1.732f)
                arcToRelative(8f, 8f, 0f, false, false, 4.001f, 14.928f)
                lineToRelative(-0.001f, -16f)
                arcToRelative(8f, 8f, 0f, false, false, -4f, 1.072f)
            }
        }.build()
        
        return _Contrast!!
    }

private var _Contrast: ImageVector? = null

