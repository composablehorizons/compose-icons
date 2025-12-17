package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ink_marker: ImageVector
    get() {
        if (_Ink_marker != null) return _Ink_marker!!
        
        _Ink_marker = ImageVector.Builder(
            name = "ink_marker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(272f, 856f)
                lineToRelative(-38f, -38f)
                lineToRelative(-90f, 90f)
                lineToRelative(-90f, -94f)
                lineToRelative(88f, -88f)
                lineToRelative(-38f, -40f)
                lineToRelative(583f, -583f)
                lineToRelative(170f, 170f)
                lineToRelative(-585f, 583f)
                close()
                moveToRelative(172f, -396f)
                lineTo(216f, 686f)
                lineToRelative(58f, 58f)
                lineToRelative(226f, -228f)
                lineToRelative(-56f, -56f)
                close()
            }
        }.build()
        
        return _Ink_marker!!
    }

private var _Ink_marker: ImageVector? = null

