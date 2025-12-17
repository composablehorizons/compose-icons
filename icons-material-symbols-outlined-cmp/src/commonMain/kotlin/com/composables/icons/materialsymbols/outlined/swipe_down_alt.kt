package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Swipe_down_alt: ImageVector
    get() {
        if (_Swipe_down_alt != null) return _Swipe_down_alt!!
        
        _Swipe_down_alt = ImageVector.Builder(
            name = "swipe_down_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(320f, 720f)
                lineToRelative(56f, -57f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-171f)
                quadToRelative(-69f, -14f, -114.5f, -68.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 360f)
                quadToRelative(0f, 73f, -45.5f, 127.5f)
                reflectiveQuadTo(520f, 556f)
                verticalLineToRelative(171f)
                lineToRelative(64f, -63f)
                lineToRelative(56f, 56f)
                lineTo(480f, 880f)
                close()
                moveToRelative(0f, -400f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -120f)
                close()
            }
        }.build()
        
        return _Swipe_down_alt!!
    }

private var _Swipe_down_alt: ImageVector? = null

