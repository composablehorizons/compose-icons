package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Volume_up: ImageVector
    get() {
        if (_Volume_up != null) return _Volume_up!!
        
        _Volume_up = ImageVector.Builder(
            name = "volume_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 479f)
                quadToRelative(0f, -83f, -44f, -151.5f)
                reflectiveQuadTo(598f, 225f)
                quadToRelative(-15f, -7f, -22f, -21.5f)
                reflectiveQuadToRelative(-2f, -29.5f)
                quadToRelative(6f, -16f, 21.5f, -23f)
                reflectiveQuadToRelative(31.5f, 0f)
                quadToRelative(97f, 43f, 155f, 131.5f)
                reflectiveQuadTo(840f, 479f)
                quadToRelative(0f, 108f, -58f, 196.5f)
                reflectiveQuadTo(627f, 807f)
                quadToRelative(-16f, 7f, -31.5f, 0f)
                reflectiveQuadTo(574f, 784f)
                quadToRelative(-5f, -15f, 2f, -29.5f)
                reflectiveQuadToRelative(22f, -21.5f)
                quadToRelative(74f, -34f, 118f, -102.5f)
                reflectiveQuadTo(760f, 479f)
                close()
                moveTo(280f, 600f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(120f)
                lineToRelative(132f, -132f)
                quadToRelative(19f, -19f, 43.5f, -8.5f)
                reflectiveQuadTo(480f, 257f)
                verticalLineToRelative(446f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(412f, 732f)
                lineTo(280f, 600f)
                close()
                moveToRelative(380f, -120f)
                quadToRelative(0f, 42f, -19f, 79.5f)
                reflectiveQuadTo(591f, 621f)
                quadToRelative(-10f, 6f, -20.5f, 0.5f)
                reflectiveQuadTo(560f, 604f)
                verticalLineToRelative(-250f)
                quadToRelative(0f, -12f, 10.5f, -17.5f)
                reflectiveQuadToRelative(20.5f, 0.5f)
                quadToRelative(31f, 25f, 50f, 63f)
                reflectiveQuadToRelative(19f, 80f)
                close()
            }
        }.build()
        
        return _Volume_up!!
    }

private var _Volume_up: ImageVector? = null

