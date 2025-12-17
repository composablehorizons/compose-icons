package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sports_baseball: ImageVector
    get() {
        if (_Sports_baseball != null) return _Sports_baseball!!
        
        _Sports_baseball = ImageVector.Builder(
            name = "sports_baseball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(167f, 729f)
                quadToRelative(-42f, -54f, -64.5f, -117.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -68f, 22.5f, -131.5f)
                reflectiveQuadTo(167f, 231f)
                quadToRelative(58f, 45f, 91f, 110.5f)
                reflectiveQuadTo(291f, 480f)
                quadToRelative(0f, 73f, -33f, 138.5f)
                reflectiveQuadTo(167f, 729f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-72f, 0f, -137.5f, -24f)
                reflectiveQuadTo(223f, 786f)
                quadToRelative(69f, -57f, 108f, -136.5f)
                reflectiveQuadTo(370f, 480f)
                quadToRelative(0f, -90f, -39f, -169.5f)
                reflectiveQuadTo(223f, 174f)
                quadToRelative(54f, -46f, 119.5f, -70f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(72f, 0f, 137.5f, 24f)
                reflectiveQuadTo(737f, 174f)
                quadToRelative(-69f, 57f, -108f, 136.5f)
                reflectiveQuadTo(590f, 480f)
                quadToRelative(0f, 90f, 39f, 169.5f)
                reflectiveQuadTo(737f, 786f)
                quadToRelative(-54f, 46f, -119.5f, 70f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(313f, -151f)
                quadToRelative(-58f, -45f, -91f, -110.5f)
                reflectiveQuadTo(669f, 480f)
                quadToRelative(0f, -73f, 33f, -138.5f)
                reflectiveQuadTo(793f, 231f)
                quadToRelative(42f, 54f, 64.5f, 117.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 68f, -22.5f, 131.5f)
                reflectiveQuadTo(793f, 729f)
                close()
            }
        }.build()
        
        return _Sports_baseball!!
    }

private var _Sports_baseball: ImageVector? = null

