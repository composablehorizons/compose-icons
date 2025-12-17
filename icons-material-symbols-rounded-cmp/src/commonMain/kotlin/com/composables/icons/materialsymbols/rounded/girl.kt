package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Girl: ImageVector
    get() {
        if (_Girl != null) return _Girl!!
        
        _Girl = ImageVector.Builder(
            name = "girl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 300f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(410f, 230f)
                quadToRelative(0f, -29f, 20.5f, -49.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(29f, 0f, 49.5f, 20.5f)
                reflectiveQuadTo(550f, 230f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(480f, 300f)
                close()
                moveToRelative(-80f, 460f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-22f)
                quadToRelative(-21f, 0f, -33.5f, -17f)
                reflectiveQuadToRelative(-4.5f, -37f)
                lineToRelative(75f, -201f)
                quadToRelative(8f, -20f, 25.5f, -32.5f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(22f, 0f, 39.5f, 12.5f)
                reflectiveQuadTo(545f, 385f)
                lineToRelative(75f, 201f)
                quadToRelative(8f, 20f, -4.5f, 37f)
                reflectiveQuadTo(582f, 640f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 760f)
                close()
            }
        }.build()
        
        return _Girl!!
    }

private var _Girl: ImageVector? = null

