package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Task_alt: ImageVector
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
                quadToRelative(48f, 0f, 93.5f, 11f)
                reflectiveQuadToRelative(87.5f, 32f)
                quadToRelative(15f, 8f, 19.5f, 24f)
                reflectiveQuadToRelative(-5.5f, 30f)
                quadToRelative(-10f, 14f, -26.5f, 18f)
                reflectiveQuadToRelative(-32.5f, -4f)
                quadToRelative(-32f, -15f, -66.5f, -23f)
                reflectiveQuadToRelative(-69.5f, -8f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -8f, -0.5f, -15.5f)
                reflectiveQuadTo(798f, 449f)
                quadToRelative(-2f, -17f, 6.5f, -32.5f)
                reflectiveQuadTo(830f, 396f)
                quadToRelative(16f, -5f, 30f, 3f)
                reflectiveQuadToRelative(16f, 24f)
                quadToRelative(2f, 14f, 3f, 28f)
                reflectiveQuadToRelative(1f, 29f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-56f, -328f)
                lineToRelative(372f, -373f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(852f, 179f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(452f, 636f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(282f, 522f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(86f, 86f)
                close()
            }
        }.build()
        
        return _Task_alt!!
    }

private var _Task_alt: ImageVector? = null

