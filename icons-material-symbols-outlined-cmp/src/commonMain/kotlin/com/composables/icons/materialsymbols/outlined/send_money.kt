package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Send_money: ImageVector
    get() {
        if (_Send_money != null) return _Send_money!!
        
        _Send_money = ImageVector.Builder(
            name = "send_money",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 790f)
                quadTo(136f, 763f, 68f, 678f)
                reflectiveQuadTo(0f, 480f)
                quadToRelative(0f, -113f, 68f, -198f)
                reflectiveQuadToRelative(172f, -112f)
                verticalLineToRelative(84f)
                quadToRelative(-71f, 24f, -115.5f, 86f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, 78f, 44.5f, 140f)
                reflectiveQuadTo(240f, 706f)
                verticalLineToRelative(84f)
                close()
                moveToRelative(320f, 10f)
                quadToRelative(-133f, 0f, -226.5f, -93.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -133f, 93.5f, -226.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(66f, 0f, 124f, 25f)
                reflectiveQuadToRelative(102f, 69f)
                lineToRelative(-56f, 56f)
                quadToRelative(-33f, -33f, -76.5f, -51.5f)
                reflectiveQuadTo(560f, 240f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(50f, 0f, 93.5f, -18.5f)
                reflectiveQuadTo(730f, 650f)
                lineToRelative(56f, 56f)
                quadToRelative(-44f, 44f, -102f, 69f)
                reflectiveQuadToRelative(-124f, 25f)
                close()
                moveToRelative(240f, -160f)
                lineToRelative(-56f, -56f)
                lineToRelative(64f, -64f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(288f)
                lineToRelative(-64f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Send_money!!
    }

private var _Send_money: ImageVector? = null

