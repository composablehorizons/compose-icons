package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Timer_3_select: ImageVector
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
                moveTo(400f, 760f)
                horizontalLineTo(220f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(160f, 700f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(220f, 640f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-100f)
                horizontalLineTo(220f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(220f, 420f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-100f)
                horizontalLineTo(220f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(160f, 260f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(220f, 200f)
                horizontalLineToRelative(180f)
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
                close()
                moveToRelative(386f, 0f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 680f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-40f)
                horizontalLineTo(654f)
                quadToRelative(-23f, 0f, -38.5f, -15.5f)
                reflectiveQuadTo(600f, 586f)
                verticalLineToRelative(-92f)
                quadToRelative(0f, -23f, 15.5f, -38.5f)
                reflectiveQuadTo(654f, 440f)
                horizontalLineToRelative(146f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 520f)
                horizontalLineTo(680f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(106f)
                quadToRelative(23f, 0f, 38.5f, 15.5f)
                reflectiveQuadTo(840f, 614f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 23f, -15.5f, 38.5f)
                reflectiveQuadTo(786f, 760f)
                close()
            }
        }.build()
        
        return _Timer_3_select!!
    }

private var _Timer_3_select: ImageVector? = null

