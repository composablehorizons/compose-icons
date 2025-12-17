package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.View_in_ar: ImageVector
    get() {
        if (_View_in_ar != null) return _View_in_ar!!
        
        _View_in_ar = ImageVector.Builder(
            name = "view_in_ar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 802f)
                lineTo(200f, 641f)
                verticalLineToRelative(-322f)
                lineToRelative(280f, -161f)
                lineToRelative(280f, 161f)
                verticalLineToRelative(322f)
                lineTo(480f, 802f)
                close()
                moveToRelative(-40f, -115f)
                verticalLineToRelative(-184f)
                lineToRelative(-160f, -93f)
                verticalLineToRelative(185f)
                lineToRelative(160f, 92f)
                close()
                moveToRelative(80f, 0f)
                lineToRelative(160f, -92f)
                verticalLineToRelative(-185f)
                lineToRelative(-160f, 93f)
                verticalLineToRelative(184f)
                close()
                moveTo(80f, 280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveTo(280f, 880f)
                horizontalLineTo(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                close()
                moveToRelative(120f, -600f)
                verticalLineToRelative(-120f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 434f)
                lineToRelative(158f, -93f)
                lineToRelative(-158f, -91f)
                lineToRelative(-158f, 91f)
                lineToRelative(158f, 93f)
                close()
                moveToRelative(0f, 45f)
                close()
                moveToRelative(0f, -45f)
                close()
                moveToRelative(40f, 69f)
                close()
                moveToRelative(-80f, 0f)
                close()
            }
        }.build()
        
        return _View_in_ar!!
    }

private var _View_in_ar: ImageVector? = null

