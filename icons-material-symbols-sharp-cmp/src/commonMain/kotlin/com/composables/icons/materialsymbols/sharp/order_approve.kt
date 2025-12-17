package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Order_approve: ImageVector
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
                verticalLineToRelative(-760f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(347f)
                quadToRelative(-19f, -9f, -39f, -15f)
                reflectiveQuadToRelative(-41f, -9f)
                verticalLineToRelative(-243f)
                horizontalLineTo(200f)
                verticalLineToRelative(562f)
                horizontalLineToRelative(243f)
                quadToRelative(5f, 31f, 15.5f, 59f)
                reflectiveQuadTo(486f, 874f)
                lineToRelative(-6f, 6f)
                lineToRelative(-60f, -60f)
                lineToRelative(-60f, 60f)
                lineToRelative(-60f, -60f)
                lineToRelative(-60f, 60f)
                lineToRelative(-60f, -60f)
                lineToRelative(-60f, 60f)
                close()
                moveToRelative(120f, -200f)
                horizontalLineToRelative(203f)
                quadToRelative(3f, -21f, 9f, -41f)
                reflectiveQuadToRelative(15f, -39f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(284f)
                quadToRelative(38f, -37f, 88.5f, -58.5f)
                reflectiveQuadTo(720f, 440f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-40f, 242f)
                verticalLineToRelative(-562f)
                verticalLineToRelative(562f)
                close()
            }
        }.build()
        
        return _Order_approve!!
    }

private var _Order_approve: ImageVector? = null

