package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Brightness_auto: ImageVector
    get() {
        if (_Brightness_auto != null) return _Brightness_auto!!
        
        _Brightness_auto = ImageVector.Builder(
            name = "brightness_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 640f)
                horizontalLineToRelative(64f)
                lineToRelative(16f, -46f)
                quadToRelative(8f, -21f, 31.5f, -33.5f)
                reflectiveQuadTo(505f, 548f)
                quadToRelative(22f, 0f, 39.5f, 12.5f)
                reflectiveQuadTo(570f, 594f)
                lineToRelative(9f, 27f)
                quadToRelative(3f, 8f, 10.5f, 13.5f)
                reflectiveQuadTo(606f, 640f)
                quadToRelative(15f, 0f, 23.5f, -12.5f)
                reflectiveQuadTo(633f, 601f)
                lineTo(519f, 299f)
                quadToRelative(-3f, -9f, -13.5f, -14f)
                reflectiveQuadToRelative(-36.5f, -5f)
                quadToRelative(-9f, 0f, -17f, 5f)
                reflectiveQuadToRelative(-11f, 14f)
                lineTo(312f, 640f)
                close()
                moveToRelative(114f, -144f)
                lineToRelative(52f, -150f)
                horizontalLineToRelative(4f)
                lineToRelative(52f, 150f)
                horizontalLineTo(426f)
                close()
                moveToRelative(-80f, 304f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-106f)
                lineToRelative(-77f, -78f)
                quadToRelative(-11f, -12f, -17f, -26.5f)
                reflectiveQuadTo(60f, 480f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadTo(83f, 424f)
                lineToRelative(77f, -78f)
                verticalLineToRelative(-106f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 160f)
                horizontalLineToRelative(106f)
                lineToRelative(78f, -77f)
                quadToRelative(12f, -11f, 26.5f, -17f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(15f, 0f, 29.5f, 6f)
                reflectiveQuadToRelative(26.5f, 17f)
                lineToRelative(78f, 77f)
                horizontalLineToRelative(106f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(106f)
                lineToRelative(77f, 78f)
                quadToRelative(11f, 12f, 17f, 26.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                quadToRelative(0f, 15f, -6f, 29.5f)
                reflectiveQuadTo(877f, 536f)
                lineToRelative(-77f, 78f)
                verticalLineToRelative(106f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 800f)
                horizontalLineTo(614f)
                lineToRelative(-78f, 77f)
                quadToRelative(-12f, 11f, -26.5f, 17f)
                reflectiveQuadTo(480f, 900f)
                quadToRelative(-15f, 0f, -29.5f, -6f)
                reflectiveQuadTo(424f, 877f)
                lineToRelative(-78f, -77f)
                close()
            }
        }.build()
        
        return _Brightness_auto!!
    }

private var _Brightness_auto: ImageVector? = null

