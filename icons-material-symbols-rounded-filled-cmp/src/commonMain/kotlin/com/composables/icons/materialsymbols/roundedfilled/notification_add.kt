package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Notification_add: ImageVector
    get() {
        if (_Notification_add != null) return _Notification_add!!
        
        _Notification_add = ImageVector.Builder(
            name = "notification_add",
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
                moveToRelative(240f, -480f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 480f)
                verticalLineToRelative(-80f)
                close()
                moveTo(200f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 680f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -83f, 50f, -147.5f)
                reflectiveQuadTo(420f, 168f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(28f)
                quadToRelative(4f, 1f, 7f, 2f)
                reflectiveQuadToRelative(7f, 2f)
                quadToRelative(14f, 5f, 17.5f, 20f)
                reflectiveQuadToRelative(-6.5f, 28f)
                quadToRelative(-22f, 29f, -33.5f, 65f)
                reflectiveQuadTo(520f, 360f)
                quadToRelative(0f, 82f, 48f, 144.5f)
                reflectiveQuadTo(691f, 590f)
                quadToRelative(13f, 4f, 21f, 13.5f)
                reflectiveQuadToRelative(8f, 22.5f)
                verticalLineToRelative(54f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Notification_add!!
    }

private var _Notification_add: ImageVector? = null

