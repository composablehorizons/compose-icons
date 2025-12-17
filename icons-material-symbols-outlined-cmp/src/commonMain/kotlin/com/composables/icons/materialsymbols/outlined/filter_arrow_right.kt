package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Filter_arrow_right: ImageVector
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
                moveTo(360f, 520f)
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
                moveToRelative(400f, 240f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(440f, 492f)
                lineToRelative(198f, -252f)
                horizontalLineTo(242f)
                lineToRelative(198f, 252f)
                close()
            }
        }.build()
        
        return _Filter_arrow_right!!
    }

private var _Filter_arrow_right: ImageVector? = null

