package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Regular_expression: ImageVector
    get() {
        if (_Regular_expression != null) return _Regular_expression!!
        
        _Regular_expression = ImageVector.Builder(
            name = "regular_expression",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(197f, 761f)
                quadToRelative(-56f, -57f, -86.5f, -130f)
                reflectiveQuadTo(80f, 478f)
                quadToRelative(0f, -80f, 30f, -153f)
                reflectiveQuadToRelative(87f, -130f)
                lineToRelative(57f, 57f)
                quadToRelative(-46f, 45f, -70f, 103.5f)
                reflectiveQuadTo(160f, 478f)
                quadToRelative(0f, 64f, 24.5f, 122.5f)
                reflectiveQuadTo(254f, 704f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(183f, -41f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(320f, 660f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 600f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(440f, 660f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(380f, 720f)
                close()
                moveToRelative(139f, -200f)
                verticalLineToRelative(-71f)
                lineToRelative(-61f, 36f)
                lineToRelative(-40f, -70f)
                lineToRelative(61f, -35f)
                lineToRelative(-61f, -35f)
                lineToRelative(40f, -70f)
                lineToRelative(61f, 36f)
                verticalLineToRelative(-71f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(71f)
                lineToRelative(61f, -36f)
                lineToRelative(40f, 70f)
                lineToRelative(-61f, 35f)
                lineToRelative(61f, 35f)
                lineToRelative(-40f, 70f)
                lineToRelative(-61f, -36f)
                verticalLineToRelative(71f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(244f, 241f)
                lineToRelative(-57f, -57f)
                quadToRelative(46f, -45f, 70f, -103.5f)
                reflectiveQuadTo(800f, 478f)
                quadToRelative(0f, -64f, -24.5f, -122.5f)
                reflectiveQuadTo(706f, 252f)
                lineToRelative(57f, -57f)
                quadToRelative(56f, 57f, 86.5f, 130f)
                reflectiveQuadTo(880f, 478f)
                quadToRelative(0f, 80f, -30f, 153f)
                reflectiveQuadToRelative(-87f, 130f)
                close()
            }
        }.build()
        
        return _Regular_expression!!
    }

private var _Regular_expression: ImageVector? = null

