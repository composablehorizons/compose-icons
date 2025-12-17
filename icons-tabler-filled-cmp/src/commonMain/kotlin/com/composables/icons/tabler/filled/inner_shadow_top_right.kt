package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.InnerShadowTopRight: ImageVector
    get() {
        if (_InnerShadowTopRight != null) return _InnerShadowTopRight!!
        
        _InnerShadowTopRight = ImageVector.Builder(
            name = "inner-shadow-top-right",
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
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, -7f)
                close()
            }
        }.build()
        
        return _InnerShadowTopRight!!
    }

private var _InnerShadowTopRight: ImageVector? = null

