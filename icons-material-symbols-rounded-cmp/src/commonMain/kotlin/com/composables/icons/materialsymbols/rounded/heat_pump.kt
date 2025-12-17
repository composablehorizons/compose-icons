package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Heat_pump: ImageVector
    get() {
        if (_Heat_pump != null) return _Heat_pump!!
        
        _Heat_pump = ImageVector.Builder(
            name = "heat_pump",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveToRelative(-30f, -83f)
                verticalLineToRelative(-85f)
                lineToRelative(-60f, 60f)
                quadToRelative(14f, 9f, 28.5f, 15.5f)
                reflectiveQuadTo(450f, 637f)
                close()
                moveToRelative(60f, 0f)
                quadToRelative(16f, -3f, 31f, -9.5f)
                reflectiveQuadToRelative(29f, -15.5f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(85f)
                close()
                moveToRelative(102f, -67f)
                quadToRelative(9f, -14f, 15.5f, -29f)
                reflectiveQuadToRelative(9.5f, -31f)
                horizontalLineToRelative(-85f)
                lineToRelative(60f, 60f)
                close()
                moveToRelative(-60f, -120f)
                horizontalLineToRelative(85f)
                quadToRelative(-3f, -16f, -9.5f, -31f)
                reflectiveQuadTo(612f, 390f)
                lineToRelative(-60f, 60f)
                close()
                moveToRelative(-42f, -42f)
                lineToRelative(60f, -60f)
                quadToRelative(-14f, -9f, -28.5f, -15.5f)
                reflectiveQuadTo(510f, 323f)
                verticalLineToRelative(85f)
                close()
                moveToRelative(-30f, 112f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveToRelative(-30f, -112f)
                verticalLineToRelative(-85f)
                quadToRelative(-16f, 3f, -31f, 9.5f)
                reflectiveQuadTo(390f, 348f)
                lineToRelative(60f, 60f)
                close()
                moveToRelative(-127f, 42f)
                horizontalLineToRelative(85f)
                lineToRelative(-60f, -60f)
                quadToRelative(-9f, 14f, -15.5f, 29f)
                reflectiveQuadToRelative(-9.5f, 31f)
                close()
                moveToRelative(25f, 120f)
                lineToRelative(60f, -60f)
                horizontalLineToRelative(-85f)
                quadToRelative(3f, 16f, 9.5f, 31f)
                reflectiveQuadToRelative(15.5f, 29f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Heat_pump!!
    }

private var _Heat_pump: ImageVector? = null

