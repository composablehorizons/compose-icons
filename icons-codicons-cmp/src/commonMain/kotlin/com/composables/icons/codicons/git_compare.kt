package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitCompare: ImageVector
    get() {
        if (_GitCompare != null) return _GitCompare!!
        
        _GitCompare = ImageVector.Builder(
            name = "git-compare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.14645f, 5.85355f)
                curveTo(9.34171f, 6.04882f, 9.65829f, 6.04882f, 9.85355f, 5.85355f)
                curveTo(10.0488f, 5.65829f, 10.0488f, 5.34171f, 9.85355f, 5.14645f)
                lineTo(8.70711f, 4f)
                horizontalLineTo(10.5f)
                curveTo(11.3284f, 4f, 12f, 4.67157f, 12f, 5.5f)
                verticalLineTo(10.05f)
                curveTo(10.8589f, 10.2816f, 10f, 11.2905f, 10f, 12.5f)
                curveTo(10f, 13.8807f, 11.1193f, 15f, 12.5f, 15f)
                curveTo(13.8807f, 15f, 15f, 13.8807f, 15f, 12.5f)
                curveTo(15f, 11.2905f, 14.1411f, 10.2816f, 13f, 10.05f)
                verticalLineTo(5.5f)
                curveTo(13f, 4.11929f, 11.8807f, 3f, 10.5f, 3f)
                horizontalLineTo(8.70711f)
                lineTo(9.85355f, 1.85355f)
                curveTo(10.0488f, 1.65829f, 10.0488f, 1.34171f, 9.85355f, 1.14645f)
                curveTo(9.65829f, 0.951184f, 9.34171f, 0.951184f, 9.14645f, 1.14645f)
                lineTo(7.14645f, 3.14645f)
                curveTo(6.95118f, 3.34171f, 6.95118f, 3.65829f, 7.14645f, 3.85355f)
                lineTo(9.14645f, 5.85355f)
                close()
                moveTo(14f, 12.5f)
                curveTo(14f, 13.3284f, 13.3284f, 14f, 12.5f, 14f)
                curveTo(11.6716f, 14f, 11f, 13.3284f, 11f, 12.5f)
                curveTo(11f, 11.6716f, 11.6716f, 11f, 12.5f, 11f)
                curveTo(13.3284f, 11f, 14f, 11.6716f, 14f, 12.5f)
                close()
                moveTo(6f, 3.5f)
                curveTo(6f, 4.70948f, 5.14112f, 5.71836f, 4f, 5.94999f)
                verticalLineTo(10.5f)
                curveTo(4f, 11.3284f, 4.67157f, 12f, 5.5f, 12f)
                horizontalLineTo(7.29289f)
                lineTo(6.14645f, 10.8536f)
                curveTo(5.95118f, 10.6583f, 5.95118f, 10.3417f, 6.14645f, 10.1464f)
                curveTo(6.34171f, 9.95118f, 6.65829f, 9.95118f, 6.85355f, 10.1464f)
                lineTo(8.85355f, 12.1464f)
                curveTo(9.04882f, 12.3417f, 9.04882f, 12.6583f, 8.85355f, 12.8536f)
                lineTo(6.85355f, 14.8536f)
                curveTo(6.65829f, 15.0488f, 6.34171f, 15.0488f, 6.14645f, 14.8536f)
                curveTo(5.95118f, 14.6583f, 5.95118f, 14.3417f, 6.14645f, 14.1464f)
                lineTo(7.29289f, 13f)
                horizontalLineTo(5.5f)
                curveTo(4.11929f, 13f, 3f, 11.8807f, 3f, 10.5f)
                verticalLineTo(5.94999f)
                curveTo(1.85888f, 5.71836f, 1f, 4.70948f, 1f, 3.5f)
                curveTo(1f, 2.11929f, 2.11929f, 1f, 3.5f, 1f)
                curveTo(4.88071f, 1f, 6f, 2.11929f, 6f, 3.5f)
                close()
                moveTo(5f, 3.5f)
                curveTo(5f, 2.67157f, 4.32843f, 2f, 3.5f, 2f)
                curveTo(2.67157f, 2f, 2f, 2.67157f, 2f, 3.5f)
                curveTo(2f, 4.32843f, 2.67157f, 5f, 3.5f, 5f)
                curveTo(4.32843f, 5f, 5f, 4.32843f, 5f, 3.5f)
                close()
            }
        }.build()
        
        return _GitCompare!!
    }

private var _GitCompare: ImageVector? = null

