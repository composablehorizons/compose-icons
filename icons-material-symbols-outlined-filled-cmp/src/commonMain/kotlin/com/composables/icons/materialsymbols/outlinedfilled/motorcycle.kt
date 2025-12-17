package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Motorcycle: ImageVector
    get() {
        if (_Motorcycle != null) return _Motorcycle!!
        
        _Motorcycle = ImageVector.Builder(
            name = "motorcycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(0f, 560f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(200f, 360f)
                horizontalLineToRelative(464f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(143f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(139f, 139f)
                quadToRelative(78f, 6f, 130f, 63f)
                reflectiveQuadToRelative(52f, 135f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(760f, 760f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(560f, 560f)
                quadToRelative(0f, -18f, 2.5f, -35.5f)
                reflectiveQuadTo(572f, 490f)
                lineTo(462f, 600f)
                horizontalLineToRelative(-66f)
                quadToRelative(-14f, 70f, -69f, 115f)
                reflectiveQuadToRelative(-127f, 45f)
                close()
                moveToRelative(560f, -80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(-560f, 0f)
                quadToRelative(38f, 0f, 68.5f, -22f)
                reflectiveQuadToRelative(43.5f, -58f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(112f)
                quadToRelative(-13f, -36f, -43.5f, -58f)
                reflectiveQuadTo(200f, 440f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
            }
        }.build()
        
        return _Motorcycle!!
    }

private var _Motorcycle: ImageVector? = null

