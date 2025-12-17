package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hdr_off: ImageVector
    get() {
        if (_Hdr_off != null) return _Hdr_off!!
        
        _Hdr_off = ImageVector.Builder(
            name = "hdr_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 875f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 678f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(820f, 874f)
                quadToRelative(-12f, 12f, -28.5f, 12.5f)
                reflectiveQuadTo(763f, 875f)
                close()
                moveToRelative(-63f, -355f)
                verticalLineToRelative(66f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-136f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(670f, 360f)
                horizontalLineToRelative(110f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 18f, -10.5f, 32.5f)
                reflectiveQuadTo(804f, 516f)
                lineToRelative(20f, 46f)
                quadToRelative(6f, 14f, -2f, 26f)
                reflectiveQuadToRelative(-24f, 12f)
                quadToRelative(-8f, 0f, -15f, -4f)
                reflectiveQuadToRelative(-10f, -12f)
                lineToRelative(-29f, -64f)
                horizontalLineToRelative(-44f)
                close()
                moveToRelative(0f, -60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-120f, 6f)
                lineTo(474f, 360f)
                horizontalLineToRelative(46f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(46f)
                close()
                moveToRelative(-400f, 34f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(150f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(120f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(150f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(180f, 390f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(290f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(320f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(290f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(260f, 570f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(200f, -64f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(44f)
                horizontalLineToRelative(45f)
                lineToRelative(55f, 56f)
                quadToRelative(-5f, 2f, -10f, 3f)
                reflectiveQuadToRelative(-10f, 1f)
                horizontalLineTo(410f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(380f, 570f)
                verticalLineToRelative(-134f)
                close()
            }
        }.build()
        
        return _Hdr_off!!
    }

private var _Hdr_off: ImageVector? = null

