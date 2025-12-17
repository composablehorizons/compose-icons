package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Scanner: ImageVector
    get() {
        if (_Scanner != null) return _Scanner!!
        
        _Scanner = ImageVector.Builder(
            name = "scanner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(704f, 480f)
                lineTo(140f, 276f)
                lineToRelative(28f, -76f)
                lineToRelative(672f, 246f)
                verticalLineToRelative(354f)
                horizontalLineTo(120f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(584f)
                close()
                moveTo(400f, 680f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Scanner!!
    }

private var _Scanner: ImageVector? = null

