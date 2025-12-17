package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Notifications_paused: ImageVector
    get() {
        if (_Notifications_paused != null) return _Notifications_paused!!
        
        _Notifications_paused = ImageVector.Builder(
            name = "notifications_paused",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                quadToRelative(80f, 20f, 130f, 84.5f)
                reflectiveQuadTo(720f, 400f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -300f)
                close()
                moveToRelative(0f, 420f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(320f, 680f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(234f, -40f)
                quadToRelative(15f, 0f, 25.5f, -10.5f)
                reflectiveQuadTo(590f, 604f)
                quadToRelative(0f, -15f, -10.5f, -25.5f)
                reflectiveQuadTo(554f, 568f)
                horizontalLineToRelative(-74f)
                lineToRelative(102f, -126f)
                quadToRelative(4f, -5f, 6f, -11f)
                reflectiveQuadToRelative(2f, -12f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -15f, -10.5f, -25.5f)
                reflectiveQuadTo(554f, 360f)
                horizontalLineTo(406f)
                quadToRelative(-15f, 0f, -25.5f, 10.5f)
                reflectiveQuadTo(370f, 396f)
                quadToRelative(0f, 15f, 10.5f, 25.5f)
                reflectiveQuadTo(406f, 432f)
                horizontalLineToRelative(74f)
                lineTo(378f, 558f)
                quadToRelative(-4f, 5f, -6f, 11f)
                reflectiveQuadToRelative(-2f, 12f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 15f, 10.5f, 25.5f)
                reflectiveQuadTo(406f, 640f)
                horizontalLineToRelative(148f)
                close()
            }
        }.build()
        
        return _Notifications_paused!!
    }

private var _Notifications_paused: ImageVector? = null

