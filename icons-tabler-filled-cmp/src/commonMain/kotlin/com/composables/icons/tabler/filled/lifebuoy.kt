package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Lifebuoy: ImageVector
    get() {
        if (_Lifebuoy != null) return _Lifebuoy!!
        
        _Lifebuoy = ImageVector.Builder(
            name = "lifebuoy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.757f, 16.172f)
                lineToRelative(3.571f, 3.571f)
                arcToRelative(10.004f, 10.004f, 0f, false, true, -12.656f, 0f)
                lineToRelative(3.57f, -3.571f)
                arcToRelative(5f, 5f, 0f, false, false, 2.758f, 0.828f)
                curveToRelative(1.02f, 0f, 1.967f, -0.305f, 2.757f, -0.828f)
                moveToRelative(-10.5f, -10.5f)
                lineToRelative(3.571f, 3.57f)
                arcToRelative(5f, 5f, 0f, false, false, -0.828f, 2.758f)
                curveToRelative(0f, 1.02f, 0.305f, 1.967f, 0.828f, 2.757f)
                lineToRelative(-3.57f, 3.572f)
                arcToRelative(10f, 10f, 0f, false, true, -2.258f, -6.329f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 2.252f, -6.005f)
                moveToRelative(17.743f, 6.329f)
                curveToRelative(0f, 2.343f, -0.82f, 4.57f, -2.257f, 6.328f)
                lineToRelative(-3.571f, -3.57f)
                arcToRelative(5f, 5f, 0f, false, false, 0.828f, -2.758f)
                curveToRelative(0f, -1.02f, -0.305f, -1.967f, -0.828f, -2.757f)
                lineToRelative(3.571f, -3.57f)
                arcToRelative(10f, 10f, 0f, false, true, 2.257f, 6.327f)
                moveToRelative(-5f, -8.66f)
                quadToRelative(0.707f, 0.41f, 1.33f, 0.918f)
                lineToRelative(-3.573f, 3.57f)
                arcToRelative(5f, 5f, 0f, false, false, -2.757f, -0.828f)
                curveToRelative(-1.02f, 0f, -1.967f, 0.305f, -2.757f, 0.828f)
                lineToRelative(-3.573f, -3.57f)
                arcToRelative(10f, 10f, 0f, false, true, 11.33f, -0.918f)
            }
        }.build()
        
        return _Lifebuoy!!
    }

private var _Lifebuoy: ImageVector? = null

