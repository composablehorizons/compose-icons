package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Subscript: ImageVector
    get() {
        if (_Subscript != null) return _Subscript!!
        
        _Subscript = ImageVector.Builder(
            name = "subscript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 760f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(780f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 640f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 720f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineTo(800f)
                close()
                moveToRelative(-483f, -80f)
                quadToRelative(-27f, 0f, -39.5f, -23f)
                reflectiveQuadToRelative(1.5f, -46f)
                lineToRelative(141f, -222f)
                lineToRelative(-128f, -201f)
                quadToRelative(-14f, -22f, -1.5f, -45f)
                reflectiveQuadToRelative(38.5f, -23f)
                quadToRelative(12f, 0f, 22f, 5.5f)
                reflectiveQuadToRelative(16f, 15.5f)
                lineToRelative(111f, 179f)
                horizontalLineToRelative(4f)
                lineToRelative(110f, -179f)
                quadToRelative(6f, -10f, 16.5f, -15.5f)
                reflectiveQuadTo(630f, 160f)
                quadToRelative(27f, 0f, 39f, 23f)
                reflectiveQuadToRelative(-2f, 46f)
                lineTo(539f, 429f)
                lineToRelative(142f, 222f)
                quadToRelative(14f, 23f, 1f, 46f)
                reflectiveQuadToRelative(-39f, 23f)
                quadToRelative(-12f, 0f, -22f, -5.5f)
                reflectiveQuadTo(605f, 699f)
                lineTo(482f, 503f)
                horizontalLineToRelative(-4f)
                lineTo(355f, 699f)
                quadToRelative(-6f, 10f, -16.5f, 15.5f)
                reflectiveQuadTo(317f, 720f)
                close()
            }
        }.build()
        
        return _Subscript!!
    }

private var _Subscript: ImageVector? = null

