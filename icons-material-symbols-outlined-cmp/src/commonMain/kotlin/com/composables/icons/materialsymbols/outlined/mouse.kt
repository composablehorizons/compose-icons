package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Mouse: ImageVector
    get() {
        if (_Mouse != null) return _Mouse!!
        
        _Mouse = ImageVector.Builder(
            name = "mouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-116f, 0f, -198f, -82f)
                reflectiveQuadToRelative(-82f, -198f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -116f, 82f, -198f)
                reflectiveQuadToRelative(198f, -82f)
                quadToRelative(116f, 0f, 198f, 82f)
                reflectiveQuadToRelative(82f, 198f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 116f, -82f, 198f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(40f, -520f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -72f, -45.5f, -127f)
                reflectiveQuadTo(520f, 164f)
                verticalLineToRelative(196f)
                close()
                moveToRelative(-240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-196f)
                quadToRelative(-69f, 14f, -114.5f, 69f)
                reflectiveQuadTo(280f, 360f)
                close()
                moveToRelative(200f, 440f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 600f)
                verticalLineToRelative(-160f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(0f, -360f)
                close()
                moveToRelative(40f, -80f)
                close()
                moveToRelative(-80f, 0f)
                close()
                moveToRelative(40f, 80f)
                close()
            }
        }.build()
        
        return _Mouse!!
    }

private var _Mouse: ImageVector? = null

