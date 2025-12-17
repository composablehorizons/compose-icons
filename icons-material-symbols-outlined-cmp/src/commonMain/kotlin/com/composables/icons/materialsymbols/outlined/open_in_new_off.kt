package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Open_in_new_off: ImageVector
    get() {
        if (_Open_in_new_off != null) return _Open_in_new_off!!
        
        _Open_in_new_off = ImageVector.Builder(
            name = "open_in_new_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineToRelative(-65f, -65f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-526f)
                lineToRelative(-65f, -65f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(446f)
                lineTo(451f, 565f)
                lineToRelative(-63f, 63f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -63f)
                lineToRelative(-195f, -195f)
                verticalLineToRelative(446f)
                close()
                moveToRelative(114f, -560f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(246f)
                verticalLineToRelative(80f)
                horizontalLineTo(314f)
                close()
                moveToRelative(251f, 251f)
                lineToRelative(-56f, -56f)
                lineToRelative(195f, -195f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-144f)
                lineTo(565f, 451f)
                close()
                moveToRelative(275f, 275f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(246f)
                close()
            }
        }.build()
        
        return _Open_in_new_off!!
    }

private var _Open_in_new_off: ImageVector? = null

