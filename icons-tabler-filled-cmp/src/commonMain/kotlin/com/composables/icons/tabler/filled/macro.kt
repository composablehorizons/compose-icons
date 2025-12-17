package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Macro: ImageVector
    get() {
        if (_Macro != null) return _Macro!!
        
        _Macro = ImageVector.Builder(
            name = "macro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.994f, 2.888f)
                lineToRelative(0.006f, 0.112f)
                verticalLineToRelative(3f)
                arcToRelative(6f, 6f, 0f, false, true, -5f, 5.916f)
                verticalLineToRelative(4.186f)
                arcToRelative(6.98f, 6.98f, 0f, false, true, 5f, -2.102f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, -14f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                curveToRelative(1.96f, 0f, 3.731f, 0.805f, 5.002f, 2.103f)
                lineToRelative(-0.002f, -4.186f)
                arcToRelative(6f, 6f, 0f, false, true, -5f, -5.917f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.555f, -0.832f)
                lineToRelative(2.317f, 1.544f)
                lineToRelative(1.42f, -1.42f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.082f)
                lineToRelative(0.095f, 0.083f)
                lineToRelative(1.42f, 1.419f)
                lineToRelative(2.318f, -1.544f)
                arcToRelative(1f, 1f, 0f, false, true, 1.55f, 0.72f)
                moveToRelative(-10.865f, 13.24f)
                lineToRelative(0.03f, 0.134f)
                arcToRelative(5.01f, 5.01f, 0f, false, false, 3.71f, 3.61f)
                arcToRelative(5f, 5f, 0f, false, false, -3.74f, -3.744f)
                moveToRelative(9.742f, 0.002f)
                lineToRelative(-0.134f, 0.03f)
                arcToRelative(5.01f, 5.01f, 0f, false, false, -3.61f, 3.71f)
                arcToRelative(5f, 5f, 0f, false, false, 3.744f, -3.74f)
            }
        }.build()
        
        return _Macro!!
    }

private var _Macro: ImageVector? = null

