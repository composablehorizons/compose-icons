package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Search_check_2: ImageVector
    get() {
        if (_Search_check_2 != null) return _Search_check_2!!
        
        _Search_check_2 = ImageVector.Builder(
            name = "search_check_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 640f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveToRelative(-42f, -98f)
                lineToRelative(226f, -227f)
                lineToRelative(-57f, -57f)
                lineToRelative(-169f, 170f)
                lineToRelative(-85f, -84f)
                lineToRelative(-57f, 56f)
                lineToRelative(142f, 142f)
                close()
                moveToRelative(42f, 178f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 56f, -17.5f, 105.5f)
                reflectiveQuadTo(653f, 596f)
                lineToRelative(227f, 228f)
                lineToRelative(-56f, 56f)
                lineToRelative(-228f, -227f)
                quadToRelative(-41f, 32f, -90.5f, 49.5f)
                reflectiveQuadTo(400f, 720f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Search_check_2!!
    }

private var _Search_check_2: ImageVector? = null

