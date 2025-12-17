package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Motorcycle: ImageVector
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
                moveTo(428f, 440f)
                horizontalLineToRelative(-70f)
                horizontalLineToRelative(150f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(200f, 760f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(0f, 560f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(200f, 360f)
                horizontalLineToRelative(464f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 200f)
                horizontalLineToRelative(103f)
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
                lineToRelative(-98f, 98f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                horizontalLineToRelative(-49f)
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
                horizontalLineToRelative(-72f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 520f)
                horizontalLineToRelative(72f)
                quadToRelative(-13f, -36f, -43.5f, -58f)
                reflectiveQuadTo(200f, 440f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(198f, -160f)
                horizontalLineToRelative(30f)
                lineToRelative(80f, -80f)
                horizontalLineTo(358f)
                quadToRelative(15f, 17f, 25f, 37f)
                reflectiveQuadToRelative(15f, 43f)
                close()
            }
        }.build()
        
        return _Motorcycle!!
    }

private var _Motorcycle: ImageVector? = null

