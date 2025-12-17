package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Bakery_dining: ImageVector
    get() {
        if (_Bakery_dining != null) return _Bakery_dining!!
        
        _Bakery_dining = ImageVector.Builder(
            name = "bakery_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(835f, 708f)
                lineToRelative(-99f, -34f)
                lineToRelative(78f, -215f)
                lineToRelative(85f, 175f)
                quadToRelative(14f, 27f, -12f, 55f)
                reflectiveQuadToRelative(-52f, 19f)
                close()
                moveToRelative(-251f, -38f)
                lineToRelative(43f, -374f)
                quadToRelative(2f, -15f, 13.5f, -20.5f)
                reflectiveQuadToRelative(27.5f, -0.5f)
                lineToRelative(100f, 37f)
                quadToRelative(14f, 6f, 18.5f, 18f)
                reflectiveQuadToRelative(-0.5f, 26f)
                lineTo(673f, 670f)
                horizontalLineToRelative(-89f)
                close()
                moveToRelative(-296f, 0f)
                lineTo(175f, 356f)
                quadToRelative(-5f, -14f, -0.5f, -26.5f)
                reflectiveQuadTo(193f, 312f)
                lineToRelative(100f, -37f)
                quadToRelative(14f, -6f, 26.5f, -0.5f)
                reflectiveQuadTo(334f, 296f)
                lineToRelative(42f, 374f)
                horizontalLineToRelative(-88f)
                close()
                moveToRelative(-172f, 38f)
                quadToRelative(-26f, 8f, -47f, -19.5f)
                reflectiveQuadTo(62f, 634f)
                lineToRelative(86f, -175f)
                lineToRelative(77f, 215f)
                lineToRelative(-109f, 34f)
                close()
                moveToRelative(320f, -38f)
                lineToRelative(-48f, -430f)
                quadToRelative(-2f, -17f, 9.5f, -28.5f)
                reflectiveQuadTo(426f, 200f)
                horizontalLineToRelative(108f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(572f, 240f)
                lineToRelative(-48f, 430f)
                horizontalLineToRelative(-88f)
                close()
            }
        }.build()
        
        return _Bakery_dining!!
    }

private var _Bakery_dining: ImageVector? = null

