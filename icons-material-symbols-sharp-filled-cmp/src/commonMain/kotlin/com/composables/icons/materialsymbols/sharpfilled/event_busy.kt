package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Event_busy: ImageVector
    get() {
        if (_Event_busy != null) return _Event_busy!!
        
        _Event_busy = ImageVector.Builder(
            name = "event_busy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(388f, 748f)
                lineToRelative(-56f, -56f)
                lineToRelative(92f, -92f)
                lineToRelative(-92f, -92f)
                lineToRelative(56f, -56f)
                lineToRelative(92f, 92f)
                lineToRelative(92f, -92f)
                lineToRelative(56f, 56f)
                lineToRelative(-92f, 92f)
                lineToRelative(92f, 92f)
                lineToRelative(-56f, 56f)
                lineToRelative(-92f, -92f)
                lineToRelative(-92f, 92f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Event_busy!!
    }

private var _Event_busy: ImageVector? = null

