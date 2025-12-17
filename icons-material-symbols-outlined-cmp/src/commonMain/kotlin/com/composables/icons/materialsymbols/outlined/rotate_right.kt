package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Rotate_right: ImageVector
    get() {
        if (_Rotate_right != null) return _Rotate_right!!
        
        _Rotate_right = ImageVector.Builder(
            name = "rotate_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(522f, 880f)
                verticalLineToRelative(-82f)
                quadToRelative(34f, -5f, 66.5f, -18f)
                reflectiveQuadToRelative(61.5f, -34f)
                lineToRelative(56f, 58f)
                quadToRelative(-42f, 32f, -88f, 51.5f)
                reflectiveQuadTo(522f, 880f)
                close()
                moveToRelative(-80f, 0f)
                quadTo(304f, 862f, 213f, 760.5f)
                reflectiveQuadTo(122f, 522f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(482f, 162f)
                horizontalLineToRelative(6f)
                lineToRelative(-62f, -62f)
                lineToRelative(56f, -58f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -56f)
                lineToRelative(64f, -64f)
                horizontalLineToRelative(-8f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(202f, 522f)
                quadToRelative(0f, 104f, 68f, 182.5f)
                reflectiveQuadTo(442f, 798f)
                verticalLineToRelative(82f)
                close()
                moveToRelative(322f, -134f)
                lineToRelative(-58f, -56f)
                quadToRelative(21f, -29f, 34f, -61.5f)
                reflectiveQuadToRelative(18f, -66.5f)
                horizontalLineToRelative(82f)
                quadToRelative(-5f, 50f, -24.5f, 96f)
                reflectiveQuadTo(764f, 746f)
                close()
                moveToRelative(76f, -264f)
                horizontalLineToRelative(-82f)
                quadToRelative(-5f, -34f, -18f, -66.5f)
                reflectiveQuadTo(706f, 354f)
                lineToRelative(58f, -56f)
                quadToRelative(32f, 39f, 51f, 86f)
                reflectiveQuadToRelative(25f, 98f)
                close()
            }
        }.build()
        
        return _Rotate_right!!
    }

private var _Rotate_right: ImageVector? = null

