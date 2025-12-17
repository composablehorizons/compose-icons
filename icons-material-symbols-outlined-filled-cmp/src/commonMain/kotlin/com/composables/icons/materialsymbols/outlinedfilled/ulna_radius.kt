package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Ulna_radius: ImageVector
    get() {
        if (_Ulna_radius != null) return _Ulna_radius!!
        
        _Ulna_radius = ImageVector.Builder(
            name = "ulna_radius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(719f, 878f)
                quadToRelative(-22f, 0f, -42.5f, -8.5f)
                reflectiveQuadTo(642f, 847f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(-4.5f, -4.5f)
                horizontalLineToRelative(-94f)
                quadToRelative(-42f, 0f, -71f, -29.5f)
                reflectiveQuadTo(439f, 737f)
                quadToRelative(0f, -23f, 10f, -43.5f)
                reflectiveQuadToRelative(30f, -36.5f)
                lineToRelative(40f, -32f)
                verticalLineToRelative(-222f)
                lineToRelative(-62f, -88f)
                quadToRelative(-9f, -13f, -13.5f, -28f)
                reflectiveQuadToRelative(-4.5f, -29f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                horizontalLineToRelative(200f)
                quadToRelative(42f, 0f, 70.5f, 28.5f)
                reflectiveQuadTo(838f, 257f)
                quadToRelative(0f, 15f, -4f, 29f)
                reflectiveQuadToRelative(-13f, 27f)
                lineToRelative(-62f, 90f)
                verticalLineToRelative(224f)
                lineToRelative(39f, 39f)
                quadToRelative(20f, 20f, 30.5f, 43.5f)
                reflectiveQuadTo(839f, 758f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-367f, -52f)
                quadToRelative(-11f, 5f, -22.5f, 7.5f)
                reflectiveQuadTo(306f, 836f)
                quadToRelative(-45f, 0f, -76f, -30.5f)
                reflectiveQuadTo(199f, 731f)
                verticalLineToRelative(-364f)
                lineToRelative(-70f, -147f)
                quadToRelative(-5f, -10f, -7.5f, -21f)
                reflectiveQuadToRelative(-2.5f, -22f)
                quadToRelative(0f, -42f, 29f, -70.5f)
                reflectiveQuadToRelative(71f, -28.5f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(80f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 17f, -5f, 31.5f)
                reflectiveQuadTo(479f, 317f)
                lineToRelative(-40f, 54f)
                verticalLineToRelative(200f)
                lineToRelative(43f, 65f)
                quadToRelative(8f, 13f, 12.5f, 27.5f)
                reflectiveQuadTo(499f, 692f)
                quadToRelative(0f, 29f, -15f, 53f)
                reflectiveQuadToRelative(-40f, 36f)
                lineToRelative(-92f, 45f)
                close()
            }
        }.build()
        
        return _Ulna_radius!!
    }

private var _Ulna_radius: ImageVector? = null

