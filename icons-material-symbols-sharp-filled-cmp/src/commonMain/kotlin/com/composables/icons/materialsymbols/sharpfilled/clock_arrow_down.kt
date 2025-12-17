package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Clock_arrow_down: ImageVector
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
                moveToRelative(440f, 20f)
                lineTo(640f, 660f)
                lineToRelative(57f, -56f)
                lineToRelative(43f, 43f)
                verticalLineToRelative(-487f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(488f)
                lineToRelative(44f, -44f)
                lineToRelative(56f, 56f)
                lineToRelative(-140f, 140f)
                close()
                moveTo(420f, 620f)
                lineToRelative(56f, -56f)
                lineToRelative(-96f, -97f)
                verticalLineToRelative(-147f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(180f)
                lineToRelative(120f, 120f)
                close()
            }
        }.build()
        
        return _Clock_arrow_down!!
    }

private var _Clock_arrow_down: ImageVector? = null

