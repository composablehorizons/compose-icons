package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Park: ImageVector
    get() {
        if (_Park != null) return _Park!!
        
        _Park = ImageVector.Builder(
            name = "park",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(402f, 720f)
                horizontalLineTo(195f)
                quadToRelative(-24f, 0f, -36f, -21f)
                reflectiveQuadToRelative(2f, -41f)
                lineToRelative(119f, -178f)
                horizontalLineToRelative(-3f)
                quadToRelative(-24f, 0f, -35.5f, -21.5f)
                reflectiveQuadTo(244f, 417f)
                lineToRelative(203f, -290f)
                quadToRelative(6f, -8f, 15f, -12.5f)
                reflectiveQuadToRelative(18f, -4.5f)
                quadToRelative(9f, 0f, 18f, 4.5f)
                reflectiveQuadToRelative(15f, 12.5f)
                lineToRelative(203f, 290f)
                quadToRelative(14f, 20f, 2.5f, 41.5f)
                reflectiveQuadTo(683f, 480f)
                horizontalLineToRelative(-3f)
                lineToRelative(119f, 178f)
                quadToRelative(14f, 20f, 2f, 41f)
                reflectiveQuadToRelative(-36f, 21f)
                horizontalLineTo(558f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(518f, 880f)
                horizontalLineToRelative(-76f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(402f, 840f)
                verticalLineToRelative(-120f)
                close()
            }
        }.build()
        
        return _Park!!
    }

private var _Park: ImageVector? = null

