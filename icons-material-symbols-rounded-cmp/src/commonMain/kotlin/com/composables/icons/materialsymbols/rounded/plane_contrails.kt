package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Plane_contrails: ImageVector
    get() {
        if (_Plane_contrails != null) return _Plane_contrails!!
        
        _Plane_contrails = ImageVector.Builder(
            name = "plane_contrails",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(348f, 852f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(128f, -127f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(532f, 725f)
                lineTo(405f, 852f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(348f, 852f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(107f, -107f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(712f, 745f)
                lineTo(605f, 852f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(548f, 852f)
                close()
                moveTo(108f, 412f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(107f, -107f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(272f, 305f)
                lineTo(165f, 412f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(108f, 412f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(127f, -127f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(292f, 485f)
                lineTo(165f, 612f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(108f, 612f)
                close()
                moveToRelative(379f, -140f)
                lineToRelative(-95f, -53f)
                quadToRelative(-12f, -7f, -13f, -21.5f)
                reflectiveQuadToRelative(17f, -32.5f)
                quadToRelative(5f, -5f, 11.5f, -7.5f)
                reflectiveQuadToRelative(13.5f, -0.5f)
                lineToRelative(80f, 16f)
                lineToRelative(78f, -78f)
                lineToRelative(-192f, -77f)
                quadToRelative(-17f, -7f, -20f, -24f)
                reflectiveQuadToRelative(10f, -29f)
                lineToRelative(11f, -11f)
                quadToRelative(5f, -5f, 12.5f, -7.5f)
                reflectiveQuadToRelative(15.5f, -0.5f)
                lineToRelative(271f, 42f)
                lineToRelative(91f, -90f)
                quadToRelative(9f, -9f, 20f, -13.5f)
                reflectiveQuadToRelative(22f, -4.5f)
                quadToRelative(11f, 0f, 22f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                quadToRelative(9f, 8f, 13.5f, 19f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(0f, 11f, -4.5f, 22.5f)
                reflectiveQuadTo(862f, 182f)
                lineToRelative(-91f, 90f)
                lineToRelative(42f, 269f)
                quadToRelative(2f, 8f, -0.5f, 16.5f)
                reflectiveQuadTo(804f, 572f)
                lineToRelative(-4f, 5f)
                quadToRelative(-14f, 15f, -34f, 11f)
                reflectiveQuadToRelative(-28f, -23f)
                lineToRelative(-74f, -185f)
                lineToRelative(-78f, 78f)
                lineToRelative(15f, 78f)
                quadToRelative(2f, 8f, -0.5f, 16f)
                reflectiveQuadTo(588f, 570f)
                quadToRelative(-11f, 11f, -27f, 8.5f)
                reflectiveQuadTo(537f, 562f)
                lineToRelative(-50f, -90f)
                close()
            }
        }.build()
        
        return _Plane_contrails!!
    }

private var _Plane_contrails: ImageVector? = null

