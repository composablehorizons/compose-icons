package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Variable_remove: ImageVector
    get() {
        if (_Variable_remove != null) return _Variable_remove!!
        
        _Variable_remove = ImageVector.Builder(
            name = "variable_remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 280f)
                horizontalLineToRelative(640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 320f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 360f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 680f)
                horizontalLineTo(160f)
                close()
                moveToRelative(40f, -80f)
                verticalLineToRelative(-240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(580f, 77f)
                lineToRelative(-56f, 55f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(668f, 732f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(56f, -56f)
                lineToRelative(-56f, -56f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(56f, 56f)
                lineToRelative(56f, -56f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(892f, 508f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-55f, 56f)
                lineToRelative(55f, 56f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(892f, 732f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-56f, -55f)
                close()
            }
        }.build()
        
        return _Variable_remove!!
    }

private var _Variable_remove: ImageVector? = null

