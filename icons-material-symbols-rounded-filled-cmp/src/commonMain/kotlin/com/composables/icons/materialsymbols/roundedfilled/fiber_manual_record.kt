package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Fiber_manual_record: ImageVector
    get() {
        if (_Fiber_manual_record != null) return _Fiber_manual_record!!
        
        _Fiber_manual_record = ImageVector.Builder(
            name = "fiber_manual_record",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(480f, 760f)
                close()
            }
        }.build()
        
        return _Fiber_manual_record!!
    }

private var _Fiber_manual_record: ImageVector? = null

