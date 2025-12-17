package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Warning_off: ImageVector
    get() {
        if (_Warning_off != null) return _Warning_off!!
        
        _Warning_off = ImageVector.Builder(
            name = "warning_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(-40f, -120f)
                verticalLineToRelative(-161f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(81f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(433f, 158f)
                lineTo(655f, 541f)
                lineTo(480f, 240f)
                lineToRelative(-47f, 80f)
                lineToRelative(-58f, -58f)
                lineToRelative(105f, -182f)
                lineToRelative(393f, 678f)
                close()
                moveToRelative(-695f, 2f)
                horizontalLineToRelative(469f)
                lineTo(350f, 463f)
                lineTo(178f, 760f)
                close()
                moveTo(819f, 932f)
                lineToRelative(-92f, -92f)
                horizontalLineTo(40f)
                lineToRelative(252f, -435f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(499f, 612f)
                close()
                moveToRelative(45f, -181f)
                close()
            }
        }.build()
        
        return _Warning_off!!
    }

private var _Warning_off: ImageVector? = null

