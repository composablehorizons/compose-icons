package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Backspace: ImageVector
    get() {
        if (_Backspace != null) return _Backspace!!
        
        _Backspace = ImageVector.Builder(
            name = "backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(318f, 760f)
                lineTo(120f, 480f)
                lineToRelative(198f, -280f)
                horizontalLineToRelative(522f)
                verticalLineToRelative(560f)
                horizontalLineTo(318f)
                close()
                moveToRelative(42f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineTo(360f)
                lineTo(218f, 480f)
                lineToRelative(142f, 200f)
                close()
                moveToRelative(96f, -40f)
                lineToRelative(104f, -104f)
                lineToRelative(104f, 104f)
                lineToRelative(56f, -56f)
                lineToRelative(-104f, -104f)
                lineToRelative(104f, -104f)
                lineToRelative(-56f, -56f)
                lineToRelative(-104f, 104f)
                lineToRelative(-104f, -104f)
                lineToRelative(-56f, 56f)
                lineToRelative(104f, 104f)
                lineToRelative(-104f, 104f)
                lineToRelative(56f, 56f)
                close()
                moveToRelative(304f, 40f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Backspace!!
    }

private var _Backspace: ImageVector? = null

