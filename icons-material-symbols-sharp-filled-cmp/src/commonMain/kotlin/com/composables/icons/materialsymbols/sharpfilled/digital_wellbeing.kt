package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Digital_wellbeing: ImageVector
    get() {
        if (_Digital_wellbeing != null) return _Digital_wellbeing!!
        
        _Digital_wellbeing = ImageVector.Builder(
            name = "digital_wellbeing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 360f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(0f, 520f)
                lineTo(240f, 640f)
                quadToRelative(-20f, -20f, -30f, -45f)
                reflectiveQuadToRelative(-10f, -55f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(340f, 400f)
                quadToRelative(29f, 0f, 53.5f, 11f)
                reflectiveQuadToRelative(44.5f, 31f)
                lineToRelative(42f, 42f)
                lineToRelative(42f, -42f)
                quadToRelative(20f, -20f, 44.5f, -31f)
                reflectiveQuadToRelative(53.5f, -11f)
                quadToRelative(59f, 0f, 99.5f, 40.5f)
                reflectiveQuadTo(760f, 540f)
                quadToRelative(0f, 30f, -10f, 55f)
                reflectiveQuadToRelative(-30f, 45f)
                lineTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Digital_wellbeing!!
    }

private var _Digital_wellbeing: ImageVector? = null

