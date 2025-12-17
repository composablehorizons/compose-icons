package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Fluid_balance: ImageVector
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
                horizontalLineTo(600f)
                quadToRelative(-57f, 0f, -99.5f, 34f)
                reflectiveQuadTo(445f, 360f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                quadToRelative(0f, 59f, 21.5f, 110.5f)
                reflectiveQuadTo(523f, 800f)
                horizontalLineTo(160f)
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
            }
        }.build()
        
        return _Fluid_balance!!
    }

private var _Fluid_balance: ImageVector? = null

