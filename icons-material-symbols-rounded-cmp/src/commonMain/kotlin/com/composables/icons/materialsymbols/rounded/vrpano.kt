package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Vrpano: ImageVector
    get() {
        if (_Vrpano != null) return _Vrpano!!
        
        _Vrpano = ImageVector.Builder(
            name = "vrpano",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(431f, 518f)
                lineToRelative(-50f, -60f)
                quadToRelative(-2f, -3f, -15f, -7f)
                quadToRelative(-5f, 0f, -8.5f, 2f)
                reflectiveQuadToRelative(-6.5f, 6f)
                lineToRelative(-99f, 119f)
                quadToRelative(-9f, 11f, -3f, 22.5f)
                reflectiveQuadToRelative(20f, 9.5f)
                quadToRelative(52f, -5f, 105f, -7.5f)
                reflectiveQuadToRelative(106f, -2.5f)
                quadToRelative(53f, 0f, 104.5f, 2.5f)
                reflectiveQuadTo(688f, 610f)
                quadToRelative(15f, 2f, 22f, -9.5f)
                reflectiveQuadToRelative(-2f, -22.5f)
                lineTo(575f, 418f)
                quadToRelative(-2f, -3f, -15f, -7f)
                quadToRelative(-5f, 0f, -8.5f, 1.5f)
                reflectiveQuadTo(545f, 418f)
                lineToRelative(-84f, 100f)
                quadToRelative(-2f, 3f, -15f, 7f)
                quadToRelative(-5f, 0f, -8.5f, -1.5f)
                reflectiveQuadTo(431f, 518f)
                close()
                moveTo(120f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 160f)
                quadToRelative(8f, 0f, 35.5f, 9.5f)
                reflectiveQuadTo(229f, 190f)
                quadToRelative(46f, 11f, 108.5f, 20.5f)
                reflectiveQuadTo(480f, 220f)
                quadToRelative(80f, 0f, 142.5f, -9.5f)
                reflectiveQuadTo(731f, 190f)
                quadToRelative(46f, -11f, 73.5f, -20.5f)
                reflectiveQuadTo(840f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(-8f, 0f, -35.5f, -9.5f)
                reflectiveQuadTo(731f, 770f)
                quadToRelative(-46f, -11f, -108.5f, -20.5f)
                reflectiveQuadTo(480f, 740f)
                quadToRelative(-80f, 0f, -142.5f, 9.5f)
                reflectiveQuadTo(229f, 770f)
                quadToRelative(-46f, 11f, -73.5f, 20.5f)
                reflectiveQuadTo(120f, 800f)
                close()
                moveToRelative(40f, -94f)
                quadToRelative(78f, -23f, 158.5f, -34.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(81f, 0f, 161.5f, 11.5f)
                reflectiveQuadTo(800f, 706f)
                verticalLineToRelative(-451f)
                quadToRelative(-78f, 23f, -158.5f, 34f)
                reflectiveQuadTo(480f, 300f)
                quadToRelative(-81f, 0f, -161.5f, -11f)
                reflectiveQuadTo(160f, 255f)
                verticalLineToRelative(451f)
                close()
                moveToRelative(320f, -226f)
                close()
            }
        }.build()
        
        return _Vrpano!!
    }

private var _Vrpano: ImageVector? = null

