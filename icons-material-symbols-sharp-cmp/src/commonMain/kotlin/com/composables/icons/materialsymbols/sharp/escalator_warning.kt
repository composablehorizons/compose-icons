package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Escalator_warning: ImageVector
    get() {
        if (_Escalator_warning != null) return _Escalator_warning!!
        
        _Escalator_warning = ImageVector.Builder(
            name = "escalator_warning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(180f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(260f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(340f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(260f, 240f)
                close()
                moveToRelative(420f, 200f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(620f, 380f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(680f, 320f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(740f, 380f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(680f, 440f)
                close()
                moveTo(180f, 880f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(246f)
                lineToRelative(166f, 287f)
                lineToRelative(58f, -87f)
                horizontalLineToRelative(210f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(200f)
                horizontalLineTo(600f)
                verticalLineToRelative(-284f)
                lineToRelative(-31f, 44f)
                horizontalLineToRelative(-88f)
                lineTo(380f, 464f)
                verticalLineToRelative(416f)
                horizontalLineTo(180f)
                close()
            }
        }.build()
        
        return _Escalator_warning!!
    }

private var _Escalator_warning: ImageVector? = null

