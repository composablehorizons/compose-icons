package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Open_in_browser: ImageVector
    get() {
        if (_Open_in_browser != null) return _Open_in_browser!!
        
        _Open_in_browser = ImageVector.Builder(
            name = "open_in_browser",
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
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-480f)
                horizontalLineTo(200f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-246f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -58f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 58f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(246f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Open_in_browser!!
    }

private var _Open_in_browser: ImageVector? = null

