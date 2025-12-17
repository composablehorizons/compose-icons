package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TagPlus: ImageVector
    get() {
        if (_TagPlus != null) return _TagPlus!!
        
        _TagPlus = ImageVector.Builder(
            name = "tag-plus",
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
                moveTo(7.5f, 7.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.002f, 13f)
                curveToRelative(0f, -0.617f, -0.235f, -1.233f, -0.706f, -1.704f)
                lineToRelative(-7.71f, -7.71f)
                curveToRelative(-0.375f, -0.375f, -0.884f, -0.586f, -1.414f, -0.586f)
                horizontalLineToRelative(-5.172f)
                curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
                verticalLineToRelative(5.172f)
                curveToRelative(0f, 0.53f, 0.211f, 1.039f, 0.586f, 1.414f)
                lineToRelative(7.71f, 7.71f)
                curveToRelative(0.471f, 0.47f, 1.087f, 0.706f, 1.704f, 0.706f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _TagPlus!!
    }

private var _TagPlus: ImageVector? = null

