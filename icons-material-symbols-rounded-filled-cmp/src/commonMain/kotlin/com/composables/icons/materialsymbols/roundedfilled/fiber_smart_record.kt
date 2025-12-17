package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Fiber_smart_record: ImageVector
    get() {
        if (_Fiber_smart_record != null) return _Fiber_smart_record!!
        
        _Fiber_smart_record = ImageVector.Builder(
            name = "fiber_smart_record",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 760f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(360f, 200f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(360f, 760f)
                close()
                moveToRelative(340f, -19f)
                quadToRelative(-23f, 8f, -41.5f, -1.5f)
                reflectiveQuadTo(640f, 704f)
                quadToRelative(0f, -11f, 7.5f, -21f)
                reflectiveQuadToRelative(18.5f, -14f)
                quadToRelative(60f, -20f, 97f, -72f)
                reflectiveQuadToRelative(37f, -117f)
                quadToRelative(0f, -65f, -37f, -117f)
                reflectiveQuadToRelative(-97f, -72f)
                quadToRelative(-11f, -4f, -18.5f, -14f)
                reflectiveQuadToRelative(-7.5f, -21f)
                quadToRelative(0f, -25f, 18f, -35f)
                reflectiveQuadToRelative(41f, -2f)
                quadToRelative(81f, 29f, 131f, 100.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 89f, -50f, 160f)
                reflectiveQuadTo(700f, 741f)
                close()
            }
        }.build()
        
        return _Fiber_smart_record!!
    }

private var _Fiber_smart_record: ImageVector? = null

