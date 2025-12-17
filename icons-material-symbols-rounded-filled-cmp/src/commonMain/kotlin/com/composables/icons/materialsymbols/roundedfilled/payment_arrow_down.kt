package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Payment_arrow_down: ImageVector
    get() {
        if (_Payment_arrow_down != null) return _Payment_arrow_down!!
        
        _Payment_arrow_down = ImageVector.Builder(
            name = "payment_arrow_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 863f)
                quadToRelative(8f, 0f, 15f, -2.5f)
                reflectiveQuadToRelative(13f, -8.5f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineToRelative(-36f, 36f)
                verticalLineToRelative(-88f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 640f)
                verticalLineToRelative(88f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                lineToRelative(104f, 104f)
                quadToRelative(6f, 6f, 13f, 8.5f)
                reflectiveQuadToRelative(15f, 2.5f)
                close()
                moveToRelative(0f, -423f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveTo(200f, 560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 480f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 160f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 560f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(200f, 400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(480f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(680f, 480f)
                close()
                moveToRelative(80f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(760f, 240f)
                close()
                moveToRelative(-560f, 0f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(280f, 160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Payment_arrow_down!!
    }

private var _Payment_arrow_down: ImageVector? = null

