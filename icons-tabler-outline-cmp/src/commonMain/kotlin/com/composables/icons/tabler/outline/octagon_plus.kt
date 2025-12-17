package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.OctagonPlus: ImageVector
    get() {
        if (_OctagonPlus != null) return _OctagonPlus!!
        
        _OctagonPlus = ImageVector.Builder(
            name = "octagon-plus",
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
                moveTo(12.802f, 2.165f)
                lineToRelative(5.575f, 2.389f)
                curveToRelative(0.48f, 0.206f, 0.863f, 0.589f, 1.07f, 1.07f)
                lineToRelative(2.388f, 5.574f)
                curveToRelative(0.22f, 0.512f, 0.22f, 1.092f, 0f, 1.604f)
                lineToRelative(-2.389f, 5.575f)
                curveToRelative(-0.206f, 0.48f, -0.589f, 0.863f, -1.07f, 1.07f)
                lineToRelative(-5.574f, 2.388f)
                curveToRelative(-0.512f, 0.22f, -1.092f, 0.22f, -1.604f, 0f)
                lineToRelative(-5.575f, -2.389f)
                arcToRelative(2.036f, 2.036f, 0f, false, true, -1.07f, -1.07f)
                lineToRelative(-2.388f, -5.574f)
                arcToRelative(2.036f, 2.036f, 0f, false, true, 0f, -1.604f)
                lineToRelative(2.389f, -5.575f)
                curveToRelative(0.206f, -0.48f, 0.589f, -0.863f, 1.07f, -1.07f)
                lineToRelative(5.574f, -2.388f)
                arcToRelative(2.036f, 2.036f, 0f, false, true, 1.604f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _OctagonPlus!!
    }

private var _OctagonPlus: ImageVector? = null

