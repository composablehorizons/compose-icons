package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.InnerShadowRight: ImageVector
    get() {
        if (_InnerShadowRight != null) return _InnerShadowRight!!
        
        _InnerShadowRight = ImageVector.Builder(
            name = "inner-shadow-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.929f, 4.929f)
                curveToRelative(3.905f, -3.905f, 10.237f, -3.905f, 14.142f, 0f)
                curveToRelative(3.905f, 3.905f, 3.905f, 10.237f, 0f, 14.142f)
                curveToRelative(-3.905f, 3.905f, -10.237f, 3.905f, -14.142f, 0f)
                curveToRelative(-3.905f, -3.905f, -3.905f, -10.237f, 0f, -14.142f)
                close()
                moveToRelative(12.02f, 2.121f)
                arcToRelative(1f, 1f, 0f, false, false, -1.413f, 1.414f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 7.072f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 1.414f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, -9.9f)
                close()
            }
        }.build()
        
        return _InnerShadowRight!!
    }

private var _InnerShadowRight: ImageVector? = null

