package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Variable_insert: ImageVector
    get() {
        if (_Variable_insert != null) return _Variable_insert!!
        
        _Variable_insert = ImageVector.Builder(
            name = "variable_insert",
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
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(-40f)
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
                moveToRelative(520f, 57f)
                verticalLineToRelative(83f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 780f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 740f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 520f)
                horizontalLineToRelative(180f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(900f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(860f, 600f)
                horizontalLineToRelative(-84f)
                lineToRelative(116f, 115f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(892f, 772f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(835f, 772f)
                lineTo(720f, 657f)
                close()
            }
        }.build()
        
        return _Variable_insert!!
    }

private var _Variable_insert: ImageVector? = null

