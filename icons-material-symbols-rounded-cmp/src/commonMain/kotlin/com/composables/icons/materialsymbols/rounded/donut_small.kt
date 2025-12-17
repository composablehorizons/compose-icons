package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Donut_small: ImageVector
    get() {
        if (_Donut_small != null) return _Donut_small!!
        
        _Donut_small = ImageVector.Builder(
            name = "donut_small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(521f, 130f)
                quadToRelative(0f, -20f, 16f, -32f)
                reflectiveQuadToRelative(36f, -7f)
                quadToRelative(112f, 24f, 193.5f, 107f)
                reflectiveQuadTo(872f, 396f)
                quadToRelative(4f, 17f, -7.5f, 30.5f)
                reflectiveQuadTo(833f, 440f)
                horizontalLineTo(602f)
                quadToRelative(-4f, 0f, -7f, -2f)
                reflectiveQuadToRelative(-5f, -6f)
                quadToRelative(-9f, -21f, -25f, -37.5f)
                reflectiveQuadTo(529f, 369f)
                quadToRelative(-4f, -2f, -6f, -4.5f)
                reflectiveQuadToRelative(-2f, -6.5f)
                verticalLineToRelative(-228f)
                close()
                moveToRelative(80f, 54f)
                verticalLineToRelative(136f)
                quadToRelative(11f, 9f, 21f, 19f)
                reflectiveQuadToRelative(19f, 21f)
                horizontalLineToRelative(136f)
                quadToRelative(-24f, -60f, -70f, -106f)
                reflectiveQuadToRelative(-106f, -70f)
                close()
                moveTo(389f, 869f)
                quadToRelative(-134f, -31f, -221f, -139f)
                reflectiveQuadTo(81f, 480f)
                quadToRelative(0f, -142f, 87f, -249.5f)
                reflectiveQuadTo(389f, 91f)
                quadToRelative(20f, -5f, 36f, 8f)
                reflectiveQuadToRelative(16f, 33f)
                verticalLineToRelative(228f)
                quadToRelative(0f, 1f, -6f, 8f)
                quadToRelative(-34f, 14f, -54f, 44.5f)
                reflectiveQuadTo(361f, 480f)
                quadToRelative(0f, 37f, 20f, 66.5f)
                reflectiveQuadToRelative(54f, 43.5f)
                quadToRelative(2f, 1f, 6f, 8f)
                verticalLineToRelative(232f)
                quadToRelative(0f, 20f, -16f, 32f)
                reflectiveQuadToRelative(-36f, 7f)
                close()
                moveToRelative(-28f, -685f)
                quadToRelative(-91f, 35f, -145.5f, 116f)
                reflectiveQuadTo(161f, 480f)
                quadToRelative(0f, 99f, 54.5f, 180f)
                reflectiveQuadTo(361f, 778f)
                verticalLineToRelative(-138f)
                quadToRelative(-38f, -29f, -59f, -70.5f)
                reflectiveQuadTo(281f, 480f)
                quadToRelative(0f, -48f, 21f, -89.5f)
                reflectiveQuadToRelative(59f, -70.5f)
                verticalLineToRelative(-136f)
                close()
                moveTo(573f, 869f)
                quadToRelative(-20f, 5f, -36f, -7f)
                reflectiveQuadToRelative(-16f, -32f)
                verticalLineToRelative(-229f)
                quadToRelative(0f, -4f, 2f, -7f)
                reflectiveQuadToRelative(6f, -5f)
                quadToRelative(20f, -9f, 36f, -25f)
                reflectiveQuadToRelative(25f, -36f)
                quadToRelative(1f, -2f, 11f, -8f)
                horizontalLineToRelative(232f)
                quadToRelative(18f, 0f, 30f, 15f)
                reflectiveQuadToRelative(8f, 34f)
                quadToRelative(-25f, 115f, -107f, 196f)
                reflectiveQuadTo(573f, 869f)
                close()
                moveToRelative(68f, -269f)
                quadToRelative(-8f, 11f, -18.5f, 21f)
                reflectiveQuadTo(601f, 640f)
                verticalLineToRelative(136f)
                quadToRelative(60f, -24f, 106f, -70f)
                reflectiveQuadToRelative(70f, -106f)
                horizontalLineTo(641f)
                close()
                moveTo(281f, 481f)
                close()
                moveToRelative(360f, -121f)
                close()
                moveToRelative(0f, 240f)
                close()
            }
        }.build()
        
        return _Donut_small!!
    }

private var _Donut_small: ImageVector? = null

