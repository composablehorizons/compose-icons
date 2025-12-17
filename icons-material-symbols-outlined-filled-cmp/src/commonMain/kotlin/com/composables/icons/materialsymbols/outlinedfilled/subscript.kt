package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Subscript: ImageVector
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
                moveTo(760f, 800f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(760f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 640f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 720f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(40f)
                horizontalLineTo(760f)
                close()
                moveToRelative(-525f, -80f)
                lineToRelative(185f, -291f)
                lineToRelative(-172f, -269f)
                horizontalLineToRelative(106f)
                lineToRelative(124f, 200f)
                horizontalLineToRelative(4f)
                lineToRelative(123f, -200f)
                horizontalLineToRelative(107f)
                lineTo(539f, 429f)
                lineToRelative(186f, 291f)
                horizontalLineTo(618f)
                lineTo(482f, 503f)
                horizontalLineToRelative(-4f)
                lineTo(342f, 720f)
                horizontalLineTo(235f)
                close()
            }
        }.build()
        
        return _Subscript!!
    }

private var _Subscript: ImageVector? = null

