package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.On_device_training: ImageVector
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
                moveTo(440f, 680f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -60f)
                verticalLineToRelative(-31f)
                quadToRelative(-19f, -11f, -29.5f, -29.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, 21f, -10.5f, 39.5f)
                reflectiveQuadTo(520f, 589f)
                verticalLineToRelative(31f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(200f, 18f)
                lineToRelative(-42f, -43f)
                quadToRelative(11f, -17f, 16.5f, -36f)
                reflectiveQuadToRelative(5.5f, -39f)
                quadToRelative(0f, -20f, -5.5f, -39f)
                reflectiveQuadTo(598f, 445f)
                lineToRelative(42f, -43f)
                quadToRelative(20f, 26f, 30f, 56f)
                reflectiveQuadToRelative(10f, 62f)
                quadToRelative(0f, 32f, -10f, 62f)
                reflectiveQuadToRelative(-30f, 56f)
                close()
                moveToRelative(-320f, 0f)
                quadToRelative(-20f, -26f, -30f, -56f)
                reflectiveQuadToRelative(-10f, -62f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 320f)
                verticalLineToRelative(-50f)
                lineToRelative(90f, 80f)
                lineToRelative(-90f, 80f)
                verticalLineToRelative(-50f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 20f, 5.5f, 39f)
                reflectiveQuadToRelative(16.5f, 36f)
                lineToRelative(-42f, 43f)
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

