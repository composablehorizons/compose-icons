package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Airlines: ImageVector
    get() {
        if (_Airlines != null) return _Airlines!!
        
        _Airlines = ImageVector.Builder(
            name = "airlines",
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
                moveTo(19.59f, 4f)
                horizontalLineToRelative(-5.01f)
                curveToRelative(-0.99f, 0f, -1.91f, 0.49f, -2.47f, 1.3f)
                lineTo(2f, 20f)
                horizontalLineToRelative(17f)
                lineToRelative(2.56f, -13.63f)
                curveTo(21.79f, 5.14f, 20.84f, 4f, 19.59f, 4f)
                close()
                moveTo(14.5f, 14f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveTo(17f, 12.88f, 15.88f, 14f, 14.5f, 14f)
                close()
            }
        }.build()
        
        return _Airlines!!
    }

private var _Airlines: ImageVector? = null

