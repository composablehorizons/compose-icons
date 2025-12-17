package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Media_output: ImageVector
    get() {
        if (_Media_output != null) return _Media_output!!
        
        _Media_output = ImageVector.Builder(
            name = "media_output",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 440f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(162f)
                quadToRelative(-21f, 2f, -41f, 7.5f)
                reflectiveQuadTo(520f, 343f)
                verticalLineToRelative(-183f)
                horizontalLineTo(160f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -121f)
                verticalLineToRelative(-39f)
                quadToRelative(0f, -11f, 0.5f, -21.5f)
                reflectiveQuadTo(323f, 597f)
                quadToRelative(-19f, -5f, -31f, -21f)
                reflectiveQuadToRelative(-12f, -36f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(5f, 0f, 10f, 1f)
                reflectiveQuadToRelative(10f, 3f)
                quadToRelative(10f, -18f, 22.5f, -34.5f)
                reflectiveQuadTo(409f, 418f)
                quadToRelative(-15f, -9f, -32.5f, -13.5f)
                reflectiveQuadTo(340f, 400f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 54f, 34.5f, 92.5f)
                reflectiveQuadTo(320f, 679f)
                close()
                moveToRelative(20f, -339f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 220f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 280f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 340f)
                close()
                moveTo(560f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(640f, 460f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(460f, 640f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Media_output!!
    }

private var _Media_output: ImageVector? = null

