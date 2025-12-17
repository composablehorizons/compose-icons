package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Move_to_inbox: ImageVector
    get() {
        if (_Move_to_inbox != null) return _Move_to_inbox!!
        
        _Move_to_inbox = ImageVector.Builder(
            name = "move_to_inbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -200f)
                quadToRelative(32f, 0f, 59f, -16.5f)
                reflectiveQuadToRelative(44f, -43.5f)
                quadToRelative(6f, -9f, 15f, -14.5f)
                reflectiveQuadToRelative(20f, -5.5f)
                horizontalLineToRelative(142f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(142f)
                quadToRelative(11f, 0f, 20f, 5.5f)
                reflectiveQuadToRelative(15f, 14.5f)
                quadToRelative(17f, 27f, 44f, 43.5f)
                reflectiveQuadToRelative(59f, 16.5f)
                close()
                moveToRelative(-40f, -234f)
                verticalLineToRelative(-126f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 280f)
                verticalLineToRelative(126f)
                lineToRelative(35f, -35f)
                quadToRelative(6f, -6f, 13.5f, -9f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(7.5f, 0.5f, 15f, 3.5f)
                reflectiveQuadToRelative(13.5f, 9f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(612f, 428f)
                lineTo(508f, 532f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(348f, 428f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadToRelative(-3f, -15f)
                quadToRelative(0f, -7.5f, 3f, -14.5f)
                reflectiveQuadToRelative(9f, -13f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(405f, 371f)
                lineToRelative(35f, 35f)
                close()
            }
        }.build()
        
        return _Move_to_inbox!!
    }

private var _Move_to_inbox: ImageVector? = null

