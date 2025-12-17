package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.InnerShadowTopLeft: ImageVector
    get() {
        if (_InnerShadowTopLeft != null) return _InnerShadowTopLeft!!
        
        _InnerShadowTopLeft = ImageVector.Builder(
            name = "inner-shadow-top-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
                reflectiveCurveToRelative(4.477f, -10f, 10f, -10f)
                close()
                moveToRelative(0f, 3f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, -5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                close()
            }
        }.build()
        
        return _InnerShadowTopLeft!!
    }

private var _InnerShadowTopLeft: ImageVector? = null

