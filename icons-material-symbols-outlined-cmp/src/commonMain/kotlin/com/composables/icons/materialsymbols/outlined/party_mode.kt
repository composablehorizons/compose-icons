package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Party_mode: ImageVector
    get() {
        if (_Party_mode != null) return _Party_mode!!
        
        _Party_mode = ImageVector.Builder(
            name = "party_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 700f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(660f, 520f)
                quadToRelative(0f, -5f, -0.5f, -10f)
                reflectiveQuadToRelative(-1.5f, -10f)
                horizontalLineToRelative(-80f)
                quadToRelative(2f, 5f, 2f, 10f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                horizontalLineTo(330f)
                quadToRelative(24f, 36f, 63.5f, 58f)
                reflectiveQuadToRelative(86.5f, 22f)
                close()
                moveTo(302f, 540f)
                horizontalLineToRelative(80f)
                quadToRelative(-2f, -5f, -2f, -10f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                horizontalLineToRelative(150f)
                quadToRelative(-24f, -36f, -63.5f, -58f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(0f, 5f, 0.5f, 10f)
                reflectiveQuadToRelative(1.5f, 10f)
                close()
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(126f)
                lineToRelative(74f, -80f)
                horizontalLineToRelative(240f)
                lineToRelative(74f, 80f)
                horizontalLineToRelative(126f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(638f)
                lineToRelative(-73f, -80f)
                horizontalLineTo(395f)
                lineToRelative(-73f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(320f, -240f)
                close()
            }
        }.build()
        
        return _Party_mode!!
    }

private var _Party_mode: ImageVector? = null

