package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tab_new_right: ImageVector
    get() {
        if (_Tab_new_right != null) return _Tab_new_right!!
        
        _Tab_new_right = ImageVector.Builder(
            name = "tab_new_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 920f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineTo(760f, 920f)
                close()
                moveToRelative(-640f, -80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(414f)
                quadToRelative(-19f, -7f, -39.5f, -10.5f)
                reflectiveQuadTo(759f, 520f)
                quadToRelative(-100f, 0f, -169.5f, 70f)
                reflectiveQuadTo(520f, 760f)
                quadToRelative(0f, 21f, 3.5f, 41f)
                reflectiveQuadToRelative(10.5f, 39f)
                horizontalLineTo(120f)
                close()
                moveToRelative(320f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Tab_new_right!!
    }

private var _Tab_new_right: ImageVector? = null

