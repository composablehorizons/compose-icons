package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Crop_rotate: ImageVector
    get() {
        if (_Crop_rotate != null) return _Crop_rotate!!
        
        _Crop_rotate = ImageVector.Builder(
            name = "crop_rotate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 960f)
                quadTo(304f, 960f, 171.5f, 849.5f)
                reflectiveQuadTo(7f, 571f)
                quadToRelative(-3f, -17f, 6.5f, -31f)
                reflectiveQuadTo(40f, 524f)
                quadToRelative(17f, -2f, 30f, 8.5f)
                reflectiveQuadTo(86f, 560f)
                quadToRelative(26f, 131f, 124.5f, 219f)
                reflectiveQuadTo(444f, 878f)
                lineToRelative(-34f, -34f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineTo(598f, 920f)
                quadToRelative(7f, 7f, 4.5f, 16f)
                reflectiveQuadTo(591f, 947f)
                quadToRelative(-27f, 7f, -54.5f, 10f)
                reflectiveQuadTo(480f, 960f)
                close()
                moveTo(360f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 280f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 240f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 680f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 720f)
                verticalLineToRelative(-40f)
                horizontalLineTo(360f)
                close()
                moveToRelative(240f, -160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 360f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 0f)
                quadToRelative(176f, 0f, 308.5f, 110f)
                reflectiveQuadTo(953f, 389f)
                quadToRelative(3f, 17f, -6.5f, 31f)
                reflectiveQuadTo(920f, 436f)
                quadToRelative(-17f, 2f, -30f, -8.5f)
                reflectiveQuadTo(874f, 400f)
                quadToRelative(-26f, -131f, -124.5f, -219f)
                reflectiveQuadTo(516f, 82f)
                lineToRelative(34f, 34f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(362f, 40f)
                quadToRelative(-7f, -7f, -4.5f, -16f)
                reflectiveQuadToRelative(11.5f, -11f)
                quadToRelative(27f, -7f, 54.5f, -10f)
                reflectiveQuadToRelative(56.5f, -3f)
                close()
            }
        }.build()
        
        return _Crop_rotate!!
    }

private var _Crop_rotate: ImageVector? = null

