package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Escalator_warning: ImageVector
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
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(22f, 0f, 40f, 10.5f)
                reflectiveQuadToRelative(29f, 29.5f)
                lineToRelative(143f, 247f)
                lineToRelative(41f, -61f)
                quadToRelative(8f, -12f, 21.5f, -19f)
                reflectiveQuadToRelative(28.5f, -7f)
                horizontalLineToRelative(117f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(800f, 540f)
                verticalLineToRelative(140f)
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

