package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Home_improvement_and_tools: ImageVector
    get() {
        if (_Home_improvement_and_tools != null) return _Home_improvement_and_tools!!
        
        _Home_improvement_and_tools = ImageVector.Builder(
            name = "home_improvement_and_tools",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 80f)
                horizontalLineToRelative(480f)
                lineTo(600f, 248f)
                verticalLineToRelative(152f)
                horizontalLineTo(360f)
                verticalLineToRelative(-152f)
                lineTo(240f, 80f)
                close()
                moveToRelative(120f, 400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                lineTo(480f, 880f)
                lineTo(360f, 760f)
                verticalLineToRelative(-120f)
                close()
            }
        }.build()
        
        return _Home_improvement_and_tools!!
    }

private var _Home_improvement_and_tools: ImageVector? = null

