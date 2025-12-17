package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Skull_list: ImageVector
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
                moveToRelative(80f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-44f)
                lineToRelative(39f, -23f)
                quadToRelative(36f, -21f, 58.5f, -56f)
                reflectiveQuadToRelative(22.5f, -77f)
                quadToRelative(0f, -69f, -54f, -114.5f)
                reflectiveQuadTo(300f, 280f)
                quadToRelative(-72f, 0f, -126f, 45.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, 42f, 22.5f, 76.5f)
                reflectiveQuadTo(201f, 573f)
                lineToRelative(39f, 23f)
                verticalLineToRelative(44f)
                close()
                moveToRelative(-20f, -160f)
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
                moveTo(300f, 460f)
                close()
            }
        }.build()
        
        return _Skull_list!!
    }

private var _Skull_list: ImageVector? = null

