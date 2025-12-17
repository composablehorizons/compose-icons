package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Eye_tracking: ImageVector
    get() {
        if (_Eye_tracking != null) return _Eye_tracking!!
        
        _Eye_tracking = ImageVector.Builder(
            name = "eye_tracking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 920f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 920f)
                horizontalLineTo(720f)
                close()
                moveTo(480f, 740f)
                quadToRelative(-120f, 0f, -217.5f, -71f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(45f, -118f, 142.5f, -189f)
                reflectiveQuadTo(480f, 220f)
                quadToRelative(120f, 0f, 217.5f, 71f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(-45f, 118f, -142.5f, 189f)
                reflectiveQuadTo(480f, 740f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(88f, 0f, 161f, -48f)
                reflectiveQuadToRelative(112f, -132f)
                quadToRelative(-39f, -84f, -112f, -132f)
                reflectiveQuadToRelative(-161f, -48f)
                quadToRelative(-88f, 0f, -161f, 48f)
                reflectiveQuadTo(207f, 480f)
                quadToRelative(39f, 84f, 112f, 132f)
                reflectiveQuadToRelative(161f, 48f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 480f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 540f)
                close()
                moveTo(40f, 240f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(120f)
                horizontalLineTo(40f)
                close()
                moveToRelative(800f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Eye_tracking!!
    }

private var _Eye_tracking: ImageVector? = null

