package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Group_auto: ImageVector
    get() {
        if (_Group_auto != null) return _Group_auto!!
        
        _Group_auto = ImageVector.Builder(
            name = "group_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -31f, 16f, -56.5f)
                reflectiveQuadToRelative(44f, -39.5f)
                quadToRelative(52f, -26f, 107.5f, -40f)
                reflectiveQuadTo(361f, 640f)
                quadToRelative(58f, 0f, 113.5f, 14f)
                reflectiveQuadTo(581f, 694f)
                quadToRelative(27f, 14f, 43f, 39.5f)
                reflectiveQuadToRelative(16f, 56.5f)
                verticalLineToRelative(90f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -38f, -19.5f, -71f)
                reflectiveQuadTo(652f, 651f)
                quadToRelative(32f, 8f, 63.5f, 17.5f)
                reflectiveQuadTo(776f, 693f)
                quadToRelative(26f, 14f, 45f, 36f)
                reflectiveQuadToRelative(19f, 51f)
                verticalLineToRelative(100f)
                horizontalLineTo(720f)
                close()
                moveTo(360f, 600f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(340f, -140f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                quadToRelative(-8f, 0f, -14.5f, -0.5f)
                reflectiveQuadTo(532f, 597f)
                quadToRelative(25f, -29f, 36.5f, -64f)
                reflectiveQuadToRelative(11.5f, -73f)
                quadToRelative(0f, -38f, -11.5f, -73f)
                reflectiveQuadTo(532f, 323f)
                quadToRelative(7f, -2f, 13.5f, -2.5f)
                reflectiveQuadToRelative(14.5f, -0.5f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                close()
                moveToRelative(40f, -60f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(560f, 220f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(740f, 40f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(920f, 220f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(740f, 400f)
                close()
            }
        }.build()
        
        return _Group_auto!!
    }

private var _Group_auto: ImageVector? = null

