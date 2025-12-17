package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Leaf_spark: ImageVector
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
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(240f)
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
                moveToRelative(340f, 400f)
                quadToRelative(48f, 0f, 92f, -17.5f)
                reflectiveQuadToRelative(78f, -52.5f)
                quadToRelative(35f, -34f, 52.5f, -78f)
                reflectiveQuadToRelative(17.5f, -92f)
                verticalLineToRelative(-240f)
                horizontalLineTo(560f)
                quadToRelative(-47f, 0f, -90.5f, 18f)
                reflectiveQuadTo(392f, 389f)
                quadToRelative(-35f, 34f, -53.5f, 78f)
                reflectiveQuadTo(320f, 560f)
                quadToRelative(0f, 39f, 12f, 74f)
                reflectiveQuadToRelative(33f, 65f)
                lineToRelative(207f, -207f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(421f, 756f)
                quadToRelative(29f, 21f, 64.5f, 32.5f)
                reflectiveQuadTo(560f, 800f)
                close()
                moveToRelative(0f, -240f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Leaf_spark!!
    }

private var _Leaf_spark: ImageVector? = null

