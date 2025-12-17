package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hand_package: ImageVector
    get() {
        if (_Hand_package != null) return _Hand_package!!
        
        _Hand_package = ImageVector.Builder(
            name = "hand_package",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 160f)
                horizontalLineTo(360f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-280f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineTo(680f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-280f)
                close()
                moveTo(575f, 520f)
                horizontalLineTo(320f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(222f)
                quadToRelative(21f, 0f, 40.5f, -7f)
                reflectiveQuadToRelative(35.5f, -21f)
                lineToRelative(166f, -137f)
                quadToRelative(-8f, -8f, -18f, -12f)
                reflectiveQuadToRelative(-21f, -6f)
                quadToRelative(-17f, -3f, -33f, 1f)
                reflectiveQuadToRelative(-30f, 15f)
                lineToRelative(-86f, 69f)
                quadToRelative(-11f, 8f, -23.5f, 13f)
                reflectiveQuadToRelative(-26.5f, 5f)
                horizontalLineTo(440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 600f)
                horizontalLineToRelative(106f)
                lineToRelative(44f, -36f)
                quadToRelative(5f, -3f, 7.5f, -8f)
                reflectiveQuadToRelative(2.5f, -11f)
                quadToRelative(0f, -10f, -7.5f, -17.5f)
                reflectiveQuadTo(575f, 520f)
                close()
                moveToRelative(-335f, 0f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                close()
                moveToRelative(40f, 0f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 520f)
                horizontalLineTo(280f)
                close()
                moveTo(240f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 440f)
                horizontalLineToRelative(415f)
                quadToRelative(85f, 0f, 164f, 29f)
                reflectiveQuadToRelative(127f, 98f)
                quadToRelative(11f, 17f, 8f, 37.5f)
                reflectiveQuadTo(855f, 639f)
                lineTo(670f, 794f)
                quadToRelative(-27f, 23f, -60f, 34.5f)
                reflectiveQuadTo(542f, 840f)
                horizontalLineTo(309f)
                quadToRelative(-11f, 18f, -29f, 29f)
                reflectiveQuadToRelative(-40f, 11f)
                close()
            }
        }.build()
        
        return _Hand_package!!
    }

private var _Hand_package: ImageVector? = null

