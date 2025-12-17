package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Brightness_3: ImageVector
    get() {
        if (_Brightness_3 != null) return _Brightness_3!!
        
        _Brightness_3 = ImageVector.Builder(
            name = "brightness_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                quadToRelative(-32f, 0f, -61.5f, -4.5f)
                reflectiveQuadTo(240f, 862f)
                quadToRelative(126f, -41f, 203f, -146f)
                reflectiveQuadToRelative(77f, -236f)
                quadToRelative(0f, -131f, -77f, -236f)
                reflectiveQuadTo(240f, 98f)
                quadToRelative(29f, -9f, 58.5f, -13.5f)
                reflectiveQuadTo(360f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(643f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(643f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(360f, 880f)
                close()
            }
        }.build()
        
        return _Brightness_3!!
    }

private var _Brightness_3: ImageVector? = null

