package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Linear_scale: ImageVector
    get() {
        if (_Linear_scale != null) return _Linear_scale!!
        
        _Linear_scale = ImageVector.Builder(
            name = "linear_scale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 680f)
                quadToRelative(-72f, 0f, -127f, -45.5f)
                reflectiveQuadTo(484f, 520f)
                horizontalLineTo(272f)
                quadToRelative(-12f, 27f, -37f, 43.5f)
                reflectiveQuadTo(180f, 580f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(30f, 0f, 55f, 16.5f)
                reflectiveQuadToRelative(37f, 43.5f)
                horizontalLineToRelative(212f)
                quadToRelative(14f, -69f, 69f, -114.5f)
                reflectiveQuadTo(680f, 280f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 680f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
            }
        }.build()
        
        return _Linear_scale!!
    }

private var _Linear_scale: ImageVector? = null

