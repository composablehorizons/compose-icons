package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Missing_controller: ImageVector
    get() {
        if (_Missing_controller != null) return _Missing_controller!!
        
        _Missing_controller = ImageVector.Builder(
            name = "missing_controller",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(226f, 186f)
                lineToRelative(-56f, -56f)
                quadToRelative(59f, -62f, 138.5f, -96f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(92f, 0f, 171.5f, 34f)
                reflectiveQuadTo(790f, 130f)
                lineToRelative(-56f, 56f)
                quadToRelative(-48f, -50f, -113.5f, -78f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(-75f, 0f, -140.5f, 28f)
                reflectiveQuadTo(226f, 186f)
                close()
                moveToRelative(112f, 112f)
                lineToRelative(-56f, -56f)
                quadToRelative(38f, -38f, 88.5f, -60f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(59f, 0f, 109.5f, 22f)
                reflectiveQuadToRelative(88.5f, 60f)
                lineToRelative(-56f, 56f)
                quadToRelative(-27f, -27f, -63.5f, -42.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-42f, 0f, -78.5f, 15.5f)
                reflectiveQuadTo(338f, 298f)
                close()
                moveTo(480f, 960f)
                quadToRelative(-57f, 0f, -98.5f, -41.5f)
                reflectiveQuadTo(340f, 820f)
                verticalLineToRelative(-322f)
                quadToRelative(0f, -57f, 41.5f, -98.5f)
                reflectiveQuadTo(480f, 358f)
                quadToRelative(57f, 0f, 98.5f, 41.5f)
                reflectiveQuadTo(620f, 498f)
                verticalLineToRelative(322f)
                quadToRelative(0f, 57f, -41.5f, 98.5f)
                reflectiveQuadTo(480f, 960f)
                close()
                moveToRelative(0f, -380f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 500f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 500f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 580f)
                close()
            }
        }.build()
        
        return _Missing_controller!!
    }

private var _Missing_controller: ImageVector? = null

