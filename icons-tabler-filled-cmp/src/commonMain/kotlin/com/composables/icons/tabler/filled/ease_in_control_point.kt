package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.EaseInControlPoint: ImageVector
    get() {
        if (_EaseInControlPoint != null) return _EaseInControlPoint!!
        
        _EaseInControlPoint = ImageVector.Builder(
            name = "ease-in-control-point",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 16f)
                arcToRelative(3f, 3f, 0f, true, true, -2.829f, 4f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(1.17f)
                arcToRelative(3f, 3f, 0f, false, true, 2.83f, -2f)
                moveToRelative(2.53f, -13.848f)
                arcToRelative(1f, 1f, 0f, false, true, 0.318f, 1.378f)
                lineToRelative(-0.286f, 0.445f)
                lineToRelative(-0.173f, 0.264f)
                arcToRelative(73f, 73f, 0f, false, true, -1.26f, 1.839f)
                arcToRelative(70f, 70f, 0f, false, true, -4.376f, 5.58f)
                curveToRelative(-2.795f, 3.195f, -5.544f, 5.638f, -8.171f, 7.04f)
                curveToRelative(-1.593f, 0.848f, -3.123f, 1.302f, -4.582f, 1.302f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                curveToRelative(1.097f, 0f, 2.317f, -0.361f, 3.64f, -1.068f)
                curveToRelative(2.373f, -1.265f, 4.958f, -3.562f, 7.607f, -6.59f)
                arcToRelative(68f, 68f, 0f, false, false, 4.25f, -5.42f)
                arcToRelative(69f, 69f, 0f, false, false, 1.003f, -1.456f)
                lineToRelative(0.455f, -0.69f)
                quadToRelative(0.133f, -0.204f, 0.196f, -0.306f)
                arcToRelative(1f, 1f, 0f, false, true, 1.378f, -0.318f)
                moveToRelative(-9.529f, 15.848f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
            }
        }.build()
        
        return _EaseInControlPoint!!
    }

private var _EaseInControlPoint: ImageVector? = null

