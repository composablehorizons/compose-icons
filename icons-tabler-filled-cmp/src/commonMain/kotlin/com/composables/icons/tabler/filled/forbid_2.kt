package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Forbid2: ImageVector
    get() {
        if (_Forbid2 != null) return _Forbid2!!
        
        _Forbid2 = ImageVector.Builder(
            name = "forbid-2",
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
                moveToRelative(-1.293f, 4.953f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-6f, 6f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 1.497f, 1.32f)
                lineToRelative(6f, -6f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                close()
            }
        }.build()
        
        return _Forbid2!!
    }

private var _Forbid2: ImageVector? = null

