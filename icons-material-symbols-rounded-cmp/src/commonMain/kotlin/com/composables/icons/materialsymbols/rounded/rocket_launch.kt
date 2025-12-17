package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Rocket_launch: ImageVector
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
                moveTo(284f, 454f)
                quadToRelative(14f, -28f, 29f, -54f)
                reflectiveQuadToRelative(33f, -52f)
                lineToRelative(-56f, -11f)
                lineToRelative(-84f, 84f)
                lineToRelative(78f, 33f)
                close()
                moveToRelative(482f, -275f)
                quadToRelative(-70f, 2f, -149.5f, 41f)
                reflectiveQuadTo(472f, 324f)
                quadToRelative(-42f, 42f, -75f, 90f)
                reflectiveQuadToRelative(-49f, 90f)
                lineToRelative(114f, 113f)
                quadToRelative(42f, -16f, 90f, -49f)
                reflectiveQuadToRelative(90f, -75f)
                quadToRelative(65f, -65f, 104f, -144f)
                reflectiveQuadToRelative(41f, -149f)
                quadToRelative(0f, -4f, -1.5f, -8f)
                reflectiveQuadToRelative(-4.5f, -7f)
                quadToRelative(-3f, -3f, -7f, -4.5f)
                reflectiveQuadToRelative(-8f, -1.5f)
                close()
                moveTo(546f, 419f)
                quadToRelative(-23f, -23f, -23f, -56.5f)
                reflectiveQuadToRelative(23f, -56.5f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                quadToRelative(23f, 23f, 23f, 56.5f)
                reflectiveQuadTo(660f, 419f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                close()
                moveToRelative(-34f, 262f)
                lineToRelative(33f, 79f)
                lineToRelative(84f, -84f)
                lineToRelative(-11f, -56f)
                quadToRelative(-26f, 18f, -52f, 32.5f)
                reflectiveQuadTo(512f, 681f)
                close()
                moveToRelative(351f, -534f)
                quadToRelative(8f, 110f, -36f, 214.5f)
                reflectiveQuadTo(688f, 561f)
                lineToRelative(20f, 99f)
                quadToRelative(4f, 20f, -2f, 39f)
                reflectiveQuadToRelative(-20f, 33f)
                lineTo(560f, 858f)
                quadToRelative(-15f, 15f, -36f, 11.5f)
                reflectiveQuadTo(495f, 846f)
                lineToRelative(-61f, -143f)
                lineToRelative(-171f, -171f)
                lineToRelative(-143f, -61f)
                quadToRelative(-20f, -8f, -24f, -29f)
                reflectiveQuadToRelative(11f, -36f)
                lineToRelative(126f, -126f)
                quadToRelative(14f, -14f, 33.5f, -20f)
                reflectiveQuadToRelative(39.5f, -2f)
                lineToRelative(99f, 20f)
                quadToRelative(95f, -95f, 199.5f, -139f)
                reflectiveQuadTo(819f, 103f)
                quadToRelative(8f, 1f, 16f, 4.5f)
                reflectiveQuadToRelative(14f, 9.5f)
                quadToRelative(6f, 6f, 9.5f, 14f)
                reflectiveQuadToRelative(4.5f, 16f)
                close()
                moveTo(157f, 639f)
                quadToRelative(35f, -35f, 85.5f, -35.5f)
                reflectiveQuadTo(328f, 638f)
                quadToRelative(35f, 35f, 34.5f, 85.5f)
                reflectiveQuadTo(327f, 809f)
                quadToRelative(-48f, 48f, -113.5f, 57f)
                reflectiveQuadTo(82f, 884f)
                quadToRelative(9f, -66f, 18f, -131.5f)
                reflectiveQuadTo(157f, 639f)
                close()
                moveToRelative(57f, 56f)
                quadToRelative(-17f, 17f, -23.5f, 41f)
                reflectiveQuadTo(180f, 785f)
                quadToRelative(25f, -4f, 49f, -10f)
                reflectiveQuadToRelative(41f, -23f)
                quadToRelative(12f, -12f, 13f, -29f)
                reflectiveQuadToRelative(-11f, -29f)
                quadToRelative(-12f, -12f, -29f, -11.5f)
                reflectiveQuadTo(214f, 695f)
                close()
            }
        }.build()
        
        return _Rocket_launch!!
    }

private var _Rocket_launch: ImageVector? = null

