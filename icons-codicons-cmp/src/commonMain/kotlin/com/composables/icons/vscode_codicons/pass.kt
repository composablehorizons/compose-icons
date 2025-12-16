package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Pass: ImageVector
    get() {
        if (_Pass != null) return _Pass!!
        
        _Pass = ImageVector.Builder(
            name = "pass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.6484f, 5.64648f)
                curveTo(10.8434f, 5.45148f, 11.1605f, 5.45148f, 11.3555f, 5.64648f)
                curveTo(11.5498f, 5.84137f, 11.5499f, 6.15766f, 11.3555f, 6.35254f)
                lineTo(7.35547f, 10.3525f)
                curveTo(7.25747f, 10.4495f, 7.12898f, 10.499f, 7.00098f, 10.499f)
                curveTo(6.87299f, 10.499f, 6.74545f, 10.4505f, 6.64746f, 10.3525f)
                lineTo(4.64746f, 8.35254f)
                curveTo(4.45247f, 8.15754f, 4.45248f, 7.84148f, 4.64746f, 7.64648f)
                curveTo(4.84246f, 7.45148f, 5.15949f, 7.45148f, 5.35449f, 7.64648f)
                lineTo(7f, 9.29199f)
                lineTo(10.6465f, 5.64648f)
                horizontalLineTo(10.6484f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(11.86f, 1f, 15f, 4.14f, 15f, 8f)
                curveTo(15f, 11.86f, 11.86f, 15f, 8f, 15f)
                curveTo(4.14f, 15f, 1f, 11.86f, 1f, 8f)
                curveTo(1f, 4.14f, 4.14f, 1f, 8f, 1f)
                close()
                moveTo(8f, 2f)
                curveTo(4.691f, 2f, 2f, 4.691f, 2f, 8f)
                curveTo(2f, 11.309f, 4.691f, 14f, 8f, 14f)
                curveTo(11.309f, 14f, 14f, 11.309f, 14f, 8f)
                curveTo(14f, 4.691f, 11.309f, 2f, 8f, 2f)
                close()
            }
        }.build()
        
        return _Pass!!
    }

private var _Pass: ImageVector? = null

