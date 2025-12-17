package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Not_started: ImageVector
    get() {
        if (_Not_started != null) return _Not_started!!
        
        _Not_started = ImageVector.Builder(
            name = "not_started",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(11f, 16f)
                    horizontalLineTo(9f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(16f)
                    close()
                    moveTo(12f, 16f)
                    verticalLineTo(8f)
                    lineToRelative(5f, 4f)
                    lineTo(12f, 16f)
                    close()
                }
            }
        }.build()
        
        return _Not_started!!
    }

private var _Not_started: ImageVector? = null

