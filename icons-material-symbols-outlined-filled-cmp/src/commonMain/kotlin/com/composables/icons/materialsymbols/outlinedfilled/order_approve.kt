package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Order_approve: ImageVector
    get() {
        if (_Order_approve != null) return _Order_approve!!
        
        _Order_approve = ImageVector.Builder(
            name = "order_approve",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(691f, 810f)
                lineToRelative(139f, -138f)
                lineToRelative(-42f, -42f)
                lineToRelative(-97f, 95f)
                lineToRelative(-39f, -39f)
                lineToRelative(-42f, 43f)
                lineToRelative(81f, 81f)
                close()
                moveTo(240f, 360f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-680f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(267f)
                quadToRelative(-28f, -14f, -58.5f, -20.5f)
                reflectiveQuadTo(720f, 440f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(284f)
                quadToRelative(-17f, 17f, -31.5f, 37f)
                reflectiveQuadTo(467f, 600f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(203f)
                quadToRelative(-2f, 10f, -2.5f, 19.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 42f, 11.5f, 80.5f)
                reflectiveQuadTo(486f, 874f)
                lineToRelative(-6f, 6f)
                lineToRelative(-60f, -60f)
                lineToRelative(-60f, 60f)
                lineToRelative(-60f, -60f)
                lineToRelative(-60f, 60f)
                lineToRelative(-60f, -60f)
                lineToRelative(-60f, 60f)
                close()
            }
        }.build()
        
        return _Order_approve!!
    }

private var _Order_approve: ImageVector? = null

