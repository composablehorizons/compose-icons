package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Agriculture: ImageVector
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
                moveTo(120f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 360f)
                horizontalLineTo(120f)
                close()
                moveToRelative(120f, 360f)
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
                moveToRelative(-540f, -60f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(180f, 600f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(240f, 540f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(300f, 600f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(240f, 660f)
                close()
                moveToRelative(560f, -139f)
                quadToRelative(26f, 5f, 43f, 13.5f)
                reflectiveQuadToRelative(37f, 27.5f)
                verticalLineToRelative(-322f)
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
                horizontalLineToRelative(-81f)
                quadToRelative(23f, 17f, 37f, 35f)
                reflectiveQuadToRelative(28f, 45f)
                horizontalLineToRelative(16f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(201f)
                close()
                moveTo(641f, 640f)
                quadToRelative(6f, -27f, 14.5f, -43.5f)
                reflectiveQuadTo(682f, 560f)
                horizontalLineTo(436f)
                quadToRelative(4f, 23f, 4f, 40f)
                reflectiveQuadToRelative(-4f, 40f)
                horizontalLineToRelative(205f)
                close()
                moveToRelative(139f, 160f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(-540f, 0f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 600f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(440f, 600f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(240f, 800f)
                close()
                moveToRelative(393f, -360f)
                close()
            }
        }.build()
        
        return _Agriculture!!
    }

private var _Agriculture: ImageVector? = null

