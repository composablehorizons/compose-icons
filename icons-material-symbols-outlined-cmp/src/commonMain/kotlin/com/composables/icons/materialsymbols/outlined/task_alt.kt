package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Task_alt: ImageVector
    get() {
        if (_Task_alt != null) return _Task_alt!!
        
        _Task_alt = ImageVector.Builder(
            name = "task_alt",
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
                quadToRelative(65f, 0f, 123f, 19f)
                reflectiveQuadToRelative(107f, 53f)
                lineToRelative(-58f, 59f)
                quadToRelative(-38f, -24f, -81f, -37.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -18f, -2f, -36f)
                reflectiveQuadToRelative(-6f, -35f)
                lineToRelative(65f, -65f)
                quadToRelative(11f, 32f, 17f, 66f)
                reflectiveQuadToRelative(6f, 70f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-56f, -216f)
                lineTo(254f, 494f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 114f)
                lineToRelative(400f, -401f)
                lineToRelative(56f, 56f)
                lineToRelative(-456f, 457f)
                close()
            }
        }.build()
        
        return _Task_alt!!
    }

private var _Task_alt: ImageVector? = null

