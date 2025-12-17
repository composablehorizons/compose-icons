package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pacemaker: ImageVector
    get() {
        if (_Pacemaker != null) return _Pacemaker!!
        
        _Pacemaker = ImageVector.Builder(
            name = "pacemaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 880f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-317f)
                quadToRelative(-27f, -26f, -53.5f, -52.5f)
                reflectiveQuadTo(40f, 306f)
                quadToRelative(0f, -27f, 19.5f, -46.5f)
                reflectiveQuadTo(106f, 240f)
                quadToRelative(16f, 0f, 29.5f, 7f)
                reflectiveQuadToRelative(24.5f, 18f)
                quadToRelative(11f, -11f, 24.5f, -18f)
                reflectiveQuadToRelative(29.5f, -7f)
                quadToRelative(27f, 0f, 46.5f, 19.5f)
                reflectiveQuadTo(280f, 306f)
                quadToRelative(0f, 38f, -26.5f, 64.5f)
                reflectiveQuadTo(200f, 423f)
                verticalLineToRelative(317f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 800f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 740f)
                verticalLineToRelative(-460f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(520f, 80f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(720f, 280f)
                verticalLineToRelative(4f)
                quadToRelative(69f, 14f, 114.5f, 68.5f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -73f, 45.5f, -127.5f)
                reflectiveQuadTo(640f, 284f)
                verticalLineToRelative(-4f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(460f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(420f, -80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(680f, 760f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 600f)
                close()
                moveToRelative(0f, 80f)
                close()
            }
        }.build()
        
        return _Pacemaker!!
    }

private var _Pacemaker: ImageVector? = null

