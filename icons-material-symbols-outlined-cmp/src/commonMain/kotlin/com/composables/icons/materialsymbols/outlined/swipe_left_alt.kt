package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Swipe_left_alt: ImageVector
    get() {
        if (_Swipe_left_alt != null) return _Swipe_left_alt!!
        
        _Swipe_left_alt = ImageVector.Builder(
            name = "swipe_left_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 680f)
                quadToRelative(-73f, 0f, -127.5f, -45.5f)
                reflectiveQuadTo(404f, 520f)
                horizontalLineTo(233f)
                lineToRelative(63f, 64f)
                lineToRelative(-56f, 56f)
                lineTo(80f, 480f)
                lineToRelative(160f, -160f)
                lineToRelative(57f, 56f)
                lineToRelative(-64f, 64f)
                horizontalLineToRelative(171f)
                quadToRelative(14f, -69f, 68.5f, -114.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(600f, 680f)
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
                moveToRelative(0f, -120f)
                close()
            }
        }.build()
        
        return _Swipe_left_alt!!
    }

private var _Swipe_left_alt: ImageVector? = null

