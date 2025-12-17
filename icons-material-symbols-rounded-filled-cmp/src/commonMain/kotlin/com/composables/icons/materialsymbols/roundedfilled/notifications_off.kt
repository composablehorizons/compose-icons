package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Notifications_off: ImageVector
    get() {
        if (_Notifications_off != null) return _Notifications_off!!
        
        _Notifications_off = ImageVector.Builder(
            name = "notifications_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(646f, 760f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 680f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 8.5f, -65f)
                reflectiveQuadToRelative(25.5f, -61f)
                lineToRelative(126f, 126f)
                horizontalLineTo(288f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(820f, 876f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(646f, 760f)
                close()
                moveToRelative(74f, -251f)
                quadToRelative(0f, 12f, -7f, 22f)
                reflectiveQuadToRelative(-18f, 15f)
                quadToRelative(-11f, 5f, -23f, 2.5f)
                reflectiveQuadTo(652f, 538f)
                lineTo(367f, 253f)
                quadToRelative(-7f, -7f, -10f, -15f)
                reflectiveQuadToRelative(-3f, -17f)
                quadToRelative(0f, -11f, 5.5f, -21.5f)
                reflectiveQuadTo(375f, 184f)
                quadToRelative(11f, -5f, 22f, -9f)
                reflectiveQuadToRelative(23f, -7f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(28f)
                quadToRelative(80f, 20f, 130f, 85f)
                reflectiveQuadToRelative(50f, 147f)
                verticalLineToRelative(109f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-30f, 0f, -53.5f, -16.5f)
                reflectiveQuadTo(403f, 819f)
                quadToRelative(0f, -8f, 6.5f, -13.5f)
                reflectiveQuadTo(424f, 800f)
                horizontalLineToRelative(112f)
                quadToRelative(8f, 0f, 14.5f, 5.5f)
                reflectiveQuadTo(557f, 819f)
                quadToRelative(0f, 28f, -23.5f, 44.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Notifications_off!!
    }

private var _Notifications_off: ImageVector? = null

