package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Domino_mask: ImageVector
    get() {
        if (_Domino_mask != null) return _Domino_mask!!
        
        _Domino_mask = ImageVector.Builder(
            name = "domino_mask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 720f)
                quadToRelative(-51f, 0f, -97.5f, -18f)
                reflectiveQuadTo(131f, 649f)
                quadToRelative(-48f, -45f, -69.5f, -106.5f)
                reflectiveQuadTo(40f, 415f)
                quadToRelative(0f, -78f, 38f, -126.5f)
                reflectiveQuadTo(189f, 240f)
                quadToRelative(14f, 0f, 26.5f, 2.5f)
                reflectiveQuadTo(241f, 250f)
                lineToRelative(239f, 89f)
                lineToRelative(239f, -89f)
                quadToRelative(13f, -5f, 25.5f, -7.5f)
                reflectiveQuadTo(771f, 240f)
                quadToRelative(73f, 0f, 111f, 48.5f)
                reflectiveQuadTo(920f, 415f)
                quadToRelative(0f, 66f, -21.5f, 127.5f)
                reflectiveQuadTo(829f, 649f)
                quadToRelative(-37f, 35f, -83.5f, 53f)
                reflectiveQuadTo(648f, 720f)
                quadToRelative(-66f, 0f, -112f, -30f)
                lineToRelative(-46f, -30f)
                horizontalLineToRelative(-20f)
                lineToRelative(-46f, 30f)
                quadToRelative(-46f, 30f, -112f, 30f)
                close()
                moveToRelative(37f, -160f)
                quadToRelative(29f, 0f, 46f, -13.5f)
                reflectiveQuadToRelative(17f, -36.5f)
                quadToRelative(0f, -39f, -52f, -74.5f)
                reflectiveQuadTo(251f, 400f)
                quadToRelative(-29f, 0f, -46f, 13.5f)
                reflectiveQuadTo(188f, 450f)
                quadToRelative(0f, 39f, 52f, 74.5f)
                reflectiveQuadTo(349f, 560f)
                close()
                moveToRelative(262f, 0f)
                quadToRelative(57f, 0f, 109f, -35.5f)
                reflectiveQuadToRelative(52f, -74.5f)
                quadToRelative(0f, -24f, -16.5f, -37f)
                reflectiveQuadTo(709f, 400f)
                quadToRelative(-57f, 0f, -109f, 35.5f)
                reflectiveQuadTo(548f, 510f)
                quadToRelative(0f, 23f, 16.5f, 36.5f)
                reflectiveQuadTo(611f, 560f)
                close()
            }
        }.build()
        
        return _Domino_mask!!
    }

private var _Domino_mask: ImageVector? = null

