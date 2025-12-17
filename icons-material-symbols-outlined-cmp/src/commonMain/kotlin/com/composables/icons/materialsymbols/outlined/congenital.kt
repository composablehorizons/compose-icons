package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Congenital: ImageVector
    get() {
        if (_Congenital != null) return _Congenital!!
        
        _Congenital = ImageVector.Builder(
            name = "congenital",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(392f, 760f)
                quadToRelative(-100f, 0f, -185.5f, -51f)
                reflectiveQuadTo(74f, 569f)
                lineToRelative(-25f, -46f)
                quadToRelative(-11f, -22f, -8.5f, -46f)
                reflectiveQuadTo(59f, 434f)
                lineToRelative(201f, -245f)
                quadToRelative(9f, -11f, 21f, -18f)
                reflectiveQuadToRelative(26f, -9f)
                quadToRelative(14f, -2f, 27f, -0.5f)
                reflectiveQuadToRelative(26f, 8.5f)
                lineToRelative(120f, 64f)
                lineToRelative(98f, -54f)
                quadToRelative(17f, -10f, 36f, -7f)
                reflectiveQuadToRelative(33f, 17f)
                quadToRelative(14f, 13f, 17.5f, 31.5f)
                reflectiveQuadTo(660f, 257f)
                lineTo(536f, 546f)
                quadToRelative(-11f, 26f, -36f, 39f)
                reflectiveQuadToRelative(-54f, 7f)
                lineToRelative(-304f, -65f)
                quadToRelative(36f, 71f, 103.5f, 112f)
                reflectiveQuadTo(392f, 680f)
                horizontalLineToRelative(179f)
                quadToRelative(55f, 0f, 106f, -21f)
                reflectiveQuadToRelative(90f, -59f)
                horizontalLineToRelative(-34f)
                quadToRelative(-37f, 0f, -60.5f, -28f)
                reflectiveQuadTo(654f, 508f)
                lineToRelative(27f, -178f)
                quadToRelative(3f, -19f, 15f, -31f)
                reflectiveQuadToRelative(28f, -17f)
                quadToRelative(16f, -5f, 32.5f, -0.5f)
                reflectiveQuadTo(786f, 300f)
                lineToRelative(114f, 134f)
                quadToRelative(15f, 18f, 18.5f, 41.5f)
                reflectiveQuadTo(912f, 520f)
                lineToRelative(-15f, 32f)
                quadToRelative(-45f, 95f, -132.5f, 151.5f)
                reflectiveQuadTo(571f, 760f)
                horizontalLineTo(392f)
                close()
                moveToRelative(433f, -241f)
                lineToRelative(15f, -33f)
                lineToRelative(-86f, -100f)
                lineToRelative(-20f, 133f)
                horizontalLineToRelative(91f)
                close()
                moveToRelative(-674f, -71f)
                lineToRelative(312f, 66f)
                lineToRelative(101f, -235f)
                lineToRelative(-84f, 47f)
                lineToRelative(-159f, -86f)
                lineToRelative(-170f, 208f)
                close()
                moveToRelative(207f, -71f)
                close()
                moveToRelative(429f, 109f)
                close()
            }
        }.build()
        
        return _Congenital!!
    }

private var _Congenital: ImageVector? = null

