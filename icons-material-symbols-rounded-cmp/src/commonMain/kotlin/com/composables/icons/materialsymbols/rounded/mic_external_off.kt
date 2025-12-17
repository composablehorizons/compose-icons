package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mic_external_off: ImageVector
    get() {
        if (_Mic_external_off != null) return _Mic_external_off!!
        
        _Mic_external_off = ImageVector.Builder(
            name = "mic_external_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 266f)
                lineTo(214f, 100f)
                quadToRelative(14f, -11f, 31f, -15.5f)
                reflectiveQuadToRelative(35f, -4.5f)
                quadToRelative(50f, 0f, 85f, 34.5f)
                reflectiveQuadToRelative(35f, 85.5f)
                quadToRelative(0f, 18f, -5.5f, 34.5f)
                reflectiveQuadTo(380f, 266f)
                close()
                moveToRelative(420f, 420f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-366f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(640f, 160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(560f, 240f)
                verticalLineToRelative(206f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-126f)
                quadToRelative(0f, -68f, 47f, -114f)
                reflectiveQuadToRelative(113f, -46f)
                quadToRelative(66f, 0f, 113f, 46f)
                reflectiveQuadToRelative(47f, 114f)
                verticalLineToRelative(446f)
                close()
                moveToRelative(-8f, 218f)
                lineTo(560f, 672f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(400f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                horizontalLineToRelative(-4f)
                quadToRelative(-16f, 0f, -27f, -10.5f)
                reflectiveQuadTo(196f, 684f)
                lineToRelative(-32f, -320f)
                quadToRelative(-2f, -18f, 10f, -31f)
                reflectiveQuadToRelative(30f, -13f)
                horizontalLineToRelative(2f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(272f, 640f)
                horizontalLineToRelative(16f)
                lineToRelative(22f, -218f)
                lineToRelative(-24f, -22f)
                horizontalLineToRelative(-38f)
                lineToRelative(24f, 240f)
                close()
                moveToRelative(128f, 160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(480f, 720f)
                verticalLineToRelative(-128f)
                lineToRelative(-98f, -98f)
                lineToRelative(-18f, 190f)
                quadToRelative(-2f, 15f, -13f, 25.5f)
                reflectiveQuadTo(324f, 720f)
                horizontalLineToRelative(-4f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 800f)
                close()
                moveTo(272f, 400f)
                horizontalLineToRelative(-24f)
                horizontalLineToRelative(62f)
                horizontalLineToRelative(-38f)
                close()
            }
        }.build()
        
        return _Mic_external_off!!
    }

private var _Mic_external_off: ImageVector? = null

