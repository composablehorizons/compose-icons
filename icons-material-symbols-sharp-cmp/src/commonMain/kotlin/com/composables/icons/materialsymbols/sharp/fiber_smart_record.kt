package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fiber_smart_record: ImageVector
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
                moveToRelative(0f, -280f)
                close()
                moveToRelative(280f, 276f)
                verticalLineToRelative(-80f)
                quadToRelative(70f, -14f, 115f, -69f)
                reflectiveQuadToRelative(45f, -127f)
                quadToRelative(0f, -72f, -45f, -127f)
                reflectiveQuadToRelative(-115f, -69f)
                verticalLineToRelative(-80f)
                quadToRelative(104f, 14f, 172f, 92.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 105f, -68f, 183.5f)
                reflectiveQuadTo(640f, 756f)
                close()
                moveToRelative(-280f, -76f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(360f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(360f, 680f)
                close()
            }
        }.build()
        
        return _Fiber_smart_record!!
    }

private var _Fiber_smart_record: ImageVector? = null

