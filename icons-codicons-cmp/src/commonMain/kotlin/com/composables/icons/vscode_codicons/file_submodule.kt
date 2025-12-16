package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FileSubmodule: ImageVector
    get() {
        if (_FileSubmodule != null) return _FileSubmodule!!
        
        _FileSubmodule = ImageVector.Builder(
            name = "file-submodule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 3f)
                curveTo(2.67157f, 3f, 2f, 3.67157f, 2f, 4.5f)
                verticalLineTo(5f)
                horizontalLineTo(5.08579f)
                curveTo(5.21839f, 5f, 5.34557f, 4.94732f, 5.43934f, 4.85355f)
                lineTo(6.29289f, 4f)
                lineTo(5.43934f, 3.14645f)
                curveTo(5.34557f, 3.05268f, 5.21839f, 3f, 5.08579f, 3f)
                horizontalLineTo(3.5f)
                close()
                moveTo(1f, 4.44118f)
                curveTo(1f, 4.4252f, 1.00075f, 4.4094f, 1.00221f, 4.39381f)
                curveTo(1.05785f, 3.06235f, 2.15486f, 2f, 3.5f, 2f)
                horizontalLineTo(5.08579f)
                curveTo(5.48361f, 2f, 5.86514f, 2.15804f, 6.14645f, 2.43934f)
                lineTo(7.20711f, 3.5f)
                horizontalLineTo(10.5f)
                curveTo(11.8807f, 3.5f, 13f, 4.61929f, 13f, 6f)
                verticalLineTo(9.5f)
                curveTo(13f, 10.8807f, 11.8807f, 12f, 10.5f, 12f)
                horizontalLineTo(3.5f)
                curveTo(2.11929f, 12f, 1f, 10.8807f, 1f, 9.5f)
                verticalLineTo(4.44118f)
                close()
                moveTo(7.20711f, 4.5f)
                lineTo(6.14645f, 5.56066f)
                curveTo(5.86514f, 5.84196f, 5.48361f, 6f, 5.08579f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(9.5f)
                curveTo(2f, 10.3284f, 2.67157f, 11f, 3.5f, 11f)
                horizontalLineTo(10.5f)
                curveTo(11.3284f, 11f, 12f, 10.3284f, 12f, 9.5f)
                verticalLineTo(6f)
                curveTo(12f, 5.17157f, 11.3284f, 4.5f, 10.5f, 4.5f)
                horizontalLineTo(7.20711f)
                close()
                moveTo(14.0002f, 6f)
                curveTo(14.6074f, 6.4561f, 15.0002f, 7.18227f, 15.0002f, 8.00018f)
                verticalLineTo(9.50018f)
                curveTo(15.0002f, 11.9855f, 12.9855f, 14.0002f, 10.5002f, 14.0002f)
                horizontalLineTo(5.50018f)
                curveTo(4.68227f, 14.0002f, 3.9561f, 13.6074f, 3.5f, 13.0002f)
                horizontalLineTo(10.5002f)
                curveTo(12.4332f, 13.0002f, 14.0002f, 11.4332f, 14.0002f, 9.50018f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _FileSubmodule!!
    }

private var _FileSubmodule: ImageVector? = null

