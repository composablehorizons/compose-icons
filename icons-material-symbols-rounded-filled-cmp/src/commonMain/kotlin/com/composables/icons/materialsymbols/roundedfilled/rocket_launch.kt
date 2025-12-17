package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Rocket_launch: ImageVector
    get() {
        if (_Rocket_launch != null) return _Rocket_launch!!
        
        _Rocket_launch = ImageVector.Builder(
            name = "rocket_launch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(245f, 486f)
                quadToRelative(26f, -66f, 62.5f, -127f)
                reflectiveQuadTo(390f, 244f)
                lineToRelative(-52f, -11f)
                quadToRelative(-20f, -4f, -39f, 2f)
                reflectiveQuadToRelative(-33f, 20f)
                lineTo(140f, 381f)
                quadToRelative(-15f, 15f, -11.5f, 36f)
                reflectiveQuadToRelative(23.5f, 29f)
                lineToRelative(93f, 40f)
                close()
                moveToRelative(588f, -390f)
                quadToRelative(-106f, -5f, -201.5f, 41f)
                reflectiveQuadTo(461f, 258f)
                quadToRelative(-48f, 48f, -84.5f, 104f)
                reflectiveQuadTo(313f, 480f)
                quadToRelative(-5f, 13f, -5f, 26.5f)
                reflectiveQuadToRelative(10f, 23.5f)
                lineToRelative(125f, 125f)
                quadToRelative(10f, 10f, 23.5f, 10f)
                reflectiveQuadToRelative(26.5f, -5f)
                quadToRelative(62f, -27f, 118f, -63.5f)
                reflectiveQuadTo(715f, 512f)
                quadToRelative(75f, -75f, 121f, -170.5f)
                reflectiveQuadTo(877f, 140f)
                quadToRelative(0f, -8f, -4f, -16f)
                reflectiveQuadToRelative(-10f, -14f)
                quadToRelative(-6f, -6f, -14f, -10f)
                reflectiveQuadToRelative(-16f, -4f)
                close()
                moveTo(579f, 394f)
                quadToRelative(-23f, -23f, -23f, -56.5f)
                reflectiveQuadToRelative(23f, -56.5f)
                quadToRelative(23f, -23f, 56.5f, -23f)
                reflectiveQuadToRelative(56.5f, 23f)
                quadToRelative(23f, 23f, 23f, 56.5f)
                reflectiveQuadTo(692f, 394f)
                quadToRelative(-23f, 23f, -56.5f, 23f)
                reflectiveQuadTo(579f, 394f)
                close()
                moveToRelative(-92f, 334f)
                lineToRelative(40f, 93f)
                quadToRelative(8f, 20f, 29f, 24f)
                reflectiveQuadToRelative(36f, -11f)
                lineToRelative(126f, -126f)
                quadToRelative(14f, -14f, 20f, -33.5f)
                reflectiveQuadToRelative(2f, -39.5f)
                lineToRelative(-10f, -52f)
                quadToRelative(-55f, 46f, -115.5f, 82.5f)
                reflectiveQuadTo(487f, 728f)
                close()
                moveToRelative(-325f, -86f)
                quadToRelative(35f, -35f, 85f, -35.5f)
                reflectiveQuadToRelative(85f, 34.5f)
                quadToRelative(35f, 35f, 35f, 85f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(-48f, 48f, -113.5f, 57f)
                reflectiveQuadTo(87f, 886f)
                quadToRelative(9f, -66f, 18.5f, -131.5f)
                reflectiveQuadTo(162f, 642f)
                close()
            }
        }.build()
        
        return _Rocket_launch!!
    }

private var _Rocket_launch: ImageVector? = null

