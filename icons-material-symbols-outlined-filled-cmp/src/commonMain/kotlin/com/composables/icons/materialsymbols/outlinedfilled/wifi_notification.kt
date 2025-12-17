package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Wifi_notification: ImageVector
    get() {
        if (_Wifi_notification != null) return _Wifi_notification!!
        
        _Wifi_notification = ImageVector.Builder(
            name = "wifi_notification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(160f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -83f, 50f, -147.5f)
                reflectiveQuadTo(420f, 168f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(28f)
                quadToRelative(23f, 5f, 43.5f, 15f)
                reflectiveQuadToRelative(39.5f, 24f)
                quadToRelative(-78f, 22f, -146.5f, 64f)
                reflectiveQuadTo(354f, 373f)
                lineToRelative(306f, 307f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(534f, -160f)
                lineToRelative(-57f, -56f)
                quadToRelative(11f, -11f, 25.5f, -17.5f)
                reflectiveQuadTo(694f, 520f)
                quadToRelative(17f, 0f, 31f, 6.5f)
                reflectiveQuadToRelative(25f, 17.5f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-99f, -99f)
                lineToRelative(-43f, -43f)
                quadToRelative(27f, -27f, 63f, -42.5f)
                reflectiveQuadToRelative(78f, -15.5f)
                quadToRelative(42f, 0f, 78.5f, 15.5f)
                reflectiveQuadTo(835f, 458f)
                lineToRelative(-43f, 43f)
                quadToRelative(-19f, -20f, -44f, -30.5f)
                reflectiveQuadTo(694f, 460f)
                quadToRelative(-29f, 0f, -54.5f, 11f)
                reflectiveQuadTo(595f, 501f)
                close()
                moveToRelative(-85f, -85f)
                lineToRelative(-43f, -42f)
                quadToRelative(44f, -44f, 102.5f, -69f)
                reflectiveQuadTo(694f, 280f)
                quadToRelative(66f, 0f, 124f, 25f)
                reflectiveQuadToRelative(102f, 69f)
                lineToRelative(-43f, 42f)
                quadToRelative(-35f, -35f, -82.5f, -55.5f)
                reflectiveQuadTo(693f, 340f)
                quadToRelative(-54f, 0f, -101f, 20.5f)
                reflectiveQuadTo(510f, 416f)
                close()
            }
        }.build()
        
        return _Wifi_notification!!
    }

private var _Wifi_notification: ImageVector? = null

