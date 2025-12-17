package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Fluid_balance: ImageVector
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
                horizontalLineTo(440f)
                verticalLineToRelative(120f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                quadToRelative(0f, 57f, 22.5f, 109f)
                reflectiveQuadToRelative(63.5f, 91f)
                horizontalLineTo(80f)
                close()
                moveTo(680f, 920f)
                verticalLineToRelative(-124f)
                quadToRelative(-70f, -14f, -115f, -69f)
                reflectiveQuadToRelative(-45f, -127f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 72f, -45f, 127f)
                reflectiveQuadToRelative(-115f, 69f)
                verticalLineToRelative(44f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                close()
                moveToRelative(110f, -360f)
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

