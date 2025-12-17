package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Highlight: ImageVector
    get() {
        if (_Highlight != null) return _Highlight!!
        
        _Highlight = ImageVector.Builder(
            name = "highlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(226f, 320f)
                lineToRelative(-86f, -84f)
                lineToRelative(56f, -58f)
                lineToRelative(86f, 86f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(214f, -120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(296f, 120f)
                lineToRelative(-58f, -56f)
                lineToRelative(86f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-84f, 84f)
                close()
                moveTo(360f, 880f)
                verticalLineToRelative(-200f)
                lineTo(240f, 560f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(200f)
                lineTo(600f, 680f)
                verticalLineToRelative(200f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Highlight!!
    }

private var _Highlight: ImageVector? = null

