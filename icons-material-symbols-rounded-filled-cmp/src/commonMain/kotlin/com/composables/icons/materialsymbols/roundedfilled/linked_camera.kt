package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Linked_camera: ImageVector
    get() {
        if (_Linked_camera != null) return _Linked_camera!!
        
        _Linked_camera = ImageVector.Builder(
            name = "linked_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(852f, 280f)
                quadToRelative(-11f, 0f, -19.5f, -8f)
                reflectiveQuadToRelative(-8.5f, -19f)
                quadToRelative(0f, -66f, -45.5f, -111.5f)
                reflectiveQuadTo(667f, 96f)
                quadToRelative(-11f, 0f, -19f, -8.5f)
                reflectiveQuadToRelative(-8f, -19.5f)
                quadToRelative(0f, -11f, 8f, -19f)
                reflectiveQuadToRelative(19f, -8f)
                quadToRelative(88f, 0f, 150f, 62f)
                reflectiveQuadToRelative(62f, 150f)
                quadToRelative(0f, 11f, -8f, 19f)
                reflectiveQuadToRelative(-19f, 8f)
                close()
                moveToRelative(-108f, 0f)
                quadToRelative(-11f, 0f, -19.5f, -7.5f)
                reflectiveQuadTo(716f, 254f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(666f, 204f)
                quadToRelative(-11f, 0f, -18.5f, -8.5f)
                reflectiveQuadTo(640f, 176f)
                quadToRelative(0f, -11f, 8f, -19f)
                reflectiveQuadToRelative(19f, -8f)
                quadToRelative(43f, 0f, 73.5f, 30.5f)
                reflectiveQuadTo(771f, 253f)
                quadToRelative(0f, 11f, -8f, 19f)
                reflectiveQuadToRelative(-19f, 8f)
                close()
                moveTo(480f, 700f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(660f, 520f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 700f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(126f)
                lineToRelative(50f, -54f)
                quadToRelative(11f, -12f, 26.5f, -19f)
                reflectiveQuadToRelative(32.5f, -7f)
                horizontalLineToRelative(165f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 320f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Linked_camera!!
    }

private var _Linked_camera: ImageVector? = null

