package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) return _Strikethrough!!
        
        _Strikethrough = ImageVector.Builder(
            name = "strikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.657f, 4.728f)
                curveToRelative(-1.086f, 0.385f, -1.766f, 1.057f, -1.979f, 1.85f)
                curveToRelative(-0.214f, 0.8f, 0.046f, 1.733f, 0.81f, 2.616f)
                curveToRelative(0.746f, 0.862f, 1.93f, 1.612f, 3.388f, 2.003f)
                curveToRelative(0.07f, 0.019f, 0.14f, 0.037f, 0.21f, 0.053f)
                horizontalLineToRelative(8.163f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-8.24f)
                arcToRelative(0.66f, 0.66f, 0f, false, true, -0.02f, 0f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(4.78f)
                arcToRelative(7.108f, 7.108f, 0f, false, true, -1.175f, -1.074f)
                curveTo(6.372f, 9.042f, 5.849f, 7.61f, 6.229f, 6.19f)
                curveToRelative(0.377f, -1.408f, 1.528f, -2.38f, 2.927f, -2.876f)
                curveToRelative(1.402f, -0.497f, 3.127f, -0.55f, 4.855f, -0.086f)
                arcTo(8.937f, 8.937f, 0f, false, true, 16.94f, 4.6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.881f, 1.215f)
                arcToRelative(7.437f, 7.437f, 0f, false, false, -2.436f, -1.14f)
                curveToRelative(-1.473f, -0.394f, -2.885f, -0.331f, -3.966f, 0.052f)
                close()
                moveToRelative(6.533f, 9.632f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.03f, 0.25f)
                curveToRelative(0.592f, 0.974f, 0.846f, 2.094f, 0.55f, 3.2f)
                curveToRelative(-0.378f, 1.408f, -1.529f, 2.38f, -2.927f, 2.876f)
                curveToRelative(-1.402f, 0.497f, -3.127f, 0.55f, -4.855f, 0.087f)
                curveToRelative(-1.712f, -0.46f, -3.168f, -1.354f, -4.134f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.134f, -0.982f)
                curveToRelative(0.746f, 0.862f, 1.93f, 1.612f, 3.388f, 2.003f)
                curveToRelative(1.473f, 0.394f, 2.884f, 0.331f, 3.966f, -0.052f)
                curveToRelative(1.085f, -0.384f, 1.766f, -1.056f, 1.978f, -1.85f)
                curveToRelative(0.169f, -0.628f, 0.046f, -1.33f, -0.381f, -2.032f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.25f, -1.03f)
                close()
            }
        }.build()
        
        return _Strikethrough!!
    }

private var _Strikethrough: ImageVector? = null

