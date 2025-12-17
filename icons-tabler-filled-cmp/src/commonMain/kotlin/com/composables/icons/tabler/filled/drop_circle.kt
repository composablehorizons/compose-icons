package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DropCircle: ImageVector
    get() {
        if (_DropCircle != null) return _DropCircle!!
        
        _DropCircle = ImageVector.Builder(
            name = "drop-circle",
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
                moveToRelative(-4.177f, 4.092f)
                arcToRelative(1f, 1f, 0f, false, false, -1.646f, 0f)
                lineToRelative(-2.602f, 3.764f)
                curveToRelative(-1.022f, 1.67f, -0.634f, 3.736f, 0.875f, 4.929f)
                arcToRelative(4.144f, 4.144f, 0f, false, false, 5.095f, 0f)
                curveToRelative(1.51f, -1.191f, 1.897f, -3.26f, 0.904f, -4.882f)
                close()
            }
        }.build()
        
        return _DropCircle!!
    }

private var _DropCircle: ImageVector? = null

