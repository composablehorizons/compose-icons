package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Browser_updated: ImageVector
    get() {
        if (_Browser_updated != null) return _Browser_updated!!
        
        _Browser_updated = ImageVector.Builder(
            name = "browser_updated",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                verticalLineToRelative(-80f)
                lineToRelative(40f, -40f)
                horizontalLineTo(80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(360f, -240f)
                lineTo(400f, 400f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 103f)
                verticalLineToRelative(-327f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(327f)
                lineToRelative(104f, -103f)
                lineToRelative(56f, 56f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Browser_updated!!
    }

private var _Browser_updated: ImageVector? = null

