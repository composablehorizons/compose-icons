package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Select_check_box: ImageVector
    get() {
        if (_Select_check_box != null) return _Select_check_box!!
        
        _Select_check_box = ImageVector.Builder(
            name = "select_check_box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(675f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-266f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(426f)
                horizontalLineTo(120f)
                close()
                moveToRelative(341f, -160f)
                lineTo(235f, 454f)
                lineToRelative(56f, -56f)
                lineToRelative(170f, 170f)
                lineToRelative(367f, -367f)
                lineToRelative(57f, 55f)
                lineToRelative(-424f, 424f)
                close()
            }
        }.build()
        
        return _Select_check_box!!
    }

private var _Select_check_box: ImageVector? = null

