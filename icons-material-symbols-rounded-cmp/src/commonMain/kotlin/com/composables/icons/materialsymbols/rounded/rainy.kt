package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Rainy: ImageVector
    get() {
        if (_Rainy != null) return _Rainy!!
        
        _Rainy = ImageVector.Builder(
            name = "rainy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(558f, 876f)
                quadToRelative(-15f, 8f, -30.5f, 2.5f)
                reflectiveQuadTo(504f, 858f)
                lineToRelative(-60f, -120f)
                quadToRelative(-8f, -15f, -2.5f, -30.5f)
                reflectiveQuadTo(462f, 684f)
                quadToRelative(15f, -8f, 30.5f, -2.5f)
                reflectiveQuadTo(516f, 702f)
                lineToRelative(60f, 120f)
                quadToRelative(8f, 15f, 2.5f, 30.5f)
                reflectiveQuadTo(558f, 876f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-15f, 8f, -30.5f, 2.5f)
                reflectiveQuadTo(744f, 858f)
                lineToRelative(-60f, -120f)
                quadToRelative(-8f, -15f, -2.5f, -30.5f)
                reflectiveQuadTo(702f, 684f)
                quadToRelative(15f, -8f, 30.5f, -2.5f)
                reflectiveQuadTo(756f, 702f)
                lineToRelative(60f, 120f)
                quadToRelative(8f, 15f, 2.5f, 30.5f)
                reflectiveQuadTo(798f, 876f)
                close()
                moveToRelative(-480f, 0f)
                quadToRelative(-15f, 8f, -30.5f, 2.5f)
                reflectiveQuadTo(264f, 858f)
                lineToRelative(-60f, -120f)
                quadToRelative(-8f, -15f, -2.5f, -30.5f)
                reflectiveQuadTo(222f, 684f)
                quadToRelative(15f, -8f, 30.5f, -2.5f)
                reflectiveQuadTo(276f, 702f)
                lineToRelative(60f, 120f)
                quadToRelative(8f, 15f, 2.5f, 30.5f)
                reflectiveQuadTo(318f, 876f)
                close()
                moveToRelative(-18f, -236f)
                quadToRelative(-91f, 0f, -155.5f, -64.5f)
                reflectiveQuadTo(80f, 420f)
                quadToRelative(0f, -83f, 55f, -145f)
                reflectiveQuadToRelative(136f, -73f)
                quadToRelative(32f, -57f, 87.5f, -89.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(90f, 0f, 156.5f, 57.5f)
                reflectiveQuadTo(717f, 281f)
                quadToRelative(69f, 6f, 116f, 57f)
                reflectiveQuadToRelative(47f, 122f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(700f, 640f)
                horizontalLineTo(300f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-48f, 0f, -87.5f, 26f)
                reflectiveQuadTo(333f, 256f)
                lineToRelative(-10f, 24f)
                horizontalLineToRelative(-25f)
                quadToRelative(-57f, 2f, -97.5f, 42.5f)
                reflectiveQuadTo(160f, 420f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(180f, -200f)
                close()
            }
        }.build()
        
        return _Rainy!!
    }

private var _Rainy: ImageVector? = null

