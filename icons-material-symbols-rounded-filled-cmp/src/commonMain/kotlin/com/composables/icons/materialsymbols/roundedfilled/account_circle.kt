package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Account_circle: ImageVector
    get() {
        if (_Account_circle != null) return _Account_circle!!
        
        _Account_circle = ImageVector.Builder(
            name = "account_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(234f, 684f)
                quadToRelative(51f, -39f, 114f, -61.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(69f, 0f, 132f, 22.5f)
                reflectiveQuadTo(726f, 684f)
                quadToRelative(35f, -41f, 54.5f, -93f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 59f, 19.5f, 111f)
                reflectiveQuadToRelative(54.5f, 93f)
                close()
                moveToRelative(246f, -164f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(340f, 380f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(59f, 0f, 99.5f, 40.5f)
                reflectiveQuadTo(620f, 380f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveToRelative(0f, 360f)
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
        
        return _Account_circle!!
    }

private var _Account_circle: ImageVector? = null

