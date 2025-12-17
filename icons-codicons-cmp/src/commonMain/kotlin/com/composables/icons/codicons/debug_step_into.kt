package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugStepInto: ImageVector
    get() {
        if (_DebugStepInto != null) return _DebugStepInto!!
        
        _DebugStepInto = ImageVector.Builder(
            name = "debug-step-into",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 13f)
                curveTo(10f, 14.103f, 9.10304f, 15f, 8.00004f, 15f)
                curveTo(6.89704f, 15f, 6.00004f, 14.103f, 6.00004f, 13f)
                curveTo(6.00004f, 11.897f, 6.89704f, 11f, 8.00004f, 11f)
                curveTo(9.10304f, 11f, 10f, 11.897f, 10f, 13f)
                close()
                moveTo(12.03f, 5.22f)
                curveTo(11.737f, 4.927f, 11.262f, 4.927f, 10.969f, 5.22f)
                lineTo(8.74904f, 7.44f)
                verticalLineTo(1.75f)
                curveTo(8.74904f, 1.336f, 8.41304f, 1f, 7.99904f, 1f)
                curveTo(7.58504f, 1f, 7.24904f, 1.336f, 7.24904f, 1.75f)
                verticalLineTo(7.439f)
                lineTo(5.02904f, 5.219f)
                curveTo(4.73604f, 4.926f, 4.26104f, 4.926f, 3.96804f, 5.219f)
                curveTo(3.67504f, 5.512f, 3.67504f, 5.987f, 3.96804f, 6.28f)
                lineTo(7.46804f, 9.78f)
                curveTo(7.61404f, 9.926f, 7.80604f, 10f, 7.99804f, 10f)
                curveTo(8.19004f, 10f, 8.38204f, 9.927f, 8.52804f, 9.78f)
                lineTo(12.028f, 6.28f)
                curveTo(12.321f, 5.987f, 12.321f, 5.512f, 12.028f, 5.219f)
                lineTo(12.03f, 5.22f)
                close()
            }
        }.build()
        
        return _DebugStepInto!!
    }

private var _DebugStepInto: ImageVector? = null

