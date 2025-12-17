package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Escalator: ImageVector
    get() {
        if (_Escalator != null) return _Escalator!!
        
        _Escalator = ImageVector.Builder(
            name = "escalator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.5f, 4f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 7f)
                horizontalLineToRelative(-1.086f)
                lineToRelative(-8.12f, 8.121f)
                arcToRelative(3f, 3f, 0f, false, true, -1.924f, 0.872f)
                lineToRelative(-0.198f, 0.007f)
                horizontalLineToRelative(-3.672f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -7f)
                horizontalLineToRelative(2.084f)
                lineToRelative(8.123f, -8.121f)
                arcToRelative(3f, 3f, 0f, false, true, 1.923f, -0.872f)
                lineToRelative(0.198f, -0.007f)
                close()
            }
        }.build()
        
        return _Escalator!!
    }

private var _Escalator: ImageVector? = null

