package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Add_diamond: ImageVector
    get() {
        if (_Add_diamond != null) return _Add_diamond!!
        
        _Add_diamond = ImageVector.Builder(
            name = "add_diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 520f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 440f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 520f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(40f, 360f)
                quadToRelative(-16f, 0f, -30.5f, -5.5f)
                reflectiveQuadTo(424f, 857f)
                lineTo(105f, 537f)
                quadToRelative(-11f, -12f, -18f, -26.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -16f, 7f, -30.5f)
                reflectiveQuadToRelative(18f, -25.5f)
                lineToRelative(319f, -320f)
                quadToRelative(12f, -12f, 26f, -18f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(16f, 0f, 31f, 6f)
                reflectiveQuadToRelative(26f, 18f)
                lineToRelative(318f, 320f)
                quadToRelative(11f, 12f, 18f, 26f)
                reflectiveQuadToRelative(7f, 30f)
                quadToRelative(0f, 16f, -6.5f, 30.5f)
                reflectiveQuadTo(855f, 537f)
                lineTo(537f, 857f)
                quadToRelative(-11f, 11f, -26f, 17f)
                reflectiveQuadToRelative(-31f, 6f)
                close()
                moveToRelative(0f, -80f)
                lineToRelative(319f, -320f)
                lineToRelative(-319f, -320f)
                lineToRelative(-319f, 320f)
                lineToRelative(319f, 320f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Add_diamond!!
    }

private var _Add_diamond: ImageVector? = null

