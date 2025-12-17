package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Perplexity: ImageVector
    get() {
        if (_Perplexity != null) return _Perplexity!!
        
        _Perplexity = ImageVector.Builder(
            name = "perplexity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0.188f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.503f, 0.5f)
                verticalLineTo(4.03f)
                lineToRelative(3.022f, -2.92f)
                lineToRelative(0.059f, -0.048f)
                arcToRelative(0.51f, 0.51f, 0f, false, true, 0.49f, -0.054f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.306f, 0.46f)
                verticalLineToRelative(3.247f)
                horizontalLineToRelative(1.117f)
                lineToRelative(0.1f, 0.01f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.403f, 0.49f)
                verticalLineToRelative(5.558f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.503f, 0.5f)
                horizontalLineTo(12.38f)
                verticalLineToRelative(3.258f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.312f, 0.462f)
                arcToRelative(0.51f, 0.51f, 0f, false, true, -0.55f, -0.11f)
                lineToRelative(-3.016f, -3.018f)
                verticalLineToRelative(3.448f)
                curveToRelative(0f, 0.275f, -0.225f, 0.5f, -0.503f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.503f, -0.5f)
                verticalLineToRelative(-3.448f)
                lineToRelative(-3.018f, 3.019f)
                arcToRelative(0.51f, 0.51f, 0f, false, true, -0.548f, 0.11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.312f, -0.463f)
                verticalLineToRelative(-3.258f)
                horizontalLineTo(2.503f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.503f, -0.5f)
                verticalLineTo(5.215f)
                lineToRelative(0.01f, -0.1f)
                curveToRelative(0.047f, -0.229f, 0.25f, -0.4f, 0.493f, -0.4f)
                horizontalLineTo(3.62f)
                verticalLineTo(1.469f)
                lineToRelative(0.006f, -0.074f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.302f, -0.387f)
                arcToRelative(0.51f, 0.51f, 0f, false, true, 0.547f, 0.102f)
                lineToRelative(3.023f, 2.92f)
                verticalLineTo(0.687f)
                curveToRelative(0f, -0.276f, 0.225f, -0.5f, 0.503f, -0.5f)
                moveTo(4.626f, 9.333f)
                verticalLineToRelative(3.984f)
                lineToRelative(2.87f, -2.872f)
                verticalLineToRelative(-4.01f)
                close()
                moveToRelative(3.877f, 1.113f)
                lineToRelative(2.871f, 2.871f)
                verticalLineTo(9.333f)
                lineToRelative(-2.87f, -2.897f)
                close()
                moveToRelative(3.733f, -1.668f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.145f, 0.35f)
                verticalLineToRelative(1.145f)
                horizontalLineToRelative(0.612f)
                verticalLineTo(5.715f)
                horizontalLineTo(9.201f)
                close()
                moveToRelative(-9.23f, 1.495f)
                horizontalLineToRelative(0.613f)
                verticalLineTo(9.13f)
                curveToRelative(0f, -0.131f, 0.052f, -0.257f, 0.145f, -0.35f)
                lineToRelative(3.033f, -3.064f)
                horizontalLineToRelative(-3.79f)
                close()
                moveToRelative(1.62f, -5.558f)
                horizontalLineTo(6.76f)
                lineTo(4.626f, 2.652f)
                close()
                moveToRelative(4.613f, 0f)
                horizontalLineToRelative(2.134f)
                verticalLineTo(2.652f)
                close()
            }
        }.build()
        
        return _Perplexity!!
    }

private var _Perplexity: ImageVector? = null

