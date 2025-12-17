package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Downhill_skiing: ImageVector
    get() {
        if (_Downhill_skiing != null) return _Downhill_skiing!!
        
        _Downhill_skiing = ImageVector.Builder(
            name = "downhill_skiing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(740f, 920f)
                quadToRelative(-26f, 0f, -50.5f, -4f)
                reflectiveQuadTo(642f, 904f)
                lineTo(80f, 699f)
                lineToRelative(20f, -57f)
                lineToRelative(276f, 101f)
                lineToRelative(69f, -178f)
                lineToRelative(-143f, -149f)
                quadToRelative(-27f, -28f, -21.5f, -66.5f)
                reflectiveQuadTo(320f, 291f)
                lineToRelative(139f, -80f)
                quadToRelative(17f, -10f, 34.5f, -11.5f)
                reflectiveQuadTo(528f, 205f)
                quadToRelative(17f, 6f, 29.5f, 19f)
                reflectiveQuadToRelative(18.5f, 31f)
                lineToRelative(13f, 43f)
                quadToRelative(13f, 43f, 42.5f, 76f)
                reflectiveQuadToRelative(70.5f, 50f)
                lineToRelative(21f, -64f)
                lineToRelative(57f, 18f)
                lineToRelative(-45f, 138f)
                quadToRelative(-74f, -12f, -131f, -58f)
                reflectiveQuadToRelative(-84f, -114f)
                lineToRelative(-101f, 58f)
                lineToRelative(121f, 138f)
                lineToRelative(-89f, 230f)
                lineToRelative(124f, 45f)
                lineToRelative(84f, -257f)
                quadToRelative(14f, 5f, 28f, 9f)
                reflectiveQuadToRelative(29f, 7f)
                lineToRelative(-85f, 262f)
                lineToRelative(31f, 11f)
                quadToRelative(18f, 6f, 37.5f, 9.5f)
                reflectiveQuadTo(740f, 860f)
                quadToRelative(26f, 0f, 49.5f, -5f)
                reflectiveQuadToRelative(45.5f, -15f)
                lineToRelative(45f, 45f)
                quadToRelative(-32f, 17f, -67f, 26f)
                reflectiveQuadToRelative(-73f, 9f)
                close()
                moveToRelative(-80f, -660f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(580f, 180f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(660f, 100f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(740f, 180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(660f, 260f)
                close()
            }
        }.build()
        
        return _Downhill_skiing!!
    }

private var _Downhill_skiing: ImageVector? = null

