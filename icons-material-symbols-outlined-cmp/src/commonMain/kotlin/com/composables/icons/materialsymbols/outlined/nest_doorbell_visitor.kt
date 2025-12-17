package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nest_doorbell_visitor: ImageVector
    get() {
        if (_Nest_doorbell_visitor != null) return _Nest_doorbell_visitor!!
        
        _Nest_doorbell_visitor = ImageVector.Builder(
            name = "nest_doorbell_visitor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 720f)
                close()
                moveTo(560f, 880f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -44f, 44f, -70.5f)
                reflectiveQuadTo(720f, 760f)
                quadToRelative(72f, 0f, 116f, 26.5f)
                reflectiveQuadToRelative(44f, 70.5f)
                verticalLineToRelative(23f)
                horizontalLineTo(560f)
                close()
                moveToRelative(120f, -400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -51f, -36f, -85.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-48f, 0f, -84f, 34.5f)
                reflectiveQuadTo(360f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 48f, 36f, 84f)
                reflectiveQuadToRelative(84f, 36f)
                verticalLineToRelative(80f)
                quadToRelative(-85f, 0f, -142.5f, -57.5f)
                reflectiveQuadTo(280f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -85f, 57.5f, -142.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(85f, 0f, 142.5f, 57.5f)
                reflectiveQuadTo(680f, 280f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(-200f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(0f, 80f)
                close()
                moveToRelative(-80f, 160f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 640f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 640f)
                close()
                moveToRelative(80f, 40f)
                quadToRelative(-18f, 0f, -29f, -12.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, -15f, 11f, -27.5f)
                reflectiveQuadToRelative(29f, -12.5f)
                quadToRelative(18f, 0f, 29f, 11f)
                reflectiveQuadToRelative(11f, 29f)
                quadToRelative(0f, 15f, -11f, 27.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Nest_doorbell_visitor!!
    }

private var _Nest_doorbell_visitor: ImageVector? = null

