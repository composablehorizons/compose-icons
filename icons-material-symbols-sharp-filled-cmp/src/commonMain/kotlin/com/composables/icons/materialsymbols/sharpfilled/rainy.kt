package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Rainy: ImageVector
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
            }
        }.build()
        
        return _Rainy!!
    }

private var _Rainy: ImageVector? = null

