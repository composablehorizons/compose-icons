package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Backspace: ImageVector
    get() {
        if (_Backspace != null) return _Backspace!!
        
        _Backspace = ImageVector.Builder(
            name = "backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.515f, 10.674f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, 0f, 2.652f)
                lineTo(8.89f, 19.7f)
                curveToRelative(0.352f, 0.351f, 0.829f, 0.549f, 1.326f, 0.549f)
                horizontalLineTo(19.5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(6.75f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-9.284f)
                curveToRelative(-0.497f, 0f, -0.974f, 0.198f, -1.326f, 0.55f)
                lineToRelative(-6.375f, 6.374f)
                close()
                moveTo(12.53f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineTo(13.19f, 12f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(1.72f, -1.72f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(15.31f, 12f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.72f, 1.72f)
                lineToRelative(-1.72f, -1.72f)
                close()
            }
        }.build()
        
        return _Backspace!!
    }

private var _Backspace: ImageVector? = null

