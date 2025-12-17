package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Timer_arrow_down: ImageVector
    get() {
        if (_Timer_arrow_down != null) return _Timer_arrow_down!!
        
        _Timer_arrow_down = ImageVector.Builder(
            name = "timer_arrow_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 800f)
                quadToRelative(-125f, 0f, -212.5f, -87.5f)
                reflectiveQuadTo(40f, 500f)
                quadToRelative(0f, -125f, 87.5f, -212.5f)
                reflectiveQuadTo(340f, 200f)
                quadToRelative(52f, 0f, 98f, 16.5f)
                reflectiveQuadToRelative(84f, 45.5f)
                lineToRelative(14f, -14f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(592f, 248f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-14f, 14f)
                quadToRelative(29f, 38f, 45.5f, 84.5f)
                reflectiveQuadTo(640f, 500f)
                quadToRelative(0f, 125f, -87.5f, 212.5f)
                reflectiveQuadTo(340f, 800f)
                close()
                moveToRelative(-60f, -640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 160f)
                horizontalLineTo(280f)
                close()
                moveToRelative(60f, 380f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(380f, 500f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(340f, 340f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(300f, 380f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(340f, 540f)
                close()
                moveToRelative(412f, 232f)
                lineToRelative(-92f, -92f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(12f, -27.5f)
                quadToRelative(12f, -11f, 28.5f, -11.5f)
                reflectiveQuadTo(717f, 624f)
                lineToRelative(23f, 23f)
                verticalLineToRelative(-447f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(780f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(820f, 200f)
                verticalLineToRelative(448f)
                lineToRelative(24f, -24f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-92f, 92f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
            }
        }.build()
        
        return _Timer_arrow_down!!
    }

private var _Timer_arrow_down: ImageVector? = null

