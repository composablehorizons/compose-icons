package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tibia: ImageVector
    get() {
        if (_Tibia != null) return _Tibia!!
        
        _Tibia = ImageVector.Builder(
            name = "tibia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 368f)
                lineToRelative(-85f, -85f)
                quadToRelative(-17f, -17f, -26f, -39f)
                reflectiveQuadToRelative(-9f, -45f)
                quadToRelative(0f, -50f, 34.5f, -84.5f)
                reflectiveQuadTo(358f, 80f)
                horizontalLineToRelative(244f)
                quadToRelative(49f, 0f, 83f, 34.5f)
                reflectiveQuadToRelative(34f, 83.5f)
                quadToRelative(0f, 25f, -10f, 47.5f)
                reflectiveQuadTo(682f, 285f)
                lineToRelative(-82f, 82f)
                verticalLineToRelative(222f)
                lineToRelative(84f, 84f)
                quadToRelative(17f, 17f, 26.5f, 39f)
                reflectiveQuadToRelative(9.5f, 46f)
                quadToRelative(0f, 51f, -35f, 86f)
                reflectiveQuadToRelative(-86f, 35f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                quadToRelative(-7f, -8f, -15.5f, -11.5f)
                reflectiveQuadTo(480f, 829f)
                quadToRelative(-10f, 0f, -18.5f, 4f)
                reflectiveQuadTo(446f, 844f)
                quadToRelative(-17f, 17f, -39f, 26f)
                reflectiveQuadToRelative(-46f, 9f)
                quadToRelative(-51f, 0f, -86f, -35f)
                reflectiveQuadToRelative(-35f, -86f)
                quadToRelative(0f, -24f, 9f, -46f)
                reflectiveQuadToRelative(26f, -39f)
                lineToRelative(85f, -83f)
                verticalLineToRelative(-222f)
                close()
            }
        }.build()
        
        return _Tibia!!
    }

private var _Tibia: ImageVector? = null

