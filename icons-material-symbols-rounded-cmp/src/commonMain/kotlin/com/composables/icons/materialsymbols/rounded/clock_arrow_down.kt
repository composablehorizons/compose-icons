package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Clock_arrow_down: ImageVector
    get() {
        if (_Clock_arrow_down != null) return _Clock_arrow_down!!
        
        _Clock_arrow_down = ImageVector.Builder(
            name = "clock_arrow_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 780f)
                quadToRelative(-125f, 0f, -212.5f, -87.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -125f, 87.5f, -212.5f)
                reflectiveQuadTo(340f, 180f)
                quadToRelative(125f, 0f, 212.5f, 87.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, 125f, -87.5f, 212.5f)
                reflectiveQuadTo(340f, 780f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(92f, 0f, 156f, -64f)
                reflectiveQuadToRelative(64f, -156f)
                quadToRelative(0f, -92f, -64f, -156f)
                reflectiveQuadToRelative(-156f, -64f)
                quadToRelative(-92f, 0f, -156f, 64f)
                reflectiveQuadToRelative(-64f, 156f)
                quadToRelative(0f, 92f, 64f, 156f)
                reflectiveQuadToRelative(156f, 64f)
                close()
                moveToRelative(40f, -233f)
                verticalLineToRelative(-107f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(340f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(300f, 360f)
                verticalLineToRelative(123f)
                quadToRelative(0f, 8f, 3f, 15.5f)
                reflectiveQuadToRelative(9f, 13.5f)
                lineToRelative(80f, 80f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                lineToRelative(-68f, -69f)
                close()
                moveToRelative(-40f, 13f)
                close()
                moveToRelative(412f, 292f)
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
        
        return _Clock_arrow_down!!
    }

private var _Clock_arrow_down: ImageVector? = null

