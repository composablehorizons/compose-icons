package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Flag_check: ImageVector
    get() {
        if (_Flag_check != null) return _Flag_check!!
        
        _Flag_check = ImageVector.Builder(
            name = "flag_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 400f)
                close()
                moveTo(200f, 840f)
                verticalLineToRelative(-680f)
                horizontalLineToRelative(250f)
                quadToRelative(-5f, 20f, -8f, 40f)
                reflectiveQuadToRelative(-2f, 40f)
                horizontalLineTo(280f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(290f)
                lineToRelative(16f, 80f)
                horizontalLineToRelative(134f)
                verticalLineToRelative(-46f)
                quadToRelative(20f, 0f, 40f, -3f)
                reflectiveQuadToRelative(40f, -9f)
                verticalLineToRelative(138f)
                horizontalLineTo(520f)
                lineToRelative(-16f, -80f)
                horizontalLineTo(280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(491f, -516f)
                lineToRelative(139f, -138f)
                lineToRelative(-42f, -42f)
                lineToRelative(-97f, 95f)
                lineToRelative(-39f, -39f)
                lineToRelative(-42f, 43f)
                lineToRelative(81f, 81f)
                close()
                moveToRelative(29f, -290f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 234f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 434f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 234f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 34f)
                close()
            }
        }.build()
        
        return _Flag_check!!
    }

private var _Flag_check: ImageVector? = null

