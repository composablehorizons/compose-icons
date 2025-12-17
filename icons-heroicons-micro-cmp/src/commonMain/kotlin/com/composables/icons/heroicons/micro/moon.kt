package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Moon: ImageVector
    get() {
        if (_Moon != null) return _Moon!!
        
        _Moon = ImageVector.Builder(
            name = "moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.438f, 10.148f)
                curveToRelative(0.19f, -0.425f, -0.321f, -0.787f, -0.748f, -0.601f)
                arcTo(5.5f, 5.5f, 0f, false, true, 6.453f, 2.31f)
                curveToRelative(0.186f, -0.427f, -0.176f, -0.938f, -0.6f, -0.748f)
                arcToRelative(6.501f, 6.501f, 0f, true, false, 8.585f, 8.586f)
                close()
            }
        }.build()
        
        return _Moon!!
    }

private var _Moon: ImageVector? = null

