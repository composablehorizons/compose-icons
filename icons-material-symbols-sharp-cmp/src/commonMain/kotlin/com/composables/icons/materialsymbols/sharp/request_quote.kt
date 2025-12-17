package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Request_quote: ImageVector
    get() {
        if (_Request_quote != null) return _Request_quote!!
        
        _Request_quote = ImageVector.Builder(
            name = "request_quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 760f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(440f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(40f)
                horizontalLineTo(360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(440f)
                lineToRelative(200f, 200f)
                verticalLineToRelative(600f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(0f, -640f)
                verticalLineToRelative(160f)
                verticalLineToRelative(-160f)
                verticalLineToRelative(640f)
                verticalLineToRelative(-640f)
                close()
            }
        }.build()
        
        return _Request_quote!!
    }

private var _Request_quote: ImageVector? = null

