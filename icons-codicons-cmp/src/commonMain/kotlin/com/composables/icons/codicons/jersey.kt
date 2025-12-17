package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Jersey: ImageVector
    get() {
        if (_Jersey != null) return _Jersey!!
        
        _Jersey = ImageVector.Builder(
            name = "jersey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 14f)
                horizontalLineTo(4.49997f)
                curveTo(4.22397f, 14f, 3.99997f, 13.776f, 3.99997f, 13.5f)
                verticalLineTo(7f)
                horizontalLineTo(2.24997f)
                curveTo(2.02397f, 7f, 1.82697f, 6.849f, 1.76797f, 6.631f)
                lineTo(1.01797f, 3.881f)
                curveTo(0.948972f, 3.628f, 1.08697f, 3.364f, 1.33497f, 3.278f)
                lineTo(5.47797f, 1.828f)
                curveTo(5.60297f, 1.783f, 5.74197f, 1.792f, 5.86197f, 1.85f)
                curveTo(5.98197f, 1.909f, 6.07397f, 2.013f, 6.11697f, 2.139f)
                curveTo(6.39297f, 2.953f, 7.14997f, 3.5f, 8.00097f, 3.5f)
                curveTo(8.85197f, 3.5f, 9.60797f, 2.953f, 9.88497f, 2.139f)
                curveTo(9.92797f, 2.013f, 10.02f, 1.909f, 10.14f, 1.85f)
                curveTo(10.26f, 1.792f, 10.399f, 1.783f, 10.524f, 1.828f)
                lineTo(14.667f, 3.278f)
                curveTo(14.915f, 3.364f, 15.053f, 3.628f, 14.984f, 3.881f)
                lineTo(14.234f, 6.631f)
                curveTo(14.174f, 6.849f, 13.977f, 7f, 13.752f, 7f)
                horizontalLineTo(12.002f)
                verticalLineTo(13.5f)
                curveTo(12.002f, 13.776f, 11.778f, 14f, 11.502f, 14f)
                horizontalLineTo(11.5f)
                close()
                moveTo(4.99997f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(6.5f)
                curveTo(11f, 6.224f, 11.224f, 6f, 11.5f, 6f)
                horizontalLineTo(13.368f)
                lineTo(13.895f, 4.068f)
                lineTo(10.629f, 2.925f)
                curveTo(10.112f, 3.884f, 9.10897f, 4.5f, 7.99997f, 4.5f)
                curveTo(6.89097f, 4.5f, 5.88797f, 3.884f, 5.37097f, 2.925f)
                lineTo(2.10497f, 4.068f)
                lineTo(2.63197f, 6f)
                horizontalLineTo(4.49997f)
                curveTo(4.77597f, 6f, 4.99997f, 6.224f, 4.99997f, 6.5f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _Jersey!!
    }

private var _Jersey: ImageVector? = null

