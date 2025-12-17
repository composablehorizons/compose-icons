package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Rtt: ImageVector
    get() {
        if (_Rtt != null) return _Rtt!!
        
        _Rtt = ImageVector.Builder(
            name = "rtt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(425f, 840f)
                quadToRelative(-23f, 0f, -39f, -18f)
                reflectiveQuadToRelative(-12f, -41f)
                quadToRelative(3f, -19f, 17.5f, -31f)
                reflectiveQuadToRelative(33.5f, -12f)
                horizontalLineToRelative(49f)
                lineToRelative(82f, -516f)
                horizontalLineTo(456f)
                lineToRelative(-22f, 136f)
                quadToRelative(-3f, 19f, -17.5f, 31.5f)
                reflectiveQuadTo(382f, 402f)
                quadToRelative(-24f, 0f, -39.5f, -18.5f)
                reflectiveQuadTo(331f, 341f)
                lineToRelative(27f, -171f)
                quadToRelative(4f, -22f, 20.5f, -36f)
                reflectiveQuadToRelative(38.5f, -14f)
                horizontalLineToRelative(398f)
                quadToRelative(28f, 0f, 46f, 21f)
                reflectiveQuadToRelative(13f, 48f)
                lineToRelative(-27f, 169f)
                quadToRelative(-3f, 19f, -17.5f, 31.5f)
                reflectiveQuadTo(795f, 402f)
                quadToRelative(-24f, 0f, -40f, -18f)
                reflectiveQuadToRelative(-12f, -42f)
                lineToRelative(19f, -120f)
                horizontalLineTo(662f)
                lineToRelative(-82f, 516f)
                horizontalLineToRelative(33f)
                quadToRelative(23f, 0f, 39f, 18f)
                reflectiveQuadToRelative(12f, 41f)
                quadToRelative(-3f, 19f, -17.5f, 31f)
                reflectiveQuadTo(613f, 840f)
                horizontalLineTo(425f)
                close()
                moveTo(197f, 280f)
                quadToRelative(-19f, 0f, -30.5f, -14f)
                reflectiveQuadToRelative(-8.5f, -32f)
                quadToRelative(2f, -14f, 13f, -24f)
                reflectiveQuadToRelative(26f, -10f)
                horizontalLineToRelative(116f)
                lineToRelative(-13f, 80f)
                horizontalLineTo(197f)
                close()
                moveToRelative(-25f, 160f)
                quadToRelative(-19f, 0f, -30.5f, -14f)
                reflectiveQuadToRelative(-8.5f, -32f)
                quadToRelative(2f, -14f, 13f, -24f)
                reflectiveQuadToRelative(26f, -10f)
                horizontalLineToRelative(116f)
                lineToRelative(-13f, 80f)
                horizontalLineTo(172f)
                close()
                moveToRelative(-51f, 320f)
                quadToRelative(-18f, 0f, -30f, -14f)
                reflectiveQuadToRelative(-9f, -32f)
                quadToRelative(2f, -15f, 13f, -24.5f)
                reflectiveQuadToRelative(26f, -9.5f)
                horizontalLineToRelative(216f)
                lineToRelative(-12f, 80f)
                horizontalLineTo(121f)
                close()
                moveToRelative(26f, -160f)
                quadToRelative(-19f, 0f, -30.5f, -14f)
                reflectiveQuadToRelative(-8.5f, -32f)
                quadToRelative(2f, -14f, 13f, -24f)
                reflectiveQuadToRelative(26f, -10f)
                horizontalLineToRelative(216f)
                lineToRelative(-13f, 80f)
                horizontalLineTo(147f)
                close()
            }
        }.build()
        
        return _Rtt!!
    }

private var _Rtt: ImageVector? = null

