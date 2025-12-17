package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Print_connect: ImageVector
    get() {
        if (_Print_connect != null) return _Print_connect!!
        
        _Print_connect = ImageVector.Builder(
            name = "print_connect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(718f, 694f)
                lineToRelative(113f, -113f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(887f, 638f)
                lineTo(746f, 779f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-57f, -57f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(12f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(29f, 28f)
                close()
                moveTo(320f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                horizontalLineToRelative(560f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(880f, 440f)
                quadToRelative(0f, 11f, -8.5f, 16.5f)
                reflectiveQuadToRelative(-18.5f, 0.5f)
                quadToRelative(-21f, -8f, -44f, -12.5f)
                reflectiveQuadToRelative(-46f, -4.5f)
                quadToRelative(-72f, 0f, -132f, 38f)
                reflectiveQuadToRelative(-92f, 102f)
                quadToRelative(-5f, 9f, -13f, 14.5f)
                reflectiveQuadToRelative(-18f, 5.5f)
                horizontalLineTo(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(204f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(564f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(524f, 840f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-40f, -560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 240f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 120f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 200f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 280f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Print_connect!!
    }

private var _Print_connect: ImageVector? = null

