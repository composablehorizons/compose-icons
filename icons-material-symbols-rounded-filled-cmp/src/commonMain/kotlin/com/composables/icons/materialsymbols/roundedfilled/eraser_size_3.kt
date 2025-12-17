package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Eraser_size_3: ImageVector
    get() {
        if (_Eraser_size_3 != null) return _Eraser_size_3!!
        
        _Eraser_size_3 = ImageVector.Builder(
            name = "eraser_size_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 760f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -27f, 10.5f, -53f)
                reflectiveQuadToRelative(30.5f, -46f)
                lineToRelative(280f, -280f)
                quadToRelative(20f, -20f, 46f, -30.5f)
                reflectiveQuadToRelative(53f, -10.5f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 27f, -10.5f, 53f)
                reflectiveQuadTo(719f, 439f)
                lineTo(439f, 719f)
                quadToRelative(-20f, 20f, -46f, 30.5f)
                reflectiveQuadTo(340f, 760f)
                close()
            }
        }.build()
        
        return _Eraser_size_3!!
    }

private var _Eraser_size_3: ImageVector? = null

