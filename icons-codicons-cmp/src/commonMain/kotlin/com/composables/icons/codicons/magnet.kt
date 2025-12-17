package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Magnet: ImageVector
    get() {
        if (_Magnet != null) return _Magnet!!
        
        _Magnet = ImageVector.Builder(
            name = "magnet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.58702f, 2.02801f)
                curveTo(6.87302f, 1.86101f, 5.23102f, 2.40801f, 3.96402f, 3.55901f)
                curveTo(2.71502f, 4.69401f, 1.99902f, 6.31301f, 1.99902f, 8.00001f)
                verticalLineTo(13f)
                curveTo(1.99902f, 13.551f, 2.44802f, 14f, 2.99902f, 14f)
                horizontalLineTo(4.99902f)
                curveTo(5.55002f, 14f, 5.99902f, 13.551f, 5.99902f, 13f)
                verticalLineTo(8.00001f)
                curveTo(5.99902f, 7.43601f, 6.23902f, 6.89501f, 6.65802f, 6.51701f)
                curveTo(7.08202f, 6.13301f, 7.63602f, 5.95301f, 8.20702f, 6.01101f)
                curveTo(9.21202f, 6.11101f, 9.99902f, 7.04801f, 9.99902f, 8.14301f)
                verticalLineTo(13f)
                curveTo(9.99902f, 13.551f, 10.448f, 14f, 10.999f, 14f)
                horizontalLineTo(12.999f)
                curveTo(13.55f, 14f, 13.999f, 13.551f, 13.999f, 13f)
                verticalLineTo(8.23601f)
                curveTo(13.999f, 5.04401f, 11.623f, 2.31701f, 8.58702f, 2.02801f)
                close()
                moveTo(3.00002f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(5.00002f)
                verticalLineTo(13f)
                horizontalLineTo(3.00002f)
                close()
                moveTo(8.30802f, 5.01601f)
                curveTo(8.20702f, 5.00601f, 8.10702f, 5.00101f, 8.00702f, 5.00101f)
                curveTo(7.26302f, 5.00101f, 6.54102f, 5.27501f, 5.98802f, 5.77501f)
                curveTo(5.36002f, 6.34301f, 5.00002f, 7.15401f, 5.00002f, 8.00001f)
                verticalLineTo(10f)
                horizontalLineTo(3.00002f)
                verticalLineTo(8.00001f)
                curveTo(3.00002f, 6.59401f, 3.59702f, 5.24501f, 4.63802f, 4.29901f)
                curveTo(5.69302f, 3.34001f, 7.06702f, 2.89001f, 8.49302f, 3.02301f)
                curveTo(11.02f, 3.26401f, 13f, 5.55401f, 13f, 8.23601f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(8.14301f)
                curveTo(11f, 6.54001f, 9.81702f, 5.16701f, 8.30802f, 5.01601f)
                close()
                moveTo(11f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                close()
            }
        }.build()
        
        return _Magnet!!
    }

private var _Magnet: ImageVector? = null

