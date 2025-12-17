package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Home_improvement_and_tools: ImageVector
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
                moveTo(318f, 80f)
                horizontalLineToRelative(324f)
                quadToRelative(25f, 0f, 36f, 21.5f)
                reflectiveQuadToRelative(-3f, 41.5f)
                lineToRelative(-75f, 105f)
                verticalLineToRelative(152f)
                horizontalLineTo(360f)
                verticalLineToRelative(-152f)
                lineToRelative(-75f, -105f)
                quadToRelative(-14f, -20f, -3f, -41.5f)
                reflectiveQuadToRelative(36f, -21.5f)
                close()
                moveToRelative(42f, 400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(87f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(577f, 783f)
                lineToRelative(-69f, 69f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadTo(480f, 863f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineToRelative(-69f, -69f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                verticalLineToRelative(-87f)
                close()
            }
        }.build()
        
        return _Home_improvement_and_tools!!
    }

private var _Home_improvement_and_tools: ImageVector? = null

