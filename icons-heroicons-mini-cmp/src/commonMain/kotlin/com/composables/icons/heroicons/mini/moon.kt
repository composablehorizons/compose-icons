package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Moon: ImageVector
    get() {
        if (_Moon != null) return _Moon!!
        
        _Moon = ImageVector.Builder(
            name = "moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.455f, 2.004f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.26f, 0.77f)
                arcToRelative(7f, 7f, 0f, false, false, 9.958f, 7.967f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.067f, 0.853f)
                arcTo(8.5f, 8.5f, 0f, true, true, 6.647f, 1.921f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.808f, 0.083f)
                close()
            }
        }.build()
        
        return _Moon!!
    }

private var _Moon: ImageVector? = null

