package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Altitude: ImageVector
    get() {
        if (_Altitude != null) return _Altitude!!
        
        _Altitude = ImageVector.Builder(
            name = "altitude",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                quadToRelative(-25f, 0f, -36f, -22f)
                reflectiveQuadToRelative(4f, -42f)
                lineToRelative(160f, -213f)
                quadToRelative(6f, -8f, 14.5f, -12f)
                reflectiveQuadToRelative(17.5f, -4f)
                quadToRelative(9f, 0f, 17.5f, 4f)
                reflectiveQuadToRelative(14.5f, 12f)
                lineToRelative(124f, 165f)
                quadToRelative(10f, 14f, 26f, 16f)
                reflectiveQuadToRelative(30f, -8f)
                quadToRelative(14f, -10f, 16.5f, -26.5f)
                reflectiveQuadTo(500f, 719f)
                lineToRelative(-72f, -95f)
                quadToRelative(-8f, -11f, -8f, -24f)
                reflectiveQuadToRelative(8f, -24f)
                lineToRelative(100f, -133f)
                quadToRelative(6f, -8f, 14.5f, -12f)
                reflectiveQuadToRelative(17.5f, -4f)
                quadToRelative(9f, 0f, 17.5f, 4f)
                reflectiveQuadToRelative(14.5f, 12f)
                lineToRelative(280f, 373f)
                quadToRelative(15f, 20f, 4f, 42f)
                reflectiveQuadToRelative(-36f, 22f)
                horizontalLineTo(120f)
                close()
                moveToRelative(640f, -400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 440f)
                verticalLineToRelative(-128f)
                lineToRelative(-37f, 36f)
                quadToRelative(-11f, 11f, -27f, 11.5f)
                reflectiveQuadTo(628f, 348f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(835f, 348f)
                lineToRelative(-35f, -35f)
                verticalLineToRelative(127f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 480f)
                close()
            }
        }.build()
        
        return _Altitude!!
    }

private var _Altitude: ImageVector? = null

