package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sports_basketball: ImageVector
    get() {
        if (_Sports_basketball != null) return _Sports_basketball!!
        
        _Sports_basketball = ImageVector.Builder(
            name = "sports_basketball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(162f, 440f)
                horizontalLineToRelative(114f)
                quadToRelative(-6f, -38f, -23f, -71f)
                reflectiveQuadToRelative(-43f, -59f)
                quadToRelative(-18f, 29f, -30.5f, 61.5f)
                reflectiveQuadTo(162f, 440f)
                close()
                moveToRelative(522f, 0f)
                horizontalLineToRelative(114f)
                quadToRelative(-5f, -36f, -17.5f, -68.5f)
                reflectiveQuadTo(750f, 310f)
                quadToRelative(-26f, 26f, -43f, 59f)
                reflectiveQuadToRelative(-23f, 71f)
                close()
                moveTo(210f, 650f)
                quadToRelative(26f, -26f, 43f, -59f)
                reflectiveQuadToRelative(23f, -71f)
                horizontalLineTo(162f)
                quadToRelative(5f, 36f, 17.5f, 68.5f)
                reflectiveQuadTo(210f, 650f)
                close()
                moveToRelative(540f, 0f)
                quadToRelative(18f, -29f, 30.5f, -61.5f)
                reflectiveQuadTo(798f, 520f)
                horizontalLineTo(684f)
                quadToRelative(6f, 38f, 23f, 71f)
                reflectiveQuadToRelative(43f, 59f)
                close()
                moveTo(358f, 440f)
                horizontalLineToRelative(82f)
                verticalLineToRelative(-278f)
                quadToRelative(-53f, 8f, -98.5f, 29.5f)
                reflectiveQuadTo(260f, 248f)
                quadToRelative(39f, 38f, 64.5f, 86.5f)
                reflectiveQuadTo(358f, 440f)
                close()
                moveToRelative(162f, 0f)
                horizontalLineToRelative(82f)
                quadToRelative(8f, -57f, 33.5f, -105.5f)
                reflectiveQuadTo(700f, 248f)
                quadToRelative(-36f, -35f, -81.5f, -56.5f)
                reflectiveQuadTo(520f, 162f)
                verticalLineToRelative(278f)
                close()
                moveToRelative(-80f, 358f)
                verticalLineToRelative(-278f)
                horizontalLineToRelative(-82f)
                quadToRelative(-8f, 57f, -33.5f, 105.5f)
                reflectiveQuadTo(260f, 712f)
                quadToRelative(36f, 35f, 81.5f, 56.5f)
                reflectiveQuadTo(440f, 798f)
                close()
                moveToRelative(80f, 0f)
                quadToRelative(53f, -8f, 98.5f, -29.5f)
                reflectiveQuadTo(700f, 712f)
                quadToRelative(-39f, -38f, -64.5f, -86.5f)
                reflectiveQuadTo(602f, 520f)
                horizontalLineToRelative(-82f)
                verticalLineToRelative(278f)
                close()
                moveToRelative(-40f, -318f)
                close()
                moveToRelative(0f, 400f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Sports_basketball!!
    }

private var _Sports_basketball: ImageVector? = null

