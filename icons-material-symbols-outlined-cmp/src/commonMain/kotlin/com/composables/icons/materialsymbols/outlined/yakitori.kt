package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Yakitori: ImageVector
    get() {
        if (_Yakitori != null) return _Yakitori!!
        
        _Yakitori = ImageVector.Builder(
            name = "yakitori",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(843f, 900f)
                lineTo(670f, 726f)
                lineToRelative(-85f, 85f)
                quadToRelative(-23f, 23f, -56.5f, 23f)
                reflectiveQuadTo(472f, 811f)
                lineToRelative(-57f, -56f)
                quadToRelative(-23f, -23f, -23f, -56.5f)
                reflectiveQuadToRelative(23f, -56.5f)
                lineToRelative(-56f, -57f)
                quadToRelative(-23f, 23f, -56.5f, 23f)
                reflectiveQuadTo(246f, 585f)
                lineToRelative(-57f, -56f)
                quadToRelative(-23f, -23f, -23f, -56.5f)
                reflectiveQuadToRelative(23f, -56.5f)
                lineToRelative(-56f, -57f)
                quadToRelative(-23f, -23f, -23f, -56.5f)
                reflectiveQuadToRelative(23f, -56.5f)
                lineToRelative(28f, -28f)
                lineTo(60f, 116f)
                lineToRelative(56f, -56f)
                lineToRelative(102f, 102f)
                lineToRelative(28f, -28f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(56f, 56f)
                quadToRelative(23f, -23f, 56.5f, -23f)
                reflectiveQuadToRelative(56.5f, 23f)
                lineToRelative(57f, 56f)
                quadToRelative(23f, 23f, 23f, 57f)
                reflectiveQuadToRelative(-23f, 57f)
                lineToRelative(56f, 56f)
                quadToRelative(23f, -23f, 56.5f, -23f)
                reflectiveQuadToRelative(56.5f, 23f)
                lineToRelative(57f, 56f)
                quadToRelative(23f, 23f, 23f, 57f)
                reflectiveQuadToRelative(-23f, 57f)
                lineToRelative(-85f, 84f)
                lineToRelative(172f, 173f)
                lineToRelative(-56f, 57f)
                close()
                moveTo(529f, 755f)
                lineToRelative(227f, -226f)
                lineToRelative(-57f, -57f)
                lineToRelative(-227f, 227f)
                lineToRelative(57f, 56f)
                close()
                moveToRelative(-57f, -170f)
                lineToRelative(114f, -113f)
                lineToRelative(-57f, -56f)
                lineToRelative(-113f, 113f)
                lineToRelative(56f, 56f)
                close()
                moveToRelative(-170f, -56f)
                lineToRelative(227f, -227f)
                lineToRelative(-57f, -56f)
                lineToRelative(-226f, 226f)
                lineToRelative(56f, 57f)
                close()
                moveToRelative(-56f, -170f)
                lineToRelative(114f, -113f)
                lineToRelative(-57f, -57f)
                lineToRelative(-113f, 113f)
                lineToRelative(56f, 57f)
                close()
                moveToRelative(368f, 255f)
                close()
                moveTo(501f, 500f)
                close()
                moveTo(388f, 387f)
                close()
                moveTo(275f, 274f)
                close()
            }
        }.build()
        
        return _Yakitori!!
    }

private var _Yakitori: ImageVector? = null

