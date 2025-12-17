package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Strikethrough_s: ImageVector
    get() {
        if (_Strikethrough_s != null) return _Strikethrough_s!!
        
        _Strikethrough_s = ImageVector.Builder(
            name = "strikethrough_s",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(486f, 800f)
                quadToRelative(-63f, 0f, -116.5f, -33.5f)
                reflectiveQuadTo(285f, 677f)
                quadToRelative(-9f, -16f, -2.5f, -33.5f)
                reflectiveQuadTo(306f, 617f)
                quadToRelative(18f, -10f, 37.5f, -3.5f)
                reflectiveQuadTo(374f, 638f)
                quadToRelative(18f, 30f, 48.5f, 48f)
                reflectiveQuadToRelative(65.5f, 18f)
                quadToRelative(44f, 0f, 76.5f, -27f)
                reflectiveQuadToRelative(32.5f, -69f)
                quadToRelative(0f, -20f, 14f, -34f)
                reflectiveQuadToRelative(34f, -14f)
                quadToRelative(20f, 0f, 34.5f, 14f)
                reflectiveQuadToRelative(14.5f, 34f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 79f, -62.5f, 129.5f)
                reflectiveQuadTo(486f, 800f)
                close()
                moveTo(120f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 400f)
                horizontalLineToRelative(720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 480f)
                horizontalLineTo(120f)
                close()
                moveToRelative(208f, -165f)
                quadToRelative(-17f, -10f, -23f, -29.5f)
                reflectiveQuadToRelative(4f, -36.5f)
                quadToRelative(25f, -47f, 72f, -71f)
                reflectiveQuadToRelative(101f, -24f)
                quadToRelative(48f, 0f, 90.5f, 20f)
                reflectiveQuadToRelative(71.5f, 58f)
                quadToRelative(11f, 14f, 7f, 32f)
                reflectiveQuadToRelative(-19f, 29f)
                quadToRelative(-17f, 12f, -36.5f, 9f)
                reflectiveQuadTo(562f, 283f)
                quadToRelative(-15f, -17f, -35f, -25f)
                reflectiveQuadToRelative(-43f, -8f)
                quadToRelative(-27f, 0f, -52f, 11f)
                reflectiveQuadToRelative(-38f, 34f)
                quadToRelative(-10f, 18f, -29.5f, 24f)
                reflectiveQuadToRelative(-36.5f, -4f)
                close()
            }
        }.build()
        
        return _Strikethrough_s!!
    }

private var _Strikethrough_s: ImageVector? = null

