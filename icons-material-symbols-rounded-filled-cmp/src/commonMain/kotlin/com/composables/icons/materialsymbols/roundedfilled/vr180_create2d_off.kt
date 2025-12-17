package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Vr180_create2d_off: ImageVector
    get() {
        if (_Vr180_create2d_off != null) return _Vr180_create2d_off!!
        
        _Vr180_create2d_off = ImageVector.Builder(
            name = "vr180_create2d_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(125f, 237f)
                lineToRelative(-72f, -72f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(711f, 711f)
                quadToRelative(12f, 12f, 10.5f, 29.5f)
                reflectiveQuadTo(816f, 880f)
                quadToRelative(-10f, 10f, -24f, 10f)
                reflectiveQuadToRelative(-24f, -10f)
                horizontalLineTo(480f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                verticalLineToRelative(-288f)
                lineToRelative(-75f, -74f)
                quadToRelative(-3f, 11f, -4f, 21f)
                reflectiveQuadToRelative(-1f, 21f)
                verticalLineToRelative(171f)
                quadToRelative(0f, 22f, -18f, 34.5f)
                reflectiveQuadToRelative(-38f, 4.5f)
                quadToRelative(-84f, -39f, -134f, -117f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -45f, 12f, -86f)
                reflectiveQuadToRelative(33f, -77f)
                close()
                moveToRelative(527f, 83f)
                horizontalLineTo(480f)
                quadToRelative(-11f, 0f, -21f, 1f)
                reflectiveQuadToRelative(-21f, 4f)
                lineTo(274f, 161f)
                quadToRelative(-14f, -14f, -10f, -33f)
                reflectiveQuadToRelative(21f, -27f)
                quadToRelative(27f, -11f, 56f, -16f)
                reflectiveQuadToRelative(59f, -5f)
                quadToRelative(94f, 0f, 173f, 50f)
                reflectiveQuadToRelative(118f, 135f)
                quadToRelative(9f, 20f, -3.5f, 37.5f)
                reflectiveQuadTo(652f, 320f)
                close()
                moveToRelative(228f, 160f)
                verticalLineToRelative(190f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(812f, 699f)
                lineTo(581f, 468f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(610f, 400f)
                horizontalLineToRelative(190f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 480f)
                close()
                moveTo(520f, 760f)
                horizontalLineToRelative(128f)
                lineToRelative(-28f, -29f)
                lineToRelative(-57f, -56f)
                lineToRelative(-51f, 69f)
                quadToRelative(-4f, 5f, -1f, 10.5f)
                reflectiveQuadToRelative(9f, 5.5f)
                close()
            }
        }.build()
        
        return _Vr180_create2d_off!!
    }

private var _Vr180_create2d_off: ImageVector? = null

