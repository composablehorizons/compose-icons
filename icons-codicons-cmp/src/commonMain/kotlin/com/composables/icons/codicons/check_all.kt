package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CheckAll: ImageVector
    get() {
        if (_CheckAll != null) return _CheckAll!!
        
        _CheckAll = ImageVector.Builder(
            name = "check-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.354f, 3.646f)
                curveTo(12.159f, 3.451f, 11.842f, 3.451f, 11.647f, 3.646f)
                lineTo(6.70798f, 8.585f)
                lineTo(7.41498f, 9.292f)
                lineTo(12.354f, 4.353f)
                curveTo(12.549f, 4.158f, 12.549f, 3.841f, 12.354f, 3.646f)
                close()
                moveTo(1.85398f, 8.146f)
                curveTo(1.65898f, 7.951f, 1.34198f, 7.951f, 1.14698f, 8.146f)
                curveTo(0.951982f, 8.341f, 0.951982f, 8.658f, 1.14698f, 8.853f)
                lineTo(4.14698f, 11.853f)
                curveTo(4.24498f, 11.951f, 4.37298f, 11.999f, 4.50098f, 11.999f)
                curveTo(4.62898f, 11.999f, 4.75698f, 11.95f, 4.85498f, 11.853f)
                lineTo(5.20898f, 11.499f)
                lineTo(4.50198f, 10.792f)
                lineTo(1.85598f, 8.146f)
                horizontalLineTo(1.85398f)
                close()
                moveTo(7.49998f, 12f)
                curveTo(7.37198f, 12f, 7.24398f, 11.951f, 7.14598f, 11.854f)
                lineTo(4.14598f, 8.854f)
                curveTo(3.95098f, 8.659f, 3.95098f, 8.342f, 4.14598f, 8.147f)
                curveTo(4.34098f, 7.952f, 4.65798f, 7.952f, 4.85298f, 8.147f)
                lineTo(7.49898f, 10.793f)
                lineTo(14.645f, 3.647f)
                curveTo(14.84f, 3.452f, 15.157f, 3.452f, 15.352f, 3.647f)
                curveTo(15.547f, 3.842f, 15.547f, 4.159f, 15.352f, 4.354f)
                lineTo(7.85198f, 11.854f)
                curveTo(7.75398f, 11.952f, 7.62598f, 12f, 7.49798f, 12f)
                horizontalLineTo(7.49998f)
                close()
            }
        }.build()
        
        return _CheckAll!!
    }

private var _CheckAll: ImageVector? = null

