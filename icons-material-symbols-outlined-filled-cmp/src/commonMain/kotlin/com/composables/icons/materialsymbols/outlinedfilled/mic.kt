package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mic: ImageVector
    get() {
        if (_Mic != null) return _Mic!!
        
        _Mic = ImageVector.Builder(
            name = "mic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 560f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-40f, 280f)
                verticalLineToRelative(-123f)
                quadToRelative(-104f, -14f, -172f, -93f)
                reflectiveQuadToRelative(-68f, -184f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 105f, -68f, 184f)
                reflectiveQuadToRelative(-172f, 93f)
                verticalLineToRelative(123f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Mic!!
    }

private var _Mic: ImageVector? = null

