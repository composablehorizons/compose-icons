package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.TriangleInverted: ImageVector
    get() {
        if (_TriangleInverted != null) return _TriangleInverted!!
        
        _TriangleInverted = ImageVector.Builder(
            name = "triangle-inverted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.118f, 3f)
                horizontalLineToRelative(-16.225f)
                arcToRelative(2.914f, 2.914f, 0f, false, false, -2.503f, 4.371f)
                lineToRelative(8.116f, 13.549f)
                arcToRelative(2.917f, 2.917f, 0f, false, false, 4.987f, 0.005f)
                lineToRelative(8.11f, -13.539f)
                arcToRelative(2.914f, 2.914f, 0f, false, false, -2.486f, -4.386f)
                close()
            }
        }.build()
        
        return _TriangleInverted!!
    }

private var _TriangleInverted: ImageVector? = null

