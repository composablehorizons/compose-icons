package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tab_close: ImageVector
    get() {
        if (_Tab_close != null) return _Tab_close!!
        
        _Tab_close = ImageVector.Builder(
            name = "tab_close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(476f, 540f)
                lineToRelative(84f, -84f)
                lineToRelative(84f, 84f)
                lineToRelative(56f, -56f)
                lineToRelative(-84f, -84f)
                lineToRelative(84f, -84f)
                lineToRelative(-56f, -56f)
                lineToRelative(-84f, 84f)
                lineToRelative(-84f, -84f)
                lineToRelative(-56f, 56f)
                lineToRelative(84f, 84f)
                lineToRelative(-84f, 84f)
                lineToRelative(56f, 56f)
                close()
                moveTo(240f, 720f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Tab_close!!
    }

private var _Tab_close: ImageVector? = null

