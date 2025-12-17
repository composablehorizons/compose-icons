package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Mobile_question: ImageVector
    get() {
        if (_Mobile_question != null) return _Mobile_question!!
        
        _Mobile_question = ImageVector.Builder(
            name = "mobile_question",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(404f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-720f)
                horizontalLineTo(280f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-720f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(200f, -160f)
                quadToRelative(17f, 0f, 29.5f, -12.5f)
                reflectiveQuadTo(522f, 638f)
                quadToRelative(0f, -17f, -12.5f, -29.5f)
                reflectiveQuadTo(480f, 596f)
                quadToRelative(-17f, 0f, -29.5f, 12.5f)
                reflectiveQuadTo(438f, 638f)
                quadToRelative(0f, 17f, 12.5f, 29.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-30f, -128f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, -32f, 6f, -44f)
                reflectiveQuadToRelative(36f, -42f)
                quadToRelative(18f, -18f, 30f, -39f)
                reflectiveQuadToRelative(12f, -45f)
                quadToRelative(0f, -51f, -33.5f, -76.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-44f, 0f, -73f, 24.5f)
                reflectiveQuadTo(366f, 364f)
                lineToRelative(54f, 22f)
                quadToRelative(5f, -17f, 19f, -32.5f)
                reflectiveQuadToRelative(41f, -15.5f)
                quadToRelative(27f, 0f, 40.5f, 14f)
                reflectiveQuadToRelative(13.5f, 32f)
                quadToRelative(0f, 17f, -10f, 30.5f)
                reflectiveQuadTo(500f, 442f)
                quadToRelative(-35f, 30f, -42.5f, 47f)
                reflectiveQuadToRelative(-7.5f, 63f)
                close()
            }
        }.build()
        
        return _Mobile_question!!
    }

private var _Mobile_question: ImageVector? = null

