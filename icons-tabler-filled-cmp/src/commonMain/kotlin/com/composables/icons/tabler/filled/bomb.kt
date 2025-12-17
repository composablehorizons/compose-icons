package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Bomb: ImageVector
    get() {
        if (_Bomb != null) return _Bomb!!
        
        _Bomb = ImageVector.Builder(
            name = "bomb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.499f, 3.996f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 1.556f, 0.645f)
                lineToRelative(3.302f, 3.301f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 0f, 3.113f)
                lineToRelative(-0.567f, 0.567f)
                lineToRelative(0.043f, 0.192f)
                arcToRelative(8.5f, 8.5f, 0f, false, true, -3.732f, 8.83f)
                lineToRelative(-0.23f, 0.144f)
                arcToRelative(8.5f, 8.5f, 0f, true, true, -2.687f, -15.623f)
                lineToRelative(0.192f, 0.042f)
                lineToRelative(0.567f, -0.566f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, 1.362f, -0.636f)
                close()
                moveToRelative(-4.499f, 5.004f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 0.83f, -0.302f, 1.629f, -0.846f, 2.25f)
                lineToRelative(-0.154f, 0.163f)
                lineToRelative(-1.293f, 1.293f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(1.293f, -1.292f)
                curveToRelative(0.232f, -0.232f, 0.375f, -0.537f, 0.407f, -0.86f)
                lineToRelative(0.007f, -0.14f)
                arcToRelative(2f, 2f, 0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Bomb!!
    }

private var _Bomb: ImageVector? = null

