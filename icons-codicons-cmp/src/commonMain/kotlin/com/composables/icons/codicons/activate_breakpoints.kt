package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ActivateBreakpoints: ImageVector
    get() {
        if (_ActivateBreakpoints != null) return _ActivateBreakpoints!!
        
        _ActivateBreakpoints = ImageVector.Builder(
            name = "activate-breakpoints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 10.5f)
                curveTo(10f, 12.985f, 7.985f, 15f, 5.5f, 15f)
                curveTo(3.015f, 15f, 1f, 12.985f, 1f, 10.5f)
                curveTo(1f, 8.015f, 3.015f, 6f, 5.5f, 6f)
                curveTo(7.985f, 6f, 10f, 8.015f, 10f, 10.5f)
                close()
                moveTo(10.5f, 1f)
                curveTo(8.19f, 1f, 6.306f, 2.756f, 6.053f, 5f)
                horizontalLineTo(7.067f)
                curveTo(7.313f, 3.31f, 8.743f, 2f, 10.5f, 2f)
                curveTo(12.43f, 2f, 14f, 3.57f, 14f, 5.5f)
                curveTo(14f, 7.257f, 12.69f, 8.687f, 11f, 8.933f)
                verticalLineTo(9.947f)
                curveTo(13.244f, 9.694f, 15f, 7.81f, 15f, 5.5f)
                curveTo(15f, 3.019f, 12.981f, 1f, 10.5f, 1f)
                close()
            }
        }.build()
        
        return _ActivateBreakpoints!!
    }

private var _ActivateBreakpoints: ImageVector? = null

