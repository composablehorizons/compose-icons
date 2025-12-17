package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Partner_heart: ImageVector
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
                moveTo(40f, 840f)
                verticalLineToRelative(-160f)
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
                verticalLineToRelative(160f)
                horizontalLineTo(640f)
                verticalLineToRelative(-91f)
                quadToRelative(-35f, 25f, -75.5f, 38f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(-43f, 0f, -84f, -13.5f)
                reflectiveQuadTo(320f, 748f)
                verticalLineToRelative(92f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -280f)
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
                moveToRelative(-320f, -80f)
                quadToRelative(-68f, -62f, -111f, -104.5f)
                reflectiveQuadTo(302f, 302f)
                quadToRelative(-24f, -31f, -33f, -54.5f)
                reflectiveQuadToRelative(-9f, -47.5f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(86f, -35f)
                quadToRelative(28f, 0f, 54f, 12.5f)
                reflectiveQuadToRelative(45f, 33.5f)
                quadToRelative(19f, -21f, 45f, -33.5f)
                reflectiveQuadToRelative(54f, -12.5f)
                quadToRelative(51f, 0f, 86f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 24f, -9f, 47.5f)
                reflectiveQuadTo(658f, 302f)
                quadToRelative(-24f, 31f, -67f, 73.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(0f, -108f)
                quadToRelative(72f, -66f, 106f, -107.5f)
                reflectiveQuadToRelative(34f, -64.5f)
                quadToRelative(0f, -17f, -12f, -28.5f)
                reflectiveQuadTo(579f, 160f)
                quadToRelative(-12f, 0f, -23.5f, 7f)
                reflectiveQuadTo(532f, 188f)
                lineToRelative(-51f, 59f)
                lineToRelative(-51f, -57f)
                quadToRelative(-14f, -16f, -25.5f, -23f)
                reflectiveQuadToRelative(-23.5f, -7f)
                quadToRelative(-17f, 0f, -29f, 11.5f)
                reflectiveQuadTo(340f, 200f)
                quadToRelative(0f, 23f, 34f, 64.5f)
                reflectiveQuadTo(480f, 372f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Partner_heart!!
    }

private var _Partner_heart: ImageVector? = null

