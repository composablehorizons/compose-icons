package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Procedure: ImageVector
    get() {
        if (_Procedure != null) return _Procedure!!
        
        _Procedure = ImageVector.Builder(
            name = "procedure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 440f)
                quadToRelative(-38f, 0f, -81f, -21.5f)
                reflectiveQuadTo(599f, 359f)
                quadToRelative(-37f, -38f, -58.5f, -81f)
                reflectiveQuadTo(519f, 198f)
                quadToRelative(0f, -17f, 5f, -31f)
                reflectiveQuadToRelative(15f, -24f)
                quadToRelative(26f, -26f, 105.5f, -45.5f)
                reflectiveQuadTo(794f, 81f)
                quadToRelative(25f, 2f, 41.5f, 6f)
                reflectiveQuadToRelative(24.5f, 12f)
                quadToRelative(7f, 7f, 11.5f, 21.5f)
                reflectiveQuadTo(878f, 157f)
                quadToRelative(5f, 69f, -14f, 152f)
                reflectiveQuadToRelative(-46f, 110f)
                quadToRelative(-10f, 10f, -25.5f, 15.5f)
                reflectiveQuadTo(760f, 440f)
                close()
                moveToRelative(35f, -200f)
                quadToRelative(2f, -18f, 3f, -38f)
                reflectiveQuadToRelative(2f, -42f)
                quadToRelative(-20f, -1f, -40.5f, 0.5f)
                reflectiveQuadTo(719f, 164f)
                quadToRelative(11f, 8f, 21.5f, 17f)
                reflectiveQuadToRelative(19.5f, 18f)
                quadToRelative(10f, 10f, 18.5f, 20f)
                reflectiveQuadToRelative(16.5f, 21f)
                close()
                moveToRelative(-35f, 120f)
                quadToRelative(1f, -20f, -15f, -49.5f)
                reflectiveQuadTo(703f, 256f)
                quadToRelative(-25f, -25f, -53.5f, -40.5f)
                reflectiveQuadTo(601f, 200f)
                quadToRelative(2f, 23f, 17f, 52f)
                reflectiveQuadToRelative(37f, 51f)
                quadToRelative(24f, 24f, 52.5f, 39.5f)
                reflectiveQuadTo(760f, 360f)
                close()
                moveToRelative(-96f, 200f)
                horizontalLineTo(297f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(241f, 537f)
                lineTo(80f, 376f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(160f, 160f)
                horizontalLineToRelative(367f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(161f, 161f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(664f, 560f)
                close()
                moveTo(360f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 840f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 640f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 720f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Procedure!!
    }

private var _Procedure: ImageVector? = null

