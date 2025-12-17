package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Humerus: ImageVector
    get() {
        if (_Humerus != null) return _Humerus!!
        
        _Humerus = ImageVector.Builder(
            name = "humerus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(362f, 880f)
                quadToRelative(-51f, 0f, -86.5f, -35f)
                reflectiveQuadTo(240f, 759f)
                quadToRelative(0f, -24f, 9.5f, -46f)
                reflectiveQuadToRelative(26.5f, -39f)
                lineToRelative(85f, -83f)
                verticalLineToRelative(-151f)
                quadToRelative(-1f, -14f, -12f, -23f)
                reflectiveQuadToRelative(-23f, -17f)
                quadToRelative(-45f, -34f, -65.5f, -70f)
                reflectiveQuadTo(240f, 250f)
                quadToRelative(0f, -71f, 52.5f, -120.5f)
                reflectiveQuadTo(420f, 80f)
                quadToRelative(17f, 0f, 32.5f, 4.5f)
                reflectiveQuadTo(480f, 95f)
                quadToRelative(13f, 5f, 21.5f, 10f)
                reflectiveQuadToRelative(17.5f, 5f)
                quadToRelative(20f, 0f, 40f, -14f)
                quadToRelative(11f, -6f, 23f, -11f)
                reflectiveQuadToRelative(27f, -5f)
                quadToRelative(48f, 0f, 79.5f, 33.5f)
                reflectiveQuadTo(720f, 195f)
                quadToRelative(0f, 23f, -9.5f, 46.5f)
                reflectiveQuadTo(682f, 284f)
                lineToRelative(-81f, 83f)
                verticalLineToRelative(223f)
                lineToRelative(84f, 84f)
                quadToRelative(17f, 17f, 26f, 39f)
                reflectiveQuadToRelative(9f, 46f)
                quadToRelative(0f, 51f, -34.5f, 86f)
                reflectiveQuadTo(600f, 880f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                quadToRelative(-7f, -7f, -15.5f, -10.5f)
                reflectiveQuadTo(481f, 831f)
                quadToRelative(-10f, 0f, -18.5f, 3.5f)
                reflectiveQuadTo(447f, 845f)
                quadToRelative(-17f, 17f, -39f, 26f)
                reflectiveQuadToRelative(-46f, 9f)
                close()
            }
        }.build()
        
        return _Humerus!!
    }

private var _Humerus: ImageVector? = null

