package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Filter_arrow_right: ImageVector
    get() {
        if (_Filter_arrow_right != null) return _Filter_arrow_right!!
        
        _Filter_arrow_right = ImageVector.Builder(
            name = "filter_arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(767f, 640f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 560f)
                horizontalLineToRelative(127f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(788f, 732f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(732f, 732f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(35f, -36f)
                close()
                moveTo(440f, 492f)
                lineToRelative(198f, -252f)
                horizontalLineTo(242f)
                lineToRelative(198f, 252f)
                close()
                moveToRelative(-80f, 28f)
                lineTo(129f, 225f)
                quadToRelative(-5f, -6f, -7f, -12.5f)
                reflectiveQuadToRelative(-2f, -12.5f)
                quadToRelative(0f, -16f, 11.5f, -28f)
                reflectiveQuadToRelative(28.5f, -12f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 12f)
                reflectiveQuadToRelative(11.5f, 28f)
                quadToRelative(0f, 6f, -2f, 12.5f)
                reflectiveQuadToRelative(-7f, 12.5f)
                lineTo(520f, 520f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 800f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 760f)
                verticalLineToRelative(-240f)
                close()
            }
        }.build()
        
        return _Filter_arrow_right!!
    }

private var _Filter_arrow_right: ImageVector? = null

