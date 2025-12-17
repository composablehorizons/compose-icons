package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Washoku: ImageVector
    get() {
        if (_Washoku != null) return _Washoku!!
        
        _Washoku = ImageVector.Builder(
            name = "washoku",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                lineToRelative(-61f, -184f)
                quadToRelative(-36f, -20f, -61f, -53f)
                reflectiveQuadToRelative(-36f, -75f)
                lineTo(90f, 400f)
                horizontalLineToRelative(780f)
                lineToRelative(-32f, 128f)
                quadToRelative(-11f, 42f, -36f, 75f)
                reflectiveQuadToRelative(-61f, 53f)
                lineToRelative(-61f, 184f)
                horizontalLineTo(280f)
                close()
                moveToRelative(520f, -520f)
                horizontalLineTo(160f)
                quadToRelative(0f, -50f, 34.5f, -85f)
                reflectiveQuadToRelative(83.5f, -35f)
                quadToRelative(8f, 0f, 17f, 1.5f)
                reflectiveQuadToRelative(17f, 3.5f)
                quadToRelative(17f, -38f, 51.5f, -61.5f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(48f, 0f, 84.5f, 28.5f)
                reflectiveQuadTo(574f, 223f)
                quadToRelative(19f, -20f, 44f, -31.5f)
                reflectiveQuadToRelative(53f, -11.5f)
                quadToRelative(54f, 0f, 91.5f, 38f)
                reflectiveQuadToRelative(37.5f, 92f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Washoku!!
    }

private var _Washoku: ImageVector? = null

