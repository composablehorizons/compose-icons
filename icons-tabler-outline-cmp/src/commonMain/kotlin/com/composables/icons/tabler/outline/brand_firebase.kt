package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandFirebase: ImageVector
    get() {
        if (_BrandFirebase != null) return _BrandFirebase!!
        
        _BrandFirebase = ImageVector.Builder(
            name = "brand-firebase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.53f, 17.05f)
                lineToRelative(6.15f, -11.72f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(0.38f, -0.74f, 1.28f, -1.02f, 2.01f, -0.63f)
                curveToRelative(0.26f, 0.14f, 0.48f, 0.36f, 0.62f, 0.62f)
                lineToRelative(1.06f, 2.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.47f, 6.45f)
                curveToRelative(0.58f, -0.59f, 1.53f, -0.59f, 2.11f, -0.01f)
                curveToRelative(0.22f, 0.22f, 0.36f, 0.5f, 0.41f, 0.81f)
                lineToRelative(1.5f, 9.11f)
                curveToRelative(0.1f, 0.62f, -0.2f, 1.24f, -0.76f, 1.54f)
                lineToRelative(-6.07f, 2.9f)
                curveToRelative(-0.46f, 0.25f, -1.01f, 0.26f, -1.46f, 0f)
                lineToRelative(-6.02f, -2.92f)
                curveToRelative(-0.55f, -0.31f, -0.85f, -0.92f, -0.75f, -1.54f)
                lineToRelative(1.96f, -12.04f)
                curveToRelative(0.12f, -0.82f, 0.89f, -1.38f, 1.7f, -1.25f)
                curveToRelative(0.46f, 0.07f, 0.87f, 0.36f, 1.09f, 0.77f)
                lineToRelative(1.24f, 1.76f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.57f, 17.18f)
                lineToRelative(10.93f, -10.68f)
            }
        }.build()
        
        return _BrandFirebase!!
    }

private var _BrandFirebase: ImageVector? = null

