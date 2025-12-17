package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Partner_heart: ImageVector
    get() {
        if (_Partner_heart != null) return _Partner_heart!!
        
        _Partner_heart = ImageVector.Builder(
            name = "partner_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-43f, 0f, -84f, -13.5f)
                reflectiveQuadTo(320f, 748f)
                verticalLineToRelative(52f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 840f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -34f, 23.5f, -57f)
                reflectiveQuadToRelative(56.5f, -23f)
                horizontalLineToRelative(131f)
                quadToRelative(20f, 0f, 38f, 10f)
                reflectiveQuadToRelative(29f, 27f)
                quadToRelative(29f, 39f, 71.5f, 61f)
                reflectiveQuadToRelative(90.5f, 22f)
                quadToRelative(49f, 0f, 91.5f, -22f)
                reflectiveQuadToRelative(70.5f, -61f)
                quadToRelative(13f, -17f, 30.5f, -27f)
                reflectiveQuadToRelative(36.5f, -10f)
                horizontalLineToRelative(131f)
                quadToRelative(34f, 0f, 57f, 23f)
                reflectiveQuadToRelative(23f, 57f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 840f)
                horizontalLineTo(680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 800f)
                verticalLineToRelative(-51f)
                quadToRelative(-35f, 25f, -75.5f, 38f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveTo(160f, 560f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(280f, 440f)
                quadToRelative(0f, 50f, -34.5f, 85f)
                reflectiveQuadTo(160f, 560f)
                close()
                moveToRelative(640f, 0f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(920f, 440f)
                quadToRelative(0f, 50f, -34.5f, 85f)
                reflectiveQuadTo(800f, 560f)
                close()
                moveTo(480f, 126f)
                quadToRelative(19f, -21f, 45f, -33.5f)
                reflectiveQuadToRelative(54f, -12.5f)
                quadToRelative(51f, 0f, 86f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 45f, -35f, 93f)
                reflectiveQuadTo(518f, 445f)
                quadToRelative(-16f, 15f, -37.5f, 15f)
                reflectiveQuadTo(442f, 445f)
                quadTo(330f, 341f, 295f, 293f)
                reflectiveQuadToRelative(-35f, -93f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(86f, -35f)
                quadToRelative(28f, 0f, 54f, 12.5f)
                reflectiveQuadToRelative(45f, 33.5f)
                close()
            }
        }.build()
        
        return _Partner_heart!!
    }

private var _Partner_heart: ImageVector? = null

