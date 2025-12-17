package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Filter2Cog: ImageVector
    get() {
        if (_Filter2Cog != null) return _Filter2Cog!!
        
        _Filter2Cog = ImageVector.Builder(
            name = "filter-2-cog",
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
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineToRelative(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                horizontalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.001f, 21f)
                curveToRelative(-0.53f, 0f, -1.039f, -0.211f, -1.414f, -0.586f)
                curveToRelative(-0.375f, -0.375f, -0.586f, -0.884f, -0.586f, -1.414f)
                curveToRelative(0f, -0.53f, 0.211f, -1.039f, 0.586f, -1.414f)
                curveToRelative(0.375f, -0.375f, 0.884f, -0.586f, 1.414f, -0.586f)
                moveToRelative(0f, 4f)
                curveToRelative(0.53f, 0f, 1.039f, -0.211f, 1.414f, -0.586f)
                curveToRelative(0.375f, -0.375f, 0.586f, -0.884f, 0.586f, -1.414f)
                curveToRelative(0f, -0.53f, -0.211f, -1.039f, -0.586f, -1.414f)
                curveToRelative(-0.375f, -0.375f, -0.884f, -0.586f, -1.414f, -0.586f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, -5.5f)
                verticalLineToRelative(-1.5f)
                moveToRelative(3.031f, 1.75f)
                lineToRelative(-1.299f, 0.75f)
                moveToRelative(-3.463f, 2f)
                lineToRelative(-1.3f, 0.75f)
                moveToRelative(0f, -3.5f)
                lineToRelative(1.3f, 0.75f)
                moveToRelative(3.463f, 2f)
                lineToRelative(1.3f, 0.75f)
            }
        }.build()
        
        return _Filter2Cog!!
    }

private var _Filter2Cog: ImageVector? = null

