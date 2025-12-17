package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Energy_savings_leaf: ImageVector
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
                moveToRelative(-47f, -67f)
                lineToRelative(184f, -164f)
                quadToRelative(9f, -8f, 5f, -19f)
                reflectiveQuadToRelative(-16f, -13f)
                lineToRelative(-144f, -14f)
                lineToRelative(86f, -119f)
                quadToRelative(3f, -5f, 3.5f, -9.5f)
                reflectiveQuadTo(548f, 306f)
                quadToRelative(-4f, -5f, -10f, -4.5f)
                reflectiveQuadToRelative(-11f, 4.5f)
                lineTo(344f, 470f)
                quadToRelative(-9f, 8f, -5f, 19f)
                reflectiveQuadToRelative(16f, 13f)
                lineToRelative(144f, 14f)
                lineToRelative(-87f, 119f)
                quadToRelative(-3f, 5f, -3f, 9.5f)
                reflectiveQuadToRelative(4f, 8.5f)
                quadToRelative(4f, 4f, 9.5f, 4f)
                reflectiveQuadToRelative(10.5f, -4f)
                close()
                moveToRelative(47f, 147f)
                quadToRelative(-56f, 0f, -105.5f, -17.5f)
                reflectiveQuadTo(284f, 733f)
                lineToRelative(-55f, 55f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 760f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(55f, -55f)
                quadToRelative(-32f, -41f, -49.5f, -90.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(240f)
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

