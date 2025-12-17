package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.No_meeting_room: ImageVector
    get() {
        if (_No_meeting_room != null) return _No_meeting_room!!
        
        _No_meeting_room = ImageVector.Builder(
            name = "no_meeting_room",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 646f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-326f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(246f)
                lineTo(234f, 120f)
                horizontalLineToRelative(326f)
                quadToRelative(16f, 0f, 22.5f, 14.5f)
                reflectiveQuadTo(600f, 160f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(446f)
                close()
                moveToRelative(4f, 230f)
                lineTo(600f, 712f)
                verticalLineToRelative(88f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 760f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-448f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _No_meeting_room!!
    }

private var _No_meeting_room: ImageVector? = null

