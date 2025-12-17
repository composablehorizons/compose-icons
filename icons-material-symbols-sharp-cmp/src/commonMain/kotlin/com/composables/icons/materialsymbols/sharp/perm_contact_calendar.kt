package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Perm_contact_calendar: ImageVector
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
                moveTo(480f, 720f)
                quadToRelative(-56f, 0f, -107f, 17.5f)
                reflectiveQuadTo(280f, 790f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-10f)
                quadToRelative(-42f, -35f, -93f, -52.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(-280f, 34f)
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
                moveToRelative(0f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 420f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 420f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 480f)
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
                moveToRelative(360f, -460f)
                close()
                moveToRelative(0f, 380f)
                horizontalLineToRelative(200f)
                horizontalLineToRelative(-400f)
                horizontalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Perm_contact_calendar!!
    }

private var _Perm_contact_calendar: ImageVector? = null

