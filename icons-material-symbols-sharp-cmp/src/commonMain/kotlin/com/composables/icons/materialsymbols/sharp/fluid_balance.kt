package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fluid_balance: ImageVector
    get() {
        if (_Fluid_balance != null) return _Fluid_balance!!
        
        _Fluid_balance = ImageVector.Builder(
            name = "fluid_balance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
                moveTo(880f, 920f)
                horizontalLineTo(680f)
                verticalLineToRelative(-124f)
                quadToRelative(-69f, -14f, -114.5f, -68.5f)
                reflectiveQuadTo(520f, 600f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 73f, -45.5f, 127.5f)
                reflectiveQuadTo(760f, 796f)
                verticalLineToRelative(44f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-90f, -360f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(30f)
                quadToRelative(33f, 0f, 62.5f, 15f)
                reflectiveQuadToRelative(49.5f, 41f)
                quadToRelative(8f, 12f, 21f, 18f)
                reflectiveQuadToRelative(27f, 6f)
                close()
                moveToRelative(-70f, 160f)
                quadToRelative(39f, 0f, 70f, -22.5f)
                reflectiveQuadToRelative(43f, -57.5f)
                horizontalLineToRelative(-43f)
                quadToRelative(-33f, 0f, -62.5f, -14.5f)
                reflectiveQuadTo(678f, 584f)
                quadToRelative(-9f, -11f, -21.5f, -17.5f)
                reflectiveQuadTo(630f, 560f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 51f, 34.5f, 85.5f)
                reflectiveQuadTo(720f, 720f)
                close()
                moveToRelative(-42f, -184f)
                close()
                moveToRelative(-438f, -96f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Fluid_balance!!
    }

private var _Fluid_balance: ImageVector? = null

