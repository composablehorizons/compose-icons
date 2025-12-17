package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mail_shield: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(186f)
                quadToRelative(0f, 23f, -19f, 34.5f)
                reflectiveQuadToRelative(-39f, 1.5f)
                lineToRelative(-26f, -14f)
                quadToRelative(-17f, -8f, -36f, -8f)
                reflectiveQuadToRelative(-36f, 8f)
                lineToRelative(-160f, 80f)
                quadToRelative(-20f, 11f, -32f, 30f)
                reflectiveQuadToRelative(-12f, 42f)
                verticalLineToRelative(102f)
                quadToRelative(0f, 14f, 1.5f, 26.5f)
                reflectiveQuadTo(525f, 754f)
                quadToRelative(3f, 18f, -8f, 32f)
                reflectiveQuadToRelative(-28f, 14f)
                horizontalLineTo(160f)
                close()
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
                lineTo(212f, 272f)
                quadToRelative(-17f, -11f, -34.5f, -1f)
                reflectiveQuadTo(160f, 301f)
                quadToRelative(0f, 9f, 4f, 16.5f)
                reflectiveQuadToRelative(12f, 12.5f)
                lineToRelative(283f, 177f)
                quadToRelative(10f, 6f, 21f, 6f)
                reflectiveQuadToRelative(21f, -6f)
                lineToRelative(283f, -177f)
                quadToRelative(8f, -5f, 12f, -12.5f)
                reflectiveQuadToRelative(4f, -16.5f)
                quadToRelative(0f, -20f, -17.5f, -30f)
                reflectiveQuadToRelative(-34.5f, 1f)
                lineTo(480f, 440f)
                close()
            }
        }.build()
        
        return _Mail_shield!!
    }

private var _Mail_shield: ImageVector? = null

