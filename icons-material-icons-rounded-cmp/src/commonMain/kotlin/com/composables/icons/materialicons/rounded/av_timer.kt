package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Av_timer: ImageVector
    get() {
        if (_Av_timer != null) return _Av_timer!!
        
        _Av_timer = ImageVector.Builder(
            name = "av_timer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 17f)
                arcTo(1f, 1f, 0f, false, true, 12f, 18f)
                arcTo(1f, 1f, 0f, false, true, 11f, 17f)
                arcTo(1f, 1f, 0f, false, true, 13f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 12f)
                arcTo(1f, 1f, 0f, false, true, 7f, 13f)
                arcTo(1f, 1f, 0f, false, true, 6f, 12f)
                arcTo(1f, 1f, 0f, false, true, 8f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 12f)
                arcTo(1f, 1f, 0f, false, true, 17f, 13f)
                arcTo(1f, 1f, 0f, false, true, 16f, 12f)
                arcTo(1f, 1f, 0f, false, true, 18f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.92f)
                curveToRelative(3.31f, 0.48f, 5.87f, 3.25f, 6f, 6.66f)
                curveToRelative(0.14f, 3.85f, -3.03f, 7.2f, -6.88f, 7.26f)
                curveTo(8.19f, 19.06f, 5f, 15.91f, 5f, 12f)
                curveToRelative(0f, -1.68f, 0.59f, -3.22f, 1.58f, -4.42f)
                lineToRelative(4.71f, 4.72f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(7.26f, 5.46f)
                curveToRelative(-0.38f, -0.38f, -1f, -0.39f, -1.4f, -0.02f)
                curveTo(4.1f, 7.07f, 3f, 9.4f, 3f, 12f)
                curveToRelative(0f, 5.04f, 4.14f, 9.12f, 9.21f, 9f)
                curveToRelative(4.7f, -0.11f, 8.63f, -4.01f, 8.78f, -8.71f)
                curveTo(21.16f, 7.19f, 17.07f, 3f, 12f, 3f)
                close()
            }
        }.build()
        
        return _Av_timer!!
    }

private var _Av_timer: ImageVector? = null

