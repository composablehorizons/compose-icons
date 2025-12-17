package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Double_arrow: ImageVector
    get() {
        if (_Double_arrow != null) return _Double_arrow!!
        
        _Double_arrow = ImageVector.Builder(
            name = "double_arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(442f, 480f)
                lineTo(287f, 263f)
                quadToRelative(-14f, -20f, -3.5f, -41.5f)
                reflectiveQuadTo(319f, 200f)
                quadToRelative(10f, 0f, 19f, 4.5f)
                reflectiveQuadToRelative(14f, 12.5f)
                lineToRelative(188f, 263f)
                lineToRelative(-188f, 263f)
                quadToRelative(-5f, 8f, -14f, 12.5f)
                reflectiveQuadToRelative(-19f, 4.5f)
                quadToRelative(-24f, 0f, -35f, -21.5f)
                reflectiveQuadToRelative(3f, -41.5f)
                lineToRelative(155f, -217f)
                close()
                moveToRelative(238f, 0f)
                lineTo(525f, 263f)
                quadToRelative(-14f, -20f, -3.5f, -41.5f)
                reflectiveQuadTo(557f, 200f)
                quadToRelative(10f, 0f, 19f, 4.5f)
                reflectiveQuadToRelative(14f, 12.5f)
                lineToRelative(188f, 263f)
                lineToRelative(-188f, 263f)
                quadToRelative(-5f, 8f, -14f, 12.5f)
                reflectiveQuadToRelative(-19f, 4.5f)
                quadToRelative(-24f, 0f, -35f, -21.5f)
                reflectiveQuadToRelative(3f, -41.5f)
                lineToRelative(155f, -217f)
                close()
            }
        }.build()
        
        return _Double_arrow!!
    }

private var _Double_arrow: ImageVector? = null

