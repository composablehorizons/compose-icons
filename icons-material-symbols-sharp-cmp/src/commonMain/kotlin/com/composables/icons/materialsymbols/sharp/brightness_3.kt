package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Brightness_3: ImageVector
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
                moveTo(507f, 764f)
                quadToRelative(80f, -42f, 126.5f, -118f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -90f, -46.5f, -166f)
                reflectiveQuadTo(507f, 196f)
                quadToRelative(45f, 62f, 69f, 134.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, 77f, -24f, 149.5f)
                reflectiveQuadTo(507f, 764f)
                close()
                moveTo(360f, 880f)
                quadToRelative(-31f, 0f, -61f, -4.5f)
                reflectiveQuadTo(240f, 862f)
                quadToRelative(125f, -41f, 202.5f, -146f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, -131f, -77.5f, -236f)
                reflectiveQuadTo(240f, 98f)
                quadToRelative(29f, -9f, 59f, -13.5f)
                reflectiveQuadToRelative(61f, -4.5f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(643f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(643f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(360f, 880f)
                close()
                moveToRelative(240f, -400f)
                close()
            }
        }.build()
        
        return _Brightness_3!!
    }

private var _Brightness_3: ImageVector? = null

