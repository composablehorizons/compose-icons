package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Clipboard: ImageVector
    get() {
        if (_Clipboard != null) return _Clipboard!!
        
        _Clipboard = ImageVector.Builder(
            name = "clipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 3f)
                arcTo(1.501f, 1.501f, 0f, false, false, 9f, 4.5f)
                horizontalLineToRelative(6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.5f, 3f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(-2.693f, 0.178f)
                arcTo(3f, 3f, 0f, false, true, 10.5f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, true, 2.694f, 1.678f)
                curveToRelative(0.497f, 0.042f, 0.992f, 0.092f, 1.486f, 0.15f)
                curveToRelative(1.497f, 0.173f, 2.57f, 1.46f, 2.57f, 2.929f)
                verticalLineTo(19.5f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(6.75f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(6.257f)
                curveToRelative(0f, -1.47f, 1.073f, -2.756f, 2.57f, -2.93f)
                curveToRelative(0.493f, -0.057f, 0.989f, -0.107f, 1.487f, -0.15f)
                close()
            }
        }.build()
        
        return _Clipboard!!
    }

private var _Clipboard: ImageVector? = null

