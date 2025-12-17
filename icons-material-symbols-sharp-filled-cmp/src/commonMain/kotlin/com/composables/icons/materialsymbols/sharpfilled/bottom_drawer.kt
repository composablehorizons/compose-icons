package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bottom_drawer: ImageVector
    get() {
        if (_Bottom_drawer != null) return _Bottom_drawer!!
        
        _Bottom_drawer = ImageVector.Builder(
            name = "bottom_drawer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -640f)
                verticalLineToRelative(330f)
                lineToRelative(50f, -50f)
                horizontalLineToRelative(460f)
                lineToRelative(50f, 50f)
                verticalLineToRelative(-330f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Bottom_drawer!!
    }

private var _Bottom_drawer: ImageVector? = null

