package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Transit_enterexit: ImageVector
    get() {
        if (_Transit_enterexit != null) return _Transit_enterexit!!
        
        _Transit_enterexit = ImageVector.Builder(
            name = "transit_enterexit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(446f, 600f)
                horizontalLineToRelative(134f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(640f, 660f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(580f, 720f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 680f)
                verticalLineToRelative(-300f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(300f, 320f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(360f, 380f)
                verticalLineToRelative(130f)
                lineToRelative(228f, -228f)
                quadToRelative(18f, -18f, 44f, -18f)
                reflectiveQuadToRelative(44f, 18f)
                quadToRelative(18f, 18f, 18f, 44f)
                reflectiveQuadToRelative(-18f, 44f)
                lineTo(446f, 600f)
                close()
            }
        }.build()
        
        return _Transit_enterexit!!
    }

private var _Transit_enterexit: ImageVector? = null

