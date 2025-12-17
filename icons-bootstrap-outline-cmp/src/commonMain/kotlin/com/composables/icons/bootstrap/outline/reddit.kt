package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Reddit: ImageVector
    get() {
        if (_Reddit != null) return _Reddit!!
        
        _Reddit = ImageVector.Builder(
            name = "reddit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.167f, 8f)
                arcToRelative(0.83f, 0.83f, 0f, false, false, -0.83f, 0.83f)
                curveToRelative(0f, 0.459f, 0.372f, 0.84f, 0.83f, 0.831f)
                arcToRelative(0.831f, 0.831f, 0f, false, false, 0f, -1.661f)
                moveToRelative(1.843f, 3.647f)
                curveToRelative(0.315f, 0f, 1.403f, -0.038f, 1.976f, -0.611f)
                arcToRelative(0.23f, 0.23f, 0f, false, false, 0f, -0.306f)
                arcToRelative(0.213f, 0.213f, 0f, false, false, -0.306f, 0f)
                curveToRelative(-0.353f, 0.363f, -1.126f, 0.487f, -1.67f, 0.487f)
                curveToRelative(-0.545f, 0f, -1.308f, -0.124f, -1.671f, -0.487f)
                arcToRelative(0.213f, 0.213f, 0f, false, false, -0.306f, 0f)
                arcToRelative(0.213f, 0.213f, 0f, false, false, 0f, 0.306f)
                curveToRelative(0.564f, 0.563f, 1.652f, 0.61f, 1.977f, 0.61f)
                close()
                moveToRelative(0.992f, -2.807f)
                curveToRelative(0f, 0.458f, 0.373f, 0.83f, 0.831f, 0.83f)
                reflectiveCurveToRelative(0.83f, -0.381f, 0.83f, -0.83f)
                arcToRelative(0.831f, 0.831f, 0f, false, false, -1.66f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-3.828f, -1.165f)
                curveToRelative(-0.315f, 0f, -0.602f, 0.124f, -0.812f, 0.325f)
                curveToRelative(-0.801f, -0.573f, -1.9f, -0.945f, -3.121f, -0.993f)
                lineToRelative(0.534f, -2.501f)
                lineToRelative(1.738f, 0.372f)
                arcToRelative(0.83f, 0.83f, 0f, true, false, 0.83f, -0.869f)
                arcToRelative(0.83f, 0.83f, 0f, false, false, -0.744f, 0.468f)
                lineToRelative(-1.938f, -0.41f)
                arcToRelative(0.2f, 0.2f, 0f, false, false, -0.153f, 0.028f)
                arcToRelative(0.2f, 0.2f, 0f, false, false, -0.086f, 0.134f)
                lineToRelative(-0.592f, 2.788f)
                curveToRelative(-1.24f, 0.038f, -2.358f, 0.41f, -3.17f, 0.992f)
                curveToRelative(-0.21f, -0.2f, -0.496f, -0.324f, -0.81f, -0.324f)
                arcToRelative(1.163f, 1.163f, 0f, false, false, -0.478f, 2.224f)
                quadToRelative(-0.03f, 0.17f, -0.029f, 0.353f)
                curveToRelative(0f, 1.795f, 2.091f, 3.256f, 4.669f, 3.256f)
                reflectiveCurveToRelative(4.668f, -1.451f, 4.668f, -3.256f)
                curveToRelative(0f, -0.114f, -0.01f, -0.238f, -0.029f, -0.353f)
                curveToRelative(0.401f, -0.181f, 0.688f, -0.592f, 0.688f, -1.069f)
                curveToRelative(0f, -0.65f, -0.525f, -1.165f, -1.165f, -1.165f)
            }
        }.build()
        
        return _Reddit!!
    }

private var _Reddit: ImageVector? = null

