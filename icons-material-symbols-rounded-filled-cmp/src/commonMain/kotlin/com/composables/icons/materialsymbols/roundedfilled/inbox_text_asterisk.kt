package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Inbox_text_asterisk: ImageVector
    get() {
        if (_Inbox_text_asterisk != null) return _Inbox_text_asterisk!!
        
        _Inbox_text_asterisk = ImageVector.Builder(
            name = "inbox_text_asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 748f)
                lineToRelative(-38f, 53f)
                quadToRelative(-10f, 14f, -26f, 16f)
                reflectiveQuadToRelative(-30f, -8f)
                quadToRelative(-14f, -10f, -16.5f, -25.5f)
                reflectiveQuadTo(617f, 754f)
                lineToRelative(38f, -53f)
                lineToRelative(-62f, -20f)
                quadToRelative(-16f, -5f, -23f, -19.5f)
                reflectiveQuadToRelative(-2f, -30.5f)
                quadToRelative(5f, -16f, 19.5f, -23.5f)
                reflectiveQuadTo(618f, 605f)
                lineToRelative(62f, 20f)
                verticalLineToRelative(-65f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 560f)
                verticalLineToRelative(65f)
                lineToRelative(62f, -20f)
                quadToRelative(16f, -5f, 30.5f, 2.5f)
                reflectiveQuadTo(872f, 631f)
                quadToRelative(5f, 16f, -2.5f, 30.5f)
                reflectiveQuadTo(846f, 681f)
                lineToRelative(-61f, 20f)
                lineToRelative(38f, 53f)
                quadToRelative(10f, 14f, 7.5f, 29.5f)
                reflectiveQuadTo(814f, 809f)
                quadToRelative(-14f, 10f, -30f, 8f)
                reflectiveQuadToRelative(-26f, -16f)
                lineToRelative(-38f, -53f)
                close()
                moveToRelative(-520f, 92f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(161f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 360f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(142f)
                quadToRelative(11f, 0f, 20.5f, 5.5f)
                reflectiveQuadTo(377f, 580f)
                quadToRelative(9f, 15f, 21.5f, 27.5f)
                reflectiveQuadTo(427f, 628f)
                quadToRelative(8f, 4f, 12f, 11.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                quadToRelative(-3f, 32f, 1f, 63.5f)
                reflectiveQuadToRelative(15f, 61.5f)
                quadToRelative(8f, 22f, -2f, 41f)
                reflectiveQuadToRelative(-30f, 19f)
                horizontalLineTo(200f)
                close()
                moveToRelative(120f, -490f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 310f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 270f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 310f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 350f)
                close()
                moveToRelative(0f, 140f)
                horizontalLineToRelative(224f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(584f, 450f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(544f, 410f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 450f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 490f)
                close()
            }
        }.build()
        
        return _Inbox_text_asterisk!!
    }

private var _Inbox_text_asterisk: ImageVector? = null

