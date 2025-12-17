package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Leaf_spark: ImageVector
    get() {
        if (_Leaf_spark != null) return _Leaf_spark!!
        
        _Leaf_spark = ImageVector.Builder(
            name = "leaf_spark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 880f)
                quadToRelative(-56f, 0f, -105.5f, -18f)
                reflectiveQuadTo(364f, 812f)
                lineToRelative(-56f, 56f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(56f, -56f)
                quadToRelative(-32f, -41f, -50f, -90.5f)
                reflectiveQuadTo(240f, 560f)
                quadToRelative(0f, -138f, 95.5f, -229f)
                reflectiveQuadTo(560f, 240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 62f, -23.5f, 120f)
                reflectiveQuadTo(786f, 786f)
                quadToRelative(-48f, 47f, -106f, 70.5f)
                reflectiveQuadTo(560f, 880f)
                close()
                moveTo(220f, 400f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(400f, 220f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(220f, 40f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(40f, 220f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(220f, 400f)
                close()
                moveToRelative(352f, 92f)
                lineTo(393f, 671f)
                quadToRelative(-12f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(11.5f, 28f)
                quadToRelative(12f, 12f, 28f, 12.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                lineToRelative(179f, -180f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                close()
            }
        }.build()
        
        return _Leaf_spark!!
    }

private var _Leaf_spark: ImageVector? = null

