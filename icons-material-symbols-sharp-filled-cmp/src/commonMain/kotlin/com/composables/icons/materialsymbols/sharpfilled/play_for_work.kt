package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Play_for_work: ImageVector
    get() {
        if (_Play_for_work != null) return _Play_for_work!!
        
        _Play_for_work = ImageVector.Builder(
            name = "play_for_work",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveToRelative(0f, -201f)
                lineTo(320f, 439f)
                lineToRelative(56f, -57f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-246f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(246f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 57f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Play_for_work!!
    }

private var _Play_for_work: ImageVector? = null

