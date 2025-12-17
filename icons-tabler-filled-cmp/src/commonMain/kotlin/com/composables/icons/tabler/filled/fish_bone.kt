package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FishBone: ImageVector
    get() {
        if (_FishBone != null) return _FishBone!!
        
        _FishBone = ImageVector.Builder(
            name = "fish-bone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.675f, 6.44f)
                lineToRelative(0.118f, 0.005f)
                arcToRelative(1f, 1f, 0f, false, true, 0.232f, 0.052f)
                lineToRelative(0.032f, 0.015f)
                lineToRelative(0.273f, 0.103f)
                curveToRelative(1.936f, 0.771f, 3.69f, 2.27f, 5.253f, 4.476f)
                lineToRelative(0.245f, 0.355f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.12f)
                curveToRelative(-1.702f, 2.519f, -3.636f, 4.176f, -5.792f, 4.947f)
                arcToRelative(1f, 1f, 0f, false, true, -1.093f, -0.288f)
                arcToRelative(7.97f, 7.97f, 0f, false, true, -1.883f, -4.225f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.166f)
                lineToRelative(-0.335f, 0.324f)
                arcToRelative(39f, 39f, 0f, false, false, -1.751f, 1.846f)
                arcToRelative(1f, 1f, 0f, false, true, -1.496f, -1.328f)
                quadToRelative(0.593f, -0.667f, 1.214f, -1.308f)
                lineToRelative(0.522f, -0.528f)
                lineToRelative(-0.523f, -0.529f)
                arcToRelative(42f, 42f, 0f, false, true, -0.613f, -0.648f)
                lineToRelative(-0.6f, -0.661f)
                arcToRelative(1f, 1f, 0f, true, true, 1.496f, -1.328f)
                arcToRelative(40f, 40f, 0f, false, false, 2.069f, 2.161f)
                lineToRelative(1.183f, -0.001f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.062f)
                arcToRelative(7.97f, 7.97f, 0f, false, true, 1.656f, -3.953f)
                lineToRelative(0.196f, -0.24f)
                lineToRelative(0.075f, -0.081f)
                lineToRelative(0.105f, -0.088f)
                lineToRelative(0.068f, -0.048f)
                lineToRelative(0.097f, -0.052f)
                lineToRelative(0.069f, -0.03f)
                lineToRelative(0.138f, -0.042f)
                lineToRelative(0.091f, -0.017f)
                quadToRelative(0.059f, -0.007f, 0.118f, -0.009f)
                moveToRelative(1.325f, 3.56f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, 0.117f)
                lineToRelative(0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _FishBone!!
    }

private var _FishBone: ImageVector? = null

