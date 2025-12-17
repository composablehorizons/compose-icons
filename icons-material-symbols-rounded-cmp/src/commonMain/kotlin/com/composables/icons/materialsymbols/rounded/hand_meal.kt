package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hand_meal: ImageVector
    get() {
        if (_Hand_meal != null) return _Hand_meal!!
        
        _Hand_meal = ImageVector.Builder(
            name = "hand_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(121f, 440f)
                quadToRelative(14f, -127f, 103f, -216f)
                reflectiveQuadToRelative(216f, -103f)
                verticalLineToRelative(-1f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                verticalLineToRelative(1f)
                quadToRelative(127f, 14f, 216f, 103f)
                reflectiveQuadToRelative(103f, 216f)
                horizontalLineToRelative(41f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 520f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 440f)
                horizontalLineToRelative(41f)
                close()
                moveToRelative(82f, 0f)
                horizontalLineToRelative(554f)
                quadToRelative(-14f, -103f, -92.5f, -171.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-106f, 0f, -184.5f, 68.5f)
                reflectiveQuadTo(203f, 440f)
                close()
                moveToRelative(277f, 0f)
                close()
                moveToRelative(95f, 80f)
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
                moveToRelative(0f, 360f)
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
        
        return _Hand_meal!!
    }

private var _Hand_meal: ImageVector? = null

