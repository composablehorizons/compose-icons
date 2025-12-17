package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Agriculture: ImageVector
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
                moveTo(160f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 360f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, 360f)
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
                verticalLineToRelative(-190f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(800f, 240f)
                horizontalLineTo(548f)
                lineToRelative(-42f, -44f)
                lineToRelative(42f, -42f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineTo(407f, 239f)
                quadToRelative(-6f, 6f, -5.5f, 14.5f)
                reflectiveQuadTo(408f, 268f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                lineToRelative(42f, -42f)
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

