package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Turn_left: ImageVector
    get() {
        if (_Turn_left != null) return _Turn_left!!
        
        _Turn_left = ImageVector.Builder(
            name = "turn_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 800f)
                verticalLineToRelative(-360f)
                horizontalLineTo(272f)
                lineToRelative(64f, 64f)
                lineToRelative(-56f, 56f)
                lineToRelative(-160f, -160f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-64f, 64f)
                horizontalLineToRelative(328f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 440f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Turn_left!!
    }

private var _Turn_left: ImageVector? = null

