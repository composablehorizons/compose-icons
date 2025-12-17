package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Backward: ImageVector
    get() {
        if (_Backward != null) return _Backward!!
        
        _Backward = ImageVector.Builder(
            name = "backward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.712f, 4.818f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 6.095f)
                verticalLineToRelative(2.972f)
                curveToRelative(0.104f, -0.13f, 0.234f, -0.248f, 0.389f, -0.343f)
                lineToRelative(6.323f, -3.906f)
                arcTo(1.5f, 1.5f, 0f, false, true, 19f, 6.095f)
                verticalLineToRelative(7.81f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -2.288f, 1.276f)
                lineToRelative(-6.323f, -3.905f)
                arcToRelative(1.505f, 1.505f, 0f, false, true, -0.389f, -0.344f)
                verticalLineToRelative(2.973f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -2.288f, 1.276f)
                lineToRelative(-6.323f, -3.905f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, -2.552f)
                lineToRelative(6.323f, -3.906f)
                close()
            }
        }.build()
        
        return _Backward!!
    }

private var _Backward: ImageVector? = null

