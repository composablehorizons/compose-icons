package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Attach_file_off: ImageVector
    get() {
        if (_Attach_file_off != null) return _Attach_file_off!!
        
        _Attach_file_off = ImageVector.Builder(
            name = "attach_file_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(470f, 880f)
                quadToRelative(-104f, 0f, -177f, -73f)
                reflectiveQuadToRelative(-73f, -177f)
                verticalLineToRelative(-298f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-95f, -95f)
                quadToRelative(-35f, 45f, -86.5f, 72f)
                reflectiveQuadTo(470f, 880f)
                close()
                moveTo(300f, 412f)
                verticalLineToRelative(218f)
                quadToRelative(-1f, 71f, 49f, 120.5f)
                reflectiveQuadTo(470f, 800f)
                quadToRelative(45f, 0f, 81.5f, -21f)
                reflectiveQuadToRelative(59.5f, -56f)
                lineToRelative(-50f, -50f)
                quadToRelative(-15f, 22f, -38.5f, 34.5f)
                reflectiveQuadTo(470f, 720f)
                quadToRelative(-46f, 0f, -78f, -32f)
                reflectiveQuadToRelative(-32f, -78f)
                verticalLineToRelative(-138f)
                lineToRelative(-60f, -60f)
                close()
                moveToRelative(140f, 140f)
                verticalLineToRelative(58f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(470f, 640f)
                quadToRelative(12f, 0f, 20.5f, -8f)
                reflectiveQuadToRelative(9.5f, -20f)
                lineToRelative(-60f, -60f)
                close()
                moveToRelative(200f, -26f)
                verticalLineToRelative(-246f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 280f)
                verticalLineToRelative(326f)
                lineToRelative(-80f, -80f)
                close()
                moveTo(500f, 386f)
                verticalLineToRelative(-126f)
                quadToRelative(-1f, -42f, -29.5f, -71f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(-26f, 0f, -47f, 12f)
                reflectiveQuadToRelative(-35f, 32f)
                lineToRelative(-57f, -57f)
                quadToRelative(25f, -31f, 61f, -49f)
                reflectiveQuadToRelative(78f, -18f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(580f, 260f)
                verticalLineToRelative(206f)
                lineToRelative(-80f, -80f)
                close()
                moveTo(369f, 254f)
                quadToRelative(5f, -7f, 13.5f, -10.5f)
                reflectiveQuadTo(400f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 280f)
                verticalLineToRelative(46f)
                lineToRelative(-71f, -72f)
                close()
            }
        }.build()
        
        return _Attach_file_off!!
    }

private var _Attach_file_off: ImageVector? = null

