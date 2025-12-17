package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Desktop_access_disabled: ImageVector
    get() {
        if (_Desktop_access_disabled != null) return _Desktop_access_disabled!!
        
        _Desktop_access_disabled = ImageVector.Builder(
            name = "desktop_access_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(127f, 127f)
                lineToRelative(73f, 73f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(368f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(608f, 720f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -37f, 23.5f, -55f)
                lineToRelative(23.5f, -18f)
                close()
                moveToRelative(753f, 73f)
                verticalLineToRelative(420f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(800f, 619f)
                verticalLineToRelative(-419f)
                horizontalLineTo(360f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(320f, 160f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                close()
                moveTo(557f, 443f)
                close()
                moveToRelative(-213f, 13f)
                close()
            }
        }.build()
        
        return _Desktop_access_disabled!!
    }

private var _Desktop_access_disabled: ImageVector? = null

