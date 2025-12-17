package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Play: ImageVector
    get() {
        if (_Play != null) return _Play!!
        
        _Play = ImageVector.Builder(
            name = "play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 5.653f)
                curveToRelative(0f, -1.427f, 1.529f, -2.33f, 2.779f, -1.643f)
                lineToRelative(11.54f, 6.347f)
                curveToRelative(1.295f, 0.712f, 1.295f, 2.573f, 0f, 3.286f)
                lineTo(7.28f, 19.99f)
                curveToRelative(-1.25f, 0.687f, -2.779f, -0.217f, -2.779f, -1.643f)
                verticalLineTo(5.653f)
                close()
            }
        }.build()
        
        return _Play!!
    }

private var _Play: ImageVector? = null

