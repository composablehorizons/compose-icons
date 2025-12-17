package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Text_decrease: ImageVector
    get() {
        if (_Text_decrease != null) return _Text_decrease!!
        
        _Text_decrease = ImageVector.Builder(
            name = "text_decrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 520f)
                horizontalLineTo(640f)
                close()
                moveToRelative(-453f, 97f)
                lineToRelative(-41f, 114f)
                quadToRelative(-5f, 14f, -16f, 21.5f)
                reflectiveQuadToRelative(-25f, 7.5f)
                quadToRelative(-23f, 0f, -36.5f, -19.5f)
                reflectiveQuadTo(63f, 699f)
                lineToRelative(176f, -469f)
                quadToRelative(5f, -14f, 17f, -22f)
                reflectiveQuadToRelative(26f, -8f)
                horizontalLineToRelative(36f)
                quadToRelative(15f, 0f, 26.5f, 8f)
                reflectiveQuadToRelative(16.5f, 22f)
                lineToRelative(177f, 470f)
                quadToRelative(8f, 22f, -5.5f, 41f)
                reflectiveQuadTo(496f, 760f)
                quadToRelative(-14f, 0f, -26f, -8f)
                reflectiveQuadToRelative(-17f, -22f)
                lineToRelative(-40f, -113f)
                horizontalLineTo(187f)
                close()
                moveToRelative(29f, -81f)
                horizontalLineToRelative(168f)
                lineToRelative(-82f, -232f)
                horizontalLineToRelative(-4f)
                lineToRelative(-82f, 232f)
                close()
            }
        }.build()
        
        return _Text_decrease!!
    }

private var _Text_decrease: ImageVector? = null

