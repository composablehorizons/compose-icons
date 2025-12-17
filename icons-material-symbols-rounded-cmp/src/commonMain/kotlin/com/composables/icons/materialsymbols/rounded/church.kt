package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Church: ImageVector
    get() {
        if (_Church != null) return _Church!!
        
        _Church = ImageVector.Builder(
            name = "church",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-188f)
                quadToRelative(0f, -24f, 13f, -43.5f)
                reflectiveQuadToRelative(35f, -29.5f)
                lineToRelative(112f, -50f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -23f, 12f, -41.5f)
                reflectiveQuadToRelative(32f, -29.5f)
                lineToRelative(156f, -78f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 200f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(60f)
                lineToRelative(156f, 78f)
                quadToRelative(20f, 11f, 32f, 29.5f)
                reflectiveQuadToRelative(12f, 41.5f)
                verticalLineToRelative(80f)
                lineToRelative(112f, 50f)
                quadToRelative(22f, 10f, 35f, 29.5f)
                reflectiveQuadToRelative(13f, 43.5f)
                verticalLineToRelative(188f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 720f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-82f)
                quadToRelative(0f, -51f, 35f, -86.5f)
                reflectiveQuadToRelative(85f, -35.5f)
                quadToRelative(50f, 0f, 85f, 35.5f)
                reflectiveQuadToRelative(35f, 86.5f)
                verticalLineToRelative(82f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-192f)
                lineToRelative(-160f, -72f)
                verticalLineToRelative(-134f)
                lineToRelative(-160f, -82f)
                lineToRelative(-160f, 82f)
                verticalLineToRelative(134f)
                lineToRelative(-160f, 72f)
                verticalLineToRelative(192f)
                close()
                moveToRelative(320f, -260f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 480f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 540f)
                close()
                moveToRelative(0f, 20f)
                close()
            }
        }.build()
        
        return _Church!!
    }

private var _Church: ImageVector? = null

