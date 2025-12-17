package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mobile_screensaver: ImageVector
    get() {
        if (_Mobile_screensaver != null) return _Mobile_screensaver!!
        
        _Mobile_screensaver = ImageVector.Builder(
            name = "mobile_screensaver",
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
                moveToRelative(340f, -320f)
                quadToRelative(6f, 0f, 9f, -5.5f)
                reflectiveQuadToRelative(-1f, -10.5f)
                lineToRelative(-85f, -113f)
                quadToRelative(-3f, -4f, -8f, -4f)
                reflectiveQuadToRelative(-8f, 4f)
                lineToRelative(-67f, 89f)
                lineToRelative(-47f, -63f)
                quadToRelative(-3f, -4f, -8f, -4f)
                reflectiveQuadToRelative(-8f, 4f)
                lineToRelative(-65f, 87f)
                quadToRelative(-4f, 5f, -1f, 10.5f)
                reflectiveQuadToRelative(9f, 5.5f)
                horizontalLineToRelative(280f)
                close()
                moveToRelative(-20f, -200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 400f)
                close()
            }
        }.build()
        
        return _Mobile_screensaver!!
    }

private var _Mobile_screensaver: ImageVector? = null

