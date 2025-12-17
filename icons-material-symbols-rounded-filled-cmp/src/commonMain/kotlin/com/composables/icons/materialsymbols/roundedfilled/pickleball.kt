package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pickleball: ImageVector
    get() {
        if (_Pickleball != null) return _Pickleball!!
        
        _Pickleball = ImageVector.Builder(
            name = "pickleball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(372f, 695f)
                quadToRelative(-40f, 0f, -77.5f, -15f)
                reflectiveQuadTo(227f, 635f)
                lineTo(75f, 484f)
                quadToRelative(-17f, -17f, -26f, -39.5f)
                reflectiveQuadTo(40f, 399f)
                quadToRelative(0f, -23f, 9f, -45.5f)
                reflectiveQuadTo(75f, 314f)
                lineToRelative(159f, -159f)
                quadToRelative(17f, -17f, 39.5f, -26f)
                reflectiveQuadToRelative(45.5f, -9f)
                quadToRelative(23f, 0f, 45.5f, 9f)
                reflectiveQuadToRelative(39.5f, 26f)
                lineToRelative(151f, 152f)
                quadToRelative(30f, 30f, 45f, 67.5f)
                reflectiveQuadToRelative(15f, 77.5f)
                quadToRelative(0f, 36f, -12.5f, 71.5f)
                reflectiveQuadTo(564f, 588f)
                lineToRelative(207f, 207f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(771f, 852f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(508f, 645f)
                quadToRelative(-29f, 26f, -64.5f, 38f)
                reflectiveQuadTo(372f, 695f)
                close()
                moveToRelative(408f, -335f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
            }
        }.build()
        
        return _Pickleball!!
    }

private var _Pickleball: ImageVector? = null

