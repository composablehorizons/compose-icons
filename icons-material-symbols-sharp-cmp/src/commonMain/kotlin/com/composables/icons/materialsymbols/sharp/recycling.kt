package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Recycling: ImageVector
    get() {
        if (_Recycling != null) return _Recycling!!
        
        _Recycling = ImageVector.Builder(
            name = "recycling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 368f)
                lineToRelative(89f, -147f)
                lineToRelative(-59f, -98f)
                quadToRelative(-12f, -20f, -34.5f, -20f)
                reflectiveQuadTo(329f, 123f)
                lineToRelative(-98f, 163f)
                lineToRelative(137f, 82f)
                close()
                moveToRelative(387f, 272f)
                lineToRelative(-89f, -148f)
                lineToRelative(139f, -80f)
                lineToRelative(64f, 107f)
                quadToRelative(11f, 17f, 12f, 38f)
                reflectiveQuadToRelative(-9f, 39f)
                quadToRelative(-10f, 20f, -29.5f, 32f)
                reflectiveQuadTo(800f, 640f)
                horizontalLineToRelative(-45f)
                close()
                moveTo(640f, 920f)
                lineTo(480f, 760f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(190f)
                lineToRelative(-58f, 116f)
                quadToRelative(-11f, 20f, -30f, 32f)
                reflectiveQuadToRelative(-42f, 12f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-387f, -80f)
                quadToRelative(-20f, 0f, -36.5f, -10.5f)
                reflectiveQuadTo(192f, 802f)
                quadToRelative(-8f, -16f, -7.5f, -33.5f)
                reflectiveQuadTo(194f, 736f)
                lineToRelative(34f, -56f)
                horizontalLineToRelative(172f)
                verticalLineToRelative(160f)
                horizontalLineTo(253f)
                close()
                moveToRelative(-99f, -114f)
                lineTo(89f, 596f)
                quadToRelative(-9f, -18f, -8.5f, -38.5f)
                reflectiveQuadTo(92f, 519f)
                lineToRelative(16f, -27f)
                lineToRelative(-68f, -41f)
                lineToRelative(219f, -55f)
                lineToRelative(55f, 220f)
                lineToRelative(-69f, -42f)
                lineToRelative(-91f, 152f)
                close()
                moveToRelative(540f, -342f)
                lineToRelative(-219f, -55f)
                lineToRelative(69f, -41f)
                lineToRelative(-125f, -208f)
                horizontalLineToRelative(141f)
                quadToRelative(21f, 0f, 39.5f, 10.5f)
                reflectiveQuadTo(629f, 119f)
                lineToRelative(52f, 87f)
                lineToRelative(68f, -42f)
                lineToRelative(-55f, 220f)
                close()
            }
        }.build()
        
        return _Recycling!!
    }

private var _Recycling: ImageVector? = null

