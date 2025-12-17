package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bedtime_off: ImageVector
    get() {
        if (_Bedtime_off != null) return _Bedtime_off!!
        
        _Bedtime_off = ImageVector.Builder(
            name = "bedtime_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 709f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 710f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(14f, -13f, 23.5f, -26f)
                reflectiveQuadToRelative(18.5f, -32f)
                quadToRelative(-85f, -8f, -161.5f, -44.5f)
                reflectiveQuadTo(506f, 453f)
                quadToRelative(-63f, -63f, -99f, -139f)
                reflectiveQuadToRelative(-43f, -160f)
                quadToRelative(-20f, 11f, -31f, 19f)
                reflectiveQuadToRelative(-28f, 24f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(30f, -27f, 60.5f, -46f)
                reflectiveQuadToRelative(77.5f, -40f)
                quadToRelative(20f, -9f, 39.5f, 5f)
                reflectiveQuadToRelative(18.5f, 37f)
                quadToRelative(-3f, 85f, 27.5f, 162f)
                reflectiveQuadTo(563f, 396f)
                quadToRelative(60f, 60f, 138f, 91.5f)
                reflectiveQuadTo(862f, 516f)
                quadToRelative(23f, -1f, 36.5f, 18f)
                reflectiveQuadToRelative(5.5f, 41f)
                quadToRelative(-15f, 39f, -35.5f, 71f)
                reflectiveQuadTo(819f, 709f)
                close()
                moveTo(748f, 894f)
                lineToRelative(-81f, -80f)
                quadToRelative(-35f, 13f, -71f, 19.5f)
                reflectiveQuadToRelative(-72f, 6.5f)
                quadToRelative(-84f, 0f, -157.5f, -32f)
                reflectiveQuadToRelative(-128f, -86.5f)
                quadTo(184f, 667f, 152f, 593.5f)
                reflectiveQuadTo(120f, 436f)
                quadToRelative(0f, -36f, 6.5f, -72f)
                reflectiveQuadToRelative(19.5f, -71f)
                lineToRelative(-78f, -78f)
                quadToRelative(-12f, -12f, -12f, -29f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                lineToRelative(678f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11.5f)
                reflectiveQuadTo(748f, 894f)
                close()
                moveTo(524f, 760f)
                quadToRelative(20f, 0f, 39.5f, -2.5f)
                reflectiveQuadTo(603f, 750f)
                lineTo(210f, 357f)
                quadToRelative(-5f, 21f, -7.5f, 40.5f)
                reflectiveQuadTo(200f, 436f)
                quadToRelative(0f, 135f, 94.5f, 229.5f)
                reflectiveQuadTo(524f, 760f)
                close()
                moveTo(406f, 553f)
                close()
                moveToRelative(116f, -116f)
                close()
            }
        }.build()
        
        return _Bedtime_off!!
    }

private var _Bedtime_off: ImageVector? = null

