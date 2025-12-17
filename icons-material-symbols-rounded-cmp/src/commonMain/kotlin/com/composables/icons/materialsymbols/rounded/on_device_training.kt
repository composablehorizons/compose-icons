package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.On_device_training: ImageVector
    get() {
        if (_On_device_training != null) return _On_device_training!!
        
        _On_device_training = ImageVector.Builder(
            name = "on_device_training",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 680f)
                horizontalLineToRelative(-40f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(40f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                close()
                moveToRelative(-40f, -60f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-11f)
                quadToRelative(-19f, -11f, -29.5f, -29.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, 21f, -10.5f, 39.5f)
                reflectiveQuadTo(520f, 589f)
                verticalLineToRelative(11f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(160f, -100f)
                quadToRelative(0f, -13f, -2f, -25f)
                reflectiveQuadToRelative(-7f, -24f)
                quadToRelative(-5f, -11f, -2f, -23f)
                reflectiveQuadToRelative(14f, -19f)
                quadToRelative(11f, -7f, 22.5f, -4.5f)
                reflectiveQuadTo(662f, 438f)
                quadToRelative(9f, 19f, 13.5f, 39.5f)
                reflectiveQuadTo(680f, 520f)
                quadToRelative(0f, 21f, -4.5f, 41.5f)
                reflectiveQuadTo(662f, 601f)
                quadToRelative(-5f, 11f, -16.5f, 14f)
                reflectiveQuadToRelative(-22.5f, -4f)
                quadToRelative(-11f, -7f, -14f, -19f)
                reflectiveQuadToRelative(2f, -24f)
                quadToRelative(5f, -11f, 7f, -23f)
                reflectiveQuadToRelative(2f, -25f)
                close()
                moveToRelative(-280f, 0f)
                quadToRelative(0f, 13f, 2f, 25f)
                reflectiveQuadToRelative(7f, 24f)
                quadToRelative(5f, 11f, 2f, 23f)
                reflectiveQuadToRelative(-14f, 19f)
                quadToRelative(-11f, 7f, -22.5f, 4.5f)
                reflectiveQuadTo(298f, 602f)
                quadToRelative(-9f, -19f, -13.5f, -39.5f)
                reflectiveQuadTo(280f, 520f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 320f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -7f, 6f, -9.5f)
                reflectiveQuadToRelative(11f, 2.5f)
                lineToRelative(56f, 50f)
                quadToRelative(7f, 6f, 7f, 15f)
                reflectiveQuadToRelative(-7f, 15f)
                lineToRelative(-56f, 50f)
                quadToRelative(-5f, 5f, -11f, 2.5f)
                reflectiveQuadToRelative(-6f, -9.5f)
                verticalLineToRelative(-28f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                close()
                moveTo(240f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 40f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 920f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -200f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(240f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -40f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(0f, 720f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _On_device_training!!
    }

private var _On_device_training: ImageVector? = null

