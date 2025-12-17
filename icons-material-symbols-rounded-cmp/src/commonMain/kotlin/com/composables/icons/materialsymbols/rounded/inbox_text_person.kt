package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Inbox_text_person: ImageVector
    get() {
        if (_Inbox_text_person != null) return _Inbox_text_person!!
        
        _Inbox_text_person = ImageVector.Builder(
            name = "inbox_text_person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 640f)
                close()
                moveToRelative(3f, 40f)
                quadToRelative(28f, 0f, 55f, 5.5f)
                reflectiveQuadToRelative(53f, 17.5f)
                quadToRelative(20f, 9f, 34.5f, 25.5f)
                reflectiveQuadTo(880f, 767f)
                quadToRelative(0f, 14f, -9.5f, 23.5f)
                reflectiveQuadTo(847f, 800f)
                horizontalLineTo(592f)
                quadToRelative(-14f, 0f, -23f, -9.5f)
                reflectiveQuadToRelative(-9f, -23.5f)
                quadToRelative(0f, -22f, 14f, -39f)
                reflectiveQuadToRelative(34f, -25f)
                quadToRelative(27f, -11f, 56.5f, -17f)
                reflectiveQuadToRelative(58.5f, -6f)
                close()
                moveTo(200f, 840f)
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
                quadToRelative(12f, 0f, 21f, 5.5f)
                reflectiveQuadToRelative(14f, 14.5f)
                quadToRelative(11f, 17f, 24.5f, 28.5f)
                reflectiveQuadTo(432f, 628f)
                quadToRelative(11f, 5f, 17.5f, 15f)
                reflectiveQuadToRelative(6.5f, 22f)
                quadToRelative(0f, 21f, -17f, 33.5f)
                reflectiveQuadToRelative(-37f, 5.5f)
                quadToRelative(-26f, -8f, -45.5f, -26f)
                reflectiveQuadTo(320f, 640f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(216f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(456f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(416f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(253f)
                horizontalLineToRelative(-253f)
                close()
                moveToRelative(120f, -410f)
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
        
        return _Inbox_text_person!!
    }

private var _Inbox_text_person: ImageVector? = null

