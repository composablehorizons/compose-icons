package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Home_improvement_and_tools: ImageVector
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
                moveTo(480f, 863f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineToRelative(-69f, -69f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                verticalLineToRelative(-479f)
                lineToRelative(-75f, -105f)
                quadToRelative(-14f, -20f, -3f, -41.5f)
                reflectiveQuadToRelative(36f, -21.5f)
                horizontalLineToRelative(324f)
                quadToRelative(25f, 0f, 36f, 21.5f)
                reflectiveQuadToRelative(-3f, 41.5f)
                lineToRelative(-75f, 105f)
                verticalLineToRelative(479f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(577f, 783f)
                lineToRelative(-69f, 69f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadTo(480f, 863f)
                close()
                moveToRelative(-40f, -463f)
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

