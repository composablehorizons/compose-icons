package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Perm_contact_calendar: ImageVector
    get() {
        if (_Perm_contact_calendar != null) return _Perm_contact_calendar!!
        
        _Perm_contact_calendar = ImageVector.Builder(
            name = "perm_contact_calendar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 754f)
                quadToRelative(54f, -53f, 125.5f, -83.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(83f, 0f, 154.5f, 30.5f)
                reflectiveQuadTo(760f, 754f)
                verticalLineToRelative(-514f)
                horizontalLineTo(200f)
                verticalLineToRelative(514f)
                close()
                moveToRelative(280f, -194f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
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
            }
        }.build()
        
        return _Perm_contact_calendar!!
    }

private var _Perm_contact_calendar: ImageVector? = null

