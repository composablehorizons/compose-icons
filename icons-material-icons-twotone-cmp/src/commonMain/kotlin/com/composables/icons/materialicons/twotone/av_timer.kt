package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Av_timer: ImageVector
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 21f)
                curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
                reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(5.08f)
                curveToRelative(3.39f, 0.49f, 6f, 3.39f, 6f, 6.92f)
                curveToRelative(0f, 3.87f, -3.13f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.13f, -7f, -7f)
                curveToRelative(0f, -1.68f, 0.59f, -3.22f, 1.58f, -4.42f)
                lineTo(12f, 13f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.8f, -6.8f)
                verticalLineToRelative(0.02f)
                curveTo(4.42f, 6.45f, 3f, 9.05f, 3f, 12f)
                curveToRelative(0f, 4.97f, 4.02f, 9f, 9f, 9f)
                close()
            }
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
                moveTo(18f, 12f)
                arcTo(1f, 1f, 0f, false, true, 17f, 13f)
                arcTo(1f, 1f, 0f, false, true, 16f, 12f)
                arcTo(1f, 1f, 0f, false, true, 18f, 12f)
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
        }.build()
        
        return _Av_timer!!
    }

private var _Av_timer: ImageVector? = null

