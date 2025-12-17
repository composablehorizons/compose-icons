package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Transform: ImageVector
    get() {
        if (_Transform != null) return _Transform!!
        
        _Transform = ImageVector.Builder(
            name = "transform",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 920f)
                lineTo(480f, 760f)
                lineToRelative(56f, -58f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-86f)
                horizontalLineTo(360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-86f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -58f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 58f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(406f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                verticalLineToRelative(86f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 58f)
                lineTo(640f, 920f)
                close()
                moveToRelative(-40f, -400f)
                verticalLineToRelative(-160f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 360f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Transform!!
    }

private var _Transform: ImageVector? = null

