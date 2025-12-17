package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Deaf: ImageVector
    get() {
        if (_Deaf != null) return _Deaf!!
        
        _Deaf = ImageVector.Builder(
            name = "deaf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 260f)
                curveToRelative(0f, 15.464f, -12.536f, 28f, -28f, 28f)
                reflectiveCurveToRelative(-28f, -12.536f, -28f, -28f)
                curveToRelative(0f, -44.112f, 35.888f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.888f, 80f, 80f)
                curveToRelative(0f, 15.464f, -12.536f, 28f, -28f, 28f)
                reflectiveCurveToRelative(-28f, -12.536f, -28f, -28f)
                curveToRelative(0f, -13.234f, -10.767f, -24f, -24f, -24f)
                reflectiveCurveToRelative(-24f, 10.766f, -24f, 24f)
                close()
                moveToRelative(24f, -176f)
                curveToRelative(-97.047f, 0f, -176f, 78.953f, -176f, 176f)
                curveToRelative(0f, 15.464f, 12.536f, 28f, 28f, 28f)
                reflectiveCurveToRelative(28f, -12.536f, 28f, -28f)
                curveToRelative(0f, -66.168f, 53.832f, -120f, 120f, -120f)
                reflectiveCurveToRelative(120f, 53.832f, 120f, 120f)
                curveToRelative(0f, 75.164f, -71.009f, 70.311f, -71.997f, 143.622f)
                lineTo(288f, 404f)
                curveToRelative(0f, 28.673f, -23.327f, 52f, -52f, 52f)
                curveToRelative(-15.464f, 0f, -28f, 12.536f, -28f, 28f)
                reflectiveCurveToRelative(12.536f, 28f, 28f, 28f)
                curveToRelative(59.475f, 0f, 107.876f, -48.328f, 108f, -107.774f)
                curveToRelative(0.595f, -34.428f, 72f, -48.24f, 72f, -144.226f)
                curveToRelative(0f, -97.047f, -78.953f, -176f, -176f, -176f)
                close()
                moveToRelative(268.485f, -52.201f)
                lineTo(480.2f, 3.515f)
                curveToRelative(-4.687f, -4.686f, -12.284f, -4.686f, -16.971f, 0f)
                lineTo(376.2f, 90.544f)
                curveToRelative(-4.686f, 4.686f, -4.686f, 12.284f, 0f, 16.971f)
                lineToRelative(28.285f, 28.285f)
                curveToRelative(4.686f, 4.686f, 12.284f, 4.686f, 16.97f, 0f)
                lineToRelative(87.03f, -87.029f)
                curveToRelative(4.687f, -4.688f, 4.687f, -12.286f, 0f, -16.972f)
                close()
                moveTo(168.97f, 314.745f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.97f, 0f)
                lineTo(3.515f, 463.23f)
                curveToRelative(-4.686f, 4.686f, -4.686f, 12.284f, 0f, 16.971f)
                lineTo(31.8f, 508.485f)
                curveToRelative(4.687f, 4.686f, 12.284f, 4.686f, 16.971f, 0f)
                lineTo(197.256f, 360f)
                curveToRelative(4.686f, -4.686f, 4.686f, -12.284f, 0f, -16.971f)
                lineToRelative(-28.286f, -28.284f)
                close()
            }
        }.build()
        
        return _Deaf!!
    }

private var _Deaf: ImageVector? = null

