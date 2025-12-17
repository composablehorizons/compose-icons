package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.InnerShadowBottom: ImageVector
    get() {
        if (_InnerShadowBottom != null) return _InnerShadowBottom!!
        
        _InnerShadowBottom = ImageVector.Builder(
            name = "inner-shadow-bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.144f, 4.72f)
                curveToRelative(3.92f, -3.695f, 10.093f, -3.625f, 13.927f, 0.209f)
                curveToRelative(3.905f, 3.905f, 3.905f, 10.237f, 0f, 14.142f)
                curveToRelative(-3.905f, 3.905f, -10.237f, 3.905f, -14.142f, 0f)
                curveToRelative(-3.905f, -3.905f, -3.905f, -10.237f, 0f, -14.142f)
                close()
                moveToRelative(3.32f, 10.816f)
                arcToRelative(1f, 1f, 0f, true, false, -1.414f, 1.414f)
                arcToRelative(7f, 7f, 0f, false, false, 9.9f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, -1.414f)
                arcToRelative(5f, 5f, 0f, false, true, -7.072f, 0f)
                close()
            }
        }.build()
        
        return _InnerShadowBottom!!
    }

private var _InnerShadowBottom: ImageVector? = null

