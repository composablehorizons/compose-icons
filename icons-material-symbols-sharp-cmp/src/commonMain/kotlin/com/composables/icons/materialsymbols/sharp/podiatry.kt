package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Podiatry: ImageVector
    get() {
        if (_Podiatry != null) return _Podiatry!!
        
        _Podiatry = ImageVector.Builder(
            name = "podiatry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(684f, 571f)
                lineToRelative(179f, -179f)
                lineToRelative(57f, 57f)
                lineToRelative(-180f, 179f)
                lineToRelative(-56f, -57f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-167f)
                quadToRelative(35f, -5f, 67f, -20f)
                reflectiveQuadToRelative(61f, -37f)
                lineToRelative(70f, 75f)
                lineToRelative(28f, -28f)
                lineToRelative(-67f, -72f)
                lineToRelative(15.5f, -15.5f)
                quadTo(222f, 528f, 230f, 519f)
                lineToRelative(68f, 72f)
                lineToRelative(29f, -29f)
                lineToRelative(-69f, -71f)
                quadToRelative(5f, -10f, 10.5f, -20.5f)
                reflectiveQuadTo(278f, 448f)
                lineToRelative(81f, 82f)
                lineToRelative(29f, -29f)
                lineToRelative(-93f, -93f)
                lineToRelative(41f, -114f)
                lineToRelative(216f, -214f)
                lineToRelative(282f, 283f)
                lineToRelative(-414f, 437f)
                horizontalLineTo(40f)
                close()
                moveToRelative(345f, -80f)
                lineToRelative(337f, -355f)
                lineToRelative(-337f, 355f)
                close()
                moveToRelative(-265f, 0f)
                horizontalLineToRelative(265f)
                lineToRelative(337f, -355f)
                lineToRelative(-171f, -171f)
                lineToRelative(-146f, 145f)
                lineToRelative(-29f, 81f)
                lineToRelative(88f, 86f)
                lineToRelative(-230f, 230f)
                lineToRelative(-62f, -67f)
                quadToRelative(-13f, 8f, -25.5f, 14f)
                reflectiveQuadTo(120f, 694f)
                verticalLineToRelative(26f)
                close()
            }
        }.build()
        
        return _Podiatry!!
    }

private var _Podiatry: ImageVector? = null

