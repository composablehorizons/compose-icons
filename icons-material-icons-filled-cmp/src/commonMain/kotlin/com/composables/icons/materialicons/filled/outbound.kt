package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Outbound: ImageVector
    get() {
        if (_Outbound != null) return _Outbound!!
        
        _Outbound = ImageVector.Builder(
            name = "outbound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(13.88f, 11.54f)
                lineToRelative(-4.96f, 4.96f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.96f, -4.96f)
                lineTo(10.34f, 8f)
                lineToRelative(5.65f, 0.01f)
                lineTo(16f, 13.66f)
                lineTo(13.88f, 11.54f)
                close()
            }
        }.build()
        
        return _Outbound!!
    }

private var _Outbound: ImageVector? = null

