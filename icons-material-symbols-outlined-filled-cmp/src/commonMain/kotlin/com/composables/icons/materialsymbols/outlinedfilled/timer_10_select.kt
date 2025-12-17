package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Timer_10_select: ImageVector
    get() {
        if (_Timer_10_select != null) return _Timer_10_select!!
        
        _Timer_10_select = ImageVector.Builder(
            name = "timer_10_select",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-320f)
                horizontalLineTo(400f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(0f, 120f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(120f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-280f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineTo(40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(560f)
                horizontalLineTo(120f)
                close()
                moveToRelative(560f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineTo(734f)
                quadToRelative(-23f, 0f, -38.5f, -15.5f)
                reflectiveQuadTo(680f, 586f)
                verticalLineToRelative(-92f)
                quadToRelative(0f, -23f, 15.5f, -38.5f)
                reflectiveQuadTo(734f, 440f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(106f)
                quadToRelative(23f, 0f, 38.5f, 15.5f)
                reflectiveQuadTo(920f, 614f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 23f, -15.5f, 38.5f)
                reflectiveQuadTo(866f, 760f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Timer_10_select!!
    }

private var _Timer_10_select: ImageVector? = null

