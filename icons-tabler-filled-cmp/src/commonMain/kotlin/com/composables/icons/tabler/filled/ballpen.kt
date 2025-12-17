package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Ballpen: ImageVector
    get() {
        if (_Ballpen != null) return _Ballpen!!
        
        _Ballpen = ImageVector.Builder(
            name = "ballpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.828f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 1.977f, 0.743f)
                lineToRelative(0.145f, 0.136f)
                lineToRelative(1.171f, 1.17f)
                arcToRelative(3f, 3f, 0f, false, true, 0.136f, 4.1f)
                lineToRelative(-0.136f, 0.144f)
                lineToRelative(-1.706f, 1.707f)
                lineToRelative(2.292f, 2.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-4f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(3.292f, -3.293f)
                lineToRelative(-1.586f, -1.585f)
                lineToRelative(-7.464f, 7.464f)
                arcToRelative(3.828f, 3.828f, 0f, false, true, -2.474f, 1.114f)
                lineToRelative(-0.233f, 0.008f)
                curveToRelative(-0.674f, 0f, -1.33f, -0.178f, -1.905f, -0.508f)
                lineToRelative(-1.216f, 1.214f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(1.214f, -1.216f)
                arcToRelative(3.828f, 3.828f, 0f, false, true, 0.454f, -4.442f)
                lineToRelative(0.16f, -0.17f)
                lineToRelative(10.586f, -10.586f)
                arcToRelative(3f, 3f, 0f, false, true, 1.923f, -0.873f)
                lineToRelative(0.198f, -0.006f)
                close()
                moveToRelative(0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, -0.608f, 0.206f)
                lineToRelative(-0.099f, 0.087f)
                lineToRelative(-1.707f, 1.707f)
                lineToRelative(2.586f, 2.585f)
                lineToRelative(1.707f, -1.706f)
                arcToRelative(1f, 1f, 0f, false, false, 0.284f, -0.576f)
                lineToRelative(0.01f, -0.131f)
                arcToRelative(1f, 1f, 0f, false, false, -0.207f, -0.609f)
                lineToRelative(-0.087f, -0.099f)
                lineToRelative(-1.171f, -1.171f)
                arcToRelative(1f, 1f, 0f, false, false, -0.708f, -0.293f)
                close()
            }
        }.build()
        
        return _Ballpen!!
    }

private var _Ballpen: ImageVector? = null

