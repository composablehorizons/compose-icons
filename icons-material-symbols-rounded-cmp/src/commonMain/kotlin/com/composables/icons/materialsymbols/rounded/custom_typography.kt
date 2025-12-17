package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Custom_typography: ImageVector
    get() {
        if (_Custom_typography != null) return _Custom_typography!!
        
        _Custom_typography = ImageVector.Builder(
            name = "custom_typography",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 800f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 840f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 680f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-360f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 720f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(224f, -363f)
                horizontalLineToRelative(193f)
                lineToRelative(34f, 98f)
                quadToRelative(4f, 11f, 14f, 18f)
                reflectiveQuadToRelative(22f, 7f)
                quadToRelative(20f, 0f, 32f, -17f)
                reflectiveQuadToRelative(4f, -36f)
                lineTo(533f, 106f)
                quadToRelative(-5f, -12f, -15f, -19f)
                reflectiveQuadToRelative(-23f, -7f)
                horizontalLineToRelative(-30f)
                quadToRelative(-13f, 0f, -23f, 7f)
                reflectiveQuadToRelative(-15f, 19f)
                lineTo(276f, 508f)
                quadToRelative(-7f, 19f, 4.5f, 35.5f)
                reflectiveQuadTo(312f, 560f)
                quadToRelative(13f, 0f, 22.5f, -7f)
                reflectiveQuadToRelative(14.5f, -19f)
                lineToRelative(35f, -97f)
                close()
                moveToRelative(24f, -69f)
                lineToRelative(70f, -199f)
                horizontalLineToRelative(4f)
                lineToRelative(70f, 199f)
                horizontalLineTo(408f)
                close()
            }
        }.build()
        
        return _Custom_typography!!
    }

private var _Custom_typography: ImageVector? = null

