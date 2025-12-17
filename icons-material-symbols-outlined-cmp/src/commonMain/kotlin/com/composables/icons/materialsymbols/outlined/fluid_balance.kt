package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Fluid_balance: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
                moveTo(760f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(680f, 840f)
                verticalLineToRelative(-44f)
                quadToRelative(-69f, -14f, -114.5f, -68.5f)
                reflectiveQuadTo(520f, 600f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 400f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 73f, -45.5f, 127.5f)
                reflectiveQuadTo(760f, 796f)
                verticalLineToRelative(44f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                close()
                moveToRelative(30f, -360f)
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

