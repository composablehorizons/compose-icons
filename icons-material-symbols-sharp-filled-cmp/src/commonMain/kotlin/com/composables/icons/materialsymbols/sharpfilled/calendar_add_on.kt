package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Calendar_add_on: ImageVector
    get() {
        if (_Calendar_add_on != null) return _Calendar_add_on!!
        
        _Calendar_add_on = ImageVector.Builder(
            name = "calendar_add_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-560f, -80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(324f)
                quadToRelative(-20f, -3f, -40f, -3f)
                reflectiveQuadToRelative(-40f, 3f)
                verticalLineToRelative(-84f)
                horizontalLineTo(200f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(280f)
                quadToRelative(0f, 20f, 3f, 40f)
                reflectiveQuadToRelative(11f, 40f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Calendar_add_on!!
    }

private var _Calendar_add_on: ImageVector? = null

