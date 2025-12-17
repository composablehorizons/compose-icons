package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Home: ImageVector
    get() {
        if (_Home != null) return _Home!!
        
        _Home = ImageVector.Builder(
            name = "home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.31299f, 1.26164f)
                curveTo(7.69849f, 0.897163f, 8.30151f, 0.897163f, 8.68701f, 1.26164f)
                lineTo(13.5305f, 5.84098f)
                curveTo(13.8302f, 6.12431f, 14f, 6.51853f, 14f, 6.93094f)
                verticalLineTo(12.5002f)
                curveTo(14f, 13.3286f, 13.3284f, 14.0002f, 12.5f, 14.0002f)
                horizontalLineTo(10.5f)
                curveTo(9.67157f, 14.0002f, 9f, 13.3286f, 9f, 12.5002f)
                verticalLineTo(10.0002f)
                curveTo(9f, 9.72407f, 8.77614f, 9.50021f, 8.5f, 9.50021f)
                horizontalLineTo(7.5f)
                curveTo(7.22386f, 9.50021f, 7f, 9.72407f, 7f, 10.0002f)
                verticalLineTo(12.5002f)
                curveTo(7f, 13.3286f, 6.32843f, 14.0002f, 5.5f, 14.0002f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 14.0002f, 2f, 13.3286f, 2f, 12.5002f)
                verticalLineTo(6.93094f)
                curveTo(2f, 6.51853f, 2.1698f, 6.12431f, 2.46948f, 5.84098f)
                lineTo(7.31299f, 1.26164f)
                close()
                moveTo(8f, 1.98828f)
                lineTo(3.15649f, 6.56762f)
                curveTo(3.0566f, 6.66207f, 3f, 6.79347f, 3f, 6.93094f)
                verticalLineTo(12.5002f)
                curveTo(3f, 12.7763f, 3.22386f, 13.0002f, 3.5f, 13.0002f)
                horizontalLineTo(5.5f)
                curveTo(5.77614f, 13.0002f, 6f, 12.7763f, 6f, 12.5002f)
                verticalLineTo(10.0002f)
                curveTo(6f, 9.17179f, 6.67157f, 8.50022f, 7.5f, 8.50022f)
                horizontalLineTo(8.5f)
                curveTo(9.32843f, 8.50022f, 10f, 9.17179f, 10f, 10.0002f)
                verticalLineTo(12.5002f)
                curveTo(10f, 12.7763f, 10.2239f, 13.0002f, 10.5f, 13.0002f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 13.0002f, 13f, 12.7763f, 13f, 12.5002f)
                verticalLineTo(6.93094f)
                curveTo(13f, 6.79347f, 12.9434f, 6.66207f, 12.8435f, 6.56762f)
                lineTo(8f, 1.98828f)
                close()
            }
        }.build()
        
        return _Home!!
    }

private var _Home: ImageVector? = null

