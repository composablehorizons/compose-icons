package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Blender: ImageVector
    get() {
        if (_Blender != null) return _Blender!!
        
        _Blender = ImageVector.Builder(
            name = "blender",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 800f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -47f, 20.5f, -87f)
                reflectiveQuadToRelative(53.5f, -67f)
                lineToRelative(-25f, -166f)
                horizontalLineToRelative(-89f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(159f)
                lineToRelative(-73f, 486f)
                quadToRelative(33f, 27f, 53.5f, 67f)
                reflectiveQuadToRelative(20.5f, 87f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-43f, -520f)
                lineToRelative(-24f, -160f)
                horizontalLineToRelative(-53f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(77f)
                close()
                moveToRelative(203f, 400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(-92f, -200f)
                horizontalLineToRelative(184f)
                lineToRelative(54f, -360f)
                horizontalLineTo(334f)
                lineToRelative(54f, 360f)
                close()
            }
        }.build()
        
        return _Blender!!
    }

private var _Blender: ImageVector? = null

