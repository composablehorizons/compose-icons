package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wind_power: ImageVector
    get() {
        if (_Wind_power != null) return _Wind_power!!
        
        _Wind_power = ImageVector.Builder(
            name = "wind_power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-229f)
                quadToRelative(9f, 4f, 19f, 6f)
                reflectiveQuadToRelative(21f, 2f)
                quadToRelative(42f, 0f, 70.5f, -28.5f)
                reflectiveQuadTo(619f, 520f)
                verticalLineToRelative(-9f)
                lineToRelative(161f, 39f)
                lineToRelative(142f, 254f)
                lineTo(809f, 917f)
                lineTo(560f, 669f)
                verticalLineToRelative(171f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-280f, -80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveTo(40f, 600f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(421f)
                quadToRelative(-19f, 14f, -29.5f, 34.5f)
                reflectiveQuadTo(421f, 520f)
                quadToRelative(0f, 23f, 9f, 42f)
                reflectiveQuadToRelative(25f, 33f)
                lineToRelative(-133f, 85f)
                lineToRelative(-282f, -80f)
                close()
                moveToRelative(480f, -20f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(460f, 520f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(520f, 460f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(580f, 520f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(520f, 580f)
                close()
                moveToRelative(92f, -98f)
                quadToRelative(-11f, -27f, -35.5f, -44f)
                reflectiveQuadTo(520f, 421f)
                quadToRelative(-11f, 0f, -21f, 2f)
                reflectiveQuadToRelative(-19f, 6f)
                verticalLineToRelative(-193f)
                lineToRelative(213f, -199f)
                lineToRelative(136f, 85f)
                lineToRelative(-217f, 360f)
                close()
                moveTo(40f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Wind_power!!
    }

private var _Wind_power: ImageVector? = null

