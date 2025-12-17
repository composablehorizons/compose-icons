package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Balance: ImageVector
    get() {
        if (_Balance != null) return _Balance!!
        
        _Balance = ImageVector.Builder(
            name = "balance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 760f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-447f)
                quadToRelative(-26f, -9f, -45f, -28f)
                reflectiveQuadToRelative(-28f, -45f)
                horizontalLineTo(240f)
                lineToRelative(110f, 258f)
                quadToRelative(5f, 11f, 6f, 22.5f)
                reflectiveQuadToRelative(-1f, 23.5f)
                quadToRelative(-9f, 46f, -49.5f, 71f)
                reflectiveQuadTo(220f, 640f)
                quadToRelative(-45f, 0f, -85.5f, -25f)
                reflectiveQuadTo(85f, 544f)
                quadToRelative(-2f, -12f, -1f, -23.5f)
                reflectiveQuadToRelative(6f, -22.5f)
                lineToRelative(110f, -258f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(207f)
                quadToRelative(12f, -35f, 43f, -57.5f)
                reflectiveQuadToRelative(70f, -22.5f)
                quadToRelative(39f, 0f, 70f, 22.5f)
                reflectiveQuadToRelative(43f, 57.5f)
                horizontalLineToRelative(207f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 240f)
                horizontalLineToRelative(-40f)
                lineToRelative(110f, 258f)
                quadToRelative(5f, 11f, 6f, 22.5f)
                reflectiveQuadToRelative(-1f, 23.5f)
                quadToRelative(-9f, 46f, -49.5f, 71f)
                reflectiveQuadTo(740f, 640f)
                quadToRelative(-45f, 0f, -85.5f, -25f)
                reflectiveQuadTo(605f, 544f)
                quadToRelative(-2f, -12f, -1f, -23.5f)
                reflectiveQuadToRelative(6f, -22.5f)
                lineToRelative(110f, -258f)
                horizontalLineTo(593f)
                quadToRelative(-9f, 26f, -28f, 45f)
                reflectiveQuadToRelative(-45f, 28f)
                verticalLineToRelative(447f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(545f, -320f)
                horizontalLineToRelative(150f)
                lineToRelative(-75f, -174f)
                lineToRelative(-75f, 174f)
                close()
                moveToRelative(-520f, 0f)
                horizontalLineToRelative(150f)
                lineToRelative(-75f, -174f)
                lineToRelative(-75f, 174f)
                close()
                moveToRelative(335f, -280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Balance!!
    }

private var _Balance: ImageVector? = null

