package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Notification_settings: ImageVector
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
                moveTo(160f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -84f, 50.5f, -149f)
                reflectiveQuadTo(422f, 167f)
                quadToRelative(-11f, 26f, -17f, 55f)
                reflectiveQuadToRelative(-6f, 58f)
                quadToRelative(0f, 65f, 26f, 119.5f)
                reflectiveQuadToRelative(71f, 92.5f)
                quadToRelative(45f, 38f, 102.5f, 56.5f)
                reflectiveQuadTo(720f, 558f)
                verticalLineToRelative(122f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(480f, -280f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(584f, 396f)
                lineToRelative(-58f, 18f)
                lineToRelative(-40f, -68f)
                lineToRelative(46f, -40f)
                quadToRelative(-2f, -13f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-46f, -40f)
                lineToRelative(40f, -68f)
                lineToRelative(58f, 18f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(628f, 140f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 22.5f, 10.5f)
                reflectiveQuadTo(776f, 164f)
                lineToRelative(58f, -18f)
                lineToRelative(40f, 68f)
                lineToRelative(-46f, 40f)
                quadToRelative(2f, 13f, 2f, 26f)
                reflectiveQuadToRelative(-2f, 26f)
                lineToRelative(46f, 40f)
                lineToRelative(-40f, 68f)
                lineToRelative(-58f, -18f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(732f, 420f)
                lineToRelative(-12f, 60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -120f)
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

