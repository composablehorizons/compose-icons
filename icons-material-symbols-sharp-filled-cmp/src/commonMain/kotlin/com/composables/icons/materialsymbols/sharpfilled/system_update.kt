package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.System_update: ImageVector
    get() {
        if (_System_update != null) return _System_update!!
        
        _System_update = ImageVector.Builder(
            name = "system_update",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(200f, -80f)
                lineTo(320f, 480f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 62f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(166f)
                lineToRelative(64f, -62f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _System_update!!
    }

private var _System_update: ImageVector? = null

