package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Paid: ImageVector
    get() {
        if (_Paid != null) return _Paid!!
        
        _Paid = ImageVector.Builder(
            name = "paid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(444f, 760f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-50f)
                quadToRelative(50f, -9f, 86f, -39f)
                reflectiveQuadToRelative(36f, -89f)
                quadToRelative(0f, -42f, -24f, -77f)
                reflectiveQuadToRelative(-96f, -61f)
                quadToRelative(-60f, -20f, -83f, -35f)
                reflectiveQuadToRelative(-23f, -41f)
                quadToRelative(0f, -26f, 18.5f, -41f)
                reflectiveQuadToRelative(53.5f, -15f)
                quadToRelative(32f, 0f, 50f, 15.5f)
                reflectiveQuadToRelative(26f, 38.5f)
                lineToRelative(64f, -26f)
                quadToRelative(-11f, -35f, -40.5f, -61f)
                reflectiveQuadTo(516f, 250f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(50f)
                quadToRelative(-50f, 11f, -78f, 44f)
                reflectiveQuadToRelative(-28f, 74f)
                quadToRelative(0f, 47f, 27.5f, 76f)
                reflectiveQuadToRelative(86.5f, 50f)
                quadToRelative(63f, 23f, 87.5f, 41f)
                reflectiveQuadToRelative(24.5f, 47f)
                quadToRelative(0f, 33f, -23.5f, 48.5f)
                reflectiveQuadTo(486f, 646f)
                quadToRelative(-33f, 0f, -58.5f, -20.5f)
                reflectiveQuadTo(390f, 564f)
                lineToRelative(-66f, 26f)
                quadToRelative(14f, 48f, 43.5f, 77.5f)
                reflectiveQuadTo(444f, 708f)
                verticalLineToRelative(52f)
                close()
                moveToRelative(36f, 120f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Paid!!
    }

private var _Paid: ImageVector? = null

