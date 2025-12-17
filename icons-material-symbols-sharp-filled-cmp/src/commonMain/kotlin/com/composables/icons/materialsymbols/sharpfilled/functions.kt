package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Functions: ImageVector
    get() {
        if (_Functions != null) return _Functions!!
        
        _Functions = ImageVector.Builder(
            name = "functions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                verticalLineToRelative(-80f)
                lineToRelative(260f, -240f)
                lineToRelative(-260f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(120f)
                horizontalLineTo(431f)
                lineToRelative(215f, 200f)
                lineToRelative(-215f, 200f)
                horizontalLineToRelative(289f)
                verticalLineToRelative(120f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Functions!!
    }

private var _Functions: ImageVector? = null

