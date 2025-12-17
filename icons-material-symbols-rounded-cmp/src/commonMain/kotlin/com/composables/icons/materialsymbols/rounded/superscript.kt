package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Superscript: ImageVector
    get() {
        if (_Superscript != null) return _Superscript!!
        
        _Superscript = ImageVector.Builder(
            name = "superscript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 320f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(780f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 200f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineTo(800f)
                close()
                moveTo(317f, 800f)
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
                reflectiveQuadTo(630f, 240f)
                quadToRelative(27f, 0f, 39f, 23f)
                reflectiveQuadToRelative(-2f, 46f)
                lineTo(539f, 509f)
                lineToRelative(142f, 222f)
                quadToRelative(14f, 23f, 1f, 46f)
                reflectiveQuadToRelative(-39f, 23f)
                quadToRelative(-12f, 0f, -22f, -5.5f)
                reflectiveQuadTo(605f, 779f)
                lineTo(482f, 583f)
                horizontalLineToRelative(-4f)
                lineTo(355f, 779f)
                quadToRelative(-6f, 10f, -16.5f, 15.5f)
                reflectiveQuadTo(317f, 800f)
                close()
            }
        }.build()
        
        return _Superscript!!
    }

private var _Superscript: ImageVector? = null

