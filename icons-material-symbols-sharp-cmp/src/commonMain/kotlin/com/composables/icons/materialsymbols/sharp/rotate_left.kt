package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Rotate_left: ImageVector
    get() {
        if (_Rotate_left != null) return _Rotate_left!!
        
        _Rotate_left = ImageVector.Builder(
            name = "rotate_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                quadToRelative(-50f, -5f, -96f, -24.5f)
                reflectiveQuadTo(256f, 804f)
                lineToRelative(56f, -58f)
                quadToRelative(29f, 21f, 61.5f, 34f)
                reflectiveQuadToRelative(66.5f, 18f)
                verticalLineToRelative(82f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(-82f)
                quadToRelative(104f, -15f, 172f, -93.5f)
                reflectiveQuadTo(760f, 522f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 242f)
                horizontalLineToRelative(-8f)
                lineToRelative(64f, 64f)
                lineToRelative(-56f, 56f)
                lineToRelative(-160f, -160f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 58f)
                lineToRelative(-62f, 62f)
                horizontalLineToRelative(6f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(840f, 522f)
                quadToRelative(0f, 137f, -91f, 238.5f)
                reflectiveQuadTo(520f, 880f)
                close()
                moveTo(198f, 746f)
                quadToRelative(-32f, -42f, -51.5f, -88f)
                reflectiveQuadTo(122f, 562f)
                horizontalLineToRelative(82f)
                quadToRelative(5f, 34f, 18f, 66.5f)
                reflectiveQuadToRelative(34f, 61.5f)
                lineToRelative(-58f, 56f)
                close()
                moveToRelative(-76f, -264f)
                quadToRelative(6f, -51f, 25f, -98f)
                reflectiveQuadToRelative(51f, -86f)
                lineToRelative(58f, 56f)
                quadToRelative(-21f, 29f, -34f, 61.5f)
                reflectiveQuadTo(204f, 482f)
                horizontalLineToRelative(-82f)
                close()
            }
        }.build()
        
        return _Rotate_left!!
    }

private var _Rotate_left: ImageVector? = null

