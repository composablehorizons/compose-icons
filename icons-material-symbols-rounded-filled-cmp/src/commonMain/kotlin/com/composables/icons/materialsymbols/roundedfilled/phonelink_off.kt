package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Phonelink_off: ImageVector
    get() {
        if (_Phonelink_off != null) return _Phonelink_off!!
        
        _Phonelink_off = ImageVector.Builder(
            name = "phonelink_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 360f)
                verticalLineToRelative(305f)
                quadToRelative(0f, 14f, -7f, 23f)
                reflectiveQuadToRelative(-18f, 14f)
                quadToRelative(-11f, 5f, -22f, 2.5f)
                reflectiveQuadTo(812f, 693f)
                lineTo(584f, 470f)
                quadToRelative(-11f, -11f, -17.5f, -26.5f)
                reflectiveQuadTo(560f, 412f)
                verticalLineToRelative(-52f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 320f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 360f)
                close()
                moveTo(600f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 760f)
                verticalLineToRelative(-88f)
                lineTo(240f, 352f)
                verticalLineToRelative(328f)
                horizontalLineToRelative(180f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(480f, 740f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(420f, 800f)
                horizontalLineTo(140f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 740f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 680f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-408f)
                lineToRelative(-76f, -76f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-76f, -76f)
                horizontalLineToRelative(-88f)
                close()
                moveToRelative(200f, -560f)
                horizontalLineTo(360f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 240f)
                close()
            }
        }.build()
        
        return _Phonelink_off!!
    }

private var _Phonelink_off: ImageVector? = null

