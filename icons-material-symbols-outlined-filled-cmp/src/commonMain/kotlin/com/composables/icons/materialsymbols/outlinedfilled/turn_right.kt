package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Turn_right: ImageVector
    get() {
        if (_Turn_right != null) return _Turn_right!!
        
        _Turn_right = ImageVector.Builder(
            name = "turn_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 360f)
                horizontalLineToRelative(328f)
                lineToRelative(-64f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -56f)
                lineToRelative(64f, -64f)
                horizontalLineTo(360f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Turn_right!!
    }

private var _Turn_right: ImageVector? = null

