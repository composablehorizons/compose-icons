package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Cameraswitch: ImageVector
    get() {
        if (_Cameraswitch != null) return _Cameraswitch!!
        
        _Cameraswitch = ImageVector.Builder(
            name = "cameraswitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(40f)
                lineToRelative(28f, -28f)
                quadToRelative(6f, -6f, 13.5f, -9f)
                reflectiveQuadToRelative(15.5f, -3f)
                horizontalLineToRelative(126f)
                quadToRelative(8f, 0f, 15.5f, 3f)
                reflectiveQuadToRelative(13.5f, 9f)
                lineToRelative(28f, 28f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 680f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-240f)
                horizontalLineTo(320f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(160f, -40f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 480f)
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
                moveToRelative(0f, -960f)
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
        
        return _Cameraswitch!!
    }

private var _Cameraswitch: ImageVector? = null

