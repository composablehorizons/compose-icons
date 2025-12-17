package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Quick_reorder: ImageVector
    get() {
        if (_Quick_reorder != null) return _Quick_reorder!!
        
        _Quick_reorder = ImageVector.Builder(
            name = "quick_reorder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 720f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-78f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(122f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(162f, 400f)
                horizontalLineToRelative(78f)
                verticalLineToRelative(-118f)
                lineToRelative(-61f, -132f)
                quadToRelative(-7f, -15f, -1.5f, -30.5f)
                reflectiveQuadTo(198f, 97f)
                quadToRelative(15f, -7f, 30.5f, -1.5f)
                reflectiveQuadTo(251f, 116f)
                lineToRelative(77f, 164f)
                horizontalLineToRelative(464f)
                lineToRelative(-61f, -130f)
                quadToRelative(-7f, -15f, -1.5f, -30.5f)
                reflectiveQuadTo(750f, 97f)
                quadToRelative(15f, -7f, 30.5f, -1.5f)
                reflectiveQuadTo(803f, 116f)
                lineToRelative(69f, 148f)
                quadToRelative(4f, 8f, 6f, 16.5f)
                reflectiveQuadToRelative(2f, 17.5f)
                verticalLineToRelative(422f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -280f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                horizontalLineTo(480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveTo(320f, 720f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                horizontalLineTo(320f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-360f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Quick_reorder!!
    }

private var _Quick_reorder: ImageVector? = null

