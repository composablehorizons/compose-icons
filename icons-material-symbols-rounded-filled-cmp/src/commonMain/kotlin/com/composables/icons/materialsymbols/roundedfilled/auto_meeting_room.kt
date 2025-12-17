package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Auto_meeting_room: ImageVector
    get() {
        if (_Auto_meeting_room != null) return _Auto_meeting_room!!
        
        _Auto_meeting_room = ImageVector.Builder(
            name = "auto_meeting_room",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 856f)
                verticalLineTo(296f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 216f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 256f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 336f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 576f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 536f)
                verticalLineTo(336f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 936f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 896f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 856f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(240f, -240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 576f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 536f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 576f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 616f)
                close()
                moveToRelative(350f, 250f)
                lineToRelative(32f, 70f)
                quadToRelative(5f, 12f, 18f, 12f)
                reflectiveQuadToRelative(18f, -12f)
                lineToRelative(32f, -70f)
                lineToRelative(70f, -32f)
                quadToRelative(12f, -5f, 12f, -18f)
                reflectiveQuadToRelative(-12f, -18f)
                lineToRelative(-70f, -32f)
                lineToRelative(-32f, -70f)
                quadToRelative(-5f, -12f, -18f, -12f)
                reflectiveQuadToRelative(-18f, 12f)
                lineToRelative(-32f, 70f)
                lineToRelative(-70f, 32f)
                quadToRelative(-12f, 5f, -12f, 18f)
                reflectiveQuadToRelative(12f, 18f)
                lineToRelative(70f, 32f)
                close()
            }
        }.build()
        
        return _Auto_meeting_room!!
    }

private var _Auto_meeting_room: ImageVector? = null

