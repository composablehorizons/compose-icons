package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bar_chart_off: ImageVector
    get() {
        if (_Bar_chart_off != null) return _Bar_chart_off!!
        
        _Bar_chart_off = ImageVector.Builder(
            name = "bar_chart_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-400f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(240f)
                horizontalLineTo(400f)
                close()
                moveToRelative(160f, -354f)
                lineTo(400f, 286f)
                verticalLineToRelative(-126f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(286f)
                close()
                moveToRelative(240f, 240f)
                lineTo(640f, 526f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(166f)
                close()
                moveToRelative(-9f, 219f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Bar_chart_off!!
    }

private var _Bar_chart_off: ImageVector? = null

