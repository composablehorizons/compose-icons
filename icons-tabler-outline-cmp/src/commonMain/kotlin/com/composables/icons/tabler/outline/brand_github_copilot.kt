package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGithubCopilot: ImageVector
    get() {
        if (_BrandGithubCopilot != null) return _BrandGithubCopilot!!
        
        _BrandGithubCopilot = ImageVector.Builder(
            name = "brand-github-copilot",
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
                moveTo(4f, 18f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.667f, 0.167f, -1.333f, 0.5f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7.5f)
                curveToRelative(0f, -1f, -0.01f, -4.07f, -4f, -3.5f)
                curveToRelative(-3.5f, 0.5f, -4f, 2.5f, -4f, 3.5f)
                curveToRelative(0f, 1.5f, 0f, 4f, 3f, 4f)
                curveToRelative(4f, 0f, 5f, -2.5f, 5f, -4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12f)
                curveToRelative(-1.333f, 0.667f, -2f, 1.333f, -2f, 2f)
                curveToRelative(0f, 1f, 0f, 3f, 1.5f, 4f)
                curveToRelative(3f, 2f, 6.5f, 3f, 8.5f, 3f)
                reflectiveCurveToRelative(5.499f, -1f, 8.5f, -3f)
                curveToRelative(1.5f, -1f, 1.5f, -3f, 1.5f, -4f)
                curveToRelative(0f, -0.667f, -0.667f, -1.333f, -2f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 18f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.667f, -0.167f, -1.333f, -0.5f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7.5f)
                lineToRelative(0f, -0.297f)
                lineToRelative(0.01f, -0.269f)
                lineToRelative(0.027f, -0.298f)
                lineToRelative(0.013f, -0.105f)
                lineToRelative(0.033f, -0.215f)
                curveToRelative(0.014f, -0.073f, 0.029f, -0.146f, 0.046f, -0.22f)
                lineToRelative(0.06f, -0.223f)
                curveToRelative(0.336f, -1.118f, 1.262f, -2.237f, 3.808f, -1.873f)
                curveToRelative(2.838f, 0.405f, 3.703f, 1.797f, 3.93f, 2.842f)
                lineToRelative(0.036f, 0.204f)
                curveToRelative(0f, 0.033f, 0.01f, 0.066f, 0.013f, 0.098f)
                lineToRelative(0.016f, 0.185f)
                lineToRelative(0f, 0.171f)
                lineToRelative(0f, 0.49f)
                lineToRelative(-0.015f, 0.394f)
                lineToRelative(-0.02f, 0.271f)
                curveToRelative(-0.122f, 1.366f, -0.655f, 2.845f, -2.962f, 2.845f)
                curveToRelative(-3.256f, 0f, -4.524f, -1.656f, -4.883f, -3.081f)
                lineToRelative(-0.053f, -0.242f)
                arcToRelative(3.865f, 3.865f, 0f, false, true, -0.036f, -0.235f)
                lineToRelative(-0.021f, -0.227f)
                arcToRelative(3.518f, 3.518f, 0f, false, true, -0.007f, -0.215f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 15f)
                verticalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 15f)
                verticalLineToRelative(2f)
            }
        }.build()
        
        return _BrandGithubCopilot!!
    }

private var _BrandGithubCopilot: ImageVector? = null

