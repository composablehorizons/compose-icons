package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.History_2: ImageVector
    get() {
        if (_History_2 != null) return _History_2!!
        
        _History_2 = ImageVector.Builder(
            name = "history_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-142f, 0f, -250.5f, -87f)
                reflectiveQuadTo(90f, 571f)
                quadToRelative(-4f, -17f, 6f, -30.5f)
                reflectiveQuadToRelative(27f, -15.5f)
                quadToRelative(17f, -2f, 30f, 8f)
                reflectiveQuadToRelative(18f, 27f)
                quadToRelative(27f, 105f, 112.5f, 172.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-86f, 0f, -159.5f, 42.5f)
                reflectiveQuadTo(204f, 320f)
                horizontalLineToRelative(76f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 400f)
                horizontalLineTo(144f)
                quadToRelative(-22f, 0f, -35f, -17.5f)
                reflectiveQuadToRelative(-6f, -37.5f)
                quadToRelative(42f, -118f, 145f, -191.5f)
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
                moveToRelative(40f, -416f)
                lineToRelative(100f, 100f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(452f, 508f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadToRelative(-3f, -15.5f)
                verticalLineToRelative(-159f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 320f)
                verticalLineToRelative(144f)
                close()
            }
        }.build()
        
        return _History_2!!
    }

private var _History_2: ImageVector? = null

