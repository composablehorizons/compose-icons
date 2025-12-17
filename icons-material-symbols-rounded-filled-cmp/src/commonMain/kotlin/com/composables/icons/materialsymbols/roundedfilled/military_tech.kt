package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Military_tech: ImageVector
    get() {
        if (_Military_tech != null) return _Military_tech!!
        
        _Military_tech = ImageVector.Builder(
            name = "military_tech",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 786f)
                lineToRelative(-74f, 56f)
                quadToRelative(-12f, 9f, -24f, 0.5f)
                reflectiveQuadToRelative(-7f, -22.5f)
                lineToRelative(29f, -92f)
                lineToRelative(-73f, -52f)
                quadToRelative(-12f, -8f, -7f, -22f)
                reflectiveQuadToRelative(19f, -14f)
                horizontalLineToRelative(89f)
                lineToRelative(28f, -92f)
                lineToRelative(-142f, -84f)
                quadToRelative(-18f, -11f, -28f, -29f)
                reflectiveQuadToRelative(-10f, -41f)
                verticalLineToRelative(-234f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 160f)
                verticalLineToRelative(234f)
                quadToRelative(0f, 23f, -10f, 41f)
                reflectiveQuadToRelative(-28f, 29f)
                lineToRelative(-142f, 84f)
                lineToRelative(28f, 92f)
                horizontalLineToRelative(89f)
                quadToRelative(14f, 0f, 19f, 14f)
                reflectiveQuadToRelative(-7f, 22f)
                lineToRelative(-73f, 52f)
                lineToRelative(29f, 92f)
                quadToRelative(5f, 14f, -7f, 22.5f)
                reflectiveQuadToRelative(-24f, -0.5f)
                lineToRelative(-74f, -56f)
                close()
                moveToRelative(-40f, -626f)
                verticalLineToRelative(282f)
                lineToRelative(40f, 24f)
                lineToRelative(40f, -24f)
                verticalLineToRelative(-282f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Military_tech!!
    }

private var _Military_tech: ImageVector? = null

