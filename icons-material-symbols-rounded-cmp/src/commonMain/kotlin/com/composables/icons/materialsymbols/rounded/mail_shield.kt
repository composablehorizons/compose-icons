package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mail_shield: ImageVector
    get() {
        if (_Mail_shield != null) return _Mail_shield!!
        
        _Mail_shield = ImageVector.Builder(
            name = "mail_shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 916f)
                quadToRelative(-7f, 0f, -13.5f, -1f)
                reflectiveQuadTo(733f, 911f)
                quadToRelative(-26f, -11f, -48f, -29.5f)
                reflectiveQuadTo(646f, 840f)
                quadToRelative(-22f, -29f, -34f, -64.5f)
                reflectiveQuadTo(600f, 702f)
                verticalLineToRelative(-77f)
                quadToRelative(0f, -11f, 5.5f, -21f)
                reflectiveQuadToRelative(16.5f, -15f)
                lineToRelative(102f, -51f)
                quadToRelative(17f, -8f, 36f, -8f)
                reflectiveQuadToRelative(36f, 8f)
                lineToRelative(102f, 51f)
                quadToRelative(11f, 5f, 16.5f, 15f)
                reflectiveQuadToRelative(5.5f, 21f)
                verticalLineToRelative(77f)
                quadToRelative(0f, 38f, -12f, 73.5f)
                reflectiveQuadTo(874f, 840f)
                quadToRelative(-17f, 23f, -39f, 41.5f)
                reflectiveQuadTo(787f, 911f)
                quadToRelative(-6f, 3f, -13f, 4f)
                reflectiveQuadToRelative(-14f, 1f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(35f, -17f, 57.5f, -54f)
                reflectiveQuadToRelative(22.5f, -80f)
                verticalLineToRelative(-52f)
                lineToRelative(-80f, -40f)
                verticalLineToRelative(226f)
                close()
                moveTo(480f, 440f)
                lineToRelative(320f, -200f)
                horizontalLineTo(160f)
                lineToRelative(320f, 200f)
                close()
                moveTo(160f, 301f)
                verticalLineToRelative(28f)
                verticalLineToRelative(-9f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-280f)
                verticalLineToRelative(11f)
                verticalLineToRelative(-131f)
                verticalLineToRelative(9f)
                verticalLineToRelative(-57f)
                quadToRelative(0f, -11f, 0f, 0f)
                verticalLineToRelative(-32f)
                verticalLineToRelative(32f)
                verticalLineToRelative(-0.5f)
                verticalLineToRelative(29.5f)
                close()
                moveTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(186f)
                quadToRelative(0f, 23f, -19f, 34.5f)
                reflectiveQuadToRelative(-39f, 1.5f)
                quadToRelative(-11f, -5f, -16.5f, -15f)
                reflectiveQuadToRelative(-5.5f, -21f)
                verticalLineToRelative(-106f)
                lineTo(501f, 507f)
                quadToRelative(-10f, 6f, -21f, 6f)
                reflectiveQuadToRelative(-21f, -6f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(321f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(521f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(481f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                close()
            }
        }.build()
        
        return _Mail_shield!!
    }

private var _Mail_shield: ImageVector? = null

