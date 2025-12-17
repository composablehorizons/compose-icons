package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Media_output: ImageVector
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
                moveTo(400f, 880f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(240f)
                horizontalLineTo(720f)
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
                horizontalLineTo(400f)
                close()
                moveToRelative(-60f, -540f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 220f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 280f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 340f)
                close()
                moveToRelative(-20f, 460f)
                horizontalLineTo(80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(242f)
                quadToRelative(-57f, 7f, -105.5f, 32f)
                reflectiveQuadTo(409f, 418f)
                quadToRelative(-15f, -9f, -32.5f, -13.5f)
                reflectiveQuadTo(340f, 400f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 54f, 34.5f, 92.5f)
                reflectiveQuadTo(320f, 679f)
                verticalLineToRelative(121f)
                close()
                moveToRelative(20f, -320f)
                quadToRelative(5f, 0f, 10f, 1f)
                reflectiveQuadToRelative(10f, 3f)
                quadToRelative(-14f, 26f, -23.5f, 54f)
                reflectiveQuadTo(323f, 597f)
                quadToRelative(-19f, -5f, -31f, -21f)
                reflectiveQuadToRelative(-12f, -36f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(340f, 480f)
                close()
            }
        }.build()
        
        return _Media_output!!
    }

private var _Media_output: ImageVector? = null

