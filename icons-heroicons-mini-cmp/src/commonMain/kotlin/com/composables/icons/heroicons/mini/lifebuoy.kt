package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Lifebuoy: ImageVector
    get() {
        if (_Lifebuoy != null) return _Lifebuoy!!
        
        _Lifebuoy = ImageVector.Builder(
            name = "lifebuoy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.171f, 4.146f)
                lineToRelative(1.947f, 2.466f)
                arcToRelative(3.514f, 3.514f, 0f, false, true, 1.764f, 0f)
                lineToRelative(1.947f, -2.466f)
                arcToRelative(6.52f, 6.52f, 0f, false, false, -5.658f, 0f)
                close()
                moveToRelative(8.683f, 3.025f)
                lineToRelative(-2.466f, 1.947f)
                curveToRelative(0.15f, 0.578f, 0.15f, 1.186f, 0f, 1.764f)
                lineToRelative(2.466f, 1.947f)
                arcToRelative(6.52f, 6.52f, 0f, false, false, 0f, -5.658f)
                close()
                moveToRelative(-3.025f, 8.683f)
                lineToRelative(-1.947f, -2.466f)
                curveToRelative(-0.578f, 0.15f, -1.186f, 0.15f, -1.764f, 0f)
                lineToRelative(-1.947f, 2.466f)
                arcToRelative(6.52f, 6.52f, 0f, false, false, 5.658f, 0f)
                close()
                moveTo(4.146f, 12.83f)
                lineToRelative(2.466f, -1.947f)
                arcToRelative(3.514f, 3.514f, 0f, false, true, 0f, -1.764f)
                lineTo(4.146f, 7.171f)
                arcToRelative(6.52f, 6.52f, 0f, false, false, 0f, 5.658f)
                close()
                moveTo(5.63f, 3.297f)
                arcToRelative(8.01f, 8.01f, 0f, false, true, 8.738f, 0f)
                arcToRelative(8.031f, 8.031f, 0f, false, true, 2.334f, 2.334f)
                arcToRelative(8.01f, 8.01f, 0f, false, true, 0f, 8.738f)
                arcToRelative(8.033f, 8.033f, 0f, false, true, -2.334f, 2.334f)
                arcToRelative(8.01f, 8.01f, 0f, false, true, -8.738f, 0f)
                arcToRelative(8.032f, 8.032f, 0f, false, true, -2.334f, -2.334f)
                arcToRelative(8.01f, 8.01f, 0f, false, true, 0f, -8.738f)
                arcTo(8.03f, 8.03f, 0f, false, true, 5.63f, 3.297f)
                close()
                moveToRelative(5.198f, 4.882f)
                arcToRelative(2.008f, 2.008f, 0f, false, false, -2.243f, 0.407f)
                arcToRelative(1.994f, 1.994f, 0f, false, false, -0.407f, 2.243f)
                arcToRelative(1.993f, 1.993f, 0f, false, false, 0.992f, 0.992f)
                arcToRelative(2.008f, 2.008f, 0f, false, false, 2.243f, -0.407f)
                curveToRelative(0.176f, -0.175f, 0.31f, -0.374f, 0.407f, -0.585f)
                arcToRelative(2.008f, 2.008f, 0f, false, false, -0.407f, -2.243f)
                arcToRelative(1.993f, 1.993f, 0f, false, false, -0.585f, -0.407f)
                close()
            }
        }.build()
        
        return _Lifebuoy!!
    }

private var _Lifebuoy: ImageVector? = null

