package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Phone_disabled: ImageVector
    get() {
        if (_Phone_disabled != null) return _Phone_disabled!!
        
        _Phone_disabled = ImageVector.Builder(
            name = "phone_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(764f, 880f)
                lineTo(570f, 686f)
                quadToRelative(-89f, 72f, -193.5f, 113f)
                reflectiveQuadTo(162f, 840f)
                quadToRelative(-24f, 0f, -33f, -12f)
                reflectiveQuadToRelative(-9f, -30f)
                verticalLineToRelative(-162f)
                quadToRelative(0f, -14f, 9f, -24.5f)
                reflectiveQuadToRelative(23f, -13.5f)
                lineToRelative(138f, -28f)
                quadToRelative(11f, -2f, 27.5f, 3f)
                reflectiveQuadToRelative(24.5f, 13f)
                lineToRelative(94f, 94f)
                quadToRelative(18f, -11f, 39f, -25f)
                reflectiveQuadToRelative(37f, -27f)
                lineTo(84f, 200f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(-81f, -307f)
                lineToRelative(-57f, -57f)
                quadToRelative(14f, -17f, 29.5f, -39f)
                reflectiveQuadToRelative(25.5f, -41f)
                lineToRelative(-97f, -98f)
                quadToRelative(-8f, -8f, -11f, -22.5f)
                reflectiveQuadToRelative(-1f, -23.5f)
                lineToRelative(26f, -140f)
                quadToRelative(3f, -14f, 13.5f, -23f)
                reflectiveQuadToRelative(24.5f, -9f)
                horizontalLineToRelative(162f)
                quadToRelative(18f, 0f, 30f, 12f)
                reflectiveQuadToRelative(12f, 30f)
                quadToRelative(0f, 110f, -41.5f, 215f)
                reflectiveQuadTo(683f, 573f)
                close()
            }
        }.build()
        
        return _Phone_disabled!!
    }

private var _Phone_disabled: ImageVector? = null

