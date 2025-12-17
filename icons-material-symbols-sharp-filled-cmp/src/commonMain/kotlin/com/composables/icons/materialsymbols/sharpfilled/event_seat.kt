package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Event_seat: ImageVector
    get() {
        if (_Event_seat != null) return _Event_seat!!
        
        _Event_seat = ImageVector.Builder(
            name = "event_seat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-40f, -280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(440f)
                horizontalLineTo(280f)
                close()
                moveToRelative(440f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                horizontalLineTo(720f)
                close()
            }
        }.build()
        
        return _Event_seat!!
    }

private var _Event_seat: ImageVector? = null

