package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tools_phillips: ImageVector
    get() {
        if (_Tools_phillips != null) return _Tools_phillips!!
        
        _Tools_phillips = ImageVector.Builder(
            name = "tools_phillips",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(-400f)
                lineToRelative(150f, -200f)
                horizontalLineToRelative(100f)
                lineToRelative(150f, 200f)
                verticalLineToRelative(400f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -280f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-120f)
                lineToRelative(-80f, 107f)
                verticalLineToRelative(93f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-93f)
                lineToRelative(-80f, -107f)
                verticalLineToRelative(120f)
                lineToRelative(80f, 80f)
                close()
            }
        }.build()
        
        return _Tools_phillips!!
    }

private var _Tools_phillips: ImageVector? = null

