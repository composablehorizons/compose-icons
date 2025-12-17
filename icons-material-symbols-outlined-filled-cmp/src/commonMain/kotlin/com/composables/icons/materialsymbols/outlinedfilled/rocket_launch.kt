package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Rocket_launch: ImageVector
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
                moveTo(98f, 423f)
                lineToRelative(168f, -168f)
                quadToRelative(14f, -14f, 33f, -20f)
                reflectiveQuadToRelative(39f, -2f)
                lineToRelative(52f, 11f)
                quadToRelative(-54f, 64f, -85f, 116f)
                reflectiveQuadToRelative(-60f, 126f)
                lineTo(98f, 423f)
                close()
                moveToRelative(205f, 91f)
                quadToRelative(23f, -72f, 62.5f, -136f)
                reflectiveQuadTo(461f, 258f)
                quadToRelative(88f, -88f, 201f, -131.5f)
                reflectiveQuadTo(873f, 100f)
                quadToRelative(17f, 98f, -26f, 211f)
                reflectiveQuadTo(716f, 512f)
                quadToRelative(-55f, 55f, -120f, 95.5f)
                reflectiveQuadTo(459f, 671f)
                lineTo(303f, 514f)
                close()
                moveToRelative(276f, -120f)
                quadToRelative(23f, 23f, 56.5f, 23f)
                reflectiveQuadToRelative(56.5f, -23f)
                quadToRelative(23f, -23f, 23f, -56.5f)
                reflectiveQuadTo(692f, 281f)
                quadToRelative(-23f, -23f, -56.5f, -23f)
                reflectiveQuadTo(579f, 281f)
                quadToRelative(-23f, 23f, -23f, 56.5f)
                reflectiveQuadToRelative(23f, 56.5f)
                close()
                moveTo(551f, 875f)
                lineToRelative(-64f, -147f)
                quadToRelative(74f, -29f, 126.5f, -60f)
                reflectiveQuadTo(730f, 583f)
                lineToRelative(10f, 52f)
                quadToRelative(4f, 20f, -2f, 39.5f)
                reflectiveQuadTo(718f, 708f)
                lineTo(551f, 875f)
                close()
                moveTo(162f, 642f)
                quadToRelative(35f, -35f, 85f, -35.5f)
                reflectiveQuadToRelative(85f, 34.5f)
                quadToRelative(35f, 35f, 35f, 85f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(-25f, 25f, -83.5f, 43f)
                reflectiveQuadTo(87f, 886f)
                quadToRelative(14f, -103f, 32f, -161f)
                reflectiveQuadToRelative(43f, -83f)
                close()
            }
        }.build()
        
        return _Rocket_launch!!
    }

private var _Rocket_launch: ImageVector? = null

