package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Backspace: ImageVector
    get() {
        if (_Backspace != null) return _Backspace!!
        
        _Backspace = ImageVector.Builder(
            name = "backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.22f, 3.22f)
                arcTo(0.75f, 0.75f, 0f, false, true, 7.75f, 3f)
                horizontalLineToRelative(9f)
                arcTo(2.25f, 2.25f, 0f, false, true, 19f, 5.25f)
                verticalLineToRelative(9.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 16.75f, 17f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.53f, -0.22f)
                lineTo(0.97f, 10.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(6.25f, -6.25f)
                close()
                moveToRelative(3.06f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineTo(10.94f, 10f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineTo(12f, 11.06f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(13.06f, 10f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(12f, 8.94f)
                lineToRelative(-1.72f, -1.72f)
                close()
            }
        }.build()
        
        return _Backspace!!
    }

private var _Backspace: ImageVector? = null

