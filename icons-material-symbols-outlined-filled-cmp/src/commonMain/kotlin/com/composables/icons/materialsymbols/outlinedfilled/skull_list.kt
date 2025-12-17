package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Skull_list: ImageVector
    get() {
        if (_Skull_list != null) return _Skull_list!!
        
        _Skull_list = ImageVector.Builder(
            name = "skull_list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                verticalLineToRelative(-78f)
                quadToRelative(-54f, -32f, -87f, -85.5f)
                reflectiveQuadTo(40f, 440f)
                quadToRelative(0f, -103f, 77f, -171.5f)
                reflectiveQuadTo(300f, 200f)
                quadToRelative(106f, 0f, 183f, 68.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(0f, 63f, -33f, 116.5f)
                reflectiveQuadTo(440f, 642f)
                verticalLineToRelative(78f)
                horizontalLineTo(160f)
                close()
                moveToRelative(60f, -240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(260f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(220f, 400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(180f, 440f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(220f, 480f)
                close()
                moveToRelative(40f, 80f)
                horizontalLineToRelative(80f)
                lineToRelative(-40f, -80f)
                lineToRelative(-40f, 80f)
                close()
                moveToRelative(120f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(420f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(380f, 400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(340f, 440f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(380f, 480f)
                close()
                moveToRelative(220f, 40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Skull_list!!
    }

private var _Skull_list: ImageVector? = null

