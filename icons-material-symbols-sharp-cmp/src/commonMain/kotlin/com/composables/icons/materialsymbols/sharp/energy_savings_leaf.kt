package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Energy_savings_leaf: ImageVector
    get() {
        if (_Energy_savings_leaf != null) return _Energy_savings_leaf!!
        
        _Energy_savings_leaf = ImageVector.Builder(
            name = "energy_savings_leaf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(100f, 0f, 169f, -70f)
                reflectiveQuadToRelative(71f, -170f)
                verticalLineToRelative(-240f)
                horizontalLineTo(480f)
                quadToRelative(-100f, 2f, -170f, 71f)
                reflectiveQuadToRelative(-70f, 169f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveToRelative(-58f, -58f)
                lineToRelative(195f, -173f)
                lineToRelative(-11f, -32f)
                lineToRelative(-144f, -14f)
                lineToRelative(93f, -130f)
                lineToRelative(-16f, -17f)
                lineToRelative(-195f, 174f)
                lineToRelative(11f, 32f)
                lineToRelative(144f, 14f)
                lineToRelative(-94f, 129f)
                lineToRelative(17f, 17f)
                close()
                moveToRelative(58f, 138f)
                quadToRelative(-56f, 0f, -105.5f, -17.5f)
                reflectiveQuadTo(284f, 733f)
                lineToRelative(-84f, 84f)
                lineToRelative(-57f, -57f)
                lineToRelative(84f, -84f)
                quadToRelative(-32f, -41f, -49.5f, -90.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadToRelative(-227f, 93f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Energy_savings_leaf!!
    }

private var _Energy_savings_leaf: ImageVector? = null

