package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSolidjs: ImageVector
    get() {
        if (_BrandSolidjs != null) return _BrandSolidjs!!
        
        _BrandSolidjs = ImageVector.Builder(
            name = "brand-solidjs",
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
                moveTo(2f, 17.5f)
                curveToRelative(4.667f, 3f, 8f, 4.5f, 10f, 4.5f)
                curveToRelative(2.5f, 0f, 4f, -1.5f, 4f, -3.5f)
                reflectiveCurveToRelative(-1.5f, -3.5f, -4f, -3.5f)
                curveToRelative(-2f, 0f, -5.333f, 0.833f, -10f, 2.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 13.5f)
                curveToRelative(4.667f, -1.667f, 8f, -2.5f, 10f, -2.5f)
                curveToRelative(2.5f, 0f, 4f, 1.5f, 4f, 3.5f)
                curveToRelative(0f, 0.738f, -0.204f, 1.408f, -0.588f, 1.96f)
                lineToRelative(-2.883f, 3.825f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6.5f)
                curveToRelative(-4f, -3f, -8f, -4.5f, -10f, -4.5f)
                curveToRelative(-2.04f, 0f, -2.618f, 0.463f, -3.419f, 1.545f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 17.5f)
                lineToRelative(3f, -4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6.5f)
                lineToRelative(-3f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.581f, 3.545f)
                lineToRelative(-2.953f, 3.711f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.416f, 12.662f)
                curveToRelative(-1.51f, -0.476f, -2.416f, -1.479f, -2.416f, -3.162f)
                curveToRelative(0f, -2.5f, 1.5f, -3.5f, 4f, -3.5f)
                curveToRelative(1.688f, 0f, 5.087f, 1.068f, 8.198f, 3.204f)
                arcToRelative(114.76f, 114.76f, 0f, false, true, 1.802f, 1.296f)
                lineToRelative(-2.302f, 0.785f)
            }
        }.build()
        
        return _BrandSolidjs!!
    }

private var _BrandSolidjs: ImageVector? = null

