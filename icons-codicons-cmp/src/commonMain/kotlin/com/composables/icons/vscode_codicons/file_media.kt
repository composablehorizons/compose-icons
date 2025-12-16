package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FileMedia: ImageVector
    get() {
        if (_FileMedia != null) return _FileMedia!!
        
        _FileMedia = ImageVector.Builder(
            name = "file-media",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 1f)
                curveTo(4.89543f, 1f, 4f, 1.89543f, 4f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                curveTo(5f, 2.44772f, 5.44772f, 2f, 6f, 2f)
                horizontalLineTo(9f)
                verticalLineTo(4.5f)
                curveTo(9f, 5.32843f, 9.67157f, 6f, 10.5f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                curveTo(13f, 13.5523f, 12.5523f, 14f, 12f, 14f)
                horizontalLineTo(10.9646f)
                curveTo(10.9141f, 14.3531f, 10.8109f, 14.6891f, 10.6632f, 15f)
                horizontalLineTo(12f)
                curveTo(13.1046f, 15f, 14f, 14.1046f, 14f, 13f)
                verticalLineTo(5.41421f)
                curveTo(14f, 5.01639f, 13.842f, 4.63486f, 13.5607f, 4.35355f)
                lineTo(10.6464f, 1.43934f)
                curveTo(10.3651f, 1.15804f, 9.98361f, 1f, 9.58579f, 1f)
                horizontalLineTo(6f)
                close()
                moveTo(12.7929f, 5f)
                horizontalLineTo(10.5f)
                curveTo(10.2239f, 5f, 10f, 4.77614f, 10f, 4.5f)
                verticalLineTo(2.20711f)
                lineTo(12.7929f, 5f)
                close()
                moveTo(1f, 9.5f)
                curveTo(1f, 8.11929f, 2.11929f, 7f, 3.5f, 7f)
                horizontalLineTo(7.5f)
                curveTo(8.88071f, 7f, 10f, 8.11929f, 10f, 9.5f)
                verticalLineTo(13.5f)
                curveTo(10f, 14.0095f, 9.84756f, 14.4835f, 9.5858f, 14.8787f)
                lineTo(6.56066f, 11.8536f)
                curveTo(5.97487f, 11.2678f, 5.02513f, 11.2678f, 4.43934f, 11.8536f)
                lineTo(1.4142f, 14.8787f)
                curveTo(1.15244f, 14.4835f, 1f, 14.0095f, 1f, 13.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(8f, 9.75f)
                curveTo(8f, 9.33579f, 7.66421f, 9f, 7.25f, 9f)
                curveTo(6.83579f, 9f, 6.5f, 9.33579f, 6.5f, 9.75f)
                curveTo(6.5f, 10.1642f, 6.83579f, 10.5f, 7.25f, 10.5f)
                curveTo(7.66421f, 10.5f, 8f, 10.1642f, 8f, 9.75f)
                close()
                moveTo(2.12131f, 15.5858f)
                curveTo(2.51652f, 15.8476f, 2.99046f, 16f, 3.5f, 16f)
                horizontalLineTo(7.5f)
                curveTo(8.00954f, 16f, 8.48348f, 15.8476f, 8.87869f, 15.5858f)
                lineTo(5.85355f, 12.5607f)
                curveTo(5.65829f, 12.3654f, 5.34171f, 12.3654f, 5.14645f, 12.5607f)
                lineTo(2.12131f, 15.5858f)
                close()
            }
        }.build()
        
        return _FileMedia!!
    }

private var _FileMedia: ImageVector? = null

