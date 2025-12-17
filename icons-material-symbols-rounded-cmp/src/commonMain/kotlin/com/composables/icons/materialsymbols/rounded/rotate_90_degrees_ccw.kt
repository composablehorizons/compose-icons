package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Rotate_90_degrees_ccw: ImageVector
    get() {
        if (_Rotate_90_degrees_ccw != null) return _Rotate_90_degrees_ccw!!
        
        _Rotate_90_degrees_ccw = ImageVector.Builder(
            name = "rotate_90_degrees_ccw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 880f)
                quadToRelative(-37f, 0f, -72.5f, -7.5f)
                reflectiveQuadTo(378f, 851f)
                quadToRelative(-15f, -6f, -20f, -21.5f)
                reflectiveQuadToRelative(1f, -30.5f)
                quadToRelative(6f, -15f, 21f, -21.5f)
                reflectiveQuadToRelative(30f, 0.5f)
                quadToRelative(26f, 11f, 53.5f, 16.5f)
                reflectiveQuadTo(520f, 800f)
                quadToRelative(117f, 0f, 198.5f, -81.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(0f, -117f, -82f, -198.5f)
                reflectiveQuadTo(519f, 240f)
                horizontalLineToRelative(-7f)
                lineToRelative(36f, 36f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(388f, 228f)
                quadToRelative(-5f, -5f, -8f, -12.5f)
                reflectiveQuadToRelative(-3f, -15.5f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(8f, -12.5f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-36f, 36f)
                horizontalLineToRelative(7f)
                quadToRelative(150f, 0f, 255.5f, 105f)
                reflectiveQuadTo(880f, 520f)
                quadToRelative(0f, 150f, -105f, 255f)
                reflectiveQuadTo(520f, 880f)
                close()
                moveTo(280f, 743f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(68f, 548f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadTo(57f, 520f)
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
                lineTo(308f, 732f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                close()
                moveToRelative(0f, -97f)
                lineToRelative(126f, -126f)
                lineToRelative(-126f, -126f)
                lineToRelative(-126f, 126f)
                lineToRelative(126f, 126f)
                close()
                moveToRelative(0f, -126f)
                close()
            }
        }.build()
        
        return _Rotate_90_degrees_ccw!!
    }

private var _Rotate_90_degrees_ccw: ImageVector? = null

