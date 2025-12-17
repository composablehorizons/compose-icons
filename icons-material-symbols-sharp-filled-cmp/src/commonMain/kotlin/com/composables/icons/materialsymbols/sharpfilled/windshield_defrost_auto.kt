package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Windshield_defrost_auto: ImageVector
    get() {
        if (_Windshield_defrost_auto != null) return _Windshield_defrost_auto!!
        
        _Windshield_defrost_auto = ImageVector.Builder(
            name = "windshield_defrost_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(520f)
                horizontalLineTo(280f)
                close()
                moveToRelative(59f, -279f)
                lineToRelative(-68f, -43f)
                lineToRelative(11f, -16f)
                quadToRelative(11f, -16f, 9f, -33f)
                reflectiveQuadToRelative(-15f, -31f)
                quadToRelative(-19f, -20f, -28.5f, -43f)
                reflectiveQuadToRelative(-9.5f, -47f)
                quadToRelative(0f, -18f, 5.5f, -36.5f)
                reflectiveQuadTo(260f, 316f)
                lineToRelative(11f, -17f)
                lineToRelative(68f, 43f)
                lineToRelative(-11f, 16f)
                quadToRelative(-11f, 16f, -9f, 33f)
                reflectiveQuadToRelative(15f, 31f)
                quadToRelative(19f, 20f, 28.5f, 43f)
                reflectiveQuadToRelative(9.5f, 47f)
                quadToRelative(0f, 18f, -5.5f, 36.5f)
                reflectiveQuadTo(350f, 584f)
                lineToRelative(-11f, 17f)
                close()
                moveToRelative(192f, 0f)
                lineToRelative(-68f, -43f)
                lineToRelative(11f, -16f)
                quadToRelative(11f, -16f, 9f, -33f)
                reflectiveQuadToRelative(-15f, -31f)
                quadToRelative(-19f, -20f, -28.5f, -43f)
                reflectiveQuadToRelative(-9.5f, -47f)
                quadToRelative(0f, -18f, 5.5f, -36.5f)
                reflectiveQuadTo(452f, 316f)
                lineToRelative(11f, -17f)
                lineToRelative(68f, 43f)
                lineToRelative(-11f, 16f)
                quadToRelative(-11f, 16f, -9f, 33f)
                reflectiveQuadToRelative(15f, 31f)
                quadToRelative(19f, 20f, 28f, 43f)
                reflectiveQuadToRelative(9f, 47f)
                quadToRelative(0f, 18f, -5.5f, 36.5f)
                reflectiveQuadTo(541f, 584f)
                lineToRelative(-10f, 17f)
                close()
                moveToRelative(-420f, -81f)
                lineTo(40f, 135f)
                quadToRelative(89f, -23f, 178.5f, -39f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(92f, 0f, 181.5f, 16f)
                reflectiveQuadTo(760f, 135f)
                lineToRelative(-71f, 385f)
                lineToRelative(-79f, -15f)
                lineToRelative(57f, -310f)
                quadToRelative(-66f, -15f, -132.5f, -25f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(-68f, 0f, -134.5f, 10f)
                reflectiveQuadTo(133f, 195f)
                lineToRelative(57f, 310f)
                lineToRelative(-79f, 15f)
                close()
            }
        }.build()
        
        return _Windshield_defrost_auto!!
    }

private var _Windshield_defrost_auto: ImageVector? = null

