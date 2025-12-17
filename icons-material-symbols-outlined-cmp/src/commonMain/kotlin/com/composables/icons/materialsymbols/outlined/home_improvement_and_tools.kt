package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Home_improvement_and_tools: ImageVector
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
                verticalLineToRelative(512f)
                lineTo(480f, 880f)
                lineTo(360f, 760f)
                verticalLineToRelative(-512f)
                lineTo(240f, 80f)
                close()
                moveToRelative(200f, 320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-176f)
                lineToRelative(40f, -64f)
                horizontalLineTo(400f)
                lineToRelative(40f, 64f)
                verticalLineToRelative(176f)
                close()
                moveToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(0f, 240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                lineToRelative(40f, 40f)
                lineToRelative(40f, -40f)
                close()
                moveToRelative(-40f, -320f)
                close()
                moveToRelative(0f, 160f)
                close()
                moveToRelative(0f, -160f)
                close()
                moveToRelative(0f, 80f)
                close()
                moveToRelative(0f, 160f)
                close()
            }
        }.build()
        
        return _Home_improvement_and_tools!!
    }

private var _Home_improvement_and_tools: ImageVector? = null

