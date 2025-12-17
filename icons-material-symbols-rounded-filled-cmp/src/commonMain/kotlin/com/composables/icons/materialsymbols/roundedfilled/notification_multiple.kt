package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Notification_multiple: ImageVector
    get() {
        if (_Notification_multiple != null) return _Notification_multiple!!
        
        _Notification_multiple = ImageVector.Builder(
            name = "notification_multiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 800f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(120f, 320f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 640f)
                verticalLineToRelative(-340f)
                quadToRelative(0f, -21f, 9.5f, -40f)
                reflectiveQuadToRelative(28.5f, -30f)
                lineToRelative(261f, -154f)
                quadToRelative(14f, -8f, 30.5f, -4f)
                reflectiveQuadToRelative(24.5f, 18f)
                quadToRelative(9f, 14f, 4.5f, 31f)
                reflectiveQuadTo(540f, 146f)
                lineTo(288f, 294f)
                lineToRelative(272f, 160f)
                lineToRelative(270f, -160f)
                quadToRelative(15f, -9f, 30.5f, -8.5f)
                reflectiveQuadTo(890f, 294f)
                quadToRelative(14f, 8f, 22f, 21.5f)
                reflectiveQuadToRelative(8f, 30.5f)
                verticalLineToRelative(294f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 720f)
                horizontalLineTo(280f)
                close()
                moveToRelative(274f, -432f)
                lineToRelative(114f, -114f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(582f, 372f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-56f, -56f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(28f, 28f)
                close()
            }
        }.build()
        
        return _Notification_multiple!!
    }

private var _Notification_multiple: ImageVector? = null

