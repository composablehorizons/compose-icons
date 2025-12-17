package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wall_lamp: ImageVector
    get() {
        if (_Wall_lamp != null) return _Wall_lamp!!
        
        _Wall_lamp = ImageVector.Builder(
            name = "wall_lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 840f)
                close()
                moveToRelative(174f, -400f)
                horizontalLineToRelative(372f)
                lineToRelative(-72f, -240f)
                horizontalLineTo(406f)
                lineToRelative(-72f, 240f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(372f)
                horizontalLineToRelative(-372f)
                close()
                moveToRelative(-54f, 320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 680f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(280f)
                quadToRelative(-20f, 0f, -32f, -15.5f)
                reflectiveQuadToRelative(-6f, -35.5f)
                lineToRelative(96f, -320f)
                quadToRelative(4f, -13f, 14f, -21f)
                reflectiveQuadToRelative(24f, -8f)
                horizontalLineToRelative(288f)
                quadToRelative(14f, 0f, 24f, 8f)
                reflectiveQuadToRelative(14f, 21f)
                lineToRelative(96f, 320f)
                quadToRelative(6f, 20f, -6f, 35.5f)
                reflectiveQuadTo(760f, 520f)
                horizontalLineTo(560f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Wall_lamp!!
    }

private var _Wall_lamp: ImageVector? = null

