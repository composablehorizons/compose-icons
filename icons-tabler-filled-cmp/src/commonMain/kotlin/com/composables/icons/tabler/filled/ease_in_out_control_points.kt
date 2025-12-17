package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.EaseInOutControlPoints: ImageVector
    get() {
        if (_EaseInOutControlPoints != null) return _EaseInOutControlPoints!!
        
        _EaseInOutControlPoints = ImageVector.Builder(
            name = "ease-in-out-control-points",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 17f)
                arcToRelative(3f, 3f, 0f, true, true, -2.829f, 4f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(1.17f)
                arcToRelative(3f, 3f, 0f, false, true, 2.83f, -2f)
                moveToRelative(-14f, -16f)
                curveToRelative(1.306f, 0f, 2.418f, 0.835f, 2.83f, 2f)
                horizontalLineToRelative(1.17f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(3.001f, 3.001f, 0f, true, true, -2.829f, -4f)
                moveToRelative(9f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
                moveToRelative(-2f, 16f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                curveToRelative(-2.83f, 0f, -4.6f, 1.845f, -8.152f, 7.53f)
                curveToRelative(-3.947f, 6.315f, -6.012f, 8.47f, -9.848f, 8.47f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                curveToRelative(2.83f, 0f, 4.6f, -1.845f, 8.152f, -7.53f)
                curveToRelative(3.947f, -6.315f, 6.012f, -8.47f, 9.848f, -8.47f)
            }
        }.build()
        
        return _EaseInOutControlPoints!!
    }

private var _EaseInOutControlPoints: ImageVector? = null

