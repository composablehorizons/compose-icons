package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Humidity_percentage: ImageVector
    get() {
        if (_Humidity_percentage != null) return _Humidity_percentage!!
        
        _Humidity_percentage = ImageVector.Builder(
            name = "humidity_percentage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 720f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(640f, 660f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(580f, 600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(520f, 660f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(580f, 720f)
                close()
                moveToRelative(-230f, -30f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(204f, -204f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(553f, 430f)
                lineTo(350f, 633f)
                quadToRelative(-12f, 12f, -12f, 28.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                close()
                moveToRelative(30f, -170f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 460f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(380f, 400f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 460f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 520f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-137f, 0f, -228.5f, -94f)
                reflectiveQuadTo(160f, 552f)
                quadToRelative(0f, -62f, 28f, -124f)
                reflectiveQuadToRelative(70f, -119f)
                quadToRelative(42f, -57f, 91f, -107f)
                reflectiveQuadToRelative(91f, -87f)
                quadToRelative(8f, -8f, 18.5f, -11.5f)
                reflectiveQuadTo(480f, 100f)
                quadToRelative(11f, 0f, 21.5f, 3.5f)
                reflectiveQuadTo(520f, 115f)
                quadToRelative(42f, 37f, 91f, 87f)
                reflectiveQuadToRelative(91f, 107f)
                quadToRelative(42f, 57f, 70f, 119f)
                reflectiveQuadToRelative(28f, 124f)
                quadToRelative(0f, 140f, -91.5f, 234f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(104f, 0f, 172f, -70.5f)
                reflectiveQuadTo(720f, 552f)
                quadToRelative(0f, -73f, -60.5f, -165f)
                reflectiveQuadTo(480f, 186f)
                quadTo(361f, 295f, 300.5f, 387f)
                reflectiveQuadTo(240f, 552f)
                quadToRelative(0f, 107f, 68f, 177.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Humidity_percentage!!
    }

private var _Humidity_percentage: ImageVector? = null

