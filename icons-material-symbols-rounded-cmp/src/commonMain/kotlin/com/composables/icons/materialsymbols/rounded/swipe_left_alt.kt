package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Swipe_left_alt: ImageVector
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
                lineToRelative(36f, 36f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(268f, 612f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(108f, 508f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadTo(97f, 480f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(268f, 405f)
                lineToRelative(-35f, 35f)
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

