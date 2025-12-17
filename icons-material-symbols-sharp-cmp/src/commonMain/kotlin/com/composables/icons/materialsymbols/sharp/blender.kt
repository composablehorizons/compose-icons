package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Blender: ImageVector
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
                moveTo(240f, 880f)
                verticalLineToRelative(-190f)
                lineToRelative(74f, -84f)
                lineToRelative(-25f, -166f)
                horizontalLineTo(120f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(159f)
                lineToRelative(-73f, 486f)
                lineToRelative(74f, 84f)
                verticalLineToRelative(190f)
                horizontalLineTo(240f)
                close()
                moveToRelative(37f, -520f)
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
                moveToRelative(-68f, 240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                lineToRelative(-71f, -80f)
                horizontalLineTo(391f)
                lineToRelative(-71f, 80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, -80f)
                close()
            }
        }.build()
        
        return _Blender!!
    }

private var _Blender: ImageVector? = null

