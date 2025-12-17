package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Scuba_diving: ImageVector
    get() {
        if (_Scuba_diving != null) return _Scuba_diving!!
        
        _Scuba_diving = ImageVector.Builder(
            name = "scuba_diving",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 920f)
                lineTo(96f, 872f)
                lineToRelative(114f, -152f)
                lineToRelative(31f, -178f)
                quadToRelative(3f, -24f, 19f, -42.5f)
                reflectiveQuadToRelative(41f, -24.5f)
                lineToRelative(379f, -115f)
                lineToRelative(80f, -160f)
                lineToRelative(120f, -120f)
                lineToRelative(40f, 40f)
                lineToRelative(-100f, 116f)
                lineToRelative(-60f, 184f)
                lineToRelative(-200f, 140f)
                lineToRelative(-234f, 74f)
                lineToRelative(-46f, 126f)
                lineTo(160f, 920f)
                close()
                moveToRelative(-40f, -320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 520f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(120f, 600f)
                close()
                moveToRelative(236f, -196f)
                quadToRelative(-24f, 7f, -45.5f, -5.5f)
                reflectiveQuadTo(282f, 362f)
                quadToRelative(-7f, -24f, 5.5f, -46f)
                reflectiveQuadToRelative(36.5f, -28f)
                lineToRelative(182f, -48f)
                lineToRelative(31f, 116f)
                lineToRelative(-181f, 48f)
                close()
            }
        }.build()
        
        return _Scuba_diving!!
    }

private var _Scuba_diving: ImageVector? = null

