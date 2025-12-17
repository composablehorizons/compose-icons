package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Timer_3_select: ImageVector
    get() {
        if (_Timer_3_select != null) return _Timer_3_select!!
        
        _Timer_3_select = ImageVector.Builder(
            name = "timer_3_select",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-100f)
                horizontalLineTo(160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-100f)
                horizontalLineTo(160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(240f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 35f, -24.5f, 59.5f)
                reflectiveQuadTo(436f, 480f)
                quadToRelative(35f, 0f, 59.5f, 24.5f)
                reflectiveQuadTo(520f, 564f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(160f)
                close()
                moveToRelative(440f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineTo(654f)
                quadToRelative(-23f, 0f, -38.5f, -15.5f)
                reflectiveQuadTo(600f, 586f)
                verticalLineToRelative(-92f)
                quadToRelative(0f, -23f, 15.5f, -38.5f)
                reflectiveQuadTo(654f, 440f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(106f)
                quadToRelative(23f, 0f, 38.5f, 15.5f)
                reflectiveQuadTo(840f, 614f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 23f, -15.5f, 38.5f)
                reflectiveQuadTo(786f, 760f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Timer_3_select!!
    }

private var _Timer_3_select: ImageVector? = null

