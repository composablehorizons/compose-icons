package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Agriculture: ImageVector
    get() {
        if (_Agriculture != null) return _Agriculture!!
        
        _Agriculture = ImageVector.Builder(
            name = "agriculture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 600f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(440f, 600f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(240f, 800f)
                close()
                moveToRelative(0f, -140f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(180f, 600f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(240f, 540f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(300f, 600f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(240f, 660f)
                close()
                moveToRelative(540f, 140f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveTo(280f, 280f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 360f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                close()
                moveToRelative(-40f, 440f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(540f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(780f, 600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(720f, 660f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(780f, 720f)
                close()
                moveToRelative(-304f, -80f)
                horizontalLineToRelative(126f)
                quadToRelative(10f, -72f, 62.5f, -115f)
                reflectiveQuadTo(783f, 482f)
                quadToRelative(25f, 0f, 49.5f, 7f)
                reflectiveQuadToRelative(47.5f, 21f)
                verticalLineToRelative(-270f)
                horizontalLineTo(548f)
                lineToRelative(-42f, -44f)
                lineToRelative(56f, -56f)
                lineToRelative(-28f, -28f)
                lineToRelative(-142f, 142f)
                lineToRelative(30f, 28f)
                lineToRelative(56f, -56f)
                lineToRelative(42f, 42f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(440f, 440f)
                horizontalLineToRelative(-22f)
                quadToRelative(30f, 33f, 45.5f, 74f)
                reflectiveQuadToRelative(15.5f, 86f)
                quadToRelative(0f, 10f, -0.5f, 20f)
                reflectiveQuadToRelative(-2.5f, 20f)
                close()
            }
        }.build()
        
        return _Agriculture!!
    }

private var _Agriculture: ImageVector? = null

