package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.List_alt_check: ImageVector
    get() {
        if (_List_alt_check != null) return _List_alt_check!!
        
        _List_alt_check = ImageVector.Builder(
            name = "list_alt_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(454f)
                verticalLineToRelative(-85f)
                verticalLineToRelative(191f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(574f, 40f)
                lineTo(552f, 738f)
                lineToRelative(57f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 57f)
                lineTo(694f, 880f)
                close()
                moveTo(440f, 520f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(440f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(440f)
                verticalLineToRelative(80f)
                close()
                moveTo(280f, 520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _List_alt_check!!
    }

private var _List_alt_check: ImageVector? = null

