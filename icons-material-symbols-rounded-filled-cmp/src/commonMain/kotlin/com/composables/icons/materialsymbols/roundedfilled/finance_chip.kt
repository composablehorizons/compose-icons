package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Finance_chip: ImageVector
    get() {
        if (_Finance_chip != null) return _Finance_chip!!
        
        _Finance_chip = ImageVector.Builder(
            name = "finance_chip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(470f, 640f)
                horizontalLineToRelative(29f)
                verticalLineToRelative(-32f)
                quadToRelative(28f, -4f, 47.5f, -23f)
                reflectiveQuadToRelative(19.5f, -49f)
                quadToRelative(0f, -26f, -20f, -43.5f)
                reflectiveQuadTo(500f, 464f)
                verticalLineToRelative(-74f)
                quadToRelative(10f, 3f, 16.5f, 10f)
                reflectiveQuadToRelative(9.5f, 17f)
                lineToRelative(36f, -15f)
                quadToRelative(-7f, -21f, -24f, -33.5f)
                reflectiveQuadTo(500f, 352f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(31f)
                quadToRelative(-28f, 3f, -47.5f, 20.5f)
                reflectiveQuadTo(403f, 418f)
                quadToRelative(0f, 27f, 20.5f, 45f)
                reflectiveQuadToRelative(46.5f, 29f)
                verticalLineToRelative(79f)
                quadToRelative(-16f, -5f, -27f, -17f)
                reflectiveQuadToRelative(-15f, -28f)
                lineToRelative(-35f, 15f)
                quadToRelative(8f, 28f, 28f, 46f)
                reflectiveQuadToRelative(49f, 22f)
                verticalLineToRelative(31f)
                close()
                moveToRelative(30f, -70f)
                verticalLineToRelative(-66f)
                quadToRelative(11f, 5f, 19.5f, 12f)
                reflectiveQuadToRelative(8.5f, 21f)
                quadToRelative(0f, 16f, -8f, 22.5f)
                reflectiveQuadTo(500f, 570f)
                close()
                moveToRelative(-30f, -119f)
                quadToRelative(-11f, -5f, -20f, -12f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(0f, -14f, 9f, -20.5f)
                reflectiveQuadToRelative(20f, -8.5f)
                verticalLineToRelative(62f)
                close()
                moveTo(320f, 760f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(320f, 200f)
                horizontalLineToRelative(320f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(640f, 760f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Finance_chip!!
    }

private var _Finance_chip: ImageVector? = null

