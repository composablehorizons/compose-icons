package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Flaky: ImageVector
    get() {
        if (_Flaky != null) return _Flaky!!
        
        _Flaky = ImageVector.Builder(
            name = "flaky",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
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
                moveTo(294f, 449f)
                lineToRelative(56f, -57f)
                lineToRelative(56f, 57f)
                lineToRelative(43f, -43f)
                lineToRelative(-57f, -56f)
                lineToRelative(57f, -56f)
                lineToRelative(-43f, -43f)
                lineToRelative(-56f, 57f)
                lineToRelative(-56f, -57f)
                lineToRelative(-43f, 43f)
                lineToRelative(57f, 56f)
                lineToRelative(-57f, 56f)
                lineToRelative(43f, 43f)
                close()
                moveToRelative(186f, 351f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -66f, -25f, -124f)
                reflectiveQuadToRelative(-69f, -102f)
                lineTo(254f, 706f)
                quadToRelative(44f, 44f, 102f, 69f)
                reflectiveQuadToRelative(124f, 25f)
                close()
                moveToRelative(82f, -96f)
                lineToRelative(-96f, -96f)
                lineToRelative(42f, -43f)
                lineToRelative(54f, 54f)
                lineToRelative(100f, -99f)
                lineToRelative(42f, 42f)
                lineToRelative(-142f, 142f)
                close()
            }
        }.build()
        
        return _Flaky!!
    }

private var _Flaky: ImageVector? = null

