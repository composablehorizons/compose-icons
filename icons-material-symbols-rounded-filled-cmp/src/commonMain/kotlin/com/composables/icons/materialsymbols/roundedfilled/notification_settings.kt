package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Notification_settings: ImageVector
    get() {
        if (_Notification_settings != null) return _Notification_settings!!
        
        _Notification_settings = ImageVector.Builder(
            name = "notification_settings",
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
                moveTo(200f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 680f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -58f, 25f, -108f)
                reflectiveQuadToRelative(69f, -83f)
                quadToRelative(22f, -17f, 46f, -3.5f)
                reflectiveQuadToRelative(21f, 47.5f)
                quadToRelative(-1f, 6f, -1f, 13.5f)
                verticalLineToRelative(13.5f)
                quadToRelative(0f, 118f, 81.5f, 199.5f)
                reflectiveQuadTo(680f, 561f)
                quadToRelative(17f, 0f, 28.5f, 10.5f)
                reflectiveQuadTo(720f, 598f)
                verticalLineToRelative(82f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(200f)
                close()
                moveToRelative(472f, -280f)
                quadToRelative(-14f, 0f, -24.5f, -9f)
                reflectiveQuadTo(634f, 448f)
                lineToRelative(-6f, -28f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(584f, 396f)
                lineToRelative(-29f, 9f)
                quadToRelative(-13f, 4f, -25.5f, -1f)
                reflectiveQuadTo(510f, 388f)
                lineToRelative(-8f, -14f)
                quadToRelative(-7f, -12f, -5f, -26f)
                reflectiveQuadToRelative(13f, -23f)
                lineToRelative(22f, -19f)
                quadToRelative(-2f, -13f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-22f, -19f)
                quadToRelative(-11f, -9f, -13f, -22.5f)
                reflectiveQuadToRelative(5f, -25.5f)
                lineToRelative(9f, -15f)
                quadToRelative(7f, -11f, 19f, -16f)
                reflectiveQuadToRelative(25f, -1f)
                lineToRelative(29f, 9f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(628f, 140f)
                lineToRelative(6f, -29f)
                quadToRelative(3f, -14f, 13.5f, -22.5f)
                reflectiveQuadTo(672f, 80f)
                horizontalLineToRelative(16f)
                quadToRelative(14f, 0f, 24.5f, 9f)
                reflectiveQuadToRelative(13.5f, 23f)
                lineToRelative(6f, 28f)
                quadToRelative(12f, 5f, 22.5f, 10.5f)
                reflectiveQuadTo(776f, 164f)
                lineToRelative(29f, -9f)
                quadToRelative(13f, -4f, 25.5f, 1f)
                reflectiveQuadToRelative(19.5f, 16f)
                lineToRelative(8f, 14f)
                quadToRelative(7f, 12f, 5f, 26f)
                reflectiveQuadToRelative(-13f, 23f)
                lineToRelative(-22f, 19f)
                quadToRelative(2f, 13f, 2f, 26f)
                reflectiveQuadToRelative(-2f, 26f)
                lineToRelative(22f, 19f)
                quadToRelative(11f, 9f, 13f, 22.5f)
                reflectiveQuadToRelative(-5f, 25.5f)
                lineToRelative(-9f, 15f)
                quadToRelative(-7f, 11f, -19f, 16f)
                reflectiveQuadToRelative(-25f, 1f)
                lineToRelative(-29f, -9f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(732f, 420f)
                lineToRelative(-6f, 29f)
                quadToRelative(-3f, 14f, -13.5f, 22.5f)
                reflectiveQuadTo(688f, 480f)
                horizontalLineToRelative(-16f)
                close()
                moveToRelative(8f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 280f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 200f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(680f, 360f)
                close()
            }
        }.build()
        
        return _Notification_settings!!
    }

private var _Notification_settings: ImageVector? = null

