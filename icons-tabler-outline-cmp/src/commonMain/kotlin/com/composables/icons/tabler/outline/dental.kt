package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Dental: ImageVector
    get() {
        if (_Dental != null) return _Dental!!
        
        _Dental = ImageVector.Builder(
            name = "dental",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5.5f)
                curveToRelative(-1.074f, -0.586f, -2.583f, -1.5f, -4f, -1.5f)
                curveToRelative(-2.1f, 0f, -4f, 1.247f, -4f, 5f)
                curveToRelative(0f, 4.899f, 1.056f, 8.41f, 2.671f, 10.537f)
                curveToRelative(0.573f, 0.756f, 1.97f, 0.521f, 2.567f, -0.236f)
                curveToRelative(0.398f, -0.505f, 0.819f, -1.439f, 1.262f, -2.801f)
                curveToRelative(0.292f, -0.771f, 0.892f, -1.504f, 1.5f, -1.5f)
                curveToRelative(0.602f, 0f, 1.21f, 0.737f, 1.5f, 1.5f)
                curveToRelative(0.443f, 1.362f, 0.864f, 2.295f, 1.262f, 2.8f)
                curveToRelative(0.597f, 0.759f, 2f, 0.993f, 2.567f, 0.237f)
                curveToRelative(1.615f, -2.127f, 2.671f, -5.637f, 2.671f, -10.537f)
                curveToRelative(0f, -3.74f, -1.908f, -5f, -4f, -5f)
                curveToRelative(-1.423f, 0f, -2.92f, 0.911f, -4f, 1.5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5.5f)
                lineToRelative(3f, 1.5f)
            }
        }.build()
        
        return _Dental!!
    }

private var _Dental: ImageVector? = null

