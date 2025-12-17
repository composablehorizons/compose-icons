package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) return _Strikethrough!!
        
        _Strikethrough = ImageVector.Builder(
            name = "strikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.617f, 3.963f)
                curveToRelative(-1.186f, -0.318f, -2.418f, -0.323f, -3.416f, 0.015f)
                curveToRelative(-0.992f, 0.336f, -1.49f, 0.91f, -1.642f, 1.476f)
                curveToRelative(-0.152f, 0.566f, -0.007f, 1.313f, 0.684f, 2.1f)
                curveToRelative(0.528f, 0.6f, 1.273f, 1.1f, 2.128f, 1.446f)
                horizontalLineToRelative(7.879f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(3.813f)
                arcToRelative(5.976f, 5.976f, 0f, false, true, -0.447f, -0.456f)
                curveTo(5.18f, 7.479f, 4.798f, 6.231f, 5.11f, 5.066f)
                curveToRelative(0.312f, -1.164f, 1.268f, -2.055f, 2.61f, -2.509f)
                curveToRelative(1.336f, -0.451f, 2.877f, -0.42f, 4.286f, -0.043f)
                curveToRelative(0.856f, 0.23f, 1.684f, 0.592f, 2.409f, 1.074f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.83f, 1.25f)
                arcToRelative(6.723f, 6.723f, 0f, false, false, -1.968f, -0.875f)
                close()
                moveToRelative(1.909f, 8.123f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.015f, 0.309f)
                curveToRelative(0.53f, 0.99f, 0.607f, 2.062f, 0.18f, 3.01f)
                curveToRelative(-0.421f, 0.94f, -1.289f, 1.648f, -2.441f, 2.038f)
                curveToRelative(-1.336f, 0.452f, -2.877f, 0.42f, -4.286f, 0.043f)
                curveToRelative(-1.409f, -0.377f, -2.759f, -1.121f, -3.69f, -2.18f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.127f, -0.99f)
                curveToRelative(0.696f, 0.791f, 1.765f, 1.403f, 2.952f, 1.721f)
                curveToRelative(1.186f, 0.318f, 2.418f, 0.323f, 3.416f, -0.015f)
                curveToRelative(0.853f, -0.288f, 1.34f, -0.756f, 1.555f, -1.232f)
                curveToRelative(0.21f, -0.467f, 0.205f, -1.049f, -0.136f, -1.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.308f, -1.014f)
                close()
            }
        }.build()
        
        return _Strikethrough!!
    }

private var _Strikethrough: ImageVector? = null

