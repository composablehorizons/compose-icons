package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Rotate_90_degrees_cw: ImageVector
    get() {
        if (_Rotate_90_degrees_cw != null) return _Rotate_90_degrees_cw!!
        
        _Rotate_90_degrees_cw = ImageVector.Builder(
            name = "rotate_90_degrees_cw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                quadToRelative(-150f, 0f, -255f, -105f)
                reflectiveQuadTo(80f, 520f)
                quadToRelative(0f, -150f, 105.5f, -255f)
                reflectiveQuadTo(441f, 160f)
                horizontalLineToRelative(7f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(5f, 5f, 8f, 12.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadToRelative(-8f, 12.5f)
                lineTo(468f, 332f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(36f, -36f)
                horizontalLineToRelative(-7f)
                quadToRelative(-117f, 0f, -199f, 81.5f)
                reflectiveQuadTo(160f, 520f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(440f, 800f)
                quadToRelative(29f, 0f, 56.5f, -5.5f)
                reflectiveQuadTo(550f, 778f)
                quadToRelative(15f, -7f, 30f, -0.5f)
                reflectiveQuadToRelative(21f, 21.5f)
                quadToRelative(6f, 15f, 1f, 30.5f)
                reflectiveQuadTo(582f, 851f)
                quadToRelative(-34f, 14f, -69.5f, 21.5f)
                reflectiveQuadTo(440f, 880f)
                close()
                moveToRelative(212f, -148f)
                lineTo(468f, 548f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(184f, -184f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(184f, 184f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(708f, 732f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                close()
                moveToRelative(28f, -86f)
                lineToRelative(126f, -126f)
                lineToRelative(-126f, -126f)
                lineToRelative(-126f, 126f)
                lineToRelative(126f, 126f)
                close()
                moveToRelative(0f, -126f)
                close()
            }
        }.build()
        
        return _Rotate_90_degrees_cw!!
    }

private var _Rotate_90_degrees_cw: ImageVector? = null

