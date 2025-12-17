package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Flame: ImageVector
    get() {
        if (_Flame != null) return _Flame!!
        
        _Flame = ImageVector.Builder(
            name = "flame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                curveToRelative(0f, -0.88f, 1.056f, -1.331f, 1.692f, -0.722f)
                curveToRelative(1.958f, 1.876f, 3.096f, 5.995f, 1.75f, 9.12f)
                lineToRelative(-0.08f, 0.174f)
                lineToRelative(0.012f, 0.003f)
                curveToRelative(0.625f, 0.133f, 1.203f, -0.43f, 2.303f, -2.173f)
                lineToRelative(0.14f, -0.224f)
                arcToRelative(1f, 1f, 0f, false, true, 1.582f, -0.153f)
                curveToRelative(1.334f, 1.435f, 2.601f, 4.377f, 2.601f, 6.27f)
                curveToRelative(0f, 4.265f, -3.591f, 7.705f, -8f, 7.705f)
                reflectiveCurveToRelative(-8f, -3.44f, -8f, -7.706f)
                curveToRelative(0f, -2.252f, 1.022f, -4.716f, 2.632f, -6.301f)
                lineToRelative(0.605f, -0.589f)
                curveToRelative(0.241f, -0.236f, 0.434f, -0.43f, 0.618f, -0.624f)
                curveToRelative(1.43f, -1.512f, 2.145f, -2.924f, 2.145f, -4.78f)
            }
        }.build()
        
        return _Flame!!
    }

private var _Flame: ImageVector? = null

