package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.BeakerStop: ImageVector
    get() {
        if (_BeakerStop != null) return _BeakerStop!!
        
        _BeakerStop = ImageVector.Builder(
            name = "beaker-stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5002f, 7f)
                curveTo(13.9851f, 7.00011f, 16.0002f, 9.01507f, 16.0002f, 11.5f)
                curveTo(16.0002f, 13.9849f, 13.9851f, 15.9999f, 11.5002f, 16f)
                curveTo(9.0152f, 16f, 7.0002f, 13.985f, 7.0002f, 11.5f)
                curveTo(7.0002f, 9.015f, 9.0152f, 7f, 11.5002f, 7f)
                close()
                moveTo(9.40352f, 14.3027f)
                curveTo(9.98752f, 14.7407f, 10.7142f, 15f, 11.5002f, 15f)
                curveTo(13.4331f, 14.9999f, 15.0002f, 13.4329f, 15.0002f, 11.5f)
                curveTo(15.0002f, 10.7141f, 14.7409f, 9.98827f, 14.3029f, 9.4043f)
                lineTo(9.40352f, 14.3027f)
                close()
                moveTo(11.5002f, 8f)
                curveTo(9.5672f, 8f, 8.0002f, 9.567f, 8.0002f, 11.5f)
                curveTo(8.0002f, 12.286f, 8.25947f, 13.0117f, 8.69747f, 13.5957f)
                lineTo(13.5959f, 8.69727f)
                curveTo(13.012f, 8.2593f, 12.2861f, 8.00005f, 11.5002f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.0002f, 0.999023f)
                curveTo(12.2761f, 0.999139f, 12.5002f, 1.22309f, 12.5002f, 1.49902f)
                curveTo(12.5002f, 1.77494f, 12.2761f, 1.99891f, 12.0002f, 1.99902f)
                horizontalLineTo(11.0041f)
                verticalLineTo(6.02539f)
                curveTo(10.6602f, 6.05639f, 10.3271f, 6.12093f, 10.0041f, 6.21191f)
                verticalLineTo(1.99902f)
                horizontalLineTo(5.99434f)
                verticalLineTo(6.68652f)
                curveTo(5.99434f, 7.43152f, 5.80926f, 8.16529f, 5.45626f, 8.82129f)
                lineTo(4.82051f, 10f)
                horizontalLineTo(6.21407f)
                curveTo(6.12207f, 10.323f, 6.05659f, 10.656f, 6.02559f, 11f)
                horizontalLineTo(4.28243f)
                lineTo(3.06172f, 13.2637f)
                curveTo(2.88272f, 13.5967f, 3.12415f, 14.001f, 3.50215f, 14.001f)
                horizontalLineTo(6.60762f)
                curveTo(6.79062f, 14.358f, 7.00695f, 14.694f, 7.26094f, 15.001f)
                horizontalLineTo(3.50118f)
                curveTo(2.36521f, 15.001f, 1.64295f, 13.789f, 2.18087f, 12.79f)
                lineTo(4.5754f, 8.3457f)
                curveTo(4.85026f, 7.8358f, 4.99434f, 7.2644f, 4.99434f, 6.68555f)
                verticalLineTo(1.99902f)
                horizontalLineTo(4.0002f)
                curveTo(3.72421f, 1.99902f, 3.50022f, 1.77501f, 3.5002f, 1.49902f)
                curveTo(3.5002f, 1.22302f, 3.7242f, 0.999023f, 4.0002f, 0.999023f)
                horizontalLineTo(12.0002f)
                close()
            }
        }.build()
        
        return _BeakerStop!!
    }

private var _BeakerStop: ImageVector? = null

